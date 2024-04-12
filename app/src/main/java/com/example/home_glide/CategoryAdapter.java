package com.example.home_glide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    private Context nContext;
    private List<Category> nListCategory;

    public CategoryAdapter(Context nContext) {
        this.nContext = nContext;
    }
public void setData(List<Category> list){
        this.nListCategory=list;
        notifyDataSetChanged();
}
    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category,parent,false);

    return new CategoryViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
Category category = nListCategory.get(position);
if(category==null){
    return;
}
holder.txtNameCategory.setText(category.getNameCategory());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(nContext,RecyclerView.HORIZONTAL,false);
        holder.rcvMusic.setLayoutManager(linearLayoutManager);
        MusicAdapter musicAdapter= new MusicAdapter();
        musicAdapter.setData(category.getMusics());
        holder.rcvMusic.setAdapter(musicAdapter);
        musicAdapter.setData(category.getMusics());
    }

    @Override
    public int getItemCount() {
        if(nListCategory!=null){
            return nListCategory.size();
        }
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{
private TextView txtNameCategory;
private RecyclerView rcvMusic;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNameCategory=itemView.findViewById(R.id.tv_name_category);
            rcvMusic=itemView.findViewById(R.id.rev_music);
        }
    }
}
