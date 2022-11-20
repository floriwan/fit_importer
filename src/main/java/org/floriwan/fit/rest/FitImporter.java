package org.floriwan.fit.rest;

import com.garmin.fit.FitMessages;
import org.floriwan.fit.data.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FitImporter {

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
                       String filename,
                       FitMessages fitMessages) {

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


        // save everything into database

        fitUploadRepository.save(fitUpload);
        fileIdRepository.save(fileId);

        sessionData.stream().forEach(s -> sessionRepository.save(s));

    }
}
