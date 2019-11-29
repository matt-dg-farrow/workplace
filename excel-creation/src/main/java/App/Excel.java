package App;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel {

	public static void generate() {
		try {
			String filename = "C:\\Users\\Admin\\Desktop\\MyFirstExcel.xls";
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Datatypes in Java");

			HSSFRow rowhead = sheet.createRow((short) 0);
			rowhead.createCell(0).setCellValue("Trainer Name");
			rowhead.createCell(1).setCellValue("Trainer Grade");

			HSSFRow row = sheet.createRow((short) 1);
			row.createCell(0).setCellValue("John Gordon");
			row.createCell(1).setCellValue("A+");

			HSSFRow row2 = sheet.createRow((short) 2);
			row2.createCell(0).setCellValue("Jordan Harrison");
			row2.createCell(1).setCellValue("A");

			HSSFRow row3 = sheet.createRow((short) 3);
			row3.createCell(0).setCellValue("Matt");
			row3.createCell(1).setCellValue("C");

			HSSFRow row4 = sheet.createRow((short) 4);
			row4.createCell(0).setCellValue("Tadas");
			row4.createCell(1).setCellValue("F");

			FileOutputStream fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
			fileOut.close();
			workbook.close();
			System.out.println("Your excel file has been generated!");
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		generate();
	}
}