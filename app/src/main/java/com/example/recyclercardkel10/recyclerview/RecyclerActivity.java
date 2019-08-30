package com.example.recyclercardkel10.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclercardkel10.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Entity_Mail> mailList;
    private AdapterMail adapterMail;

    String[] judul = {
        "RPP",
        "CODER SHACK.",
        "Facebook",
        "Gmail",
        "Google++",
        "Twitter",
        "Instagram",
        "Steam",
        "Garena",
        "Sekolah"
    };

    String[] subjudul = {
            "URGENT!!!",
            "Your JOB",
            "you have 1 new notifications",
            "Verification your account",
            "Top Suggested",
            "New Follower",
            "New Recomends to Follow",
            "Steam wallet ",
            "Succes verification account",
            "New Question"
    };

    String[] about = {
            "Contact me now!!!\n Congrats you get what you want",
            "Create CRUD LARAVEL \n 1.Create student data \n2.Delete Teacher Data  \n3.Change Data School \n4.Read All data ",
            "you have 1 new notifications \n riksa suggested you play this game",
            "Verification now , Or Your account will be blocked",
            "Top Suggested, Trending Topic Of the month",
            "New Followers, Rendra has followed you",
            "New Recomends to Follow, herlangga, Rendra ,Riksa Paradila Pasa",
            "Successfully entered the wallet \n Thank you for filling out Steam Wallet",
            "Succes verification account \nyour account has ready to play",
            "HOMEWORK FOR STUDENT,  PWPB learn about Android"
    };

    String[] time = {
            "20:00",
            "19:30",
            "15:00",
            "13:52",
            "12:00",
            "02:41",
            "06:28",
            "04:45",
            "02:00",
            "00:00"
    };

    String[] logo = {
            "R",
            "C",
            "F",
            "G",
            "G",
            "T",
            "I",
            "S",
            "G",
            "S"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        mRecyclerView = (RecyclerView)findViewById(R.id.rv_container);

        if (mRecyclerView != null){
            mRecyclerView.setHasFixedSize(true);
        }

        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLayoutManager);

        mailList = new ArrayList<>();

        for(int i = 0; i < judul.length; i++){
            Entity_Mail mail = new Entity_Mail(judul[i],subjudul[i],about[i],time[i],logo[i]);
            mailList.add(mail);

         adapterMail = new AdapterMail(this,mailList);

         mRecyclerView.setAdapter(adapterMail);
         adapterMail.notifyDataSetChanged();

        }

    }
}
