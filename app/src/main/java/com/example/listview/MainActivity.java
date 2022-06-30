package com.example.listview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    Button spinner;

    ArrayList<String> arrName = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);
        spinner = findViewById(R.id.spinner);

        spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SpinnerAndAutocomplete.class));
            }
        });

        arrName.add("What is Variables Java?");
        arrName.add("What is Class in Java?");
        arrName.add("What is Objects in Java?");
        arrName.add("Haider");
        arrName.add("Babar Azam");
        arrName.add("Sachin");
        arrName.add("Dhone");
        arrName.add("Ankit");
        arrName.add("Abbas");
        arrName.add("Raza");
        arrName.add("John");
        arrName.add("Haider");
        arrName.add("Babar Azam");
        arrName.add("Sachin");
        arrName.add("Dhone");
        arrName.add("Ankit");
        arrName.add("Murtaza");
        arrName.add("Murtaza");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrName);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position)
                {
                    case 0:
                        AlertDialog.Builder answer0 = new AlertDialog.Builder(MainActivity.this);
                        answer0.setTitle("Answer");
                        answer0.setMessage("Variable in Java is a data container that saves the data values during Java program execution. Every variable is assigned a data type that designates the type and quantity of value it can hold. A variable is a memory location name for the data. A variable is a name given to a memory location.");
                        answer0.show();
                        break;
                    case 1:
                        AlertDialog.Builder answer1 = new AlertDialog.Builder(MainActivity.this);
                        answer1.setTitle("Answer");
                        answer1.setMessage("A class — in the context of Java — is a template used to create objects and to define object data types and methods. Classes are categories, and objects are items within each category. All class objects should have the basic class properties.");
                        answer1.show();
                        break;
                    case 2:
                        AlertDialog.Builder answer2 = new AlertDialog.Builder(MainActivity.this);
                        answer2.setTitle("Answer");
                        answer2.setMessage("A Java object is a member (also called an instance) of a Java class. Each object has an identity, a behavior and a state. The state of an object is stored in fields (variables), while methods (functions) display the object's behavior. Objects are created at runtime from templates, which are also known as classes.");
                        answer2.show();
                        break;
                    default: AlertDialog.Builder defaultAnswer = new AlertDialog.Builder(MainActivity.this);
                        defaultAnswer.setTitle("Oh no! ");
                        defaultAnswer.setMessage("Please choose the right one");
                        defaultAnswer.show();
                }
            }
        });

    }
}