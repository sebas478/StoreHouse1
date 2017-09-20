package cl.ramces.storehouse.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.BuildConfig;
import com.firebase.ui.auth.ResultCodes;

import java.util.Arrays;

import cl.ramces.storehouse.R;
import cl.ramces.storehouse.login.LoginCallback;
import cl.ramces.storehouse.login.LoginValidation;

public class SplashActivity extends AppCompatActivity implements LoginCallback {


    private static final int RC_SIGN_IN = 478 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new LoginValidation(this).validate();

    }


    @Override
    public void signin() {
        startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setProviders(Arrays.asList(new AuthUI.IdpConfig.Builder(AuthUI.EMAIL_PROVIDER).build(),
                                new AuthUI.IdpConfig.Builder(AuthUI.GOOGLE_PROVIDER).build(),
                                new AuthUI.IdpConfig.Builder(AuthUI.FACEBOOK_PROVIDER).build()))
                        .setIsSmartLockEnabled(!BuildConfig.DEBUG)
                        //.setTheme(R.style.LoginTheme)
                        //.setLogo(R.mipmap.logo)
                        .build(),
                RC_SIGN_IN);
    }

    @Override
    public void logged() {startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (RC_SIGN_IN == requestCode){
            if (ResultCodes.OK == resultCode){
                logged();
            }else {signin();}
        }
    }
}
