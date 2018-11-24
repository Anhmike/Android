package com.example.mvltsevinc.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        Person person1 = new Person("AAAA","12-12-2019","Male");
        Person person2 = new Person("AAAA","12-12-2019","Male");
        Person person3 = new Person("AAAA","12-12-2019","Male");
        Person person4 = new Person("AAAA","12-12-2019","Male");
        Person person5 = new Person("AAAA","12-12-2019","Male");
        Person person6 = new Person("AAAA","12-12-2019","Male");
        Person person7 = new Person("AAAA","12-12-2019","Male");
        Person person8 = new Person("AAAA","12-12-2019","Male");
        Person person9 = new Person("AAAA","12-12-2019","Male");
        Person person11 = new Person("AAAA","12-12-2019","Male");
        Person person22 = new Person("AAAA","12-12-2019","Male");
        Person person33 = new Person("AAAA","12-12-2019","Male");
        Person person44 = new Person("AAAA","12-12-2019","Male");
        Person person55 = new Person("AAAA","12-12-2019","Male");
        Person person66= new Person("AAAA","12-12-2019","Male");
        Person person77 = new Person("AAAA","12-12-2019","Male");
        Person person88 = new Person("AAAA","12-12-2019","Male");

        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);
        personList.add(person11);
        personList.add(person22);
        personList.add(person33);
        personList.add(person44);
        personList.add(person55);
        personList.add(person66);
        personList.add(person77);
        personList.add(person88);

        PersonListAdapter adapter = new PersonListAdapter(this,R.layout.adapter_view_layout,personList);
        listView.setAdapter(adapter);
    }
}
