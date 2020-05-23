package com.candra.latihan_dicoding.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.candra.latihan_dicoding.Model.User;
import com.candra.latihan_dicoding.R;

import java.util.ArrayList;

public class UserAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<User> candra;

    // Menset context
    public void setContext(Context context) {
        this.context = context;
    }
    // Menginisiasi user list
    public void setCandra(ArrayList<User> candra) {
        this.candra = candra;
    }

    // Membuta construktor di UserAdapter
    public UserAdapter(Context context, ArrayList<User> candra) {
        this.context = context;
        this.candra = candra;
    }

    @Override
    public int getCount() {
        return candra.size();
    }

    @Override
    public Object getItem(int position) {
        return candra.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View artikel = convertView;
        if (artikel == null) {
            artikel = LayoutInflater.from(context).inflate(R.layout.item_one, parent, false);
        }

        ViewHoler viewHoler = new ViewHoler(artikel);
        User users = (User) getItem(position);
        viewHoler.ambilXml(users);
        return artikel;
    }

    private class ViewHoler{
        private ImageView gambar;
        private TextView satu,dua;
        ViewHoler(View artikel){
            gambar = artikel.findViewById(R.id.gambar);
            satu = artikel.findViewById(R.id.text1);
            dua = artikel.findViewById(R.id.text21);
        }
        void ambilXml(User user){
            gambar.setImageResource(user.getAvatar());
            satu.setText(user.getUsername());
            dua.setText(user.getName());
        }
    }
}
