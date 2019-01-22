package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.model.WorkbookRecordList;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openxml4j.exceptions.InvalidFormatException;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase
{
	public TestUtil() throws Exception {
	
		// TODO Auto-generated constructor stub
	}

	public static long PAGE_LOAD_TIME=20;
	public static long IMPLICIT_WAIT=30;
	public static String TESTDATA_SHEET_PATH = "F:\\MavenProject\\FreeCRMTest"
			+ "\\src\\main\\java\\com\\crm\\qa\\testdata\\NewContact.xlsx";
	static Workbook book;
	static Sheet sheet;
	
	public void switchToFrame()
	{
		driver.switchTo().frame("mainpanel");
	}
	
	public static Object[][] getTestData(String sheetName) throws Exception {
		FileInputStream fis=new FileInputStream(TESTDATA_SHEET_PATH);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		
		Object[][] data = new Object[s.getLastRowNum()][s.getRow(0).getLastCellNum()];
			// System.out.println(sheet.getLastRowNum() + "--------" +
			// sheet.getRow(0).getLastCellNum());
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
					data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
					// System.out.println(data[i][k]);
			Thread.sleep(1000);
		}
				Thread.sleep(2000);
			}
			return data;	
	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

}	


