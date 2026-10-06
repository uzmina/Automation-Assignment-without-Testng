package com.ui.utility;

import com.google.gson.Gson;
import com.ui.constants.Env;
import com.ui.pojo.Config;
import com.ui.pojo.Environment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonUtility {

    public static String jsonReadFile(Env env){
        Gson gson = new Gson();

        File jsonFile = new File(
                System.getProperty("user.dir")
                        + File.separator
                        + "config"
                        + File.separator
                        + "config.json");

        try {
            FileReader fileReader = new FileReader(jsonFile);

            Config config = gson.fromJson(fileReader, Config.class);

            Environment environment =
                    config.getEnvironments().get(env.name());

            return environment.getUrl();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
