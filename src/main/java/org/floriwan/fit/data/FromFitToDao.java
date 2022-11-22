package org.floriwan.fit.data;

import com.garmin.fit.ActivityMesg;
import com.garmin.fit.FileIdMesg;
import com.garmin.fit.RecordMesg;
import com.garmin.fit.SessionMesg;

public final class FromFitToDao {

    public static FileId toFileId(
            FitUpload fitUpload,
            FileIdMesg fileIdMesg) {
        FileId fileId = new FileId(
                fileIdMesg.getType(),
                fileIdMesg.getManufacturer(),
                fileIdMesg.getProduct(),
                fileIdMesg.getFaveroProduct(),
                fileIdMesg.getGarminProduct(),
                fileIdMesg.getSerialNumber(),
                fileIdMesg.getTimeCreated().getDate(),
                fileIdMesg.getNumber(),
                fileIdMesg.getProductName());

        fileId.setFitUploadId(fitUpload);
        return fileId;

    }

    public static Record toRecord(
            FitUpload fitUpload,
            RecordMesg recordMesg) {
        return new Record(fitUpload,
                recordMesg.getTimestamp().getDate(),
                recordMesg.getPositionLat(),
                recordMesg.getPositionLong(),
                recordMesg.getAltitude(),
                recordMesg.getHeartRate(),
                recordMesg.getCadence(),
                recordMesg.getDistance(),
                recordMesg.getSpeed(),
                recordMesg.getPower(),
                recordMesg.getGrade(),
                recordMesg.getResistance(),
                recordMesg.getTimeFromCourse(),
                recordMesg.getCycleLength(),
                recordMesg.getTemperature(),
                recordMesg.getCycles(),
                recordMesg.getTotalCycles(),
                recordMesg.getCompressedAccumulatedPower(),
                recordMesg.getAccumulatedPower(),
                recordMesg.getLeftRightBalance(),
                recordMesg.getGpsAccuracy(),
                recordMesg.getVerticalSpeed(),
                //recordMesg.getActivityType().getValue(),
                recordMesg.getTime128(),
                recordMesg.getDeviceIndex(),
                recordMesg.getEnhancedSpeed(),
                recordMesg.getEnhancedAltitude());
    }

    public static Session toSession(
            FitUpload fitUpload,
            SessionMesg sessionMesg) {
        Session session = new Session(
                sessionMesg.getMessageIndex(),
                sessionMesg.getTimestamp().getDate(),
                sessionMesg.getEvent().getValue(),
                sessionMesg.getEventType().getValue(),
                sessionMesg.getStartTime().getDate(),
                sessionMesg.getStartPositionLat(),
                sessionMesg.getStartPositionLong(),
                sessionMesg.getSport().getValue(),
                sessionMesg.getSubSport().getValue(),
                sessionMesg.getTotalElapsedTime(),
                sessionMesg.getTotalTimerTime(),
                sessionMesg.getTotalDistance(),
                sessionMesg.getTotalCycles(),
                sessionMesg.getTotalStrides(),
                sessionMesg.getTotalStrokes(),
                sessionMesg.getTotalCalories(),
                sessionMesg.getTotalFatCalories(),
                sessionMesg.getAvgSpeed(),
                sessionMesg.getMaxSpeed(),
                sessionMesg.getAvgHeartRate(),
                sessionMesg.getMaxHeartRate(),
                sessionMesg.getAvgCadence(),
                sessionMesg.getMaxCadence(),
                sessionMesg.getAvgPower(),
                sessionMesg.getMaxPower(),
                sessionMesg.getTotalAscent(),
                sessionMesg.getTotalDescent(),
                sessionMesg.getTotalTrainingEffect(),
                sessionMesg.getFirstLapIndex(),
                sessionMesg.getNumLaps(),
                sessionMesg.getEventGroup(),
                sessionMesg.getNecLat(),
                sessionMesg.getNecLong(),
                sessionMesg.getSwcLat(),
                sessionMesg.getSwcLong(),
                sessionMesg.getNumLengths(),
                sessionMesg.getNormalizedPower(),
                sessionMesg.getTrainingStressScore(),
                sessionMesg.getIntensityFactor(),
                sessionMesg.getLeftRightBalance(),
                sessionMesg.getAvgStrokeCount(),
                sessionMesg.getThresholdPower(),
                sessionMesg.getNumActiveLengths(),
                sessionMesg.getTotalWork(),
                sessionMesg.getAvgAltitude(),
                sessionMesg.getMaxAltitude(),
                sessionMesg.getGpsAccuracy(),
                sessionMesg.getAvgGrade(),
                sessionMesg.getAvgPosGrade(),
                sessionMesg.getAvgNegGrade(),
                sessionMesg.getMaxPosGrade(),
                sessionMesg.getMaxNegGrade(),
                sessionMesg.getAvgTemperature(),
                sessionMesg.getMaxTemperature(),
                sessionMesg.getTotalMovingTime(),
                sessionMesg.getAvgPosVerticalSpeed(),
                sessionMesg.getAvgNegVerticalSpeed(),
                sessionMesg.getMaxPosVerticalSpeed(),
                sessionMesg.getMaxNegVerticalSpeed(),
                sessionMesg.getMinHeartRate(),
                sessionMesg.getTimeInHrZone(),
                sessionMesg.getNumTimeInHrZone(),
                sessionMesg.getTimeInSpeedZone(),
                sessionMesg.getNumTimeInSpeedZone(),
                sessionMesg.getTimeInCadenceZone(),
                sessionMesg.getNumTimeInCadenceZone(),
                sessionMesg.getTimeInPowerZone(),
                sessionMesg.getNumTimeInPowerZone(),
                sessionMesg.getAvgLapTime(),
                sessionMesg.getBestLapIndex(),
                sessionMesg.getMinAltitude(),
                sessionMesg.getPlayerScore(),
                sessionMesg.getOpponentScore(),
                sessionMesg.getOpponentName(),
                sessionMesg.getZoneCount(),
                sessionMesg.getNumZoneCount(),
                sessionMesg.getAvgFractionalCadence(),
                sessionMesg.getMaxFractionalCadence(),
                sessionMesg.getTotalFractionalCycles(),
                sessionMesg.getAvgLeftTorqueEffectiveness(),
                sessionMesg.getAvgRightTorqueEffectiveness(),
                sessionMesg.getAvgLeftPedalSmoothness(),
                sessionMesg.getAvgRightPedalSmoothness(),
                sessionMesg.getAvgCombinedPedalSmoothness(),
                sessionMesg.getTimeStanding(),
                sessionMesg.getStandCount());

        session.setFitUpload(fitUpload);
        return session;

    }
}


