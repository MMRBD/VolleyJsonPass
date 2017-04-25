package com.example.mokle.volleyjsonpass;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by mokle on 4/26/2017.
 */

public class MySingleton {
    private static MySingleton mInstnt;
    private RequestQueue requestQueue;
    private static Context mContext;

    private MySingleton(Context mContext){
        this.mContext = mContext;
        requestQueue = getRequestQueue();
    }

    public RequestQueue getRequestQueue(){
        if(requestQueue == null){
            requestQueue = Volley.newRequestQueue(mContext.getApplicationContext());
        }

        return requestQueue;
    }

    public static synchronized MySingleton getInstent( Context  context){
        if (mInstnt == null){
            mInstnt = new MySingleton(mContext);
        }
        return mInstnt;
    }
    public<T> void addToRequestque(Request<T> request){
        requestQueue.add(request);
    }
}
