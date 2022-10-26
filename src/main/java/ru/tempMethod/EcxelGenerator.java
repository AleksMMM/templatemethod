package ru.tempMethod;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class EcxelGenerator {

    public File generator(String data) {
        return new File("ecxel");
    }
}
