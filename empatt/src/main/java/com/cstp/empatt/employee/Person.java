package com.cstp.empatt.employee;

import android.media.Image;

/**
 * @author Ritesh Bahety on 6/13/2018.
 */
public class Person {
    private int id;
    private Name name;

    /**
     * Store in 4:3 format
     * PNG format type
     * < 120 kb
     */
    private Image photo;

    /**
     * Male, Female or Transgender
     */
    private byte gender;
    private Address address;
    /**
     * Call symbol with each mobile number
     * Able to place call
     */
    private String mobileNumber;

    /**
     * 16-digit number
     */
    private int aadharCard;

    public int getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public Image getPhoto() {
        return photo;
    }

    public byte getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getAadharCard() {
        return aadharCard;
    }
}
