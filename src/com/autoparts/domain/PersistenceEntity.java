package com.autoparts.domain;

import java.io.Serializable;

public abstract class PersistenceEntity implements Serializable {
    public static final String ID="id";
    private long id;
    private long version;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
