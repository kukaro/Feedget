package hackathon.wap.wapsup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class MainPage1 extends Fragment {

    MainPage1Adapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        adapter = new MainPage1Adapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_page1_home, container, false);
        final RequestQueue requestQueue = Volley.newRequestQueue(getContext());

        return view;
    }

    private Response.Listener<JSONObject> networkSuccessListener() {
        return new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(final JSONObject response) {
                try {
                    String emailCheck = response.getString("emailCheck");

                    Log.e("emailCheck: ", emailCheck);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public Map<String, String> getParams() {
        Map<String, String> params = new HashMap<String, String>();

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
