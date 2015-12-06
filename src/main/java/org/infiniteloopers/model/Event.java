package org.infiniteloopers.model;


import java.io.Serializable;

public class Event implements Serializable {

    private final String data;
    private final String uuid;

    public Event(String data, String uuid) {
        this.data = data;
        this.uuid = uuid;
    }

    public String getData() {
        return data;
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return "Event{" +
                "data='" + data + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}