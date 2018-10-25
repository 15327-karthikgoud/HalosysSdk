 var exec = require('cordova/exec');

module.exports.add = function (arg0, success, error) {
    exec(success, error, 'HalosysSDK', 'add', [arg0]);
};
// module.exports.Session = function(arg0, success, error){
//  exec(sucess,error,'HalosysSDK','Session',[args0]);
// };

