package org.floriwan.fit.data;

import com.garmin.fit.FileIdMesg;

public final class FromFitToDao {

    public static FileId toFileId(FileIdMesg fileIdMesg) {
        return new FileId(
                fileIdMesg.getType(),
                fileIdMesg.getManufacturer(),
                fileIdMesg.getProduct(),
                fileIdMesg.getFaveroProduct(),
                fileIdMesg.getGarminProduct(),
                fileIdMesg.getSerialNumber(),
                fileIdMesg.getTimeCreated().getDate(),
                fileIdMesg.getNumber(),
                fileIdMesg.getProductName());
    }
}
