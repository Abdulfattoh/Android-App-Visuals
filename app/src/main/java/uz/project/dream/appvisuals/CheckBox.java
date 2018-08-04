package uz.project.dream.appvisuals;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Abdufattokh on 8/4/2018.
 */

public class CheckBox extends AppCompatActivity{

    private android.widget.CheckBox java;
    private android.widget.CheckBox php;
    private android.widget.CheckBox python;
    private Button natija;
    private TextView result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_box_activity);

        java = findViewById(R.id.java);
        php = findViewById(R.id.php);
        python = findViewById(R.id.python);
        natija = findViewById(R.id.natija);
        result = findViewById(R.id.result);

        natija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(java.getText().toString() + " status : " + java.isChecked() + "\n");
                stringBuilder.append(php.getText().toString() + " status : " + php.isChecked() + "\n");
                stringBuilder.append(python.getText().toString() + " status : " + python.isChecked() + "\n");
                //\n - enter yangi satrdan boshlash

                result.setText(stringBuilder);
            }
        });

    }
}
