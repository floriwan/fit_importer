package org.floriwan.fit.data;


import com.garmin.fit.Event;

import javax.persistence.*;
import java.util.Date;

/*
    ignore some of the session fields
    that are not needed for cycling
 */

@Entity
@Table(name = "fit_session")
public class Session {

    public Session(Integer messageIndex, Date timestamp, short event, short eventType, Date startTime, Integer startPositionLat, Integer startPositionLong, short sport, short subSport, Float totalElapsedTime, Float totalTimerTime, Float totalDistance, Long totalCycles, Long totalRides, Long totalStrokes, Integer totalColories, Integer totalFatColories, Float avgSpeed, Float maxSpeed, Short avgHartRate, Short maxHartRate, Short avgCadence, Short avgRunningCadence, Short maxCadence, Short maxRunningCadence, Integer avgPower, Integer maxPower, Integer totalAscent, Integer totalDescent, Float totalTrainingEffect, Integer firstLapIndex, Integer numLaps, Short eventGroup, Integer necLat, Integer necLong, Integer swcLat, Integer swcLong, Integer numLengths, Integer normalizedPower, Float trainingStressScore, Float intensityFactor, Integer leftRightBalance, Float avgStrokeCount, Integer thresholdPower, Integer numActiveLength, Long totalWork, Float avgAltitude, Float maxAltitude, Short gpsAccuracy, Float avgGrade, Float avgPosGrade, Float avgNegGrade, Float maxPosGrade, Float maxNegGrade, Byte avgTemperature, Byte maxTemperatur, Float totalMovingTime, Float avgPosVerticalSpeed, Float avgNegVerticalSpeed, Float maxPosVerticalSpeed, Float maxNegVerticalSpeed, Short minHeartRate, Float[] timeInHrZone, int numTimeInHrZone, Float[] timeInSpeedZone, int numTimeInSpeedZone, Float[] timeInCadenceZone, int numTimeInCadenceZone, Float[] timeInPowerZone, int numTimeInPowerZone, Float avgLapTime, Integer betLapIndex, Float minAltitude, Integer playerScore, Integer opponentScore, String opponentName, Integer[] zoneCount, int numZoneCount, Float avgFractionalCadence, Float maxFractionalCadence, Float totalFractionalCycles, Float avgLeftTorqueEffectiveness, Float avgRightTorqueEffectiveness, Float avgLeftPedalSmoothness, Float avgRightPedalSmoothness, Float avgCombinedPedalSmoothness, Float timeStanding, Integer standCount) {
        this.messageIndex = messageIndex;
        this.timestamp = timestamp;
        this.event = event;
        this.eventType = eventType;
        this.startTime = startTime;
        this.startPositionLat = startPositionLat;
        this.startPositionLong = startPositionLong;
        this.sport = sport;
        this.subSport = subSport;
        this.totalElapsedTime = totalElapsedTime;
        this.totalTimerTime = totalTimerTime;
        this.totalDistance = totalDistance;
        this.totalCycles = totalCycles;
        this.totalRides = totalRides;
        this.totalStrokes = totalStrokes;
        this.totalColories = totalColories;
        this.totalFatColories = totalFatColories;
        this.avgSpeed = avgSpeed;
        this.maxSpeed = maxSpeed;
        this.avgHartRate = avgHartRate;
        this.maxHartRate = maxHartRate;
        this.avgCadence = avgCadence;
        this.avgRunningCadence = avgRunningCadence;
        this.maxCadence = maxCadence;
        this.maxRunningCadence = maxRunningCadence;
        this.avgPower = avgPower;
        this.maxPower = maxPower;
        this.totalAscent = totalAscent;
        this.totalDescent = totalDescent;
        this.totalTrainingEffect = totalTrainingEffect;
        this.firstLapIndex = firstLapIndex;
        this.numLaps = numLaps;
        this.eventGroup = eventGroup;
        this.necLat = necLat;
        this.necLong = necLong;
        this.swcLat = swcLat;
        this.swcLong = swcLong;
        this.numLengths = numLengths;
        this.normalizedPower = normalizedPower;
        this.trainingStressScore = trainingStressScore;
        this.intensityFactor = intensityFactor;
        this.leftRightBalance = leftRightBalance;
        this.avgStrokeCount = avgStrokeCount;
        this.thresholdPower = thresholdPower;
        this.numActiveLength = numActiveLength;
        this.totalWork = totalWork;
        this.avgAltitude = avgAltitude;
        this.maxAltitude = maxAltitude;
        this.gpsAccuracy = gpsAccuracy;
        this.avgGrade = avgGrade;
        this.avgPosGrade = avgPosGrade;
        this.avgNegGrade = avgNegGrade;
        this.maxPosGrade = maxPosGrade;
        this.maxNegGrade = maxNegGrade;
        this.avgTemperature = avgTemperature;
        this.maxTemperatur = maxTemperatur;
        this.totalMovingTime = totalMovingTime;
        this.avgPosVerticalSpeed = avgPosVerticalSpeed;
        this.avgNegVerticalSpeed = avgNegVerticalSpeed;
        this.maxPosVerticalSpeed = maxPosVerticalSpeed;
        this.maxNegVerticalSpeed = maxNegVerticalSpeed;
        this.minHeartRate = minHeartRate;
        this.timeInHrZone = timeInHrZone;
        this.numTimeInHrZone = numTimeInHrZone;
        this.timeInSpeedZone = timeInSpeedZone;
        this.numTimeInSpeedZone = numTimeInSpeedZone;
        this.timeInCadenceZone = timeInCadenceZone;
        this.numTimeInCadenceZone = numTimeInCadenceZone;
        this.timeInPowerZone = timeInPowerZone;
        this.numTimeInPowerZone = numTimeInPowerZone;
        this.avgLapTime = avgLapTime;
        this.betLapIndex = betLapIndex;
        this.minAltitude = minAltitude;
        this.playerScore = playerScore;
        this.opponentScore = opponentScore;
        this.opponentName = opponentName;
        this.zoneCount = zoneCount;
        this.numZoneCount = numZoneCount;
        this.avgFractionalCadence = avgFractionalCadence;
        this.maxFractionalCadence = maxFractionalCadence;
        this.totalFractionalCycles = totalFractionalCycles;
        this.avgLeftTorqueEffectiveness = avgLeftTorqueEffectiveness;
        this.avgRightTorqueEffectiveness = avgRightTorqueEffectiveness;
        this.avgLeftPedalSmoothness = avgLeftPedalSmoothness;
        this.avgRightPedalSmoothness = avgRightPedalSmoothness;
        this.avgCombinedPedalSmoothness = avgCombinedPedalSmoothness;
        this.timeStanding = timeStanding;
        this.standCount = standCount;
    }

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "fit_upload_id", referencedColumnName = "id")
    private FitUpload fitUpload;

    public void setFitUpload(FitUpload fitUpload) {
        this.fitUpload = fitUpload;
    }

    @Column
    private Integer messageIndex;

    @Column
    private java.util.Date timestamp;

    @Column
    private short event;

    @Column
    private short eventType;

    @Column
    private java.util.Date startTime;

    @Column
    private Integer startPositionLat;

    @Column
    private Integer startPositionLong;

    @Column
    private short sport;

    @Column
    private short subSport;

    @Column
    private Float totalElapsedTime;

    @Column
    private Float totalTimerTime;

    @Column
    private Float totalDistance;

    @Column
    private Long totalCycles;

    @Column
    private Long totalRides;

    @Column
    private Long totalStrokes;

    @Column
    private Integer totalColories;

    @Column
    private Integer totalFatColories;

    @Column
    private Float avgSpeed;

    @Column
    private Float maxSpeed;

    @Column
    private Short avgHartRate;

    @Column
    private Short maxHartRate;

    @Column
    private Short avgCadence;

    @Column
    private Short avgRunningCadence;

    @Column
    private Short maxCadence;

    @Column
    private Short maxRunningCadence;

    @Column
    private Integer avgPower;

    @Column
    private Integer maxPower;

    @Column
    private Integer totalAscent;

    @Column
    private Integer totalDescent;

    @Column
    private Float totalTrainingEffect;

    @Column
    private Integer firstLapIndex;

    @Column
    private Integer numLaps;

    @Column
    private Short eventGroup;

    @Column
    private Integer necLat;

    @Column
    private Integer necLong;

    @Column
    private Integer swcLat;

    @Column
    private Integer swcLong;

    @Column
    private Integer numLengths;

    @Column
    private Integer normalizedPower;

    @Column
    private Float trainingStressScore;

    @Column
    private Float intensityFactor;

    @Column
    private Integer leftRightBalance;

    @Column
    private Float avgStrokeCount;

    @Column
    private Integer thresholdPower;

    @Column
    private Integer numActiveLength;

    @Column
    private Long totalWork;

    @Column
    private Float avgAltitude;

    @Column
    private Float maxAltitude;

    @Column
    private Short gpsAccuracy;

    @Column
    private Float avgGrade;

    @Column
    private Float avgPosGrade;

    @Column
    private Float avgNegGrade;

    @Column
    private Float maxPosGrade;

    @Column
    private Float maxNegGrade;

    @Column
    private Byte avgTemperature;

    @Column
    private Byte maxTemperatur;

    @Column
    private Float totalMovingTime;

    @Column
    private Float avgPosVerticalSpeed;

    @Column
    private Float avgNegVerticalSpeed;

    @Column
    private Float maxPosVerticalSpeed;

    @Column
    private Float maxNegVerticalSpeed;

    @Column
    private Short minHeartRate;

    @Column
    private Float[] timeInHrZone;

    @Column
    private int numTimeInHrZone;

    @Column
    private Float[] timeInSpeedZone;

    @Column
    private int numTimeInSpeedZone;

    @Column
    private Float[] timeInCadenceZone;

    @Column
    private int numTimeInCadenceZone;

    @Column
    private Float[] timeInPowerZone;

    @Column
    private int numTimeInPowerZone;

    @Column
    private Float avgLapTime;

    @Column
    private Integer betLapIndex;

    @Column
    private Float minAltitude;

    @Column
    private Integer playerScore;

    @Column
    private Integer opponentScore;

    @Column
    private String opponentName;

    @Column
    private Integer[] zoneCount;

    @Column
    private int numZoneCount;

    @Column
    private Float avgFractionalCadence;

    @Column
    private Float maxFractionalCadence;

    @Column
    private Float totalFractionalCycles;

    @Column
    private Float avgLeftTorqueEffectiveness;

    @Column
    private Float avgRightTorqueEffectiveness;

    @Column
    private Float avgLeftPedalSmoothness;

    @Column
    private Float avgRightPedalSmoothness;

    @Column
    private Float avgCombinedPedalSmoothness;

    @Column
    private Float timeStanding;

    @Column
    private Integer standCount;


}
