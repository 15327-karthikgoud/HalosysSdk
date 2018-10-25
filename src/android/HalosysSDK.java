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
        }
    
        return false;
    }


   

    public void add(JSONArray args, CallbackContext callback){
if(args !=null){
try{
int p1 = Integer.paseInt(args.getJSONObject(0).getString("param1"));
int p2 = Integer.paseInt(args.getJSONObject(0).getString("param2"));
return callback.sucess("" + (p1+p2));
}
catch(Exception ex){
callback.error("something went wrong" + ex);
}
}
callback.error('please pass valid arguments');
}

}
}
