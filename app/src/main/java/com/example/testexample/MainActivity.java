package com.example.testexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Display display;
    int width;
    int height;
    Button bt_back;
    Button bt_add;
    Integer ccount;
    ImageView card1 , card2 , card3 , card1up , card2up, card3up;
    boolean ex = true;
    int tmp;

    ArrayList<ImageView> image = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card1 = (ImageView) findViewById(R.id.card1);
        card2 = (ImageView) findViewById(R.id.card2);
        card3 = (ImageView) findViewById(R.id.card3);
        card1up = (ImageView) findViewById(R.id.card1up);
        card2up = (ImageView) findViewById(R.id.card2up);
        card3up = (ImageView) findViewById(R.id.card3up);
        //final ArrayList<Integer> tmpp = new ArrayList<>();
        final Integer[] tmpp = new Integer[2];




         display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
         width = size.x;
         height = size.y;
         ccount = 0;

         bt_back = (Button) findViewById(R.id.bt_back);
         bt_add = (Button) findViewById(R.id.bt_add);
         card3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                        tmpp[0] = 3;
                 }

         });
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmpp[0] = 1;
            }
        });card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmpp[0] = 2;
            }
        });
         card1up.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 tmpp[1]=11;
                 if ((tmpp[0] == 3) && (tmpp[1] == 11)){
                     card1up.setX(9999);
                     card1up.setY(9999);
                     tmpp[0] = 0;
                     tmpp[1] = 0;
                 }
                 else if ((tmpp[0] == 2) && (tmpp[1])==11){
                     card1up.setX(9999);
                     card1up.setY(9999);
                     tmpp[0] = 0;
                     tmpp[1] = 0;;
                 }else if ((tmpp[0] == 1) && (tmpp[1]==11)){
                     card1up.setX(9999);
                     card1up.setY(9999);
                     card1.setX(9999);
                     card1.setY(9999);
                     tmpp[0] = 0;
                     tmpp[1] = 0;
                 }
             }
         }); card2up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmpp[1] = 22;
                if ((tmpp[0] == 3) && (tmpp[1]==22)){
                    card2up.setX(9999);
                    card2up.setY(9999);
                    tmpp[0] = 0;
                    tmpp[1] = 0;
                }else if((tmpp[0] == 2) && (tmpp[1]==22)){
                    card2up.setX(9999);
                    card2up.setY(9999);
                    card2.setX(9999);
                    card2.setY(9999);
                    tmpp[0] = 0;
                    tmpp[1] = 0;
                }else if((tmpp[0] == 1) && (tmpp[1]==22)){
                    card1.setX(9999);
                    card1.setY(9999);
                    tmpp[0] = 0;
                    tmpp[1] = 0;
                }
            }
        }); card3up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmpp[1] = 33;
                if ((tmpp[0] == 3) && (tmpp[1]==33)){
                    card3up.setX(9999);
                    card3up.setY(9999);
                    card3.setY(9999);
                    card3.setX(9999);
                    tmpp[0] = 0;
                    tmpp[1] = 0;
                }else if ((tmpp[0] == 2) && (tmpp[1]==33)){
                    card2.setY(9999);
                    card2.setX(9999);
                    tmpp[0] = 0;
                    tmpp[1] = 0;
                }else if ((tmpp[0] == 1) && (tmpp[1]==33)){
                    card1.setY(9999);
                    card1.setX(9999);
                    tmpp[0] = 0;
                    tmpp[1] = 0;
                }
            }
        });








       bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card1up.setX(width/6);
                card1up.setY(height/16);
                card2up.setX(width/2 - (card2up.getWidth()/2));
                card2up.setY(height/16);
                card3up.setX(width - (width/5));
                card3up.setY(height/16);
                card3.setX(width - (width/5));
                card3.setY(height - (height/3)+(height/25));
                card2.setX(width/2 - (card2.getWidth()/2));
                card2.setY(height - (height/3)+(height/25));
                card1.setX(width/6);
                card1.setY(height - (height/3)+(height/25));
            }
        });

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
