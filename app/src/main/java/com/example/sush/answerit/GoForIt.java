package com.example.sush.answerit;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
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



public class GoForIt extends AppCompatActivity {

    Button button,start;


    static ArrayList<String> Question = new ArrayList<>();
    static ArrayList<String> Option1 = new ArrayList<>();
    static ArrayList<String> Option2 = new ArrayList<>();
    static ArrayList<String> Option3 = new ArrayList<>();
    static ArrayList<String> Option4 = new ArrayList<>();
    static ArrayList<String> Answer = new ArrayList<>();
    static ArrayList<String> YourAnswers = new ArrayList<>();


    static int j=0;
    DataReciever user = new DataReciever();
    DatabaseReference databaseQuestion;
    int i=0;
    Toast toast;
    ProgressBar progressBar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_for_it);

        start = (Button) findViewById(R.id.startGame);
        progressBar = findViewById(R.id.progress);

        databaseQuestion = FirebaseDatabase.getInstance().getReference("QuestionAndAnswer");




        updateFromDatabase obj = new updateFromDatabase();
        progressBar.setVisibility(View.VISIBLE);

        Thread t1 = new Thread(obj);
        if(haveNetwork())
        {
            t1.start();
        }
        else
        {
            Toast.makeText(GoForIt.this,"Plz check your internet connection",Toast.LENGTH_SHORT).show();
        }



        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Question.isEmpty())
                {
                   toast= Toast.makeText(GoForIt.this,"Slow Internet..Plz wait...",Toast.LENGTH_SHORT);
                   toast.show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            toast.cancel();
                        }
                    }, 500);
                }
                else
                {
                    Intent i = new Intent(GoForIt.this, Question_1.class);
                    startActivity(i);
                    finish();

                }


            }
        });
    }

    private boolean haveNetwork()
    {
        boolean have_WIFI=false;
        boolean have_MobileData=false;

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo[] networkInfos = connectivityManager.getAllNetworkInfo();

        for(NetworkInfo info:networkInfos)
        {
            if(info.getTypeName().equals("WIFI"))
            {
                if(info.isConnected())
                {
                    have_WIFI=true;
                }
            }

            if (info.getTypeName().equals("MOBILE"))
            {
                if(info.isConnected())
                {
                    have_MobileData=true;
                }
            }
        }

       return have_MobileData||have_WIFI;

    }



    public class updateFromDatabase implements Runnable
    {


        @Override
        public void run() {



                databaseQuestion.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {


                        for (DataSnapshot ds : dataSnapshot.getChildren()) {
                            user = ds.getValue(DataReciever.class);


                            if (user != null) {

                                i++;
                                String question = user.getQuestion();
                                String option1 = user.getOption1();
                                String option2 = user.getOption2();
                                String option3 = user.getOption3();
                                String option4 = user.getOption4();
                                String answer = user.getAnswer();


                                Question.add(question);
                                Option1.add(option1);
                                Option2.add(option2);
                                Option3.add(option3);
                                Option4.add(option4);
                                Answer.add(answer);

                                if(i==10)
                                {

                                    progressBar.setVisibility(View.GONE);
                                    Toast.makeText(GoForIt.this,"Welcome!",Toast.LENGTH_SHORT).show();

                                }


                            }
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }


    }




}



