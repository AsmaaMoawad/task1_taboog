package com.example.asmaa.taboogtask_productdetails;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.HashMap;

public class Activity_ProductDetails extends AppCompatActivity implements BaseSliderView.OnSliderClickListener,
        ViewPagerEx.OnPageChangeListener {


    SliderLayout sliderLayout ;
    HashMap<String, String> HashMapForURL ;

    HashMap<String, Integer> HashMapForLocalRes ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_productdetails);

        sliderLayout = (SliderLayout)findViewById(R.id.slider);
        //Call this method to add images from local drawable folder .
        AddImageUrlFormLocalRes();

        //Call this method to stop automatic sliding.
        sliderLayout.stopAutoCycle();


    }

    @Override
    protected void onStop() {

        sliderLayout.stopAutoCycle();

        super.onStop();
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {
        Toast.makeText(this,slider.getBundle().get("extra") + "",Toast.LENGTH_SHORT).show();



    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

    @Override
    public void onPageSelected(int position) {

        Log.d("Slider Demo", "Page Changed: " + position);

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public void AddImageUrlFormLocalRes(){

        HashMapForLocalRes = new HashMap<String, Integer>();

        HashMapForLocalRes.put("CupCake", R.drawable.icon_maestropayment);
        HashMapForLocalRes.put("Donut", R.drawable.icon_discoverpayment);
        HashMapForLocalRes.put("Eclair", R.drawable.icon_paypalpayment);


    }



}

