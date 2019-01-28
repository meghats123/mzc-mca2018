package com.example.administrator.mzcandroidmca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UserlistActivity extends AppCompatActivity {
TextView tv1;
    String getname,getusername,getemail,getstreet,getsuite,getcity,getzipcode,getphone,getwebsite, finalData="";
    String url="https://jsonplaceholder.typicode.com/users";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist);
        tv1=(TextView)findViewById(R.id.tv);

FetchData();
    }

    private void FetchData() {
//        Toast.makeText(getApplicationContext(),"haii",Toast.LENGTH_LONG).show();
        StringRequest stringRequest=new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("response", response);
                        try {
                            JSONArray jsonArray = new JSONArray(response);
                            for (int i=0;i<jsonArray.length();i++)
                            {
                                JSONObject jsonObject=jsonArray.getJSONObject(i);
                                getname=jsonObject.getString("name");
                                Log.d("Names",getname);
                            getusername=jsonObject.getString("username");
                                Log.d("Username",getusername);

                            getemail=jsonObject.getString("email");
                                Log.d("Email",getemail);
                                getphone=jsonObject.getString("phone");
                                Log.d("Phone",getphone);
                                getwebsite=jsonObject.getString("website");
                                Log.d("Website",getwebsite);


                                JSONObject ob1=new JSONObject(jsonObject.getString("address"));
                                getstreet=ob1.getString("street");
                                Log.d("Address",getstreet);
                            getsuite=ob1.getString("suite");
                                Log.d("Suite",getsuite);
                                getcity=ob1.getString("city");
                                Log.d("City",getcity);

                                getzipcode=ob1.getString("zipcode");
                                Log.d("Zipcode",getzipcode);
                                finalData+="Name:"+getname+"\n";
                                finalData+="Username:"+getusername+"\n";
                                finalData+="Email:"+getemail+"\n\n" +
                                        "\n";



                            }
                           tv1.setText(finalData);
                        }
                        catch (JSONException ob)
                        {
                            Log.d("Exception",ob.toString());

                        }
                    }

                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );

        RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(stringRequest);
    }
}
