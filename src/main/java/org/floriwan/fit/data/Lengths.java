package org.floriwan.fit.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fit_length")
public class Lengths {

    @Id
    @GeneratedValue
    private Long id;

}
