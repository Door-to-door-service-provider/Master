package com.example.arushi.applicationpractise;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
     private EditText et1,et2;
     private Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
     public void addListenerOnButton(){
         et1=(EditText)findViewById(R.id.editText);
         et2=(EditText)findViewById(R.id.editText2);
         bt1=(Button)findViewById(R.id.button1);
         bt1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String v1=et1.getText().toString();
                 String v2=et2.getText().toString();
                 int a=Integer.parseInt(v1);
                 int b=Integer.parseInt(v2);
                 int add=a+b;
                 Toast.makeText(getApplicationContext(),String.valueOf(add),Toast.LENGTH_LONG).show();
             }
         });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
