package com.example.home_glide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {
private List<Music> music;
public void setData(List<Music> list){
    this.music=list;
    notifyDataSetChanged();
}
    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music,parent,false);

        return new MusicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
Music music1 = music.get(position);
if(music1==null){
    return;
}
holder.imgMusic.setImageResource(music1.getResourceId());
holder.txtName.setText(music1.getName());
holder.txtTitle.setText(music1.getTitle());
    }

    @Override
    public int getItemCount() {
    if(music != null){
        return music.size();
    }
        return 0;
    }

    public class MusicViewHolder extends RecyclerView.ViewHolder{
private ImageView imgMusic;
private TextView txtName,txtTitle;
        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMusic=itemView.findViewById(R.id.img);
            txtName=itemView.findViewById(R.id.name);
            txtTitle=itemView.findViewById(R.id.title);
        }
    }
}
