package com.orangeHRM.Utilities;

import com.orangeHRM.Constants.ConfigConstant;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    public static String readConfigFile(ConfigConstant key) throws IOException {
        String value = "";
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
        prop.load(fis);
        value = prop.getProperty(String.valueOf(key));
        return value;
    }


}
