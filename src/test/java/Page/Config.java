package Page;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
public class Config {
public static String GetAppConfigg(String settings) throws Exception
{
	String path1 = "src\\main\\java\\projectConfig\\Appsettings.json";
	System.out.println(path1);
	File file = new File(path1);
	String path = file.getAbsolutePath();
	String data = new String(Files.readAllBytes(Paths.get(path))); 
    JSONObject obj = new JSONObject(data);
    return obj.get(settings).toString();
}

}