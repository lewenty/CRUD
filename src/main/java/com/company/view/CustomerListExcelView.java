package com.company.view;

import com.company.model.Customer;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class CustomerListExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map model, HSSFWorkbook workbook,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		HSSFSheet excelSheet = workbook.createSheet("Customer List");
		setExcelHeader(excelSheet);

		List<Customer> customerList = (List<Customer>) model.get("customerList");
		setExcelRows(excelSheet,customerList);

	}

	public void setExcelHeader(HSSFSheet excelSheet) {
		HSSFRow excelHeader = excelSheet.createRow(0);
		excelHeader.createCell(0).setCellValue("Id");
		excelHeader.createCell(1).setCellValue("Adi");
		excelHeader.createCell(2).setCellValue("Soyadi");
		excelHeader.createCell(3).setCellValue("tckn");
		excelHeader.createCell(4).setCellValue("unvani");
	}

	public void setExcelRows(HSSFSheet excelSheet, List<Customer> customerList){
		int record = 1;
		for (Customer customer : customerList) {
			HSSFRow excelRow = excelSheet.createRow(record++);
			excelRow.createCell(0).setCellValue(customer.getId());
			excelRow.createCell(1).setCellValue(customer.getAdi());
			excelRow.createCell(2).setCellValue(customer.getSoyadi());
			excelRow.createCell(3).setCellValue(customer.getTckn());
			excelRow.createCell(4).setCellValue(customer.getUnvani());
		}
	}
}
