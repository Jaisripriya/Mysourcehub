package SeleniumRevision;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Propertyfile_DDT {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\myprop.txt");
		//FileInputStream fis=new FileInputStream("./myprop.txt");//if we have the property file in the project folder itsel
		Properties pro=new Properties();
		pro.load(fis);
		
		/*String URL=pro.getProperty("url");
		String USER=pro.getProperty("username");
		String PASS=pro.getProperty("password");
		
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(USER);
		driver.findElement(By.name("pwd")).sendKeys(PASS);
		driver.findElement(By.id("loginButton")).click();
		
		
		//reading data from excel
		
		String flipurl = pro.getProperty("url1");
		driver.get(flipurl);
		//driver.findElement(null)
		*/
		//connecting the path
		FileInputStream fes=new FileInputStream("C:\\Users\\HP\\Desktop\\mydata.xlsx");
		//load the data
		Workbook book=WorkbookFactory.create(fes);
		
		//sheet
		Sheet sheet=book.getSheet("Flipkart");
		
		//row
		
		
		Row row=sheet.getRow(0);
		
		//cell
		Cell cell=row.getCell(0);
		Cell cell1=row.getCell(1);
		String flipURL = cell.getStringCellValue();
		driver.get(flipURL);
		String exceldata = cell1.getStringCellValue();
		
		driver.findElement(By.name("q")).sendKeys(exceldata);
		
		
		//write data into excel sheet
		
		Row row1=sheet.createRow(4);
		Cell cell2=row1.createCell(4);
		cell2.setCellValue("PRIYA");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\mydata.xlsx");
		book.write(fos);
		book.close();
		
		
		
		

	}

}
