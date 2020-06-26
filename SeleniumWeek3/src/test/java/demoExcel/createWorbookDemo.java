package demoExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class createWorbookDemo {
  @Test
  public void f() throws IOException {
	  XSSFWorkbook wbobj = new XSSFWorkbook();
	  
	  FileOutputStream outobj = new FileOutputStream(new File("DemoDDT.xlsx"));
	  
	  wbobj.write(outobj);
	  outobj.close();
	  
	  System.out.println("DemoDDT.xlsx file created sucessfully");
  }
}
