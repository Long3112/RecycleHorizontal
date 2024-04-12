package com.example.home_glide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.RecoverySystem;
import android.widget.LinearLayout;

import com.example.home_glide.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

rcvCategory=findViewById(R.id.rcv_category);
categoryAdapter = new CategoryAdapter(this);
LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
rcvCategory.setLayoutManager(linearLayoutManager);
categoryAdapter.setData(getListCategory());
rcvCategory.setAdapter(categoryAdapter);
    }
    private List<Category> getListCategory(){
        List<Category> listCategory = new ArrayList<>();
        List<Music> listMusic= new ArrayList<>();
        listMusic.add(new Music(R.drawable.a,"Non","Ga"));
        listMusic.add(new Music(R.drawable.b,"Non1","Ga1"));
        listMusic.add(new Music(R.drawable.a,"Non2","Ga2"));
        listMusic.add(new Music(R.drawable.b,"Non3","Ga3"));

        listMusic.add(new Music(R.drawable.a,"Non33","Ga3"));
        listMusic.add(new Music(R.drawable.b,"Non13","Ga13"));
        listMusic.add(new Music(R.drawable.a,"Non23","Ga23"));
        listMusic.add(new Music(R.drawable.b,"Non33","Ga33"));

        listCategory.add(new Category("Category 1",listMusic));
        listCategory.add(new Category("Category 2",listMusic));
        listCategory.add(new Category("Category 3",listMusic));
        listCategory.add(new Category("Category 4",listMusic));
        return  listCategory;
    }
}