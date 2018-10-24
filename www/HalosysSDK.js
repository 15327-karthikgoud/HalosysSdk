 var exec = require('cordova/exec');

module.exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'HalosysSDK', 'coolMethod', [arg0]);
};
module.exports.Session = function(arg0, success, error){
 exec(sucess,error,'Session','Session',[args0]);
};
