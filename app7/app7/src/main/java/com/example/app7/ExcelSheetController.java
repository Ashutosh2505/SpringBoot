package com.example.app7;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ExcelSheetController {
	@RequestMapping("e1")
	public String test1(@RequestParam MultipartFile file) throws Exception{
		FileOutputStream fout = 
		new FileOutputStream("src/main/resources/static/uploads"+file.getOriginalFilename());
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		bout.write(file.getBytes());
		bout.flush();
		bout.close();
		return "success";
	}
	@RequestMapping("e2")
	public String test2() throws Exception {
		FileInputStream file = 
				new FileInputStream("src/main/resources/static/Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		boolean isFirstRow = true;
	   while (rowIterator.hasNext()) {
		Row row = rowIterator.next();
		if (isFirstRow) {
			System.out.println(row.getCell(0).getStringCellValue() + "\t");
			System.out.println(row.getCell(1).getStringCellValue() + "\t");
			System.out.println(row.getCell(2).getStringCellValue() + "\t");
			isFirstRow = false;
		}
		else {
		System.out.println(row.getCell(0).getNumericCellValue() + "\t");
		System.out.println(row.getCell(1).getStringCellValue()  + "\t");
		System.out.println(row.getCell(2).getNumericCellValue() + "\t");
       	}
	    	System.out.println();
	   }
		return "reading is success. plz check in the console";
	}

}