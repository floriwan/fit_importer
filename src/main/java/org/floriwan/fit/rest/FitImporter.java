package org.floriwan.fit.rest;

import com.garmin.fit.FitMessages;
import org.floriwan.fit.data.*;

import java.util.Date;

public class FitImporter {

    private static final FitImporter fitImporter = new FitImporter();
    private FitImporter() {
    }

    public static FitImporter getInstance() {
        return fitImporter;
    }

    public void Import(FitUploadRepository fitFileRepository,
                       FileIdRepository fileIdRepository,
                       String filename,
                       FitMessages fitMessages) {

        FitUpload fitUpload = new FitUpload(
                filename,
                fitMessages.getDeviceInfoMesgs().get(0).getTimestamp().getDate(),
                new Date());

        FileId fileId = FromFitToDao.toFileId(fitMessages.getFileIdMesgs().get(0));

        fileId.setFitUploadId(fitUpload);

        fitFileRepository.save(fitUpload);
        fileIdRepository.save(fileId);
    }
}
