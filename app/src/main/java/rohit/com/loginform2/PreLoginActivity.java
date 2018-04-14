package rohit.com.loginform2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreLoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button mLoginbutton, mRegisterButton, mAdminLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_login);

        mLoginbutton= findViewById(R.id.button2);
        mRegisterButton = findViewById(R.id.button3);
        mAdminLogin = findViewById(R.id.button);

        mLoginbutton.setOnClickListener(this);
        mRegisterButton.setOnClickListener(this);
        mAdminLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

     switch (v.getId()){
         case R.id.button2 :
             Intent intent = new Intent(this, MainActivity.class);
             startActivity(intent);
             break;
         case R.id.button3:
             Intent intent1 = new Intent(this, UserRegistration.class);
             startActivity(intent1);
             break;
         case R.id.button:
             Intent mIntentAdminLogin = new Intent(this, AdminLoginActivity.class);
             startActivity(mIntentAdminLogin);


     }
    }
}
