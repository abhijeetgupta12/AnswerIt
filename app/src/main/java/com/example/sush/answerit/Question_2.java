package com.example.sush.answerit;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Question_2 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    private Button button;
    RadioGroup radioGroup;
    RadioButton r1,r2,r3,r4;
    String Number = "Empty"; //Initial Value is must
    TextView textView,qno;
    private AlertDialog.Builder alert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_1);

        button = (Button)findViewById(R.id.alertID);
        button.setBackgroundResource(R.drawable.next);

        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        textView = (TextView)findViewById(R.id.question);
        qno=(TextView)findViewById(R.id.questioNo);
        int q=GoForIt.j+1;
        String str = q+"/10";
        qno.setText(str);

        r1=(RadioButton)findViewById(R.id.One);
        r2=(RadioButton)findViewById(R.id.Two);
        r3=(RadioButton)findViewById(R.id.Three);
        r4=(RadioButton)findViewById(R.id.Four);

        textView.setText(GoForIt.Question.get(GoForIt.j));
        r1.setText(GoForIt.Option1.get(GoForIt.j));
        r2.setText(GoForIt.Option2.get(GoForIt.j));
        r3.setText(GoForIt.Option3.get(GoForIt.j));
        r4.setText(GoForIt.Option4.get(GoForIt.j));
        radioGroup.setOnCheckedChangeListener(this);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (Number.equals("1")||Number.equals("2")||Number.equals("3")||Number.equals("4")) {
                    GoForIt.YourAnswers.add(Number);
                    if(GoForIt.j==9)
                    {
                        Intent intent = new Intent(Question_2.this,ResultPage.class);
                        startActivity(intent);
                        GoForIt.j=0;
                        overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left);
                        Question_2.this.finish();
                    }
                    else
                    {
                        Intent i = new Intent(Question_2.this, Question_1.class);
                        startActivity(i);
                        GoForIt.j++;
                        overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left);
                        Question_2.this.finish();
                    }
                }

                else if(Number.equals("Empty"))
                {

                    Toast.makeText(Question_2.this, "Select an option", Toast.LENGTH_SHORT).show();

                }




            }
        });
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {


        switch (i) {
            case R.id.One:
                Number = "1";
                break;

            case R.id.Two:
                Number = "2";
                break;

            case R.id.Three:
                Number = "3";
                break;

            case R.id.Four:
                Number = "4";
                break;
        }

    }

    @Override
    public void onBackPressed() {

        alert = new AlertDialog.Builder(Question_2.this);

        alert.setTitle(R.string.title);

        alert.setMessage(R.string.message);

        alert.setCancelable(false);

        alert.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(Question_2.this,GoForIt.class);
                startActivity(intent);
                GoForIt.Question.clear();
                GoForIt.Answer.clear();
                GoForIt.Option1.clear();
                GoForIt.Option2.clear();
                GoForIt.Option3.clear();
                GoForIt.Option4.clear();
                GoForIt.YourAnswers.clear();
                Question_2.this.finish();
            }
        });

        alert.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog dialog = alert.create();

        dialog.show();
        //super.onBackPressed();
    }


}


 /*    String question = "Hello";
                      String option1 = "Hello";
                      String option2 = "Hello";
                      String option3 = "Hello";
                      String option4 = "Hello";
                      String answer = "Hello";
                      DataReciever dataReciever = new DataReciever(question,option1,option2,option3,option4,answer);

                      databaseQuestion.child("Question"+i).setValue(dataReciever);

                      i++;*/
