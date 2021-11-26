package com.nitesh.leetsolution;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PU2018 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu2018);
        RadioGroup rg1 = findViewById(R.id.rg1);
        RadioGroup rg2 = findViewById(R.id.rg2);
        RadioGroup rg3 = findViewById(R.id.rg3);
        RadioGroup rg4 = findViewById(R.id.rg4);
        RadioGroup rg5 = findViewById(R.id.rg5);
        RadioGroup rg6 = findViewById(R.id.rg6);
        RadioGroup rg7 = findViewById(R.id.rg7);
        RadioGroup rg8 = findViewById(R.id.rg8);
        RadioGroup rg9 = findViewById(R.id.rg9);
        RadioGroup rg10 = findViewById(R.id.rg10);
        RadioGroup rg11 = findViewById(R.id.rg11);
        RadioGroup rg12 = findViewById(R.id.rg12);
        RadioGroup rg13 = findViewById(R.id.rg13);
        RadioGroup rg14 = findViewById(R.id.rg14);
        RadioGroup rg15 = findViewById(R.id.rg15);
        RadioGroup rg16 = findViewById(R.id.rg16);
        RadioGroup rg17 = findViewById(R.id.rg17);
        RadioGroup rg18 = findViewById(R.id.rg18);
        RadioGroup rg19 = findViewById(R.id.rg19);
        RadioGroup rg20 = findViewById(R.id.rg20);
        RadioGroup rg21 = findViewById(R.id.rg21);
        RadioGroup rg22 = findViewById(R.id.rg22);
        RadioGroup rg23 = findViewById(R.id.rg23);
        RadioGroup rg24 = findViewById(R.id.rg24);
        RadioGroup rg25 = findViewById(R.id.rg25);
        RadioGroup rg26 = findViewById(R.id.rg26);
        RadioGroup rg27 = findViewById(R.id.rg27);
        RadioGroup rg28 = findViewById(R.id.rg28);
        RadioGroup rg29 = findViewById(R.id.rg29);
        RadioGroup rg30 = findViewById(R.id.rg30);
        RadioGroup rg31 = findViewById(R.id.rg31);
        RadioGroup rg32 = findViewById(R.id.rg32);
        RadioGroup rg33 = findViewById(R.id.rg33);
        RadioGroup rg34 = findViewById(R.id.rg34);
        RadioGroup rg35 = findViewById(R.id.rg35);
        RadioGroup rg36 = findViewById(R.id.rg36);
        RadioGroup rg37 = findViewById(R.id.rg37);
        RadioGroup rg38 = findViewById(R.id.rg38);
        RadioGroup rg39 = findViewById(R.id.rg39);
        RadioGroup rg40 = findViewById(R.id.rg40);
        RadioGroup rg41 = findViewById(R.id.rg41);
        RadioGroup rg42 = findViewById(R.id.rg42);
        RadioGroup rg43 = findViewById(R.id.rg43);
        RadioGroup rg44 = findViewById(R.id.rg44);
        RadioGroup rg45 = findViewById(R.id.rg45);
        RadioGroup rg46 = findViewById(R.id.rg46);
        RadioGroup rg47 = findViewById(R.id.rg47);
        RadioGroup rg48 = findViewById(R.id.rg48);
        RadioGroup rg49 = findViewById(R.id.rg49);
        RadioGroup rg50 = findViewById(R.id.rg50);
        RadioGroup rg51 = findViewById(R.id.rg51);
        RadioGroup rg52 = findViewById(R.id.rg52);
        RadioGroup rg53 = findViewById(R.id.rg53);
        RadioGroup rg54 = findViewById(R.id.rg54);
        RadioGroup rg55 = findViewById(R.id.rg55);
        RadioGroup rg56 = findViewById(R.id.rg56);
        RadioGroup rg57 = findViewById(R.id.rg57);
        RadioGroup rg58 = findViewById(R.id.rg58);
        RadioGroup rg59 = findViewById(R.id.rg59);
        RadioGroup rg60 = findViewById(R.id.rg60);
        RadioGroup rg61 = findViewById(R.id.rg61);
        RadioGroup rg62 = findViewById(R.id.rg62);
        RadioGroup rg63 = findViewById(R.id.rg63);
        RadioGroup rg64 = findViewById(R.id.rg64);
        RadioGroup rg65 = findViewById(R.id.rg65);
        RadioGroup rg66 = findViewById(R.id.rg66);
        RadioGroup rg67 = findViewById(R.id.rg67);
        RadioGroup rg68 = findViewById(R.id.rg68);
        RadioGroup rg69 = findViewById(R.id.rg69);
        RadioGroup rg70 = findViewById(R.id.rg70);
        RadioGroup rg71 = findViewById(R.id.rg71);
        RadioGroup rg72 = findViewById(R.id.rg72);
        RadioGroup rg73 = findViewById(R.id.rg73);
        RadioGroup rg74 = findViewById(R.id.rg74);
        RadioGroup rg75 = findViewById(R.id.rg75);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q1a);
                RadioButton q2 = findViewById(R.id.q1b);
                RadioButton q3 = findViewById(R.id.q1c);
                RadioButton q4 = findViewById(R.id.q1d);
                switch (checkedId) {
                    case R.id.q1a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q1b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q1c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q1d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q2a);
                RadioButton q2 = findViewById(R.id.q2b);
                RadioButton q3 = findViewById(R.id.q2c);
                RadioButton q4 = findViewById(R.id.q2d);
                switch (checkedId) {
                    case R.id.q2a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q2b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q2c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q2d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q3a);
                RadioButton q2 = findViewById(R.id.q3b);
                RadioButton q1 = findViewById(R.id.q3c);
                RadioButton q4 = findViewById(R.id.q3d);
                switch (checkedId) {
                    case R.id.q3c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q3b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q3a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q3d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q4a);
                RadioButton q2 = findViewById(R.id.q4b);
                RadioButton q3 = findViewById(R.id.q4c);
                RadioButton q4 = findViewById(R.id.q4d);
                switch (checkedId) {
                    case R.id.q4a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q4b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q4c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q4d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q5a);
                RadioButton q2 = findViewById(R.id.q5b);
                RadioButton q3 = findViewById(R.id.q5c);
                RadioButton q1 = findViewById(R.id.q5d);
                switch (checkedId) {
                    case R.id.q5d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q5b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q5c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q5a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q6a);
                RadioButton q2 = findViewById(R.id.q6b);
                RadioButton q1 = findViewById(R.id.q6c);
                RadioButton q4 = findViewById(R.id.q6d);
                switch (checkedId) {
                    case R.id.q6c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q6b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q6a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q6d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q7a);
                RadioButton q2 = findViewById(R.id.q7b);
                RadioButton q3 = findViewById(R.id.q7c);
                RadioButton q4 = findViewById(R.id.q7d);
                switch (checkedId) {
                    case R.id.q7a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q7b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q7c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q7d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q8a);
                RadioButton q1 = findViewById(R.id.q8b);
                RadioButton q3 = findViewById(R.id.q8c);
                RadioButton q4 = findViewById(R.id.q8d);
                switch (checkedId) {
                    case R.id.q8b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q8a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q8c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q8d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q9a);
                RadioButton q2 = findViewById(R.id.q9b);
                RadioButton q3 = findViewById(R.id.q9c);
                RadioButton q4 = findViewById(R.id.q9d);
                switch (checkedId) {
                    case R.id.q9a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q9b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q9c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q9d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q10a);
                RadioButton q1 = findViewById(R.id.q10b);
                RadioButton q2 = findViewById(R.id.q10c);
                RadioButton q4 = findViewById(R.id.q10d);
                switch (checkedId) {
                    case R.id.q10b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q10c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q10a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q10d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q11a);
                RadioButton q1 = findViewById(R.id.q11b);
                RadioButton q2 = findViewById(R.id.q11c);
                RadioButton q4 = findViewById(R.id.q11d);
                switch (checkedId) {
                    case R.id.q11b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q11c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q11a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q11d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q12a);
                RadioButton q2 = findViewById(R.id.q12b);
                RadioButton q1 = findViewById(R.id.q12c);
                RadioButton q4 = findViewById(R.id.q12d);
                switch (checkedId) {
                    case R.id.q12c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q12b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q12a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q12d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q13a);
                RadioButton q2 = findViewById(R.id.q13b);
                RadioButton q3 = findViewById(R.id.q13c);
                RadioButton q4 = findViewById(R.id.q13d);
                switch (checkedId) {
                    case R.id.q13a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q13b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q13c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q13d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q14a);
                RadioButton q1 = findViewById(R.id.q14b);
                RadioButton q3 = findViewById(R.id.q14c);
                RadioButton q4 = findViewById(R.id.q14d);
                switch (checkedId) {
                    case R.id.q14b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q14a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q14c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q14d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q15a);
                RadioButton q4 = findViewById(R.id.q15b);
                RadioButton q3 = findViewById(R.id.q15c);
                RadioButton q1 = findViewById(R.id.q15d);
                switch (checkedId) {
                    case R.id.q15d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q15a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q15c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q15b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q16a);
                RadioButton q2 = findViewById(R.id.q16b);
                RadioButton q3 = findViewById(R.id.q16c);
                RadioButton q4 = findViewById(R.id.q16d);
                switch (checkedId) {
                    case R.id.q16a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q16b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q16c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q16d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q17a);
                RadioButton q1 = findViewById(R.id.q17b);
                RadioButton q2 = findViewById(R.id.q17c);
                RadioButton q4 = findViewById(R.id.q17d);
                switch (checkedId) {
                    case R.id.q17b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q17c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q17a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q17d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q18a);
                RadioButton q2 = findViewById(R.id.q18b);
                RadioButton q3 = findViewById(R.id.q18c);
                RadioButton q4 = findViewById(R.id.q18d);
                switch (checkedId) {
                    case R.id.q18a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q18b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q18c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q18d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q19a);
                RadioButton q2 = findViewById(R.id.q19b);
                RadioButton q3 = findViewById(R.id.q19c);
                RadioButton q4 = findViewById(R.id.q19d);
                switch (checkedId) {
                    case R.id.q19a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q19b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q19c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q19d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q20a);
                RadioButton q2 = findViewById(R.id.q20b);
                RadioButton q1 = findViewById(R.id.q20c);
                RadioButton q4 = findViewById(R.id.q20d);
                switch (checkedId) {
                    case R.id.q20c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q20b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q20a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q20d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q21a);
                RadioButton q3 = findViewById(R.id.q21b);
                RadioButton q1 = findViewById(R.id.q21c);
                RadioButton q4 = findViewById(R.id.q21d);
                switch (checkedId) {
                    case R.id.q21c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q21a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q21b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q21d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }
            }
        });
        rg22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q22a);
                RadioButton q1 = findViewById(R.id.q22b);
                RadioButton q2 = findViewById(R.id.q22c);
                RadioButton q4 = findViewById(R.id.q22d);
                switch (checkedId) {
                    case R.id.q22b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q22c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q22a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q22d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q23a);
                RadioButton q2 = findViewById(R.id.q23b);
                RadioButton q1 = findViewById(R.id.q23c);
                RadioButton q3 = findViewById(R.id.q23d);
                switch (checkedId) {
                    case R.id.q23c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q23b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q23d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q23a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q24a);
                RadioButton q2 = findViewById(R.id.q24b);
                RadioButton q4 = findViewById(R.id.q24c);
                RadioButton q1 = findViewById(R.id.q24d);
                switch (checkedId) {
                    case R.id.q24d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q24b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q24a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q24c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q25a);
                RadioButton q1 = findViewById(R.id.q25b);
                RadioButton q3 = findViewById(R.id.q25c);
                RadioButton q4 = findViewById(R.id.q25d);
                switch (checkedId) {
                    case R.id.q25b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q25a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q25c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q25d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q26a);
                RadioButton q2 = findViewById(R.id.q26b);
                RadioButton q3 = findViewById(R.id.q26c);
                RadioButton q4 = findViewById(R.id.q26d);
                switch (checkedId) {
                    case R.id.q26a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q26b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q26c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q26d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q27a);
                RadioButton q2 = findViewById(R.id.q27b);
                RadioButton q3 = findViewById(R.id.q27c);
                RadioButton q4 = findViewById(R.id.q27d);
                switch (checkedId) {
                    case R.id.q27a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q27b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q27c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q27d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q28a);
                RadioButton q1 = findViewById(R.id.q28b);
                RadioButton q3 = findViewById(R.id.q28c);
                RadioButton q4 = findViewById(R.id.q28d);
                switch (checkedId) {
                    case R.id.q28b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q28a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q28c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q28d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q29a);
                RadioButton q2 = findViewById(R.id.q29b);
                RadioButton q1 = findViewById(R.id.q29c);
                RadioButton q4 = findViewById(R.id.q29d);
                switch (checkedId) {
                    case R.id.q29c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q29b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q29a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q29d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q30a);
                RadioButton q1 = findViewById(R.id.q30b);
                RadioButton q3 = findViewById(R.id.q30c);
                RadioButton q2 = findViewById(R.id.q30d);
                switch (checkedId) {
                    case R.id.q30b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q30d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q30c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q30a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q31a);
                RadioButton q3 = findViewById(R.id.q31b);
                RadioButton q1 = findViewById(R.id.q31c);
                RadioButton q4 = findViewById(R.id.q31d);
                switch (checkedId) {
                    case R.id.q31c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q31a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q31b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q31d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q32a);
                RadioButton q1 = findViewById(R.id.q32b);
                RadioButton q3 = findViewById(R.id.q32c);
                RadioButton q2 = findViewById(R.id.q32d);
                switch (checkedId) {
                    case R.id.q32b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q32d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q32c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q32a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q33a);
                RadioButton q2 = findViewById(R.id.q33b);
                RadioButton q3 = findViewById(R.id.q33c);
                RadioButton q4 = findViewById(R.id.q33d);
                switch (checkedId) {
                    case R.id.q33a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q33b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q33c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q33d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q34a);
                RadioButton q2 = findViewById(R.id.q34b);
                RadioButton q1 = findViewById(R.id.q34c);
                RadioButton q4 = findViewById(R.id.q34d);
                switch (checkedId) {
                    case R.id.q34c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q34b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q34a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q34d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }
            }
        });
        rg35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q35a);
                RadioButton q2 = findViewById(R.id.q35b);
                RadioButton q3 = findViewById(R.id.q35c);
                RadioButton q1 = findViewById(R.id.q35d);
                switch (checkedId) {
                    case R.id.q35d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q35b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q35c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q35a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q36a);
                RadioButton q2 = findViewById(R.id.q36b);
                RadioButton q1 = findViewById(R.id.q36c);
                RadioButton q4 = findViewById(R.id.q36d);
                switch (checkedId) {
                    case R.id.q36c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q36b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q36a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q36d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q37a);
                RadioButton q2 = findViewById(R.id.q37b);
                RadioButton q3 = findViewById(R.id.q37c);
                RadioButton q1 = findViewById(R.id.q37d);
                switch (checkedId) {
                    case R.id.q37d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q37b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q37c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q37a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q38a);
                RadioButton q2 = findViewById(R.id.q38b);
                RadioButton q3 = findViewById(R.id.q38c);
                RadioButton q4 = findViewById(R.id.q38d);
                switch (checkedId) {
                    case R.id.q38a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q38b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q38c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q38d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q39a);
                RadioButton q2 = findViewById(R.id.q39b);
                RadioButton q1 = findViewById(R.id.q39c);
                RadioButton q3 = findViewById(R.id.q39d);
                switch (checkedId) {
                    case R.id.q39c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q39b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q39d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q39a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q40a);
                RadioButton q1 = findViewById(R.id.q40b);
                RadioButton q2 = findViewById(R.id.q40c);
                RadioButton q4 = findViewById(R.id.q40d);
                switch (checkedId) {
                    case R.id.q40b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q40c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q40a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q40:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q41a);
                RadioButton q1 = findViewById(R.id.q41b);
                RadioButton q3 = findViewById(R.id.q41c);
                RadioButton q4 = findViewById(R.id.q41d);
                switch (checkedId) {
                    case R.id.q41b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q41a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q41c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q41d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q42a);
                RadioButton q2 = findViewById(R.id.q42b);
                RadioButton q1 = findViewById(R.id.q42c);
                RadioButton q4 = findViewById(R.id.q42d);
                switch (checkedId) {
                    case R.id.q42c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q42b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q42a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q42d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });

        rg43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q43a);
                RadioButton q1 = findViewById(R.id.q43b);
                RadioButton q3 = findViewById(R.id.q43c);
                RadioButton q2 = findViewById(R.id.q43d);
                switch (checkedId) {
                    case R.id.q43b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q43d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q43c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q43a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q44a);
                RadioButton q2 = findViewById(R.id.q44b);
                RadioButton q3 = findViewById(R.id.q44c);
                RadioButton q4 = findViewById(R.id.q44d);
                switch (checkedId) {
                    case R.id.q44a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q44b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q44c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q44d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q45a);
                RadioButton q2 = findViewById(R.id.q45b);
                RadioButton q3 = findViewById(R.id.q45c);
                RadioButton q1 = findViewById(R.id.q45d);
                switch (checkedId) {
                    case R.id.q45d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q45b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q45c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q45a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q46a);
                RadioButton q2 = findViewById(R.id.q46b);
                RadioButton q1 = findViewById(R.id.q46c);
                RadioButton q4 = findViewById(R.id.q46d);
                switch (checkedId) {
                    case R.id.q46c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q46b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q46a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q46d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q47a);
                RadioButton q3 = findViewById(R.id.q47b);
                RadioButton q1 = findViewById(R.id.q47c);
                RadioButton q4 = findViewById(R.id.q47d);
                switch (checkedId) {
                    case R.id.q47c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q47a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q47b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q47d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q48a);
                RadioButton q3 = findViewById(R.id.q48b);
                RadioButton q2 = findViewById(R.id.q48c);
                RadioButton q4 = findViewById(R.id.q48d);
                switch (checkedId) {
                    case R.id.q48a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q48c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q48b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q48d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q49a);
                RadioButton q1 = findViewById(R.id.q49b);
                RadioButton q3 = findViewById(R.id.q49c);
                RadioButton q4 = findViewById(R.id.q49d);
                switch (checkedId) {
                    case R.id.q49b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q49a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q49c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q49d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q50a);
                RadioButton q2 = findViewById(R.id.q50b);
                RadioButton q3 = findViewById(R.id.q50c);
                RadioButton q1 = findViewById(R.id.q50d);
                switch (checkedId) {
                    case R.id.q50d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q50b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q50c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q50a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q51a);
                RadioButton q1 = findViewById(R.id.q51b);
                RadioButton q3 = findViewById(R.id.q51c);
                RadioButton q4 = findViewById(R.id.q51d);
                switch (checkedId) {
                    case R.id.q51b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q51a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q51c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q51d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q52a);
                RadioButton q2 = findViewById(R.id.q52b);
                RadioButton q3 = findViewById(R.id.q52c);
                RadioButton q1 = findViewById(R.id.q52d);
                switch (checkedId) {
                    case R.id.q52d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q52b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q52c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q52a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q53a);
                RadioButton q2 = findViewById(R.id.q53b);
                RadioButton q3 = findViewById(R.id.q53c);
                RadioButton q1 = findViewById(R.id.q53d);
                switch (checkedId) {
                    case R.id.q53d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q53b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q53c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q53a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q54a);
                RadioButton q2 = findViewById(R.id.q54b);
                RadioButton q1 = findViewById(R.id.q54c);
                RadioButton q3 = findViewById(R.id.q54d);
                switch (checkedId) {
                    case R.id.q54c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q54b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q54d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q54a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg55.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q55a);
                RadioButton q1 = findViewById(R.id.q55b);
                RadioButton q3 = findViewById(R.id.q55c);
                RadioButton q2 = findViewById(R.id.q55d);
                switch (checkedId) {
                    case R.id.q55b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q55d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q55c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q55a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg56.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q56a);
                RadioButton q1 = findViewById(R.id.q56b);
                RadioButton q3 = findViewById(R.id.q56c);
                RadioButton q2 = findViewById(R.id.q56d);
                switch (checkedId) {
                    case R.id.q56b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q56d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q56c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q56a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg57.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q57a);
                RadioButton q2 = findViewById(R.id.q57b);
                RadioButton q3 = findViewById(R.id.q57c);
                RadioButton q4 = findViewById(R.id.q57d);
                switch (checkedId) {
                    case R.id.q57a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q57b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q57c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q57d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg58.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q58a);
                RadioButton q2 = findViewById(R.id.q58b);
                RadioButton q3 = findViewById(R.id.q58c);
                RadioButton q1 = findViewById(R.id.q58d);
                switch (checkedId) {
                    case R.id.q58d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q58b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q58c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q58a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg59.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q59a);
                RadioButton q2 = findViewById(R.id.q59b);
                RadioButton q1 = findViewById(R.id.q59c);
                RadioButton q4 = findViewById(R.id.q59d);
                switch (checkedId) {
                    case R.id.q59c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q59b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q59a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q59d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg60.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q60a);
                RadioButton q1 = findViewById(R.id.q60b);
                RadioButton q3 = findViewById(R.id.q60c);
                RadioButton q4 = findViewById(R.id.q60d);
                switch (checkedId) {
                    case R.id.q60b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q60a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q60c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q60d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg61.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q61a);
                RadioButton q1 = findViewById(R.id.q61b);
                RadioButton q2 = findViewById(R.id.q61c);
                RadioButton q4 = findViewById(R.id.q61d);
                switch (checkedId) {
                    case R.id.q61b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q61c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q61a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q61d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg62.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q62a);
                RadioButton q2 = findViewById(R.id.q62b);
                RadioButton q3 = findViewById(R.id.q62c);
                RadioButton q4 = findViewById(R.id.q62d);
                switch (checkedId) {
                    case R.id.q62a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q62b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q62c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q62d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg63.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q63a);
                RadioButton q2 = findViewById(R.id.q63b);
                RadioButton q3 = findViewById(R.id.q63c);
                RadioButton q4 = findViewById(R.id.q63d);
                switch (checkedId) {
                    case R.id.q63a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q63b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q63c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q63d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg64.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q64a);
                RadioButton q2 = findViewById(R.id.q64b);
                RadioButton q3 = findViewById(R.id.q64c);
                RadioButton q1 = findViewById(R.id.q64d);
                switch (checkedId) {
                    case R.id.q64d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q64b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q64c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q64a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg65.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q65a);
                RadioButton q1 = findViewById(R.id.q65b);
                RadioButton q3 = findViewById(R.id.q65c);
                RadioButton q4 = findViewById(R.id.q65d);
                switch (checkedId) {
                    case R.id.q65b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q65a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q65c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q65d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg66.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q66a);
                RadioButton q2 = findViewById(R.id.q66b);
                RadioButton q3 = findViewById(R.id.q66c);
                RadioButton q4 = findViewById(R.id.q66d);
                switch (checkedId) {
                    case R.id.q66a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q66b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q66c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q66d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg67.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q67a);
                RadioButton q2 = findViewById(R.id.q67b);
                RadioButton q4 = findViewById(R.id.q67c);
                RadioButton q1 = findViewById(R.id.q67d);
                switch (checkedId) {
                    case R.id.q67d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q67b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q67a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q67c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg68.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q68a);
                RadioButton q2 = findViewById(R.id.q68b);
                RadioButton q3 = findViewById(R.id.q68c);
                RadioButton q1 = findViewById(R.id.q68d);
                switch (checkedId) {
                    case R.id.q68d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q68b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q68c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q68a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg69.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q69a);
                RadioButton q2 = findViewById(R.id.q69b);
                RadioButton q3 = findViewById(R.id.q69c);
                RadioButton q4 = findViewById(R.id.q69d);
                switch (checkedId) {
                    case R.id.q69a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q69b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q69c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q69d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg70.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q70a);
                RadioButton q4 = findViewById(R.id.q70b);
                RadioButton q3 = findViewById(R.id.q70c);
                RadioButton q1 = findViewById(R.id.q70d);
                switch (checkedId) {
                    case R.id.q70d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q70a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q70c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q70b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg71.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q4 = findViewById(R.id.q71a);
                RadioButton q2 = findViewById(R.id.q71b);
                RadioButton q3 = findViewById(R.id.q71c);
                RadioButton q1 = findViewById(R.id.q71d);
                switch (checkedId) {
                    case R.id.q71d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q71b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q71c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q71a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg72.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q72a);
                RadioButton q3 = findViewById(R.id.q72b);
                RadioButton q1 = findViewById(R.id.q72c);
                RadioButton q4 = findViewById(R.id.q72d);
                switch (checkedId) {
                    case R.id.q72c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q72a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q72b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q72d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg73.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q2 = findViewById(R.id.q73a);
                RadioButton q1 = findViewById(R.id.q73b);
                RadioButton q3 = findViewById(R.id.q73c);
                RadioButton q4 = findViewById(R.id.q73d);
                switch (checkedId) {
                    case R.id.q73b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q73a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q73c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q73d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg74.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q3 = findViewById(R.id.q74a);
                RadioButton q2 = findViewById(R.id.q74b);
                RadioButton q1 = findViewById(R.id.q74c);
                RadioButton q4 = findViewById(R.id.q74d);
                switch (checkedId) {
                    case R.id.q74c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q74b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q74a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q74d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });
        rg75.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton q1 = findViewById(R.id.q75a);
                RadioButton q2 = findViewById(R.id.q75b);
                RadioButton q3 = findViewById(R.id.q75c);
                RadioButton q4 = findViewById(R.id.q75d);
                switch (checkedId) {
                    case R.id.q75a:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q75b:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q2.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q3.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q75c:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q3.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q4.setEnabled(false);
                        break;
                    case R.id.q75d:
                        q1.setBackgroundColor(Color.parseColor("#00ff00"));
                        q4.setBackgroundColor(Color.RED);
                        q1.setEnabled(false);
                        q2.setEnabled(false);
                        q3.setEnabled(false);
                        break;
                }

            }
        });

    }
}

