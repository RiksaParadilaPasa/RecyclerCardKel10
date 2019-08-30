package com.example.recyclercardkel10.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclercardkel10.MainActivity;
import com.example.recyclercardkel10.R;

import java.util.List;

public class AdapterMail extends RecyclerView.Adapter<AdapterMail.ViewHolder> {

    private List<Entity_Mail> mailList;
    private Context mContext;

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView judul,subjudul,about,waktu,logo;
        LinearLayout lr;

        public ViewHolder(View v){
            super(v);
            judul = (TextView)v.findViewById(R.id.tv_judul);
            subjudul = (TextView)v.findViewById(R.id.tv_subjudul);
            about = (TextView)v.findViewById(R.id.tv_about);
            waktu = (TextView)v.findViewById(R.id.tv_clock);
            logo = (TextView)v.findViewById(R.id.tv_logo);
            lr = (LinearLayout)v.findViewById(R.id.lr_container);
        }
    }

    public AdapterMail(Context mContext, List<Entity_Mail> mailList){
        this.mContext = mContext;
         this.mailList = mailList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_mail,parent,false);
       ViewHolder vh = new ViewHolder(v);

        return vh;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
             Entity_Mail mail = mailList.get(position);

            holder.judul.setText(String.valueOf(mail.getJudul()));
            holder.subjudul.setText(String.valueOf(mail.getSubJudul()));
            holder.about.setText(String.valueOf(mail.getAbout()));
            holder.waktu.setText(String.valueOf(mail.getWaktu()));
            holder.logo.setText(String.valueOf(mail.getLogo()));

            holder.lr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent inten = new Intent(mContext,ItemMailActivity.class);
                    inten.putExtra("judul",mailList.get(position).getJudul());
                    inten.putExtra("subjudul",mailList.get(position).getSubJudul());
                    inten.putExtra("about",mailList.get(position).getAbout());
                    inten.putExtra("waktu",mailList.get(position).getWaktu());
                    inten.putExtra("logo",mailList.get(position).getLogo());

                    mContext.startActivity(inten);
                }
            });

    }

    @Override
    public int getItemCount() {
        return mailList.size();
    }




}
