package fitpeo_karan_SDET;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ApplicationsSettings {
    public static final String BROWSER_NAME ;
    public static final String CHROME_PATH;
    public static final String URL_PATH;

    static {
        // Read properties file.
        Properties properties = new Properties();
        try {
            //ClassPathResource res = new ClassPathResource("environment.properties");
            FileReader reader= new FileReader("src/test/resources/environment.properties");
            properties.load(reader);
           // System.setProperty("DEV_ENV", "true");
           // properties.putAll(System.getProperties());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
      //  BROWSER_NAME =System.getenv().get("BROWSER");}
        BROWSER_NAME=properties.getProperty("BROWSER");
        CHROME_PATH = properties.getProperty("chromeDriver_path");
        URL_PATH=properties.getProperty("url_path");


    
}
    public static String getChromePath() { return CHROME_PATH;
    }}
