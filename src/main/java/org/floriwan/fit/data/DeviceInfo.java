package org.floriwan.fit.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fit_device_info")
public class DeviceInfo {

    @Id
    @GeneratedValue
    private Long id;

}
