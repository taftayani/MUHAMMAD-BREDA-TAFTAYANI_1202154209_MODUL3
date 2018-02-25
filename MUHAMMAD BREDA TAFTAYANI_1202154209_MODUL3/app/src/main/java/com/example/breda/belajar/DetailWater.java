package com.example.breda.belajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailWater extends AppCompatActivity {
    TextView titles,descs;
    ImageView img,bottle;
    ImageButton add1,decrease;

    private int buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_water);

        Intent intent=getIntent();

        String tlts=intent.getStringExtra("judul");
        String des=intent.getStringExtra("desri");
        Integer gambar=intent.getIntExtra("gambar",0);

        titles=(TextView)findViewById(R.id.title_detail);
        descs=(TextView)findViewById(R.id.desc_detail);
        img=(ImageView)findViewById(R.id.img_detail);
        bottle=(ImageView)findViewById(R.id.img_bottle);

        add1=(ImageButton)findViewById(R.id.add_butt);
        decrease=(ImageButton)findViewById(R.id.min_butt);

        titles.setText(tlts);
        descs.setText(des);
        img.setImageResource(gambar);



    }

    public void increase(View view) {
        buttons++;
        plus(buttons);
    }

    public void decrease(View view) {
        buttons--;
        plus(buttons);
    }

    private void plus(int buttons){

        switch (buttons){
            case 0:
                add1.setEnabled(true);
                decrease.setEnabled(false);

                bottle.setImageResource(R.drawable.ic_empty);
                Toast.makeText(this,"masih kosong", Toast.LENGTH_LONG).show();
                break;
            case 1:
                add1.setEnabled(true);
                decrease.setEnabled(true);

                bottle.setImageResource(R.drawable.ic_50);
                break;

            case 2:
                add1.setEnabled(true);
                decrease.setEnabled(true);

                bottle.setImageResource(R.drawable.ic_80);
                break;

            case 3:
                add1.setEnabled(false);
                decrease.setEnabled(true);

                bottle.setImageResource(R.drawable.ic_full);
                Toast.makeText(this,"sudah full", Toast.LENGTH_LONG).show();
                break;

        }
    }
}
