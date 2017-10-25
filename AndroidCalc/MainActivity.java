package livevasiliy.androidcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static livevasiliy.androidcalc.R.*;
import static livevasiliy.androidcalc.R.id.*;
import static livevasiliy.androidcalc.R.string.clean;
import static livevasiliy.androidcalc.R.string.zero;

public class MainActivity extends AppCompatActivity {

    float value1, value2;
    boolean plus,minus,mulply,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);




        final TextView textView = (TextView) findViewById(id.textView);


        // Blocks numbers 0 in 9
        final Button zero = (Button) findViewById(button13);
        final Button one = (Button) findViewById(button9);
        final Button two = (Button) findViewById(button10);
        final Button three = (Button) findViewById(button11);
        final Button four = (Button) findViewById(button5);
        final Button five = (Button) findViewById(button6);
        final Button six = (Button) findViewById(button7);
        final Button seven = (Button) findViewById(button);
        final Button eight = (Button) findViewById(button2);
        final Button nine = (Button) findViewById(button3);

        // Blocks math operation
        final Button AC = (Button) findViewById(button4);
        final Button add = (Button) findViewById(button8);
        final Button sub = (Button) findViewById(button12);
        final Button mul = (Button) findViewById(button15);
        final Button div = (Button) findViewById(button16);
        final Button eq = (Button) findViewById(button17);


        final Button dot = (Button) findViewById(button14);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "9");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + ".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(textView.getText()+"");
                plus = true;
                textView.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(textView.getText()+"");
                minus = true;
                textView.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(textView.getText()+"");
                mulply = true;
                textView.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(textView.getText()+"");
                division = true;
                textView.setText(null);
            }
        });

        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Float.parseFloat(textView.getText()+"");
                if (plus == true){
                    textView.setText(value1 + value2+"");
                    plus = false;
                }
                if (minus == true){
                    textView.setText(value1 - value2+"");
                    minus = false;
                }
                if (mulply == true){
                    textView.setText(value1 * value2+"");
                    mulply = false;
                }
                if (division == true){
                    if (value2 == 0) textView.setText("Error"+"");
                    else {
                        textView.setText(value1 / value2+"");
                        division = false;
                    }
                }
            }
        });

        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(null);
                System.out.println("clean");
            }
        });
    }




}
