package com.error41.pratice138;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    public  static  Custom adapter;
    ArrayList<model> dataModels;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setTitle("SecondActivity");
       // 1 - AdapterView : a listView;



        listView=findViewById(R.id.Listview);

        //2 - Data source

        dataModels=new ArrayList<>();



        dataModels.add( new model("alomgir","26",R.drawable.alomgir));
        dataModels.add( new model("arnika","40",R.drawable.arnika));
        dataModels.add( new model("","26",R.drawable.alomgir));
        dataModels.add( new model("asif","15",R.drawable.asif));
        dataModels.add( new model("alom","29",R.drawable.avijit));
        dataModels.add( new model("fahad","36",R.drawable.fahad));
        dataModels.add( new model("fariya","05",R.drawable.fariya));
        dataModels.add( new model("galib","06",R.drawable.galib));
        dataModels.add( new model("alomgir","02",R.drawable.hasibur));
        dataModels.add( new model("alomgir","09",R.drawable.humayun));
        dataModels.add( new model("imran.","39",R.drawable.imran));


        // 3- Adapter

        adapter =new Custom(getApplicationContext(), dataModels);
        listView.setAdapter(adapter);

       // 4 - Handling the click events on Listview item

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               Toast.makeText(getApplicationContext(), "Classmate_name"+adapter.getItem(i).getClassmate_name()+"\n"+
               "ROLLNUMBER "+adapter.getItem(i).getRoll(), Toast.LENGTH_SHORT
               ).show();
           }
       });

    }
}