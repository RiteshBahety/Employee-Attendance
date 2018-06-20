package com.cstp.empatt;

import android.media.Image;

import java.util.BitSet;

/**
 * @author Ritesh Bahety on 6/13/2018.
 */

public class Person {
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
     * Multiple Mobile numbers
     * Call symbol with each mobile number
     * Able to place call
     */
    private String[] mobileNumber;

    private int aadharCard;
}
