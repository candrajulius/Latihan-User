package com.candra.latihan_dicoding.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private String Username;
    private String name;
    private String lokasi;
    private String reporsity;
    private String company;
    private String followers;
    private String following;
    private int avatar;



    public User() {

    }

    public static Creator<User> getCREATOR() {
        return CREATOR;
    }

    public String getUsername() {
        return Username;
    }

    public String getName() {
        return name;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getReporsity() {
        return reporsity;
    }

    public String getCompany() {
        return company;
    }

    public String getFollowers() {
        return followers;
    }

    public String getFollowing() {
        return following;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setReporsity(String reporsity) {
        this.reporsity = reporsity;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Username);
        dest.writeString(name);
        dest.writeString(lokasi);
        dest.writeString(reporsity);
        dest.writeString(company);
        dest.writeString(followers);
        dest.writeString(following);
        dest.writeInt(avatar);
    }
    protected User(Parcel in) {
        Username = in.readString();
        name = in.readString();
        lokasi = in.readString();
        reporsity = in.readString();
        company = in.readString();
        followers = in.readString();
        following = in.readString();
        avatar = in.readInt();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
