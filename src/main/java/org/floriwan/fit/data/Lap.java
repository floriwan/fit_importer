package org.floriwan.fit.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fit_lap")
public class Lap {

    @Id
    @GeneratedValue
    private Long id;

}
