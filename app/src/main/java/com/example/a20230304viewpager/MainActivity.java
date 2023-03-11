package com.example.a20230304viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater layoutInflater = getLayoutInflater().from(this);

        View view1 = layoutInflater.inflate(R.layout.view1,null);
        View view2 = layoutInflater.inflate(R.layout.view2,null);
        View view3 = layoutInflater.inflate(R.layout.view3,null);
        View view4 = layoutInflater.inflate(R.layout.view4,null);
        View view5 = layoutInflater.inflate(R.layout.view5,null);


        ArrayList<View> arrayList = new ArrayList<>();
        arrayList.add(view1);
        arrayList.add(view2);
        arrayList.add(view3);
        arrayList.add(view4);
        arrayList.add(view5);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new MyViewPagerAdapter(arrayList));
        viewPager.setCurrentItem(0);
    }
}