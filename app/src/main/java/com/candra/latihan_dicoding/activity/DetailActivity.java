package com.candra.latihan_dicoding.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.candra.latihan_dicoding.Model.User;
import com.candra.latihan_dicoding.R;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
        private ArrayList<User> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Candra Julius Sinaga");
            getSupportActionBar().setSubtitle("Detail");
        }

        Intent intent = getIntent();
        User user = intent.getParcelableExtra("putra");

        int photo = user.getAvatar();
        String nama = user.getName();
        String username1 = user.getUsername();
        String lokasi = user.getLokasi();
        String reporsity = user.getReporsity();
        String company = user.getCompany();
        String following = user.getFollowing();
        String follwer = user.getFollowers();



        ImageView gambar = findViewById(R.id.gambar1);
        TextView usernama = findViewById(R.id.usernama);
        TextView nama1 = findViewById(R.id.nama);
        TextView lokasi1 = findViewById(R.id.lokasi);
        TextView reporstiy = findViewById(R.id.reporsity);
        TextView company1 = findViewById(R.id.company);
        TextView feed = findViewById(R.id.feedback);
        TextView follwer1 = findViewById(R.id.follower);

        gambar.setImageResource(photo);
        usernama.setText(username1);
        nama1.setText(nama);
        lokasi1.setText(lokasi);
        reporstiy.setText(reporsity);
        company1.setText(company);
        feed.setText(following);
        follwer1.setText(follwer);



    }
}
