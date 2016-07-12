package com.acadgild.jayadev.acadtrainers;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] courses=new String[]{"Java", "Android", "Linux", "Scala", "Web Development", "Node JS"};
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, courses);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Log.i("data",String.valueOf(position)+" "+l.getItemAtPosition(position));
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        Bundle bundle=new Bundle();
        bundle.putString("course", String.valueOf(l.getItemAtPosition(position)));
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
