package uz.project.dream.appvisuals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroup = findViewById(R.id.radioGroupID);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton = findViewById(checkedId);
                switch (radioButton.getId()){
                    case R.id.male:
                        Toast.makeText(RadioButtonActivity.this, "Male is checked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.female:
                        Toast.makeText(RadioButtonActivity.this, "Female is checked", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
