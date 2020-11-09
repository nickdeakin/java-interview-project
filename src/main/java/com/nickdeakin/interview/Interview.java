package com.nickdeakin.interview;

import org.json.JSONArray;

public interface Interview {
    JSONArray sortArray(JSONArray input, boolean ascending);
    JSONArray filterArray(JSONArray input, int min, int max);
}
