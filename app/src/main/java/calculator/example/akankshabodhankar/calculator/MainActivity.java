package calculator.example.akankshabodhankar.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    Button sum, sub, mul, div, assg, num1, num2, num3, num4, num5, num6, num7, num8, num9, point, clear, back, square, root, sign, zero;
    boolean sumb, subb, divb, mulb;
    TextView inputtv,displaytv;
    StringBuilder inputtext = new StringBuilder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sum = (Button) findViewById(R.id.add_bt);
        sub = (Button) findViewById(R.id.sub_bt);
        mul = (Button) findViewById(R.id.mul_bt);
        div = (Button) findViewById(R.id.div_bt);
        assg = (Button) findViewById(R.id.equal_bt);
        zero = (Button) findViewById(R.id.zero_bt);
        num1 = (Button) findViewById(R.id.one_bt);
        num2 = (Button) findViewById(R.id.two_bt);
        num3 = (Button) findViewById(R.id.three_bt);
        num4 = (Button) findViewById(R.id.four_bt);
        num5 = (Button) findViewById(R.id.five_bt);
        num6 = (Button) findViewById(R.id.six_bt);
        num7 = (Button) findViewById(R.id.seven_bt);
        num8 = (Button) findViewById(R.id.eight_bt);
        num9 = (Button) findViewById(R.id.nine_bt);
        point = (Button) findViewById(R.id.dot_bt);
        clear = (Button) findViewById(R.id.C_bt);
        back = (Button) findViewById(R.id.back_bt);
        square = (Button) findViewById(R.id.square_bt);
        root = (Button) findViewById(R.id.root_bt);
        sign = (Button) findViewById(R.id.sign_bt);
        inputtv = (TextView) findViewById(R.id.input_tv);
        displaytv = (TextView) findViewById(R.id.display_tv);
        try {
            zero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append("0");
                    inputtv.setText(inputtext);
                }
            });
            num1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append("1");
                    inputtv.setText(inputtext);
                }
            });
            num2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append("2");
                    inputtv.setText(inputtext);
                }
            });
            num3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append("3");
                    inputtv.setText(inputtext);
                }
            });
            num4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append("4");
                    inputtv.setText(inputtext);
                }
            });
            num5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append("5");
                    inputtv.setText(inputtext);
                }
            });
            num6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append("6");
                    inputtv.setText(inputtext);
                }
            });
            num7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append("7");
                    inputtv.setText(inputtext);
                }
            });
            num8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append("8");
                    inputtv.setText(inputtext);
                }
            });
            num9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append("9");
                    inputtv.setText(inputtext);
                }
            });
            point.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append(".");
                    inputtv.setText(inputtext);
                }
            });
            sum.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append("+");
                    inputtv.setText(inputtext);
                    sumb = true;
                }
            });
            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append("-");
                    inputtv.setText(inputtext);
                    subb = true;
                }
            });
            mul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append("*");
                    inputtv.setText(inputtext);
                    mulb = true;
                }
            });
            div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtext.append("/");
                    inputtv.setText(inputtext);
                    divb = true;
                }
            });
            //Results
            assg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    displaytv.setText(inputtext);
                    String[] myArray = null;
                    if(sumb==true)
                    {
                        int result = 0;
                        myArray = inputtext.toString().split("\\+");
                        for(int i=0;i<myArray.length;i++)
                            result += Integer.parseInt(myArray[i]);
                        inputtv.setText(String.valueOf(result));
                        inputtext.setLength(0);

                    }
                    else if(subb==true)
                    {
                        int result = 0;
                        myArray = inputtext.toString().split("\\-");
                        int count=0;
                        for(int i=0;i<myArray.length-1;i++)
                        {
                            result = Integer.parseInt(myArray[i])-Integer.parseInt(myArray[i+1]);

                        }

                        inputtv.setText(String.valueOf(result));
                        inputtext.setLength(0);


                    }
                    else if(mulb==true)
                    {
                        int result = 0;
                        myArray = inputtext.toString().split("\\*");
                        for(int i=0;i<myArray.length;i++)
                            result *= Integer.parseInt(myArray[i]);
                        inputtv.setText(String.valueOf(result));
                        inputtext.setLength(0);


                    }
                    else if(divb==true)
                    {
                        int result = 0;
                        myArray = inputtext.toString().split("\\/");
                        for(int i=0;i<(myArray.length-1);i++)
                            result = Integer.parseInt(myArray[i])/Integer.parseInt(myArray[i+1]);
                        inputtv.setText(String.valueOf(result));
                        inputtext.setLength(0);


                    }
                }


            });
            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputtv.setText(" ");
                    inputtext.setLength(0);
                }
            });
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Exception occured sorry!", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }

    }

    public static boolean isoperator(String s) {
        if (s == "+" || s == "-" || s == "*" || s == "/")
            return true;
        else
            return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
