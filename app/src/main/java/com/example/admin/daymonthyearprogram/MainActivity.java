package com.example.admin.daymonthyearprogram;

import android.annotation.TargetApi;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txt=(TextView)findViewById(R.id.txtdate);
        Button btnnext=(Button)findViewById(R.id.btnnext);
        TextView txt1=(TextView)findViewById(R.id.txtdate2);

        long date = System.currentTimeMillis();

        SimpleDateFormat sdf = new SimpleDateFormat("MMM MM dd, yyyy h:mm a");
        String dateString = sdf.format(date);
        txt.setText(dateString);



        long date1 = System.currentTimeMillis();

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy, dd MM MMM h:mm a");
        String dateString1 = sdf1.format(date1);
        txt1.setText(dateString1);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
