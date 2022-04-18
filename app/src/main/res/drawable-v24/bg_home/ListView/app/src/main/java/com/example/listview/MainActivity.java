package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lvPlace;
    String[] places = {  "Ho Tay", "Thap Rua", "Chua mot cot", "Quoc Tu Giam", "Lang Bac", "Thu vien QG"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvPlace = findViewById(R.id.lvPlace);

        ArrayAdapter<String> placeAdapter = new ArrayAdapter<String>(this, R.layout.list_view, places);


        lvPlace.setAdapter(placeAdapter);
        lvPlace.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String place = parent.getItemAtPosition(position).toString();

        if (place.equals("Ho Tay")){
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            startActivity(intent);
        }else if (place.equals("Thap Rua")){
            Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
            startActivity(intent);
        }else if (place.equals("Chua mot cot")){
            Intent intent = new Intent(getApplicationContext(), FourthActivity.class);
            startActivity(intent);
        }else if (place.equals("Quoc Tu Giam")){
            Intent intent = new Intent(getApplicationContext(), FifthActivity.class);
            startActivity(intent);
        }else if (place.equals("Lang Bac")){
            Intent intent = new Intent(getApplicationContext(), SixthActivity.class);
            startActivity(intent);
        }else if (place.equals("Thu vien QG")){
            Intent intent = new Intent(getApplicationContext(), SeventhActivity.class);
            startActivity(intent);
        }
    }
}
