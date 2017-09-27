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
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity {
    public Button loginButton, joinButton;
    public EditText userEmail, userPassword;
    public static String url = "http://192.168.43.153:3000/VolleyTest/Servlet2.java";
    String email, password, emailCheck = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        final RequestQueue requestQueue = Volley.newRequestQueue(Login.this);

        loginButton = (Button) findViewById(R.id.login_button);
        joinButton = (Button) findViewById(R.id.login_join_button);

        userEmail = (EditText) findViewById(R.id.login_user_email);
        userPassword = (EditText) findViewById(R.id.login_user_password);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = userEmail.getText().toString();
                password = userPassword.getText().toString();
                CustomRequest jsObjRequest = new CustomRequest(Request.Method.POST, Login.url, getParams(), networkSuccessListener(), networkErrorListener());
                requestQueue.add(jsObjRequest);

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

    private Response.Listener<JSONObject> networkSuccessListener() {
        return new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(final JSONObject response) {
                try {
                    emailCheck = response.getString("emailCheck");
                    if (emailCheck.equals("true")) {
                        Toast.makeText(Login.this, "환영합니다", Toast.LENGTH_SHORT).show();
                        Intent loginIntent = new Intent(getApplicationContext(), Main.class);
                        startActivity(loginIntent);
                        finish();
                    } else {
                        Log.e("Fail: ", "fail");
                    }
                    Log.e("emailCheck: ", emailCheck);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public Map<String, String> getParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("email", email);
        params.put("password", password);
        params.put("name", "No");
        return params;
    }

    private Response.ErrorListener networkErrorListener() {
        return new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("오류발생 ", error.toString());
            }
        };

    }


}
