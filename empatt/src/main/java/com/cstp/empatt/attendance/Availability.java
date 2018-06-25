package com.cstp.empatt.attendance;

/**
 * @author Ritesh Bahety on 6/25/2018.
 */
public enum Availability {
    PRESENT ("P", "Green"),
    HALF_DAY ("Hf", "Orange"),
    ABSENT ("Ab", "Red")
    ;

    private String abbreviatedForm;
    private String color;

    private Availability(String abbreviatedForm, String color) {
        this.abbreviatedForm = abbreviatedForm;
        this.color = color;
    }
}
