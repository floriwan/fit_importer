package org.floriwan.fit.rest;

import com.garmin.fit.FitMessages;
import org.floriwan.fit.data.FromFitToDao;

public class FitImporter {

    private static final FitImporter fitImporter = new FitImporter();
    private FitImporter() {
    }

    public static FitImporter getInstance() {
        return fitImporter;
    }

    public void Import(String filename, FitMessages fitMessages) {
        FromFitToDao.toFileId(fitMessages.getFileIdMesgs().get(0));
    }
}
