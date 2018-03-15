import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.arushi.applicationpractise.R;

/**
 * Created by Arushi on 12-03-2018.
 */


public class TogButton extends Activity {
    private ToggleButton tb1,tb2;
    private Button b1;

    protected void onCreate (Bundle SavedInstanceState)
    {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.buttontoggle);
        addClickListenerOnButton();
    }
    public void addClickListenerOnButton()
    {
       tb1=(ToggleButton)findViewById(R.id.togglebutton1);
        tb2=(ToggleButton)findViewById(R.id.togglebutton2);
        b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result=new StringBuilder();
                result.append("ToggleButton=").append(tb1.getText());
                result.append("ToggleButton=").append(tb2.getText());
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();

            }
        });
    }
}
