package com.example.sush.answerit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowAnswer extends AppCompatActivity {

  TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
  TextView a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;

  String str;
  int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_answer);

        assign();



        t1.setText(GoForIt.Question.get(0));
        str=GoForIt.Answer.get(0);

        if(GoForIt.YourAnswers.get(0).equals(str))
        {
            a1.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        }

        i=Integer.parseInt(str);
        if (i==1)
        {
            a1.setText(GoForIt.Option1.get(0));
        }
        if (i==2)
        {
            a1.setText(GoForIt.Option2.get(0));
        }
        if (i==3)
        {
            a1.setText(GoForIt.Option3.get(0));
        }
        if (i==4)
        {
            a1.setText(GoForIt.Option4.get(0));
        }




        t2.setText(GoForIt.Question.get(1));
        str=GoForIt.Answer.get(1);

        if(GoForIt.YourAnswers.get(1).equals(str))
        {
            a2.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        }

        i=Integer.parseInt(str);
        if (i==1)
        {
            a2.setText(GoForIt.Option1.get(1));
        }
        if (i==2)
        {
            a2.setText(GoForIt.Option2.get(1));
        }
        if (i==3)
        {
            a2.setText(GoForIt.Option3.get(1));
        }
        if (i==4)
        {
            a2.setText(GoForIt.Option4.get(1));
        }



        t3.setText(GoForIt.Question.get(2));
        str=GoForIt.Answer.get(2);
        if(GoForIt.YourAnswers.get(2).equals(str))
        {
            a3.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
    }

        i=Integer.parseInt(str);
        if (i==1)
        {
            a3.setText(GoForIt.Option1.get(2));
        }
        if (i==2)
        {
            a3.setText(GoForIt.Option2.get(2));
        }
        if (i==3)
        {
            a3.setText(GoForIt.Option3.get(2));
        }
        if (i==4)
        {
            a3.setText(GoForIt.Option4.get(2));
        }



        t4.setText(GoForIt.Question.get(3));
        str=GoForIt.Answer.get(3);
        if(GoForIt.YourAnswers.get(3).equals(str))
        {
            a4.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        }

        i=Integer.parseInt(str);
        if (i==1)
        {
            a4.setText(GoForIt.Option1.get(3));
        }
        if (i==2)
        {
            a4.setText(GoForIt.Option2.get(3));
        }
        if (i==3)
        {
            a4.setText(GoForIt.Option3.get(3));
        }
        if (i==4)
        {
            a4.setText(GoForIt.Option4.get(3));
        }



        t5.setText(GoForIt.Question.get(4));
        str=GoForIt.Answer.get(4);
        if(GoForIt.YourAnswers.get(4).equals(str))
        {
            a5.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        }

        i=Integer.parseInt(str);
        if (i==1)
        {
            a5.setText(GoForIt.Option1.get(4));
        }
        if (i==2)
        {
            a5.setText(GoForIt.Option2.get(4));
        }
        if (i==3)
        {
            a5.setText(GoForIt.Option3.get(4));
        }
        if (i==4)
        {
            a5.setText(GoForIt.Option4.get(4));
        }



        t6.setText(GoForIt.Question.get(5));
        str=GoForIt.Answer.get(5);
        if(GoForIt.YourAnswers.get(5).equals(str))
        {
            a6.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        }

        i=Integer.parseInt(str);
        if (i==1)
        {
            a6.setText(GoForIt.Option1.get(5));
        }
        if (i==2)
        {
            a6.setText(GoForIt.Option2.get(5));
        }
        if (i==3)
        {
            a6.setText(GoForIt.Option3.get(5));
        }
        if (i==4)
        {
            a6.setText(GoForIt.Option4.get(5));
        }



        t7.setText(GoForIt.Question.get(6));
        str=GoForIt.Answer.get(6);
        if(GoForIt.YourAnswers.get(6).equals(str))
        {
            a7.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        }

        i=Integer.parseInt(str);
        if (i==1)
        {
            a7.setText(GoForIt.Option1.get(6));
        }
        if (i==2)
        {
            a7.setText(GoForIt.Option2.get(6));
        }
        if (i==3)
        {
            a7.setText(GoForIt.Option3.get(6));
        }
        if (i==4)
        {
            a7.setText(GoForIt.Option4.get(6));
        }



        t8.setText(GoForIt.Question.get(7));
        str=GoForIt.Answer.get(7);
        if(GoForIt.YourAnswers.get(7).equals(str))
        {
            a8.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        }

        i=Integer.parseInt(str);
        if (i==1)
        {
            a8.setText(GoForIt.Option1.get(7));
        }
        if (i==2)
        {
            a8.setText(GoForIt.Option2.get(7));
        }
        if (i==3)
        {
            a8.setText(GoForIt.Option3.get(7));
        }
        if (i==4)
        {
            a8.setText(GoForIt.Option4.get(7));
        }



        t9.setText(GoForIt.Question.get(8));
        str=GoForIt.Answer.get(8);
        if(GoForIt.YourAnswers.get(8).equals(str))
        {
            a9.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        }

        i=Integer.parseInt(str);
        if (i==1)
        {
            a9.setText(GoForIt.Option1.get(8));
        }
        if (i==2)
        {
            a9.setText(GoForIt.Option2.get(8));
        }
        if (i==3)
        {
            a9.setText(GoForIt.Option3.get(8));
        }
        if (i==4)
        {
            a9.setText(GoForIt.Option4.get(8));
        }



        t10.setText(GoForIt.Question.get(9));
        str=GoForIt.Answer.get(9);
        if(GoForIt.YourAnswers.get(9).equals(str))
        {
            a10.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        }

        i=Integer.parseInt(str);
        if (i==1)
        {
            a10.setText(GoForIt.Option1.get(9));
        }
        if (i==2)
        {
            a10.setText(GoForIt.Option2.get(9));
        }
        if (i==3)
        {
            a10.setText(GoForIt.Option3.get(9));
        }
        if (i==4)
        {
            a10.setText(GoForIt.Option4.get(9));
        }

    }


    public void assign()
    {
        t1=(TextView)findViewById(R.id.q1);
        t2=(TextView)findViewById(R.id.q2);
        t3=(TextView)findViewById(R.id.q3);
        t4=(TextView)findViewById(R.id.q4);
        t5=(TextView)findViewById(R.id.q5);
        t6=(TextView)findViewById(R.id.q6);
        t7=(TextView)findViewById(R.id.q7);
        t8=(TextView)findViewById(R.id.q8);
        t9=(TextView)findViewById(R.id.q9);
        t10=(TextView)findViewById(R.id.q10);


        a1=(TextView)findViewById(R.id.a1);
        a2=(TextView)findViewById(R.id.a2);
        a3=(TextView)findViewById(R.id.a3);
        a4=(TextView)findViewById(R.id.a4);
        a5=(TextView)findViewById(R.id.a5);
        a6=(TextView)findViewById(R.id.a6);
        a7=(TextView)findViewById(R.id.a7);
        a8=(TextView)findViewById(R.id.a8);
        a9=(TextView)findViewById(R.id.a9);
        a10=(TextView)findViewById(R.id.a10);

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        GoForIt.Question.clear();
        GoForIt.Answer.clear();
        GoForIt.Option1.clear();
        GoForIt.Option2.clear();
        GoForIt.Option3.clear();
        GoForIt.Option4.clear();
        GoForIt.YourAnswers.clear();

        Intent intent = new Intent(ShowAnswer.this,GoForIt.class);
        startActivity(intent);
        ShowAnswer.this.finish();

    }
}
