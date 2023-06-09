package com.upax.zeus.util;


import com.google.gson.Gson;

import com.upax.zeus.core.Config;
import com.upax.zeus.model.LiveStream;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
public class JsonUtil {

    public static <T> T jsonToPojo(String jsonFile, Class<T> type) {
        try {
            File file = new File(Config.getDataPath(jsonFile));
            String fileContent = FileUtils.readFileToString(file, "UTF-8");
            return new Gson().fromJson(fileContent, type);
        } catch (IOException e) {
            log.error("Error reading json data file", e);
            return null;
        }
    }

    public static <T> Object[][] jsonToDataProvider(String jsonFile, Class<T> type) {
        T entityObject = jsonToPojo(jsonFile, type);
        return new Object[][]{{entityObject}};
    }

}
