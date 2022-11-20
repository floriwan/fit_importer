package org.floriwan.fit.data;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fit_upload")
public class FitUpload {

    protected FitUpload() {}

    public FitUpload(String name, Date activityDate, Date uploadDate) {
        this.name = name;
        this.activityDate = activityDate;
        this.uploadDate = uploadDate;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique=true, nullable = false, length = 100)
    private String name;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(nullable = false)
    private Date activityDate;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(nullable = false)
    private Date uploadDate;

}

