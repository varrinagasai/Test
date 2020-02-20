package core_Swagger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class Excel_Functions {
	private static File f;
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	private static String sub_txt = "D:\\COREAPI\\Katalon_Regression_Tests\\Swagger\\ACN.xlsx";

	public static void createExcel(String sheet_name, String header, int apis, List<WebElement> fun) throws Exception {
		f = new File(sub_txt);
		wb = new XSSFWorkbook(new FileInputStream(new File(sub_txt)));
		sheet = wb.createSheet(sheet_name);
		sheet.createRow(0).createCell(0).setCellValue(header);
		for (int i = 0; i <= apis - 1; i++) {
			String api_method = fun.get(i).getText();
			// System.out.println( "....." + api_method + "\n");
			row = sheet.createRow(i + 1);
			cell = row.createCell(0);
			cell.setCellValue(api_method);
		}
		try {
			FileOutputStream fs2 = new FileOutputStream(f);
			wb.write(fs2);
			fs2.close();
			System.out.println("Excel written successfully..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void updateExcel(String sheet_name, int col_num, String header, int apis, List<WebElement> fun)
			throws NullPointerException, FileNotFoundException, IOException {
//			f = new File(sub_txt_2);
//			fs1 = new FileInputStream(f);
		wb = new XSSFWorkbook(new FileInputStream(new File(sub_txt)));
		sheet = wb.getSheet(sheet_name);
		sheet.getRow(0).createCell(col_num).setCellValue(header);
		for (int i = 0; i <= apis - 1; i++) {
			String api_method = fun.get(i).getText();
			// System.out.println( "....." + api_method + "\n");
			row = sheet.getRow(i + 1);
			if (cell != null) {
				cell = row.createCell(col_num);
				cell.setCellValue(api_method);
			}
		}
		try {
			FileOutputStream outFile = new FileOutputStream(new File(sub_txt));
			wb.write(outFile);
			outFile.close();
			System.out.println("Update");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
