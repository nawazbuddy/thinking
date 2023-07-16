package genricUtility;

import java.io.FileInputStream;

import java.util.Properties;

public class PropertyFile 
{

      public String propertiesFile(String browser) throws Exception 
      {
	     FileInputStream fis = new FileInputStream("./pro.properties");
         Properties pro = new Properties();
         pro.load(fis);
         String p = pro.getProperty(browser);
         return p;
	}

}
