package net.thrymr.app.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;

    @CreationTimestamp
    @JsonIgnore
    @Column(name = "CREATED_DATE")
    public Timestamp createdDate;

    @Version
    @JsonIgnore
    @Column(name = "LAST_UPDATE")
    public Timestamp lastUpdate;

}

