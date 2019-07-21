package dev.matteomeneghetti.sendhelp.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

    private static PropertyManager istanza = null;

    Properties prop;
    String propFileName;
    File file;

    private PropertyManager(String filename) {
        this.propFileName = filename;
        file = new File("." + File.separator + filename);
        prop = new Properties();
        loadProperties();
        setDefaultValues();
    }

    public static synchronized PropertyManager getInstance() {
        if (istanza == null) {
            istanza = new PropertyManager("sendhelp.properties");
        }
        return istanza;
    }

    public String getValue(String key) {
        loadProperties();
        return prop.getProperty(key);
    }

    public void setValue(String key, String value) {
        loadProperties();
        prop.setProperty(key, value);
        saveProperties();
    }

    private void saveProperties() {
        try (FileOutputStream fr = new FileOutputStream(file)) {
            prop.store(fr, "Properties");
        } catch (IOException ioe) {
            System.err.println("Can't save properties");
        }
    }

    private void loadProperties() {
        try (FileInputStream fi = new FileInputStream(file)) {
            prop.load(fi);
        } catch (IOException ioe) {
            System.err.println("Can't load properties");
        }
    }
    
    private void setDefaultValues() {
        setValue("SBP", "1200");
        setValue("DBP", "1200");
        setValue("BPM", "3000");
        setValue("TEMP", "1800");        
        saveProperties();
    }
}
