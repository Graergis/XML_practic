package org.example.test;

import com.google.gson.Gson;

import java.io.FileNotFoundException;

public class Converter {

    public Converter(Categories value) throws FileNotFoundException {
        String json = new Gson().toJson(value);
        System.out.println(json);
    }
}