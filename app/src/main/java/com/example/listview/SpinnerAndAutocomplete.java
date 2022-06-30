package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class SpinnerAndAutocomplete extends AppCompatActivity {

    Spinner spnr;
    AutoCompleteTextView actv;

    ArrayList<String> arrSpinner = new ArrayList<>();
    ArrayList<String> arrActv = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_and_autocomplete);

        spnr = findViewById(R.id.spnr);
        actv = findViewById(R.id.actv);


        //spinner

        arrSpinner.add("Aadhaar card");
        arrSpinner.add("Ration card");
        arrSpinner.add("Driving Licence");
        arrSpinner.add("Xth report card");
        arrSpinner.add("XIIth report card");
        arrSpinner.add("PAN card");
        arrSpinner.add("PASSPORT");
        arrSpinner.add("College ID card");


        //Autocomplete view

        arrActv.add("C");
        arrActv.add("C++");
        arrActv.add("Java");
        arrActv.add("Python");
        arrActv.add("SQL");
        arrActv.add("MySQl");
        arrActv.add("PHP");
        arrActv.add("HTML");
        arrActv.add("C Sharp");
        arrActv.add("C Objective");


        ArrayAdapter<String> spnrAdapter = new ArrayAdapter<>(SpinnerAndAutocomplete.this, android.R.layout.simple_spinner_dropdown_item,arrSpinner);
        spnr.setAdapter(spnrAdapter);

        ArrayAdapter<String> acv = new ArrayAdapter<>(SpinnerAndAutocomplete.this, android.R.layout.simple_list_item_1,arrActv);
        actv.setAdapter(acv);
        actv.setThreshold(1);




    }
}

