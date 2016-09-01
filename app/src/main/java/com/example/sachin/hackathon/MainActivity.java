package com.example.sachin.hackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.StreamCorruptedException;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    HashMap<String,String> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.button);
        map=new HashMap<>();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread thread=new Thread(new Mythread());
                thread.start();
            }
        });
        tv=(TextView) findViewById(R.id.tv);



    }
    class  Mythread implements Runnable
    {

        @Override
        public void run() {
            try {
                Document document = Jsoup.connect("http://www.stupidsid.com/engineering-college-reviews#b-lore").get();
                //div class="tab-pane" id="b-lore"
                Elements divs=document.getElementsByTag("div");
                Element req=null;
                for(Element e:divs)
                {
                    if(e.id().equals("b-lore"))
                        req=e;
                }
              // Log.e("sachin",""+req.id());
               Elements all_li=req.select("a");
                for(Element linktag:all_li)
                {
                    String name=linktag.text();
                    String href=linktag.attr("href");
                    Log.e("sachin",""+name+" "+href );
                    map.put(name,href);

                }

            } catch (IOException e) {
                e.printStackTrace();
            }


            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    for(String key:map.keySet())
                        tv.append("\n"+key);
                }
            });

        }

}}

