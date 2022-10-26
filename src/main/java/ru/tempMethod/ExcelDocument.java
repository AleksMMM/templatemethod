package ru.tempMethod;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class ExcelDocument extends AbstractDocument {

    private final EcxelGenerator excelGenerator;

    public ExcelDocument(DocumentDao documentDao, Printer printer, EcxelGenerator excelGenerator) {
        super(documentDao, printer);
        this.excelGenerator = excelGenerator;
    }

    @Override
    protected File generate(String data) {
        return null;
    }
}
