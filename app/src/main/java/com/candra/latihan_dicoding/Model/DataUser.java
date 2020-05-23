package com.candra.latihan_dicoding.Model;

import com.candra.latihan_dicoding.R;

import java.util.ArrayList;

public class DataUser {
    private static String [] Username = {
            "JakeWharton",
            "amitshekhariitbhu",
            "Romainguy",
            "chrisbanes",
            "tipsy",
            "ravi8x",
            "jasoet",
            "budioktaviyan",
            "hendisantika",
            "sidiqperma"
    };
    private static String [] name = {
            "Jake Wharton",
            "Amit Shekhar",
            "Romain Guy",
            "Chris Banes",
            "David",
            "Ravi Tamanda",
            "Deny Prasetyo",
            "Budi Oktavian",
            "Hendi Santika",
            "Sidiq Permana"

    };
    private static String [] lokasi = {
            "Pittsburgh,PA,USA",
            "New Delhi,India",
            "California",
            "Sydney, Australia",
            "Tronsdheim, Norway",
            "India",
            "Kotagede, Yogyakarta",
            "Jakarta, Indonesia",
            "Bojongsoang - Bandung Jawa Barat",
            "Jakarta Indonesia"

    };
    private static String [] reporsity = {
            "102",
            "37",
            "9",
            "30",
            "56",
            "28",
            "44",
            "110",
            "1064",
            "65"
    };
    private static String [] company = {
            "Google, Inc",
            "MindOrksOpenSource",
            "Google",
            "Google working on @android",
            "Working Group Two",
            "AndroidHive | Droid5",
            "gojek-engineering",
            "KotlinID",
            "JVMDeveloperID @KotlinID @IDDevOps",
            "Nusantara Beta Studio"

    };
    private static String [] follower = {
            "56995",
            "5153",
            "7972",
            "14725",
            "788",
            "18628",
            "277",
            "178",
            "428",
            "485"

    };
    private static String [] following = {
            "12",
            "2",
            "0",
            "1",
            "0",
            "3",
            "39",
            "23",
            "61",
            "10"

    };
    private static int [] avatar = {
            R.drawable.user1,
            R.drawable.user2,
            R.drawable.user3,
            R.drawable.user4,
            R.drawable.user5,
            R.drawable.user6,
            R.drawable.user7,
            R.drawable.user8,
            R.drawable.user9,
            R.drawable.user10

    };

    public static ArrayList<User> ambilData(){
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < name.length; i++){
            User user = new User();
            user.setUsername(Username[i]);
            user.setName(name[i]);
            user.setCompany(company[i]);
            user.setFollowers(follower[i]);
            user.setReporsity(reporsity[i]);
            user.setLokasi(lokasi[i]);
            user.setFollowing(following[i]);
            user.setAvatar(avatar[i]);
            users.add(user);
        }
        return users;
    }
}
