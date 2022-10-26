package ru.tempMethod;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class PdfGenerator {

    public File generator(String data) {
       return new File("pdf");
    }
}
