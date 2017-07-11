package com.home.project.plugin;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class DataBasePropertySetter {

    private String url;
    private String user;
    private String password;

    Logger logger = Logger.getLogger(DataBasePropertySetter.class.getName());

    public DataBasePropertySetter() {
        setProperties();
    }

    public void setProperties() {
        String path = "src/main/resources/config.properties";
        try (FileInputStream fis = new FileInputStream(path)) {
            Properties property = new Properties();
            property.load(fis);

            url = property.getProperty("url");
            user = property.getProperty("user");
            password = property.getProperty("password");

        } catch (FileNotFoundException e) {
            logger.warning("Property file was'nt found");
            e.printStackTrace();
        } catch (IOException e) {
            logger.warning("Error to read Property file");
        }

    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }
}
