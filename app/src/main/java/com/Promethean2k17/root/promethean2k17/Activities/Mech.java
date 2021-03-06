package com.Promethean2k17.root.promethean2k17.Activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.Promethean2k17.root.promethean2k17.Adapters.Mech_Adapter;
import com.Promethean2k17.root.promethean2k17.Models.Mech_Model;
import com.Promethean2k17.root.promethean2k17.R;
import com.Promethean2k17.root.promethean2k17.configs.Onitemtouchlistener;

import java.util.ArrayList;

public class Mech extends AppCompatActivity {
    Mech_Adapter adapter;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Mech Events");
        recyclerView= findViewById(R.id.mech_recyclerview);

        ArrayList<Mech_Model> arrayList = new ArrayList<>();
        arrayList.add(new Mech_Model("http://23.92.25.213/promethean2k17/images/mech/mechanograsp.jpg"));
        arrayList.add(new Mech_Model("http://23.92.25.213/promethean2k17/images/mech/automobile.jpg"));
        arrayList.add(new Mech_Model("http://23.92.25.213/promethean2k17/images/mech/paper.jpg"));
        arrayList.add(new Mech_Model("http://23.92.25.213/promethean2k17/images/mech/poster.jpg"));
        arrayList.add(new Mech_Model("http://23.92.25.213/promethean2k17/images/mech/quiz.jpg"));
        arrayList.add(new Mech_Model("http://23.92.25.213/promethean2k17/images/mech/project.jpg"));
        arrayList.add(new Mech_Model("http://23.92.25.213/promethean2k17/images/mech/nitro.jpg"));
        arrayList.add(new Mech_Model("http://23.92.25.213/promethean2k17/images/mech/minute.jpg"));
        arrayList.add(new Mech_Model("http://23.92.25.213/promethean2k17/images/mech/cad.jpg"));
        adapter=new Mech_Adapter(arrayList,this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(new Onitemtouchlistener(context, new Onitemtouchlistener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                switch (position){

                    case 0:
                        Intent i1=new Intent(getApplicationContext(),Event_Registration.class);
                        i1.putExtra("name","MechanoGraspWorkshop");
                        startActivity(i1);
                        break;
                    case 1:
                        Intent i2=new Intent(getApplicationContext(),Event_Registration.class);
                        i2.putExtra("name","AutoMobileWorkshop");
                        startActivity(i2);
                        break;
                    case 2:
                        Intent i9=new Intent(getApplicationContext(),Event_Registration.class);
                        i9.putExtra("name","PaperPresentationMech");
                        startActivity(i9);
                        break;
                    case 3:
                        Intent i3=new Intent(getApplicationContext(),Event_Registration.class);
                        i3.putExtra("name","PosterPresentationMech");
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4=new Intent(getApplicationContext(),Event_Registration.class);
                        i4.putExtra("name","TechQuizMech");
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5=new Intent(getApplicationContext(),Event_Registration.class);
                        i5.putExtra("name","ProjectExpoMech");
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6=new Intent(getApplicationContext(),Event_Registration.class);
                        i6.putExtra("name","NitroRacing");
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7=new Intent(getApplicationContext(),Event_Registration.class);
                        i7.putExtra("name","OneMinuteToWin");
                        startActivity(i7);
                        break;
                    case 8:
                        Intent i8=new Intent(getApplicationContext(),Event_Registration.class);
                        i8.putExtra("name","CADModelling");
                        startActivity(i8);
                        break;


                }

            }
        }));


    }
}
