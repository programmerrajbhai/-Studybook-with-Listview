package com.soft.studybook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    ListView listView;

    HashMap<String ,String> hashMap= new HashMap<>();
    ArrayList<HashMap<String, String>>arrayList= new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView= findViewById(R.id.listView);
        arrayList= new ArrayList<>();
        MYDATA();



        MyAdapter myAdapter=new MyAdapter();
        listView.setAdapter(myAdapter);








    }

    private void MYDATA(){

        hashMap= new HashMap<>();
        hashMap.put("data","“অতৃপ্ত এই পৃথিবীতে আজ যত আয়োজন, অর্ধেক তাঁর মিথ্যে মায়া, বাকি অর্ধেক প্রয়োজন।”");
        arrayList.add(hashMap);


        hashMap= new HashMap<>();
        hashMap.put("data","অসৎ লোকেরা কাউকে সৎ বলে মনে করে না, সকলকেই সে নিজের মতো অসৎ ভাবে। ");
        arrayList.add(hashMap);

        hashMap= new HashMap<>();
        hashMap.put("data","বুদ্ধিমান এবং সত্যবাদী ব্যক্তি ছাড়া জীবনে আর কারো সঙ্গ কামনা করো না।");
        arrayList.add(hashMap);

        hashMap= new HashMap<>();
        hashMap.put("data","“রোজার মাধ্যমে আচার-আচরণ ও চরিত্র সুন্দর হয়।”");
        arrayList.add(hashMap);

        hashMap= new HashMap<>();
        hashMap.put("data","আল্লাহ’র ভয়ে তুমি যা সব কিছু ছেড়ে দেবে, আল্লাহ্ তোমাকে তার চেয়ে আরো উত্তম কিছু অবশ্যই দান করবেন।");
        arrayList.add(hashMap);


        hashMap= new HashMap<>();
        hashMap.put("data","পুণ্য অর্জন করার চেয়ে পাপ বর্জন করা শ্রেষ্ঠতর।");
        arrayList.add(hashMap);

        hashMap= new HashMap<>();
        hashMap.put("data","যে নিজের মর্যাদা বোঝে না অন্যরাও তাকে মর্যাদা দেয় না।");
        arrayList.add(hashMap);


        hashMap= new HashMap<>();
        hashMap.put("data","রমজান হল জান্নাতে যাওয়ার উৎকৃষ্টতম উপায় এবং রাইয়ান নামক বিশেষ দরজা দিয়ে জান্নাতে প্রবেশের সুযোগ পাওয়া যায়।");
        arrayList.add(hashMap);

        hashMap= new HashMap<>();
        hashMap.put("data","আমি যাকে তার প্রাপ্য সম্মানের চেয়ে অতিরিক্ত সম্মান দিয়েছি, তারা আমার ঠিক ততটুকুই ক্ষতি করেছে।");
        arrayList.add(hashMap);

        hashMap= new HashMap<>();
        hashMap.put("data","“গুনাহের সাগর আমাকে নিমজ্জিত করে নিয়েছে। ধ্বংসের দ্বারপ্রান্তে ঠেলে দিয়েছে। তবুও আমি আল্লাহর রহমতের আশাবাদী।”");
        arrayList.add(hashMap);

        hashMap= new HashMap<>();
        hashMap.put("data","“কখনো কখনো আল্লাহ তা’আলা আমাদের ভোগান্তিতে ফেলেন শুধু এজন্যই যাতে আমরা তাকে স্মরণ করি।”");
        arrayList.add(hashMap);

        hashMap= new HashMap<>();
        hashMap.put("data","সব দুঃখের মূল হল এই দুনিয়ার প্রতি আমাদের অত্যাধিক আকর্ষণ।");
        arrayList.add(hashMap);
        hashMap= new HashMap<>();
        hashMap.put("data","“রোজা সকল মানুষকে আখেরাত মুখী করে দেয়।”");
        arrayList.add(hashMap);

        hashMap= new HashMap<>();
        hashMap.put("data","রাসূলুল্লাহ সাঃ বলেছেনঃ তোমরা অযাচিত পার্থিব সম্পদ গ্রহন করো না; কেননা, এর দ্বারা তোমরা দুনিয়ার প্রতি আসক্ত হয়ে পড়বে।");
        arrayList.add(hashMap);

        hashMap= new HashMap<>();
        hashMap.put("data","“ইয়া রাব্বী, জান্নাতে যেতে পারি এমন কোন আমল আমার নেই। আবার জাহান্নামে এক মুহূর্ত কাটাতে পারবো এমন শক্তিও আমার নেই।”");
        arrayList.add(hashMap);




    }

    private class MyAdapter extends BaseAdapter{
        TextView tv;

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater= (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
            View myView= inflater.inflate(R.layout.simple_design,parent,false);

            tv= myView.findViewById(R.id.tv);

            hashMap = arrayList.get(position);
            String data= hashMap.get("data");


           tv.setText(data);



                    return myView;
        }
    }





}