package com.example.sush.answerit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ResultPage extends AppCompatActivity {

    TextView textView,high;
    String str = "",str1="";
    int r=0;
    Button showAns;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);
        textView =findViewById(R.id.text);
        high = findViewById(R.id.highestScore);

        sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


      for(int i=0;i<GoForIt.YourAnswers.size();i++)
      {
         if(GoForIt.YourAnswers.get(i).equals(GoForIt.Answer.get(i)))
          {
              r++;
          }
      }

      int highscore = sharedPreferences.getInt("Score",0);

      if(highscore<r)
      {
          editor.putInt("Score",r);
          editor.apply();
      }

        str=r+"/10";
        str1="Highest Score: "+sharedPreferences.getInt("Score",0)+"/10";
        textView.setText(str);
        high.setText(str1);

        showAns=findViewById(R.id.showAnswer);

        showAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ResultPage.this,ShowAnswer.class);
                startActivity(intent);
                ResultPage.this.finish();

            }
        });


    }



    @Override
    public void onBackPressed() {

        Intent intent = new Intent(ResultPage.this,GoForIt.class);
        startActivity(intent);
        ResultPage.this.finish();
        GoForIt.Question.clear();
        GoForIt.Answer.clear();
        GoForIt.Option1.clear();
        GoForIt.Option2.clear();
        GoForIt.Option3.clear();
        GoForIt.Option4.clear();
        GoForIt.YourAnswers.clear();
    }
}
