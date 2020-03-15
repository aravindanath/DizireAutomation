package utilits;

import org.ini4j.Ini;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {

    /**
     * @Author
     * @param key
     * @return
     * @throws IOException
     *
     * This method will get value based on given key.
     */

    public static String getValue(String key) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "config.properties";
        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        String url = prop.getProperty(key);
        return url;
    }

    /**
     *
     * @param header
     * @param key
     * @return
     * @throws IOException
     */

    public static String getValue(String header, String key) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "data.ini";
        FileInputStream fis = new FileInputStream(path);
        Ini i = new Ini();
        i.load(fis);
        String val = i.get(header,key);
        return val;
    }


}
