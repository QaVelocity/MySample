package myframe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Vraibles {

	public void loadSettingProp () throws IOException{
		String prjPath = System.getProperty("user.dir");
		String settingProp = prjPath + "\\Settings.Properties";
		System.out.println(" settingProp = " + settingProp);
		File f = new File(settingProp);
		FileInputStream fis = new FileInputStream(f);
		Constants.settingProp = new Properties();
		Constants.settingProp.load(fis);
		
	}
	
	public void loadObjectProp () throws IOException{
		String prjPath = System.getProperty("user.dir");
		String ObjectRepoProp = prjPath + "\\ObjectRepo.properties";
		System.out.println(" settingProp = " + ObjectRepoProp);
		File f = new File(ObjectRepoProp);
		FileInputStream fis = new FileInputStream(f);
		Constants.OR = new Properties();
		Constants.OR.load(fis);
		
	}
}
