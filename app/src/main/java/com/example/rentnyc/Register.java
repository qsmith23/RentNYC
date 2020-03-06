package com.example.rentnyc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button tenantSelect = (Button) findViewById(R.id.tenant);
        Button landlordSelect = (Button) findViewById((R.id.landlord));

        tenantSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createUsr(v);
            }
        });

        landlordSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createLandlord(v);
            }
        });
    }

    public void createUsr(View v){
        Intent intent = new Intent(this, TenantRegistration.class);
        startActivity(intent);
    }

    public void createLandlord(View v){
        Intent intent = new Intent(this, LandlordRegistration.class);
        startActivity(intent);
    }
}
