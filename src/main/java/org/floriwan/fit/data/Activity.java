package org.floriwan.fit.data;

import com.garmin.fit.DateTime;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fit_activity")
public class Activity {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "fit_upload_id", referencedColumnName = "id")
    private FitUpload fitUpload;

    @Column
    private Date timeStamp;

    @Column
    private Float totalTimerTime;

    @Column
    private Integer numSessions;

    @Column
    private int type;

    @Column
    private int eventType;

    @Column
    private Long localTimestamp;

    @Column
    private Short EventGroup;





}
