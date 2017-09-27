package hackathon.wap.wapsup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import hackathon.wap.wapsup.model.dao.UserDao;
import hackathon.wap.wapsup.model.dto.UserDto;

public class Join extends AppCompatActivity {

    public UserDto userDto;
    Button joinButton;
    EditText joinUserEmail, joinPassword, joinPwdCheck, joinUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join);

        joinUserEmail = (EditText) findViewById(R.id.join_user_email);
        joinPassword = (EditText) findViewById(R.id.join_user_password);
        joinPwdCheck = (EditText) findViewById(R.id.join_user_pwdcheck);
        joinUserName = (EditText) findViewById(R.id.join_user_name);


        joinButton = (Button) findViewById(R.id.join_button);
        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (joinUserEmail.getText().toString().equals("")) {
                    Toast.makeText(Join.this, "이메일을 확인해 주세요", Toast.LENGTH_SHORT).show();
                } else if (joinPassword.getText().toString().equals("") || joinPwdCheck.getText().toString().equals("")) {
                    Toast.makeText(Join.this, "비밀번호를 확인해 주세요", Toast.LENGTH_SHORT).show();
                } else if (joinUserName.getText().toString().equals("")) {
                    Toast.makeText(Join.this, "이름을 확인해 주세요", Toast.LENGTH_SHORT).show();
                }else if(!emailCheck(joinUserEmail.getText().toString())){
                    Toast.makeText(Join.this, "이메일 형식이 아닙니다", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (joinPwdCheck.getText().toString().equals(joinPwdCheck.getText().toString())) {
                        UserDao userDao = new UserDao(Join.this);
                        Log.e("aa", joinPassword.getText() + " : " + joinPwdCheck.getText());
                        UserDto userDto = userDao.read(joinUserEmail.getText().toString());
                        if (userDto == null) {
                            UserDto dto = new UserDto();
                            dto.setUserEmail(joinUserEmail.getText().toString());
                            dto.setUserPassword(joinPassword.getText().toString());
                            dto.setUserName(joinUserName.getText().toString());
                            userDao.insert(dto);
                            Toast.makeText(Join.this, "회원가입을 축하합니다", Toast.LENGTH_SHORT).show();
                            Intent joinIntent = new Intent(getApplicationContext(), Login.class);
                            startActivity(joinIntent);
                            finish();
                        } else {
                            Toast.makeText(Join.this, "존재하는 이메일 입니다", Toast.LENGTH_SHORT).show();
                            joinUserEmail.setText("");
                            joinPassword.setText("");
                            joinPwdCheck.setText("");
                            joinUserName.setText("");
                        }
                    } else {
                        Toast.makeText(Join.this, "비밀번호가 서로 다릅니다", Toast.LENGTH_SHORT).show();
                        joinPassword.setText("");
                        joinPwdCheck.setText("");
                    }
                }
            }
        });
    }

    public boolean emailCheck(String email) {
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return false;
        }
        return true;
    }
}
