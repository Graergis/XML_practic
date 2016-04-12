package org.example.test;

import org.codehaus.jackson.map.ObjectMapper;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Converter {

    public Converter(Categories value) throws FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new FileOutputStream(String.valueOf(value)));
    }
}