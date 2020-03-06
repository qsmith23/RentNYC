package com.example.rentnyc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TenantRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenant_registration);

        Button createUsrBtn = (Button) findViewById(R.id.tenantCreateBtn);

        TextView name = findViewById(R.id.tenantNameInput);

        createUsrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createTenant(v);
            }
        });

    }

    public void createTenant(View v){
        Intent intent = new Intent(this, TenantHome.class);
        startActivity(intent);
    }

}
