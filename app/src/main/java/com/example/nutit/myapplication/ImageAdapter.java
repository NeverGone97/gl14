package com.example.nutit.myapplication;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by NutIT on 4/7/2017.
 */

public class ImageAdapter extends PagerAdapter {

    Context context;

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return  sliderImagesId.length;
    }
    private int[] sliderImagesId = new int[]{
            R.drawable.image1, R.drawable.image2, R.drawable.image3,
            R.drawable.image4, R.drawable.image5, R.drawable.image6,
    };
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==((ImageView)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView=new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImagesId[position]);


            ((ViewPager)container).addView(imageView,0);

        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager)container).removeView((ImageView)object);
    }
}
