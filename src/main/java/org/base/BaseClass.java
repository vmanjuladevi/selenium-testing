package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.Now;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
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
	public static void launchbrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}
	public static void Windowmaximize() {
		driver.manage().window().maximize();
		}
	public static void launchurl(String Url) {
	driver.get(Url);	
}
	public static  String pageTitle() {
		String title = driver.getTitle();
		return title;
	}
	public static void pageurl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		}	
	public static void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);
		}
	public static void closeEntireBrowser() {
		driver.quit();
		}
	public static void clickBtn(WebElement ele) {
		ele.click();
		}
	public static void screenShot(String imgName) throws IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
	File img = ts.getScreenshotAs(OutputType.FILE);
	File f = new File("location +imgName.png");
	FileUtils.copyFile(img, f);
		}
	public static Actions a; 
		public static void moveTheCursor(WebElement targetWebElement)
		{
		a= new Actions(driver);
		a.moveToElement(targetWebElement).perform();
}
		public static void dragDrop(WebElement dragWebElement, WebElement DropElement) {
			a = new Actions(driver);
			a.dragAndDrop(dragWebElement, DropElement).perform();
			}
		public static JavascriptExecutor js ;
		public static void ScrollThePage(WebElement tarWebEle) {
			js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", tarWebEle);
					}
		public static void scroll(WebElement element) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)", element);
			}
		public static void excelReading(String sheetName, int rowNum, int cellNum) throws IOException {
			File f = new File("excel location.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet mySheet = wb.getSheet("Datas");
			Row r = mySheet.getRow(rowNum);
			Cell c = r.getCell(cellNum);
			int cellType = c.getCellType();
			String value = " ";
			if (cellType ==1) {
				String stringValue = c.getStringCellValue();
				}
			else if (DateUtil.isCellDateFormatted(c)) {
				Date dateValue = c.getDateCellValue();
				SimpleDateFormat s = new SimpleDateFormat(value);
				String format = s.format(dateValue);
			}
			else {
				double numericValue = c.getNumericCellValue();
				long l =(long)numericValue;
				String valueOf = String.valueOf(l);
			}

		}
		public static void createNewExcelFile(int rowNum, int cellNum, String WriteData) throws IOException {
			File f = new File("C:\\Users\\Best\\eclipse-workspace\\MavenProject\\Excel1\\NewFile.xlsx");
			Workbook w = new XSSFWorkbook();
			Sheet newSheet = w.createSheet("Datas");
			Row newRow = newSheet.createRow(rowNum);
			Cell newCell = newRow.createCell(cellNum);
			newCell.setCellValue(WriteData);
			FileOutputStream fos = new FileOutputStream(f);
			w.write(fos);
			}
		public static void CreateCell(int getRow, int creCell, String newData) throws IOException {
			File f = new File("C:\\Users\\Best\\eclipse-workspace\\MavenProject\\Excel1\\NewFile.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet s = wb.getSheet("Datas");
		       Row r = s.getRow(getRow);
		       Cell c = r.createCell(creCell);
		       c.setCellValue(newData);
		       FileOutputStream fos = new FileOutputStream(f);
		       wb.write(fos);
		       }
		public static void CreateRow(int creRow, int creCell, String newData) throws IOException {
			File f = new File("C:\\Users\\Best\\eclipse-workspace\\MavenProject\\Excel1\\NewFile.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet s = wb.getSheet("Datas");
			Row r = s.createRow(creRow);
			Cell c = r.createCell(creCell);
			c.setCellValue(newData);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			}
		public static void updateDataToParticularCell( int getTheRow, int getTheCell, String excistingData, String WriteNewData) throws IOException {
		File f = new File("C:\\Users\\Best\\eclipse-workspace\\MavenProject\\Excel1\\NewFile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Datas");
		Row r = s.getRow(getTheRow);
		Cell c = r.getCell(getTheCell);
		String str = c.getStringCellValue();
		if (str.equals(excistingData)) {
			c.setCellValue(WriteNewData);
			}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		}
			
		}
	

