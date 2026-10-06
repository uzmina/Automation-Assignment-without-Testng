package com.ui.utility;

import com.ui.constants.Env;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    public static String readProperties(Env env, String propertyName) {

        File propertiesFile = new File(
                System.getProperty("user.dir")
                        + File.separator
                        + "config"
                        + File.separator
                        + env
                        + ".properties");

        Properties properties = new Properties();

        try (FileReader fileReader = new FileReader(propertiesFile)) {
            properties.load(fileReader);
        } catch (IOException e) {
            throw new RuntimeException("Unable to load: "
                    + propertiesFile.getAbsolutePath(), e);
        }

        String value = properties.getProperty(propertyName);

        if (value == null) {
            throw new RuntimeException(
                    "Property '" + propertyName + "' not found in "
                            + propertiesFile.getName());
        }

        return value;
    }
}
