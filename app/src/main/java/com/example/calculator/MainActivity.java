package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsub,btnmult,btndiv,btnsign,btnclear,btndelete,btnperc,btndec,btnequal;
    EditText edtsol;
    boolean addn,subn,muln,div;
    Float solution,val1,val2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=findViewById(R.id.btn_0);
        btn1=findViewById(R.id.btn_1);
        btn2=findViewById(R.id.btn_2);
        btn3=findViewById(R.id.btn_3);
        btn4=findViewById(R.id.btn_4);
        btn5=findViewById(R.id.btn_5);
        btn6=findViewById(R.id.btn_6);
        btn7=findViewById(R.id.btn_7);
        btn8=findViewById(R.id.btn_8);
        btn9=findViewById(R.id.btn_9);
        btnadd=findViewById(R.id.btn_add);
        btnsub=findViewById(R.id.btn_sub);
        btnmult=findViewById(R.id.btn_mult);
        btndiv=findViewById(R.id.btn_div);
        btnsign=findViewById(R.id.btn_sign);
        btnclear=findViewById(R.id.btn_clear);
        btndelete=findViewById(R.id.btn_delete);
        btnperc=findViewById(R.id.btn_perc);
        btndec=findViewById(R.id.btn_dec);
        btnequal=findViewById(R.id.btn_equal);
        btnsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(edtsol.getText()+"");
                edtsol.setText((val1*-1)+"");
            }
        });
        btnperc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(edtsol.getText()+"");
                edtsol.setText(val1/100+"");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtsol.append(btn0.getText().toString());
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtsol.append(btn1.getText().toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtsol.append(btn2.getText().toString());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtsol.append(btn3.getText().toString());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtsol.append(btn4.getText().toString());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtsol.append(btn5.getText().toString());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtsol.append(btn6.getText().toString());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtsol.append(btn7.getText().toString());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtsol.append(btn8.getText().toString());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtsol.append(btn9.getText().toString());
            }
        });
        btndec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtsol.append(btndec.getText().toString());
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtsol.setText("");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(edtsol.getText()+"");
                edtsol.append(btnadd.getText().toString());
                addn=true;
                edtsol.setText(null);
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(edtsol.getText()+"");
                edtsol.append(btnsub.getText().toString());
                subn=true;
                edtsol.setText(null);
            }
        });
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(edtsol.getText()+"");
                edtsol.append(btnmult.getText().toString());
                muln=true;
                edtsol.setText(null);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(edtsol.getText()+"");
                edtsol.append(btndiv.getText().toString());
                div=true;
                edtsol.setText(null);
            }
        });
        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = edtsol.getText().length();
                if (length > 0) {
                    edtsol.getText().delete(length - 1, length);
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2=Float.parseFloat(edtsol.getText().toString());
                if(addn==true)
                {
                    edtsol.setText(val1+val2+"");
                    addn=false;
                }
                if(subn==true)
                {
                    edtsol.setText(val1-val2+"");
                    subn=false;
                }
                if(muln==true)
                {
                    edtsol.setText(val1*val2+"");
                    muln=false;
                }
                if(div==true)
                {
                    edtsol.setText(val1/val2+"");
                    div=false;
                }
            }
        });

    }
}