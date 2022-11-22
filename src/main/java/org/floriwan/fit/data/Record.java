package org.floriwan.fit.data;

import com.garmin.fit.DateTime;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fit_record")
public class Record {

    public Record(FitUpload fitUpload, Date timestamp, Integer positionLat, Integer positionLong, Float altitude, Short heartRate, Short cadence, Float distance, Float speed, Integer power, Float grade, Short resistance, Float timeFromCourse, Float cycleLength, Byte temperature, Short cycles, Long totalCycles, Integer compressedAccumulatedPower, Long accumulatedPower, Short leftRightBalance, Short gpsAccuracy, Float verticalSpeed, /*int activityType,*/ Float time128, Short deviceIndex, Float enhancedSpeed, Float enhancedAltitude) {
        this.fitUpload = fitUpload;
        this.timestamp = timestamp;
        this.positionLat = positionLat;
        this.positionLong = positionLong;
        this.altitude = altitude;
        this.heartRate = heartRate;
        this.cadence = cadence;
        this.distance = distance;
        this.speed = speed;
        this.power = power;
        this.grade = grade;
        this.resistance = resistance;
        this.timeFromCourse = timeFromCourse;
        this.cycleLength = cycleLength;
        this.temperature = temperature;
        this.cycles = cycles;
        this.totalCycles = totalCycles;
        this.compressedAccumulatedPower = compressedAccumulatedPower;
        this.accumulatedPower = accumulatedPower;
        this.leftRightBalance = leftRightBalance;
        this.gpsAccuracy = gpsAccuracy;
        this.verticalSpeed = verticalSpeed;
        this.activityType = activityType;
        this.time128 = time128;
        this.deviceIndex = deviceIndex;
        this.enhancedSpeed = enhancedSpeed;
        this.enhancedAltitude = enhancedAltitude;
    }

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "fit_upload_id", referencedColumnName = "id")
    private FitUpload fitUpload;

    @Column
    private Date timestamp;

    @Column
    private Integer positionLat;

    @Column
    private Integer positionLong;

    @Column
    private Float altitude;

    @Column
    private Short heartRate;

    @Column
    private Short cadence;

    @Column
    private Float distance;

    @Column
    private Float speed;

    @Column
    private Integer power;

    // compressed speed distance int[]

    @Column
    private Float grade;

    @Column
    private Short resistance;

    @Column
    private Float timeFromCourse;

    @Column
    private Float cycleLength;

    @Column
    private Byte temperature;

    // get number of speed 1s
    // speed 1s Float[]

    @Column
    private Short cycles;

    @Column
    private Long totalCycles;

    @Column
    private Integer compressedAccumulatedPower;

    @Column
    private Long accumulatedPower;

    @Column
    private Short leftRightBalance;

    @Column
    private Short gpsAccuracy;

    @Column
    private Float verticalSpeed;

    @Column
    private int activityType;

    @Column
    private Float time128;

    @Column
    private Short deviceIndex;

    @Column
    private Float enhancedSpeed;

    @Column
    private Float enhancedAltitude;


    public Long getId() {
        return id;
    }

    public FitUpload getFitUpload() {
        return fitUpload;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public Integer getPositionLat() {
        return positionLat;
    }

    public Integer getPositionLong() {
        return positionLong;
    }

    public Float getAltitude() {
        return altitude;
    }

    public Short getHeartRate() {
        return heartRate;
    }

    public Short getCadence() {
        return cadence;
    }

    public Float getDistance() {
        return distance;
    }

    public Float getSpeed() {
        return speed;
    }

    public Integer getPower() {
        return power;
    }

    public Float getGrade() {
        return grade;
    }

    public Short getResistance() {
        return resistance;
    }

    public Float getTimeFromCourse() {
        return timeFromCourse;
    }

    public Float getCycleLength() {
        return cycleLength;
    }

    public Byte getTemperature() {
        return temperature;
    }

    public Short getCycles() {
        return cycles;
    }

    public Long getTotalCycles() {
        return totalCycles;
    }

    public Integer getCompressedAccumulatedPower() {
        return compressedAccumulatedPower;
    }

    public Long getAccumulatedPower() {
        return accumulatedPower;
    }

    public Short getLeftRightBalance() {
        return leftRightBalance;
    }

    public Short getGpsAccuracy() {
        return gpsAccuracy;
    }

    public Float getVerticalSpeed() {
        return verticalSpeed;
    }

    public int getActivityType() {
        return activityType;
    }

    public Float getTime128() {
        return time128;
    }

    public Short getDeviceIndex() {
        return deviceIndex;
    }

    public Float getEnhancedSpeed() {
        return enhancedSpeed;
    }

    public Float getEnhancedAltitude() {
        return enhancedAltitude;
    }
}
