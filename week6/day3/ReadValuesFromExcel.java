package week6.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValuesFromExcel {
	public static String[][] getValue(String filename) throws IOException {

		// Step1: Settingup the excel file / workBook
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+filename+".xlsx");

		// Step2: to get the sheet from the wb
		XSSFSheet sheet = wb.getSheetAt(0);

		// Step3: to get the row value
		XSSFRow row = sheet.getRow(0);

		// System.out.println(row);

		// getLastRowNum(); - excludes the Header
		int rowCount = sheet.getLastRowNum();
		//System.out.println(rowCount);

		// getPhysicalNumberOfRows(); - includes the header
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);

		// get the cell/column value
		XSSFCell getCell = sheet.getRow(2).getCell(1);
		//System.out.println(getCell);

		// to get the cell value along with the header
		int physicalNumberOfCells = sheet.getRow(1).getPhysicalNumberOfCells();
		//System.out.println(physicalNumberOfCells);

		// getLastCellNum();
		short lastCellNum = sheet.getRow(2).getLastCellNum();
		//System.out.println(lastCellNum);
		
		String data[][]= new String [rowCount][lastCellNum];

		// store the cell values
		XSSFCell cell = row.getCell(1);

		// OuterLoop is for rows
		for (int i = 1; i <= rowCount; i++) {

			// InnerLoop is for cell/Column
			for (int j = 0; j < lastCellNum; j++) {
				String stringCellValue2 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue2);
				data[i-1][j]=stringCellValue2;
			}

			wb.close();
		}
		return data;
	}
	

}
