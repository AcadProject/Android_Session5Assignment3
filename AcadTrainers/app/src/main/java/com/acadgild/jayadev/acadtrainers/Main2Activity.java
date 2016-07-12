package com.acadgild.jayadev.acadtrainers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Switch;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txt=(TextView)findViewById(R.id.mentor);
        Intent in=getIntent();
        Bundle b=in.getExtras();

        switch (b.getString("course")){
            case "Java": txt.setText("Jayadev");break;
            case "Android": txt.setText("Amit Saxena");break;
            case "Linux": txt.setText("Jaya");break;
            case "Scala": txt.setText("Deva");break;
            case "Web Development": txt.setText("Amit");break;
            case "Node JS": txt.setText("Saxena");break;
        default:txt.setText("Unknown Mentor");
        }
    }
}
