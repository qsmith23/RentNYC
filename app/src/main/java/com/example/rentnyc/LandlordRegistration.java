package com.example.rentnyc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandlordRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landlord_registration);

        Button LLCreateBtn = (Button) findViewById(R.id.LLCreateBtn);

        LLCreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createLandlord2(v);
            }
        });
    }

    public void createLandlord2(View v){
        Intent intent = new Intent(this, TenantHome.class);
        startActivity(intent);
    }
}
