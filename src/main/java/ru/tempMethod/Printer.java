package ru.tempMethod;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class Printer {
    public void print(File file) {
        System.out.println("print document");
    }
}
