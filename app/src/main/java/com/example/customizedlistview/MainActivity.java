package com.example.customizedlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<User> arraylist=new ArrayList<User>();
        arraylist.add(new User("USMAN","Where u At?","20/03/2022",R.drawable.ic_launcher_background));
        arraylist.add(new User("Ahmed","Where u At?","20/03/2022",R.drawable.ic_launcher_background));
        arraylist.add(new User("Saad","Where u At?","20/03/2022",R.drawable.ic_launcher_background));
        arraylist.add(new User("Anns","Where u At?","20/03/2022",R.drawable.ic_launcher_background));
        arraylist.add(new User("Dar","Where u At?","20/03/2022",R.drawable.ic_launcher_background));
        ListView listView=findViewById(R.id.listview);
        ListAdaptor adapter = new ListAdaptor(this,0, arraylist);
        listView.setAdapter(adapter);
    }
}