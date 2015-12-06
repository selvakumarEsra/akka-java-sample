package org.infiniteloopers.model;


import java.io.Serializable;

public class Command implements Serializable{
    private final String data;

    public Command(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return "Command{" +
                "data='" + data + '\'' +
                '}';
    }
}
