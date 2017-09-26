package hackathon.wap.wapsup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Join extends AppCompatActivity {
    Button joinButton;
    EditText joinUserId, joinPassword, joinPwdCheck, joinUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join);

        joinButton = (Button) findViewById(R.id.join_button);
        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent joinIntent = new Intent(getApplicationContext(), Login.class);
                startActivity(joinIntent);
                overridePendingTransition(0,0);
                finish();
            }
        });
    }
}
