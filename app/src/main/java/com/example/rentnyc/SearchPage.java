package com.example.rentnyc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);

        Button cancel = (Button) findViewById((R.id.cancelSearch));
        Button search = (Button) findViewById((R.id.search));

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back(v);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search(v);
            }
        });
    }

    public void back(View v){
        Intent intent = new Intent(this, TenantHome.class);
        startActivity(intent);
    }

    public void search(View v){
        Intent intent = new Intent(this, TenantHome.class);
        startActivity(intent);
    }
}
