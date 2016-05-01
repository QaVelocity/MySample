package objectRepo;

import java.io.IOException;

import locating.FindObjects;
import myframe.Constants;
import myframe.Vraibles;

public class StarterClass {
	public static void main(String[] args) {
		Vraibles v = new Vraibles();
		try {
			v.loadSettingProp();
			
			ExcelToProp excel2Pro_Obj = new ExcelToProp();
			excel2Pro_Obj.readExcel();
			v.loadObjectProp();
			String property = Constants.OR.getProperty("YourName_textbox");
			System.out.println("property = " + property);
			FindObjects fo = new FindObjects();
			fo.locateElement("YourEmail_textbox");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
