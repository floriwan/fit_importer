package org.floriwan.fit.rest;

import com.garmin.fit.FitMessages;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.floriwan.fit.data.*;
import org.floriwan.fit.data.Record;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FitImporter {

    private static Log log = LogFactory.getLog(FitImporter.class);

    private static final FitImporter fitImporter = new FitImporter();
    private FitImporter() {
    }

    public static FitImporter getInstance() {
        return fitImporter;
    }

    public void Import(
            FitUploadRepository fitUploadRepository,
                       FileIdRepository fileIdRepository,
                       SessionRepository sessionRepository,
                       RecordRepository recordRepository,
                       String filename,
                       FitMessages fitMessages) {

        log.info("import session data: " + fitMessages.getSessionMesgs().size() +
                " record data: " + fitMessages.getRecordMesgs().size());

        // convert garmin data to own data structure

        FitUpload fitUpload = new FitUpload(
                filename,
                fitMessages.getDeviceInfoMesgs().get(0).getTimestamp().getDate(),
                new Date());

        FileId fileId = FromFitToDao.toFileId(fitUpload, fitMessages.getFileIdMesgs().get(0));

        List<Session> sessionData = new ArrayList<>();
        fitMessages.getSessionMesgs().stream().forEach(
                s -> sessionData.add(FromFitToDao.toSession(fitUpload, s))
        );

        List<Record> recordData = new ArrayList<>();
        fitMessages.getRecordMesgs().stream().forEach(
                r -> recordData.add(FromFitToDao.toRecord(fitUpload, r))
        );

        fitMessages.getRecordMesgs().get(0);

        // save everything into database

        fitUploadRepository.save(fitUpload);
        fileIdRepository.save(fileId);

        sessionData.stream().forEach(s -> sessionRepository.save(s));
        recordData.stream().forEach(r -> recordRepository.save(r));

    }
}
