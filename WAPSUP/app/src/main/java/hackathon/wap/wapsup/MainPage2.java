package hackathon.wap.wapsup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class MainPage2 extends Fragment {
    String img,comment,name,email,company;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_page2_market, container, false);
        CustomRequest jsObjRequest = new CustomRequest(Request.Method.POST, Login.url, getParams(), networkSuccessListener(), networkErrorListener());
        Login.requestQueue.add(jsObjRequest);
        return view;
    }
    private Response.Listener<JSONObject> networkSuccessListener() {
        return new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(final JSONObject response) {
                try {
                    JSONArray jsonArray = new JSONArray(response.getString("feedget"));
                    for(int i = 0;i<jsonArray.length();i++){
                        if(jsonArray.getString(i).equals("{}"))
                            break;
                       Log.e("Json "+i, jsonArray.getString(i));
                    }
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
