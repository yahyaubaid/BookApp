package com.mudamendunia.bookapp2;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.florent37.shapeofview.shapes.CircleView;
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView eventsplace;
    EventAdapter eventAdapter;
    List<Event> eventList;
    LinearLayout slide1, slide2, slide3, slide4, slide5, slide6;
    TextView see_all;
    CircleView btn_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventsplace = findViewById(R.id.eventsplace);
        btn_profile = findViewById(R.id.btn_profile);
        slide1 = findViewById(R.id.slide1);
        slide2 = findViewById(R.id.slide2);
        slide3 = findViewById(R.id.slide3);
        slide4 = findViewById(R.id.slide4);
        slide5 = findViewById(R.id.slide5);
        slide6 = findViewById(R.id.slide6);
        see_all = findViewById(R.id.see_all);

        eventList = new ArrayList<>();
        eventList.add(
                new Event(
                        "Sistem Reproduksi pada Manusia",
                        "RECOMMENDED",
                        R.drawable.piczero
                )
        );

        eventList.add(
                new Event(

                        "Sistem Pernapasan pada Manusia",
                        "RECOMMENDED",
                        R.drawable.piczero
                )
        );

        eventList.add(
                new Event(
                        "Sistem Pencernaan pada Manusia",
                        "RECOMMENDED",
                        R.drawable.piczero
                )
        );

        eventList.add(
                new Event(
                        "Sistem Indera pada Manusia",
                        "RECOMMENDED",
                        R.drawable.piczero
                )
        );

        eventList.add(
                new Event(
                        "Sistem Imun pada Manusia",
                        "RECOMMENDED",
                        R.drawable.piczero
                )
        );

        eventList.add(
                new Event(
                        "Sistem Hormon pada Manusia",
                        "RECOMMENDED",
                        R.drawable.piczero
                )
        );

        eventList.add(
                new Event(
                        "Sistem Saraf pada Manusia",
                        "RECOMMENDED",
                        R.drawable.piczero
                )
        );

        eventList.add(
                new Event(
                        "Sistem Sirkulasi pada Manusia",
                        "RECOMMENDED",
                        R.drawable.piczero
                )
        );

        eventList.add(
                new Event(
                        "Sistem Gerak pada Manusia",
                        "RECOMMENDED",
                        R.drawable.piczero
                )
        );

        eventList.add(
                new Event(
                        "Sistem Eksresi pada Manusia",
                        "RECOMMENDED",
                        R.drawable.piczero
                )
        );

        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this, LinearLayoutManager.HORIZONTAL, false
        );

        eventsplace.setLayoutManager(linearLayoutManager);
        eventsplace.setHasFixedSize(true);

        eventAdapter = new EventAdapter(this, eventList);
        eventsplace.setAdapter(eventAdapter);

        //snapping the scroll items
        final GravitySnapHelper snapHelper = new GravitySnapHelper(Gravity.START);
        snapHelper.attachToRecyclerView(eventsplace);

        //set a timer for default item
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 1s = 100ms
                RecyclerView.ViewHolder viewHolderDefault = eventsplace.
                        findViewHolderForAdapterPosition(0);

                LinearLayout eventparentDefault = viewHolderDefault.itemView.
                        findViewById(R.id.eventparent);
                eventparentDefault.animate().scaleY(1).scaleX(1).setDuration(350).
                        setInterpolator(new AccelerateInterpolator()).start();

                LinearLayout eventcategoryDefault = viewHolderDefault.itemView.
                        findViewById(R.id.eventbadge);
                eventcategoryDefault.animate().alpha(1).setDuration(300).start();

            }
        }, 100);

        //add animate scroll
        eventsplace.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                if (newState == RecyclerView.SCROLL_STATE_IDLE){
                    View view = snapHelper.findSnapView(linearLayoutManager);
                    int pos = linearLayoutManager.getPosition(view);

                    RecyclerView.ViewHolder viewHolder =
                            eventsplace.findViewHolderForAdapterPosition(pos);

                    LinearLayout eventparent = viewHolder.itemView.
                            findViewById(R.id.eventparent);
                    eventparent.animate().scaleY(1).scaleX(1).setDuration(550).setInterpolator(new AccelerateInterpolator()).start();

                    LinearLayout eventcategory = viewHolder.itemView.
                            findViewById(R.id.eventbadge);
                    eventcategory.animate().alpha(1).setDuration(300).start();

                }
                else{

                    View view = snapHelper.findSnapView(linearLayoutManager);
                    int pos = linearLayoutManager.getPosition(view);

                    RecyclerView.ViewHolder viewHolder =
                            eventsplace.findViewHolderForAdapterPosition(pos);

                    LinearLayout eventparent = viewHolder.itemView.
                            findViewById(R.id.eventparent);
                    eventparent.animate().scaleY(0.7f).scaleX(0.7f).setDuration(350).setInterpolator(new AccelerateInterpolator()).start();


                    LinearLayout eventcategory = viewHolder.itemView.
                            findViewById(R.id.eventbadge);
                    eventcategory.animate().alpha(0).setDuration(300).start();

                    TextView eventtitle = viewHolder.itemView.
                            findViewById(R.id.eventtitle);
                    eventtitle.animate().scaleX(1).scaleY(1).setDuration(300).start();
                }
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });

        slide1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide1 = new Intent(MainActivity.this, pdf0.class);
                startActivity(goslide1);
            }
        });

        slide3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide3 = new Intent(MainActivity.this, artho.class);
                startActivity(goslide3);
            }
        });

        slide2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide2 = new Intent(MainActivity.this, pdf1.class);
                startActivity(goslide2);
            }
        });

        slide4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide4 = new Intent(MainActivity.this, chor.class);
                startActivity(goslide4);
            }
        });

        slide5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide5 = new Intent(MainActivity.this, echi.class);
                startActivity(goslide5);
            }
        });

        slide6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide6 = new Intent(MainActivity.this, enzim.class);
                startActivity(goslide6);
            }
        });

        see_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gosee = new Intent(MainActivity.this, see_all.class);
                startActivity(gosee);
            }
        });

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goprofile = new Intent(MainActivity.this, Profile.class);
                startActivity(goprofile);
            }
        });


    }
}
