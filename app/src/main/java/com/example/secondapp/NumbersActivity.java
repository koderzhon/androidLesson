package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.secondapp.content.Content;
import com.example.secondapp.content.ContentAdapter;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    ArrayList<Content> contents = new ArrayList<Content>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        setTitle(R.string.numbers);

        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        ContentAdapter adapter = new ContentAdapter(this, contents);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

        // устанавливаем для списка адаптер

        recyclerView.setAdapter(adapter);

    }
    private void setInitialData(){

        contents.add(new Content ("Один", "Число", R.drawable.one));
        contents.add(new Content ("Два", "Число", R.drawable.two));
        contents.add(new Content ("Три", "Число", R.drawable.three));
        contents.add(new Content ("Четыри", "Число", R.drawable.four));
        contents.add(new Content ("Пять", "Число", R.drawable.five));
    }
}