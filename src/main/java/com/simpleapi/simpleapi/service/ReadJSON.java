package com.simpleapi.simpleapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.simpleapi.simpleapi.identity.DogType;
import lombok.Value;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;

public class ReadJSON {

    public ReadJSON(){
    }

    public void readJsonToDogType(){
        // create Object Mapper
        ObjectMapper mapper = new ObjectMapper();
        // read JSON file and map/convert to java POJO
        try {
            DogType someClassObject = mapper.readValue(new File("data/apidata.json"), DogType.class);
            System.out.println(someClassObject);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
