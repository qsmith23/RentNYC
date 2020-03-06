package com.example.rentnyc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TennantAccountPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tennant_account_page);

        Button backBtn = (Button) findViewById((R.id.backBtnTAcct));

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back(v);
            }
        });
    }

    public void back(View v){
        Intent intent = new Intent(this, TenantHome.class);
        startActivity(intent);
    }
}
