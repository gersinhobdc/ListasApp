package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView idRecyclerFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerFilmes = findViewById(R.id.idRecyclerFilmes);

        idRecyclerFilmes.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        idRecyclerFilmes.setHasFixedSize(true);

        //idRecyclerFilmes.setAdapter(adapter);


    }
}