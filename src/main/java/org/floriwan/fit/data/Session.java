package org.floriwan.fit.data;

import javax.persistence.*;

@Entity
@Table(name = "fit_session")
public class Session {

    @Id
    @GeneratedValue
    private Long id;

}
