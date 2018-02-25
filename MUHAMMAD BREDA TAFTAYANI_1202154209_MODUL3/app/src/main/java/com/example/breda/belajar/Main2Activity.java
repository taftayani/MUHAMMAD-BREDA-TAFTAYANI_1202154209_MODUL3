package com.example.breda.belajar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Main2Activity extends AppCompatActivity {

    private final LinkedList<String> nTitle=new LinkedList<>();
    private final LinkedList<String> nDesc=new LinkedList<>();
    private final LinkedList<Integer> nimage=new LinkedList<>();

    private RecyclerView recycle;
    private ListWater list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        list();

        recycle=(RecyclerView)findViewById(R.id.recycle);

        list=new ListWater(this,nTitle,nDesc,nimage);

        recycle.setAdapter(list);

        recycle.setLayoutManager(new LinearLayoutManager(this));

    }
    private void list(){
        nTitle.add("Aqua");
        nTitle.add("Ades");
        nTitle.add("equil");
        nTitle.add("club");
        nTitle.add("cleo");
        nTitle.add("Amidis");
        nTitle.add("Pristine");
        nTitle.add("Nestle");
        nTitle.add("VIt");
        nTitle.add("Le Mineral");
        nTitle.add("Evian");



        nDesc.add("rasanya manis");
        nDesc.add("wow sekali, murah, enak lagi");
        nDesc.add("lebih enak pristine");
        nDesc.add("sangat bagus untuk pertumbuhan");
        nDesc.add("enak, murah, desainnya simple");
        nDesc.add("lebih murah dari produk lain");
        nDesc.add("lebih mahal");
        nDesc.add("enak dan Ok buat yang sedang galau");
        nDesc.add("rasanya enak");
        nDesc.add("rasanya bervariasi, dan manis ");
        nDesc.add("lebih Ok rasanya");


        nimage.add(R.drawable.aqua);
        nimage.add(R.drawable.ades);
        nimage.add(R.drawable.equil);
        nimage.add(R.drawable.club);
        nimage.add(R.drawable.cleo);
        nimage.add(R.drawable.amidis);
        nimage.add(R.drawable.pristine);
        nimage.add(R.drawable.nestle);
        nimage.add(R.drawable.vit);
        nimage.add(R.drawable.leminerale);
        nimage.add(R.drawable.evian);

    }



}
