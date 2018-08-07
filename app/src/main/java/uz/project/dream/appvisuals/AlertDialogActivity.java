package uz.project.dream.appvisuals;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Abdufattokh on 8/7/2018.
 */

public class AlertDialogActivity extends AppCompatActivity{

    private AlertDialog.Builder builder;
    private Button show;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        show = findViewById(R.id.show);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // shu yerda biz alertdialogmizni qurib olamiz

                builder = new AlertDialog.Builder(AlertDialogActivity.this);

                //builder.setTitle(R.string.chiqish);
                builder.setTitle(getResources().getString(R.string.chiqish));

                builder.setMessage(getResources().getString(R.string.message));

                builder.setCancelable(false); // bekor qila olmasligi

                builder.setPositiveButton(getResources().getString(R.string.yes), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AlertDialogActivity.this.finish();
                    }
                });

                builder.setNegativeButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                // dialogni qurib bitkazdik builder

                AlertDialog dialog = builder.create();

                dialog.show();

            }
        });
    }
}
