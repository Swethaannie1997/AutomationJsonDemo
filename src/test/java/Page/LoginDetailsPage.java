package Page;

import org.json.simple.JSONObject;

public class LoginDetailsPage {

    public JSONObject getLoginDetails(String filePath) {
    	
        return Jsonutilities.readJsonFile(filePath);
    }
public JSONObject getSignupDetails(String filePath) {
    	
        return Jsonutilities.readJsonFile(filePath);
    }
public JSONObject getSearchDetails(String filePath) {
	
    return Jsonutilities.readJsonFile(filePath);
}
public JSONObject getCartDetails(String filePath) {
	
    return Jsonutilities.readJsonFile(filePath);
}
}