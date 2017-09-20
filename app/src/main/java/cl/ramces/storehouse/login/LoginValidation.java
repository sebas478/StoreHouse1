package cl.ramces.storehouse.login;

import cl.ramces.storehouse.models.CurrentUser;

/**
 * Created by sebas on 31-08-2017.
 */

public class LoginValidation {

    private LoginCallback callback;

    public LoginValidation(LoginCallback callback){this.callback = callback;}

    public void validate(){
     if (new CurrentUser().getCurrent() != null){
         callback.logged();
     }else {
         callback.signin();
     }
    }
}
