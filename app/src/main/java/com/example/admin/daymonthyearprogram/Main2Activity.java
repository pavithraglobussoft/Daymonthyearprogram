package com.example.admin.daymonthyearprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Calendar c = Calendar.getInstance();
        System.out.println("Current time => " + c.getTime());

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = df.format(c.getTime());
        // formattedDate have current date/time
        Toast.makeText(this, formattedDate, Toast.LENGTH_SHORT).show();


        // Now we display formattedDate value in TextView
        TextView txtView = new TextView(this);
        txtView.setText("Current Date and Time : " + formattedDate);
        txtView.setGravity(Gravity.CENTER);
        txtView.setTextSize(20);
        setContentView(txtView);


        SimpleDateFormat df1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate1 = df1.format(c.getTime());
        // formattedDate have current date/time
        Toast.makeText(this, formattedDate1, Toast.LENGTH_SHORT).show();


        // Now we display formattedDate value in TextView
        TextView txtView1 = new TextView(this);
        txtView1.setText("Current Date and Time : " + formattedDate1);
        txtView1.setGravity(Gravity.TOP);
        txtView1.setTextSize(20);
        setContentView(txtView1);
    }
}