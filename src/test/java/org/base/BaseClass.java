package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

	public static void launchUrl(String url) {

		driver.get(url);	
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String currentPageUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static void passText(WebElement element, String txt) {

		element.sendKeys(txt);
	}

	public static void clickWebelement(WebElement element) {
		element.click();
	}

	public static void browserClose() {
		driver.close();
	}

	public static void screenShot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("D:\\NewMaven\\Maven3pm\\images\\" + imgName + ".png");
		FileUtils.copyFile(source, f);
	}

	public static Actions a;

	public static void moveTheCursor(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public static void dragDrop(WebElement src, WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}

	public static JavascriptExecutor js;

	public static void scrollUp(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public static void scrollDown(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static String excelRead(int rowNum, int cellNum, String fileName, String sheetName) throws IOException {

		File f = new File("D:\\NewMaven\\Maven3pm\\Excel\\" + fileName + ".xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet mySheet = wb.getSheet(sheetName);

		Row r = mySheet.getRow(rowNum);

		Cell c = r.getCell(cellNum);

		int cellType = c.getCellType();

		// by default cellType == 1 ---> String Cell
		// other than one ---> Numeric Cell / Date Cell

		String values = "";

		if (cellType == 1) {

			values = c.getStringCellValue();
		}

		// used for checking whether cell is date or not
		else if (DateUtil.isCellDateFormatted(c)) {

			// whether cell is date format --> get the values from that date format cell
			Date dd = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
			values = s.format(dd);
		}

		else {

			double dd = c.getNumericCellValue(); // 345678.0
			long l = (long) dd; // 345678
			values = String.valueOf(l);
		}
		return values;

	}
	
	
	
	
	
	
	
	
	

	public static void createSheet(String fileName , String sheetName, int rowNum , int cellNum , String setValue) throws IOException { 

		File f = new File("D:\\NewMaven\\Maven3pm\\Excel\\"+ fileName +".xlsx");

		Workbook wb = new XSSFWorkbook();

		Sheet newSheet = wb.createSheet(sheetName);

		Row newRow = newSheet.createRow(rowNum);

		Cell newCell = newRow.createCell(cellNum);

		newCell.setCellValue(setValue);

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		System.out.println("File Writed...");

	}
	
	
	
	
	
	
	
	// to create new cell alone
	
	public static void writeValueInExcel(String fileName , String sheetName , int rowNum , int cellNum , String setValue) throws IOException {
		
		File f = new File("D:\\NewMaven\\Maven3pm\\Excel\\"+ fileName +".xlsx");

		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);

		Sheet newSheet = wb.getSheet(sheetName);

		Row newRow = newSheet.getRow(rowNum);

		Cell newCell = newRow.createCell(cellNum);

		newCell.setCellValue(setValue);

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		System.out.println("File Writed...");


	}
	 
	
	
	
	
	// to create new row alone
	
	public static void createRow(String fileName , String sheetName , int rowNum , int cellNum , String setValue) throws IOException {
		
		File f = new File("D:\\NewMaven\\Maven3pm\\Excel\\"+ fileName +".xlsx");

		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);

		Sheet newSheet = wb.getSheet(sheetName);

		Row newRow = newSheet.createRow(rowNum);

		Cell newCell = newRow.createCell(cellNum);

		newCell.setCellValue(setValue);

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		System.out.println("File Writed...");

	}
	
	
	
	
 
}
