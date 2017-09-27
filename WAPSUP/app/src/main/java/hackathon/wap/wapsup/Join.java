package hackathon.wap.wapsup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Join extends AppCompatActivity {

    Button joinButton;
    EditText joinUserEmail, joinPassword, joinPwdCheck, joinUserName;
    String emailCheck = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join);
        final RequestQueue requestQueue = Volley.newRequestQueue(Join.this);

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
                } else if (!emailCheck(joinUserEmail.getText().toString())) {
                    Toast.makeText(Join.this, "이메일 형식이 아닙니다", Toast.LENGTH_SHORT).show();
                } else {
                    if (joinPwdCheck.getText().toString().equals(joinPwdCheck.getText().toString())) {
                        CustomRequest jsObjRequest = new CustomRequest(Request.Method.POST, Login.url, getParams(), networkSuccessListener(), networkErrorListener());
                        requestQueue.add(jsObjRequest);
                    } else {
                        Toast.makeText(Join.this, "비밀번호가 서로 다릅니다", Toast.LENGTH_SHORT).show();
                        joinPassword.setText("");
                        joinPwdCheck.setText("");
                    }
                }
            }
        });
    }

    private Response.Listener<JSONObject> networkSuccessListener() {
        return new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(final JSONObject response) {
                try {
                    emailCheck = response.getString("emailCheck");

                    if (emailCheck.equals("true")) {
                        Toast.makeText(Join.this, "존재하는 이메일 입니다", Toast.LENGTH_SHORT).show();
                        joinUserEmail.setText("");
                        joinPassword.setText("");
                        joinPwdCheck.setText("");
                        joinUserName.setText("");
                    } else {
                        Toast.makeText(Join.this, "회원가입을 축하합니다", Toast.LENGTH_SHORT).show();
                        Intent joinIntent = new Intent(getApplicationContext(), Login.class);
                        startActivity(joinIntent);
                        finish();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    private Response.ErrorListener networkErrorListener() {
        return new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("오류발생 ", error.toString());
            }
        };

    }

    public Map<String, String> getParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("name", joinUserName.getText().toString());
        params.put("email", joinUserEmail.getText().toString());
        params.put("password", joinPassword.getText().toString());
        return params;
    }

    public boolean emailCheck(String email) {
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return false;
        }
        return true;
    }

    static void setPolicyTime(CustomRequest jsonObjectRequest) {
        jsonObjectRequest.setRetryPolicy(new RetryPolicy() {
            @Override
            public int getCurrentTimeout() {
                return 50000;
            }

            @Override
            public int getCurrentRetryCount() {
                return 50000;
            }

            @Override
            public void retry(VolleyError error) throws VolleyError {

            }
        });
    }
}
