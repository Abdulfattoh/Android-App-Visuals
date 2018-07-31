package uz.project.dream.appvisuals;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.suke.widget.SwitchButton;

/**
 * Created by Abdufattokh on 7/31/2018.
 */

public class ToggleButton extends AppCompatActivity{

    private TextView result;
    private SwitchButton switchButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        result = findViewById(R.id.result);
        switchButton = findViewById(R.id.switch_button);

        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                if(isChecked){
                    result.setText("Status : true");
                }else{
                    result.setText("Status : false");
                }
            }
        });



    }
}
