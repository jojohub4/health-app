package com.example.healthapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class DoctorDetail extends AppCompatActivity {
    private String[][] doctor_details1 = {
            {"Doctor Name : Ajit Sasta", "Hospital Address : Pimpri","Exp : 5yrs", "Mobile No : 94098382", "606"},
            {"Doctor Name : joseph Njoro", "Hospital Address : kiambu","Exp : 15yrs", "Mobile No : 32098382", "1606"},
            {"Doctor Name : Mathew Mutua", "Hospital Address : Nairobi","Exp : 4yrs", "Mobile No : 94098232", "206"},
            {"Doctor Name : kim karen", "Hospital Address : Nakuru","Exp : 21yrs", "Mobile No : 12098382", "2606"},
            {"Doctor Name : Ben Nita", "Hospital Address : Mwala","Exp : 8yrs", "Mobile No : 94098349", "906"},
    };
    private String[][] doctor_details2 = {
            {"Doctor Name : Ajit Sasta", "Hospital Address : Pimpri","Exp : 5yrs", "Mobile No : 94098382", "606"},
            {"Doctor Name : joseph Njoro", "Hospital Address : kiambu","Exp : 15yrs", "Mobile No : 32098382", "1606"},
            {"Doctor Name : Mathew Mutua", "Hospital Address : Nairobi","Exp : 4yrs", "Mobile No : 94098232", "206"},
            {"Doctor Name : kim karen", "Hospital Address : Nakuru","Exp : 21yrs", "Mobile No : 12098382", "2606"},
            {"Doctor Name : Ben Nita", "Hospital Address : Mwala","Exp : 8yrs", "Mobile No : 94098349", "906"},
    };
    private String[][] doctor_details3 = {
            {"Doctor Name : Ajit Sasta", "Hospital Address : Pimpri","Exp : 5yrs", "Mobile No : 94098382", "606"},
            {"Doctor Name : joseph Njoro", "Hospital Address : kiambu","Exp : 15yrs", "Mobile No : 32098382", "1606"},
            {"Doctor Name : Mathew Mutua", "Hospital Address : Nairobi","Exp : 4yrs", "Mobile No : 94098232", "206"},
            {"Doctor Name : kim karen", "Hospital Address : Nakuru","Exp : 21yrs", "Mobile No : 12098382", "2606"},
            {"Doctor Name : Ben Nita", "Hospital Address : Mwala","Exp : 8yrs", "Mobile No : 94098349", "906"},
    };
    private String[][] doctor_details4 = {
            {"Doctor Name : Ajit Sasta", "Hospital Address : Pimpri","Exp : 5yrs", "Mobile No : 94098382", "606"},
            {"Doctor Name : joseph Njoro", "Hospital Address : kiambu","Exp : 15yrs", "Mobile No : 32098382", "1606"},
            {"Doctor Name : Mathew Mutua", "Hospital Address : Nairobi","Exp : 4yrs", "Mobile No : 94098232", "206"},
            {"Doctor Name : kim karen", "Hospital Address : Nakuru","Exp : 21yrs", "Mobile No : 12098382", "2606"},
            {"Doctor Name : Ben Nita", "Hospital Address : Mwala","Exp : 8yrs", "Mobile No : 94098349", "906"},
    };
    private String[][] doctor_details5 = {
            {"Doctor Name : Ajit Sasta", "Hospital Address : Pimpri","Exp : 5yrs", "Mobile No : 94098382", "606"},
            {"Doctor Name : joseph Njoro", "Hospital Address : kiambu","Exp : 15yrs", "Mobile No : 32098382", "1606"},
            {"Doctor Name : Mathew Mutua", "Hospital Address : Nairobi","Exp : 4yrs", "Mobile No : 94098232", "206"},
            {"Doctor Name : kim karen", "Hospital Address : Nakuru","Exp : 21yrs", "Mobile No : 12098382", "2606"},
            {"Doctor Name : Ben Nita", "Hospital Address : Mwala","Exp : 8yrs", "Mobile No : 94098349", "906"},
    };
    TextView tv;
    Button btn;
    String [][] doctor_details = {};
    ArrayList list;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_detail);
        EdgeToEdge.enable(this);

        tv = findViewById(R.id.textViewDDtitle);
        btn = findViewById(R.id.buttonBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("Family Physician")==0)
            doctor_details = doctor_details1;
        else
        if (title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if (title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if (title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else

            doctor_details = doctor_details5;


            btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorDetail.this, FindDoctor.class));
            }
        });

            list = new ArrayList<>()
    }
}