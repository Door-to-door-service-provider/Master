package com.example.arushi.applicationpractise;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by Arushi on 12-03-2018.
 */

public class ChckBox extends Activity {
    private CheckBox c1,c2,c3;
    private Button b1;
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.boxcheck);
        addClickListenerOnButton();
    }
    public void addClickListenerOnButton()
    {
        c1=(CheckBox)findViewById(R.id.checkbox1);
        c2=(CheckBox)findViewById(R.id.checkbox2);
        c3=(CheckBox)findViewById(R.id.checkbox3);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalamount=0;
                StringBuilder result=new StringBuilder();
                result.append("");
                if(c1.isChecked())
                {/* String s1=c1.getText().toString();
                  result.append(s1);//custom checkbox
                */
                    result.append("\nPizza:100Rs");
                    totalamount+=100;
                }
                if(c2.isChecked())
                {
                    result.append("\nPizza:70Rs");
                    totalamount+=70;
                }
                if(c3.isChecked())
                {
                    result.append("\nSandwich:50Rs");
                    totalamount+=50;
                }
                result.append("Toatl:"+totalamount+"Rs");
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
                /*
                   if(result!=null && result.toString.equals(""))
                   {Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
                   }else
                   Toast.makeText(getApplicationContext(),"Nothing Selected",Toast.LENGTH_LONG).show();
                */
            }
        });
    }
}
