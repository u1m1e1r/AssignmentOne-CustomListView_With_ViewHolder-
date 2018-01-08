package com.mughal.sijawal.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static  int count=9;
    public void buttontapped(View view)
    {
        EditText user=(EditText) findViewById(R.id.user);
        EditText pass=(EditText) findViewById(R.id.pass);
        ImageView cat=(ImageView) findViewById(R.id.imageView);
        if(user.getText().toString().equals(pass.getText().toString())&&!(user.getText().toString().equals(null)))
        {
            Toast.makeText(getApplicationContext(),"Login Successfull " + " hello " +user.getText().toString(),Toast.LENGTH_LONG).show();

            //cat.setImageResource(R.drawable.image1);
        }
       else {
            Toast.makeText(getApplicationContext(), "Login unSuccessfull ", Toast.LENGTH_LONG).show();
        }//Log.d("error","Myname");
        if(count%9==0)
        {
            cat.setImageResource(R.drawable.image1);
        }
        else if(count%9==1)
        {
            cat.setImageResource(R.drawable.image2);
        }
        else if(count%9==2)
        {
            cat.setImageResource(R.drawable.image3);
        }
        else if(count%9==3)
        {
            cat.setImageResource(R.drawable.image4);
        }
        else if(count%9==4)
        {
            cat.setImageResource(R.drawable.image5);
        }
        else if(count%9==5)
        {
            cat.setImageResource(R.drawable.image6);
        }
        else if(count%9==6)
        {
            cat.setImageResource(R.drawable.image7);
        }
        else if(count%9==7)
        {
            cat.setImageResource(R.drawable.image8);
        }
        else
        {
            cat.setImageResource(R.drawable.image12);
        }
        count++;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
