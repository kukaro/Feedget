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
    String data, img, comment, name, email, company, site;
    String color, x, width, text, y, height;

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
                    Log.e("jsonArray", jsonArray.length() + "");
                    Log.e("asdas: ", jsonArray.toString());
                    for (int i = 0; i < jsonArray.length(); i++) {
                        data = jsonArray.getString(i);
                        Log.e("data: ", data);
                        JSONObject data = new JSONObject(jsonArray.getString(i));
                        img = data.getString("img");
                        Log.e("img: ", img);
                        site = data.getString("site");
                        Log.e("site: ", site);
                        name = data.getString("name");
                        Log.e("name: ", name);
                        email = data.getString("email");
                        Log.e("email: ", email);
                        company = data.getString("company");
                        Log.e("company: ", company);
                        try{
                            comment = data.getString("comment");
                            Log.e("comment: ", comment);
                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                       JSONArray dataArray = new JSONArray(data.getString("data"));
                        for(int j = 0;j<dataArray.length();j++){
                            JSONObject dataObject = new JSONObject(dataArray.getString(j));
                            JSONObject  labelObject = new JSONObject(dataObject.getString("label"));
                         color =  labelObject.getString("color");
                            Log.e("color: ",color);
                          x =  labelObject.getString("x");
                          width =  labelObject.getString("width");
                           text = labelObject.getString("text");
                           y =  labelObject.getString("y");
                           height =  labelObject.getString("height");
                        }
                    }

                } catch (JSONException e1) {
                    e1.printStackTrace();
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

