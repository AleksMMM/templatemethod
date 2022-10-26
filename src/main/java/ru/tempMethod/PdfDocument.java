package ru.tempMethod;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class PdfDocument extends AbstractDocument {

    private final PdfGenerator pdfGenerator;

    public PdfDocument(DocumentDao documentDao, Printer printer, PdfGenerator pdfGenerator) {
        super(documentDao, printer);
        this.pdfGenerator = pdfGenerator;
    }

    @Override
    protected File generate(String data) {
        return pdfGenerator.generator(data);
    }
}
