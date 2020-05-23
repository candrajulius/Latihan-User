package com.candra.latihan_dicoding.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.candra.latihan_dicoding.Adapter.UserAdapter;
import com.candra.latihan_dicoding.Model.DataUser;
import com.candra.latihan_dicoding.Model.User;
import com.candra.latihan_dicoding.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        private ArrayList<User> mantap = new ArrayList<>();
        private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Candra Julius Sinaga");
            getSupportActionBar().setSubtitle("Home");
        }
        listView = findViewById(R.id.list);
        mantap.addAll(DataUser.ambilData());
        UserAdapter adapter = new UserAdapter(this,mantap);
        adapter.setCandra(mantap);
        adapter.setContext(this);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent candra = new Intent(MainActivity.this, DetailActivity.class);
                candra.putExtra("putra",mantap.get(position));
                startActivity(candra);

            }
        });

    }
}
