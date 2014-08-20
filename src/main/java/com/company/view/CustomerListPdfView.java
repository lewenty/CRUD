package com.company.view;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class CustomerListPdfView extends AbstractPdfView {


    @Override
    protected void buildPdfDocument(Map<String, Object> stringObjectMap, Document document, PdfWriter writer, HttpServletRequest request, HttpServletResponse response) throws Exception {

        Table table = new Table(2);
        table.addCell("id");
        table.addCell("adi");

        table.addCell("1");
        table.addCell("levent");

        document.add(table);
    }
}
