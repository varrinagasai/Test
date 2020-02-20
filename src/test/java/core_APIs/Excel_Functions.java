package core_APIs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Functions {
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet;

	public static List<String> readExcel(String excel, String sheet_name, int row_num)
			throws NullPointerException, FileNotFoundException, IOException {
		List<String> value= null;
		try {
			wb = new XSSFWorkbook(new FileInputStream(new File(excel)));
			sheet = wb.getSheet(sheet_name);
			
			Iterator<Cell> cellIterator = sheet.getRow(row_num).cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				 if(cell != null) {
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					value.add(String.valueOf(cell.getNumericCellValue()));
					break;
				case Cell.CELL_TYPE_STRING:
					value.add(cell.getStringCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					value.add(String.valueOf(cell.getBooleanCellValue()));
					break;
				case Cell.CELL_TYPE_FORMULA:
					value.add(String.valueOf(cell.getCellFormula()));
					break;
				}
			}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
}
