package com.example.harshit.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","Hello World");
        Button b1=(Button)findViewById(R.id.button);
        EditText e1=findViewById(R.id.editText);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv=findViewById(R.id.tv1);
                tv.append("Hello world!!!!!!!!");

                Toast t=Toast.makeText(MainActivity.this,"button clicked",Toast.LENGTH_LONG);
                t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                t.show();

            }
        });

    }


    @Override
    protected void onStart()
    {
        super.onStart();
       Toast.makeText(this,"in onstart()",Toast.LENGTH_SHORT).show();



    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this," onpause() called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onstart() called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onrestart()called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onstop()called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this," ondestroy()called",Toast.LENGTH_SHORT).show();
    }
}
