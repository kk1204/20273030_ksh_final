package com.example.final_01;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        PersonAdapter adapter = new PersonAdapter();

        adapter.addItem(new Person("영화1", "흥미로웠다."));
        adapter.addItem(new Person("영화2", "재밌었다!"));
        adapter.addItem(new Person("영화3", "최고... 추천해 줘야지!"));
        adapter.addItem(new Person("영화4", "보길 잘했어."));
        adapter.addItem(new Person("영화5", "음..."));
        adapter.addItem(new Person("영화6", "영화관에서 보고 싶은 영화"));
        adapter.addItem(new Person("영화7", "괜찮은데?"));

        recyclerView.setAdapter(adapter);
    }
}