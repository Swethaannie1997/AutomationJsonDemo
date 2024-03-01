package Page;

import org.json.simple.JSONObject;

public class InputPage {

    public JSONObject getInputData(String filePath) {
    	
        return Jsonutilities.readJsonFile(filePath);
    }
public JSONObject getSignupInputData(String filePath) {
    	
        return Jsonutilities.readJsonFile(filePath);
    }
public JSONObject getSearchInputData(String filePath) {
	
    return Jsonutilities.readJsonFile(filePath);
}

}
