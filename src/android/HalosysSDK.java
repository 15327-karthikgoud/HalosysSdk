package cordova.plugin.halosys.sdk;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class HalosysSDK extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
      if(action.equals("add")){
            this.add(args,callbackContext);
            return true;
        }
    
        return false;
    }


   

    private void add(JSONArray args, CallbackContext callback){
if(args !=null){
try{
//int p1 = Integer.parseInt()
//int p2 = 
callback.success("5")
}
catch(Exception ex){
callback.error("something went wrong" + ex);
}
}
else{

callback.error("please pass valid arguments");
}
}

}

