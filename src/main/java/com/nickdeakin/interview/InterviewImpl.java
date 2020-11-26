package com.nickdeakin.interview;

import org.json.JSONArray;

public class InterviewImpl implements Interview {

    private Texty texty;

    public InterviewImpl() {
        this.texty = new Texty();
    }

    public JSONArray sortArray(JSONArray input, boolean ascending) {

        // Add code to sort array so the array supplied is returned in the correct order

        return input;
    }

    public JSONArray filterArray(JSONArray input, int min, int max) {

        // Add code to filter array so only values between min and max are returned

        return input;
    }

    public String textTester() {
        return texty.getHardcodedText();
    }
}
