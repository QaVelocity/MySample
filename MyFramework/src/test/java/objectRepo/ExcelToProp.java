package objectRepo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Properties;











import myframe.Constants;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToProp {

	
	void readExcel () throws IOException{
		String or_excelPath = Constants.settingProp.getProperty("OrExcelFilePath");
		System.out.println("property : " + or_excelPath);
		
		File f = new File(or_excelPath);
		FileInputStream is = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(is);
		XSSFSheet sheet = wb.getSheet("ObjectRepository");
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("lastRowNum="+lastRowNum);
		for(int i=0;i<lastRowNum+1;i++){
			XSSFRow row = sheet.getRow(i);
			
			row.getLastCellNum();
			XSSFCell cellLogicalName = row.getCell(0);
			XSSFCell cellValue = row.getCell(1);
			String logicalName = cellLogicalName.getStringCellValue();
			String value = cellValue.getStringCellValue();
			System.out.println("logicalName : " + logicalName);
			System.out.println("value : " + value);
			
			File orPropFile = new File(System.getProperty("user.dir") + "\\ObjectRepo.properties");
			if(orPropFile.exists()==false){
				orPropFile.createNewFile();
			}
			
			
			
			
			OutputStream os = new FileOutputStream(orPropFile,true);

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			bw.write(logicalName + "=" +value);
			bw.write("\n");
			bw.close();
		}
		
	}
	
	
	
}
