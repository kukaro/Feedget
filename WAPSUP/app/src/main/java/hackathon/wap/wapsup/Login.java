package hackathon.wap.wapsup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    public Button loginButton, joinButton;
    public EditText userId, userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginButton = (Button) findViewById(R.id.login_button);
        joinButton = (Button) findViewById(R.id.login_join_button);

        userId = (EditText) findViewById(R.id.login_user_id);
        userPassword = (EditText) findViewById(R.id.login_user_password);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(getApplicationContext(), Main.class);
                startActivity(loginIntent);
                finish();
            }
        });


        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent joinIntent = new Intent(getApplicationContext(), Join.class);
                startActivity(joinIntent);
                overridePendingTransition(0, 0);
                finish();
            }
        });

    }
}
