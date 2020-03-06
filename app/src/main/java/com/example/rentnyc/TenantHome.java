package com.example.rentnyc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TenantHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenant_home);

        Button nav2Faves = (Button) findViewById(R.id.favorites);
        Button searchBtn = (Button) findViewById(R.id.search);
        Button profDetailsBtn = (Button) findViewById((R.id.profile));

        nav2Faves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFaves(v);
            }
        });

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search(v);
            }
        });

        profDetailsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            openAcctDetails(v);
        }
    });
    }

    public void openFaves(View v){
        Intent intent = new Intent(this, FavoriteList.class);
        startActivity(intent);
    }

    public void search(View v){
        Intent intent = new Intent(this, SearchPage.class);
        startActivity(intent);
    }

    public void openAcctDetails(View v){
        Intent intent = new Intent(this, TennantAccountPage.class);
        startActivity(intent);
    }
}
