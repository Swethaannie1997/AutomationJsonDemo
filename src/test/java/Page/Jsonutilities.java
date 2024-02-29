package Page;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;

import java.io.IOException;

public class Jsonutilities {
	
	 public static JSONObject readJsonFile(String filePath) {
	           try (FileReader reader = new FileReader(filePath)) {
	               JSONParser parser = new JSONParser();
	               return (JSONObject) parser.parse(reader);
	           } catch (IOException | ParseException e) {
	               e.printStackTrace();
	               return null;
	           }
	       }
	   }
	   

