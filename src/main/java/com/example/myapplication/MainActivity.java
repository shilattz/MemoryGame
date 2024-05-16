package com.example.myapplication;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
            button10, button11, button12, button13, button14, button15, button16, buttonNewGame;
    private Drawable[] images = new Drawable[8];

    private Button[] buttons = new Button[16];

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonNewGame = (Button) findViewById(R.id.newGame);
        buttonNewGame.setOnClickListener(new Listener());
        button1 = (Button) findViewById(R.id.iv_11);
        button1.setOnClickListener(new Listener1());
        button2 = (Button) findViewById(R.id.iv_12);
        button2.setOnClickListener(new Listener2());
        button3 = (Button) findViewById(R.id.iv_13);
        button3.setOnClickListener(new Listener3());
        button4 = (Button) findViewById(R.id.iv_14);
        button4.setOnClickListener(new Listener4());
        button5 = (Button) findViewById(R.id.iv_15);
        button5.setOnClickListener(new Listener5());
        button6 = (Button) findViewById(R.id.iv_16);
        button6.setOnClickListener(new Listener6());
        button7 = (Button) findViewById(R.id.iv_17);
        button7.setOnClickListener(new Listener7());
        button8 = (Button) findViewById(R.id.iv_18);
        button8.setOnClickListener(new Listener8());
        button9 = (Button) findViewById(R.id.iv_19);
        button9.setOnClickListener(new Listener9());
        button10 = (Button) findViewById(R.id.iv_20);
        button10.setOnClickListener(new Listener10());
        button11 = (Button) findViewById(R.id.iv_21);
        button11.setOnClickListener(new Listener11());
        button12 = (Button) findViewById(R.id.iv_22);
        button12.setOnClickListener(new Listener12());
        button13 = (Button) findViewById(R.id.iv_23);
        button13.setOnClickListener(new Listener13());
        button14 = (Button) findViewById(R.id.iv_24);
        button14.setOnClickListener(new Listener14());
        button15 = (Button) findViewById(R.id.iv_25);
        button15.setOnClickListener(new Listener15());
        button16 = (Button) findViewById(R.id.iv_26);
        button16.setOnClickListener(new Listener16());
        Toast.makeText(getApplicationContext(),"GOOD LUCK!!!",Toast.LENGTH_SHORT).show();
        arrayList();

    }

    private void buttonsList() {
        buttons[0] = button1;
        buttons[1] = button2;
        buttons[2] = button3;
        buttons[3] = button4;
        buttons[4] = button5;
        buttons[5] = button6;
        buttons[6] = button7;
        buttons[7] = button8;
        buttons[8] = button9;
        buttons[9] = button10;
        buttons[10] = button11;
        buttons[11] = button12;
        buttons[12] = button13;
        buttons[13] = button14;
        buttons[14] = button15;
        buttons[15] = button16;

    }

    private void arrayList() {
        images[0] = getDrawable(R.drawable.image2);
        images[1] = getDrawable(R.drawable.image3);
        images[2] = getDrawable(R.drawable.image4);
        images[3] = getDrawable(R.drawable.image5);
        images[4] = getDrawable(R.drawable.image6);
        images[5] = getDrawable(R.drawable.image7);
        images[6] = getDrawable(R.drawable.image8);
        images[7] = getDrawable(R.drawable.images);
        Collections.shuffle(Arrays.asList((images)));

    }

    private class Listener implements View.OnClickListener {
        @Override

        public void onClick(View view) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                MainActivity.this.recreate();
            }
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    private boolean isOpen() {
        int count = 0;
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i] != null) {
                if (buttons[i].getForeground() != null)
                    count++;
            }
        }
        if (count == 2)
            return true;
        return false;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void isMatch() {
        Button first = null;
        Button second = null;
        int index = 0;
        if (isOpen()) {
            for (int i = 0; i < buttons.length; i++) {
                if (buttons[i] != null) {
                    if (buttons[i].getForeground() != null) {
                        first = buttons[i];
                        buttons[i]=null;
                        index = i;
                        break;
                    }
                }
            }
            for (int j = index + 1; j < buttons.length; j++) {
                if (buttons[j] != null) {
                    if (buttons[j].getForeground() != null) {
                        second = buttons[j];
                        buttons[j]=null;
                        break;
                    }
                }
            }

            if (first.getForeground() == second.getForeground()){
                first.setForeground(first.getForeground());
                second.setForeground(second.getForeground());
            }
           else if (first.getForeground() != second.getForeground()) {
                first.setForeground(null);
                second.setForeground(null);
            }
        }
    }

    private class Listener1 implements View.OnClickListener {
        @RequiresApi(api = Build.VERSION_CODES.M)
        @Override

        public void onClick(View view) {
                isMatch();
            if (button1.getForeground() == null) {
                button1.setForeground(images[0]);
                buttons[0]=button1;
            }
//          else
//               button1.setForeground(null);
        }
    }

    private class Listener2 implements View.OnClickListener {
        @RequiresApi(api = Build.VERSION_CODES.M)
        @Override

        public void onClick(View view) {

                isMatch();
                if (button2.getForeground()==null) {
                    button2.setForeground(images[3]);
                    buttons[1]=button2;
                }
//                else
//                    button2.setForeground(null);
        }
    }
            private class Listener3 implements View.OnClickListener {
                @RequiresApi(api = Build.VERSION_CODES.M)
                @Override

                public void onClick(View view) {

                        isMatch();
                        if (button3.getForeground()==null) {
                            button3.setForeground(images[1]);
                            buttons[2]= button3;

                        }
                       // else
                         //   button3.setForeground(null);
                }
            }
                    private class Listener4 implements View.OnClickListener {
                        @RequiresApi(api = Build.VERSION_CODES.M)
                        @Override

                        public void onClick(View view) {

                                isMatch();
                                if (button4.getForeground()==null) {
                                    button4.setForeground(images[2]);
                                    buttons[3]=button4;

                                }
                               // else
                                   // button4.setForeground(null);
                        }
                    }
                            private class Listener5 implements View.OnClickListener {
                                @RequiresApi(api = Build.VERSION_CODES.M)
                                @Override

                                public void onClick(View view) {

                                        isMatch();
                                        if (button5.getForeground()==null) {
                                            button5.setForeground(images[0]);
                                            buttons[4]=button5;

                                        }
                                        //else
                                           // button5.setForeground(null);
                                }
                            }

                                    private class Listener6 implements View.OnClickListener {
                                        @RequiresApi(api = Build.VERSION_CODES.M)
                                        @Override

                                        public void onClick(View view) {

                                                isMatch();
                                                if (button6.getForeground()==null) {
                                                    button6.setForeground(images[7]);
                                                    buttons[5]= button6;

                                                }
                                               // else
                                                  //  button6.setForeground(null);
                                        }
                                    }
                                            private class Listener7 implements View.OnClickListener {
                                                @RequiresApi(api = Build.VERSION_CODES.M)
                                                @Override

                                                public void onClick(View view) {

                                                        isMatch();
                                                        if (button7.getForeground()==null) {
                                                            button7.setForeground(images[3]);
                                                            buttons[6]= button7;

                                                        }
                                                       // else
                                                         //   button7.setForeground(null);
                                                }
                                            }
                                                    private class Listener8 implements View.OnClickListener {
                                                        @RequiresApi(api = Build.VERSION_CODES.M)
                                                        @Override

                                                        public void onClick(View view) {

                                                                isMatch();
                                                                if (button8.getForeground()==null) {
                                                                    button8.setForeground(images[1]);
                                                                    buttons[7]= button8;

                                                                }
                                                               // else
                                                                  //  button8.setForeground(null);
                                                        }
                                                    }
                                                        private class Listener9 implements View.OnClickListener {
                                                            @RequiresApi(api = Build.VERSION_CODES.M)
                                                            @Override

                                                            public void onClick(View view) {

                                                                    isMatch();
                                                                    if (button9.getForeground()==null) {
                                                                        button9.setForeground(images[5]);
                                                                        buttons[8]= button9;

                                                                    }
                                                                   // else
                                                                       // button9.setForeground(null);
                                                            }
                                                        }

                                                            private class Listener10 implements View.OnClickListener {
                                                                @RequiresApi(api = Build.VERSION_CODES.M)
                                                                @Override

                                                                public void onClick(View view) {

                                                                        isMatch();
                                                                        if (button10.getForeground()==null) {
                                                                            button10.setForeground(images[4]);
                                                                            buttons[9]= button10;

                                                                        }
                                                                     //   else
                                                                         //   button10.setForeground(null);
                                                                }
                                                            }

                                                                private class Listener11 implements View.OnClickListener {
                                                                    @RequiresApi(api = Build.VERSION_CODES.M)
                                                                    @Override

                                                                    public void onClick(View view) {

                                                                            isMatch();
                                                                            if (button11.getForeground()==null) {
                                                                                button11.setForeground(images[6]);
                                                                                buttons[10]=  button11;
                                                                            }
                                                                           // else
                                                                              //  button11.setForeground(null);
                                                                    }
                                                                }

                                                                    private class Listener12 implements View.OnClickListener {
                                                                        @RequiresApi(api = Build.VERSION_CODES.M)
                                                                        @Override

                                                                        public void onClick(View view) {

                                                                                isMatch();
                                                                                if (button12.getForeground()==null) {
                                                                                    button12.setForeground(images[5]);
                                                                                    buttons[11]= button12;

                                                                                }
                                                                              //  else
                                                                                  //  button12.setForeground(null);
                                                                        }
                                                                    }

                                                                        private class Listener13 implements View.OnClickListener {
                                                                            @RequiresApi(api = Build.VERSION_CODES.M)
                                                                            @Override

                                                                            public void onClick(View view) {

                                                                                    isMatch();
                                                                                    if (button13.getForeground()==null) {
                                                                                        button13.setForeground(images[4]);
                                                                                        buttons[12]=button13;

                                                                                    }
                                                                                   // else
                                                                                      //  button13.setForeground(null);
                                                                            }
                                                                        }

                                                                            private class Listener14 implements View.OnClickListener {
                                                                                @RequiresApi(api = Build.VERSION_CODES.M)
                                                                                @Override

                                                                                public void onClick(View view) {

                                                                                        isMatch();
                                                                                        if (button14.getForeground()==null) {
                                                                                            button14.setForeground(images[6]);
                                                                                            buttons[13]=button14;

                                                                                        }
                                                                                        //   else
                                                                                       //     button14.setForeground(null);
                                                                                }
                                                                            }
                                                                                private class Listener15 implements View.OnClickListener {
                                                                                    @RequiresApi(api = Build.VERSION_CODES.M)
                                                                                    @Override

                                                                                    public void onClick(View view) {

                                                                                            isMatch();
                                                                                            if (button15.getForeground()==null) {
                                                                                                button15.setForeground(images[2]);
                                                                                                buttons[14]=button15;

                                                                                            }
                                                                                            //  else
                                                                                              //  button15.setForeground(null);
                                                                                    }
                                                                                }
                                                                                    private class Listener16 implements View.OnClickListener {
                                                                                        @RequiresApi(api = Build.VERSION_CODES.M)
                                                                                        @Override

                                                                                        public void onClick(View view) {

                                                                                                isMatch();
                                                                                                if (button16.getForeground()==null) {
                                                                                                    button16.setForeground(images[7]);
                                                                                                    buttons[15]=  button16;

                                                                                                }
                                                                                                //else
                                                                                                 //   button16.setForeground(null);
                                                                                        }
                                                                                    }
                                                                                }

