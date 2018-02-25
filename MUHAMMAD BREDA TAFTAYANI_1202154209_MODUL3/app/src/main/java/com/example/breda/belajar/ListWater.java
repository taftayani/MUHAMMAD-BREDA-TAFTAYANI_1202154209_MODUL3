package com.example.breda.belajar;

import android.content.Intent;
import android.service.quicksettings.Tile;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by Breda on 2/24/2018.
 */

public class ListWater extends RecyclerView.Adapter<ListWater.waterView> {
    private final LinkedList<String> title;
    private final LinkedList<String> desc;
    private final LinkedList<Integer> images;

    private LayoutInflater inflater;

    public ListWater(Main2Activity main2Activity, LinkedList<String> nTitle, LinkedList<String> nDesc, LinkedList<Integer> nimage) {
            inflater =LayoutInflater.from(main2Activity);
            this.title=nTitle;
            this.desc=nDesc;
            this.images=nimage;

    }


    @Override
    public waterView onCreateViewHolder(ViewGroup parent, int viewType) {
        View listView=inflater.inflate(R.layout.listwater,parent,false);
        return new waterView(listView,this);
    }

    @Override
    public void onBindViewHolder(waterView holder, int position) {
        String CurrentTitle=title.get(position);
        String CurrentDesc=desc.get(position);
        Integer CurrentImage=images.get(position);

        holder.Title.setText(CurrentTitle);
        holder.Desc.setText(CurrentDesc);
        holder.image.setImageResource(CurrentImage);
    }

    @Override
    public int getItemCount() {
       return images.size();
    }

    public class waterView extends RecyclerView.ViewHolder {
        private final TextView Title;
        private final TextView Desc;
        private final ImageView image;

        final ListWater adapter;
        public waterView(final View listView, ListWater listWater) {
            super(listView);

            Title=(TextView)listView.findViewById(R.id.judul);
            Desc=(TextView)listView.findViewById(R.id.desc);
            image=(ImageView)listView.findViewById(R.id.gambar);

            image.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    int position =getLayoutPosition();

                    String tlt=title.get(position);
                    String descs=desc.get(position);
                    Integer gambar=images.get(position);

                    Intent intent=new Intent(listView.getContext(),DetailWater.class);

                    intent.putExtra("judul",tlt);
                    intent.putExtra("desri",descs);
                    intent.putExtra("gambar",gambar);

                    listView.getContext().startActivity(intent);
                }
            });
        this.adapter=listWater;
        }
    }
}
