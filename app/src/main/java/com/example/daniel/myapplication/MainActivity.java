package com.example.daniel.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.ListAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.listView);
        final ArrayList<String> myFamily = new ArrayList<String>();
        myFamily.add("Joe");
        myFamily.add("Jazz");
        myFamily.add("David");
        myFamily.add("Daniel");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,myFamily);

        list.setAdapter(arrayAdapter);
        //up to here just creates list and populates it

        //below is how you change what happens when its tapped

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position /* Position on list*/, long l) {
                Toast.makeText(MainActivity.this, myFamily.get(position),Toast.LENGTH_SHORT ).show();

            }
        });
    }
}
