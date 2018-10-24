package cordova.plugin.halosys.sdk;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import src.android.api.ISession;
/**
 * This class echoes a string called from JavaScript.
 */
public class HalosysSDK extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
       
        if(action.equals("Session")){
this.Session(Context context, String _appname, String _appUrl, String _appKey, String _appSecret, boolean appLog, boolean _useRefreshToken);
return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }


}
