package javautils.level1.exercise5;

import java.io.Serializable;

class Thing implements Serializable {

    String text;
    int number;

    Thing(String text, int number) {
        this.text = text;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "text='" + text + '\'' +
                ", number=" + number +
                '}';
    }
}