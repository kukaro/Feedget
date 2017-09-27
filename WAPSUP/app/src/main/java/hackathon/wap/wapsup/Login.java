package hackathon.wap.wapsup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import hackathon.wap.wapsup.model.dao.UserDao;
import hackathon.wap.wapsup.model.dto.UserDto;

public class Login extends AppCompatActivity {
    public Button loginButton, joinButton;
    public EditText userEmail, userPassword;
    public UserDao userDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginButton = (Button) findViewById(R.id.login_button);
        joinButton = (Button) findViewById(R.id.login_join_button);

        userEmail = (EditText) findViewById(R.id.login_user_email);
        userPassword = (EditText) findViewById(R.id.login_user_password);
        userDao = new UserDao(this);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = userEmail.getText().toString();
                if (userDao.read(email) != null) {
                    String pwd = userPassword.getText().toString();
                    UserDto dto = userDao.read(email);
                    String checkPwd = dto.getUserPassword().toString();
                    if (pwd.equals(checkPwd)) {
                        Toast.makeText(Login.this, "환영합니다", Toast.LENGTH_SHORT).show();
                        Intent loginIntent = new Intent(getApplicationContext(), Main.class);
                        startActivity(loginIntent);
                        finish();
                    } else {
                        Toast.makeText(Login.this, "비밀번호를 확인해 주세요", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(Login.this, "아이디가 없습니다", Toast.LENGTH_SHORT).show();
                }
            }
        });


        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent joinIntent = new Intent(getApplicationContext(), Join.class);
                startActivity(joinIntent);
                finish();
            }
        });

    }
}
