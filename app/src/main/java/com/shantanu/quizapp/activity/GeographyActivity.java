package com.shantanu.quizapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import com.shantanu.quizapp.MainActivity;
import com.shantanu.quizapp.R;

public class GeographyActivity extends AppCompatActivity {

    private final String[] questions = {
            "According to the recent IMD report, which state had the highest number of deaths due to unusual weather conditions ?",
            "The Mauna Kea volcano, which was seen in news regarding the Thirty-Meter Telescope (TMT), is situated in which country ?",
            "India is set to use Euro-VI emission compliant fuels from which date ?",
            "Trionychidae, that was seen in news recently, belongs to which species ?",
            "As per a recent study, the 68 million-year-old egg found nine years ago, might belong to which species ?",
            "Which state has the highest count of inbred tigers in the country, as per the National Centre for Biological Sciences ?",
            "What species is ‘Systomus gracilus’, that has been identified in the Ganges ?",
            "Which organisation is to set up a ‘Community response forum’ to analyse the impact of Stubble burning on places in and around Delhi ?",
            "India’s first moss garden has been developed in which state/UT ?",
            "Scientists have discovered an undiscovered population of blue whales in which region ?"
    };
    private final String[][] answers = {
            {"Uttar Pradesh", "Bihar", "Rajasthan", "Himachal Pradesh"},
            {" Indonesia", "Papua New Guinea", "Philippines", "Hawaii"},
            {" April 1, 2020", "June 1, 2020", "September 1, 2020", "January 1, 2021"},
            {"Spider", "Snake", "Turtle", "Owl"},
            {"Mosasaur", "Hainosaurus", "Tylosaurus", "Prognathodon"},
            {"Madhya Pradesh", "Rajasthan", "West Bengal", "Karnataka"},
            {"Fish", "Turtle", "Octopus", "Crocodile"},
            {"NASA", "ISRO", "FAO", "Ministry of Environment, Forest and Climate Change"},
            {" Himachal Pradesh", "Uttarakhand", "Sikkim", "West Bengal"},
            {"Western Indian Ocean", "North Pacific Ocean", "Atlantic Ocean", "Arctic Ocean"}
    };

    private final int[] correct_answer_index = {1,3,0,2,0,1,0,0,1,0};

    private TextView question_no, question, total_attempted_questions, questions_answered_correctly, questions_answered_wrong;
    private RadioButton option1, option2, option3, option4;
    private AppCompatButton save_question_btn, submit_quiz_btn;
    private int current_question_index;
    private int correct_count, wrong_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography);

        setTitle("Geography Quiz");

        // obtain all ID
        obtainID();

        // current question index
        current_question_index = 0;

        // correct and wrong answers count
        correct_count = 0;
        wrong_count = 0;

        // set question & answer
        setQuestionAnswer(current_question_index);

        // save current question answer
        saveCurrentQuestionAnswer();
    }

    private void obtainID() {
        question_no = findViewById(R.id.question_no);
        question = findViewById(R.id.question);

        option1 = findViewById(R.id.option_1);
        option2 = findViewById(R.id.option_2);
        option3 = findViewById(R.id.option_3);
        option4 = findViewById(R.id.option_4);

        save_question_btn = findViewById(R.id.save_btn);
        submit_quiz_btn = findViewById(R.id.submit_quiz);

        total_attempted_questions = findViewById(R.id.total_attempted_questions);
        questions_answered_correctly = findViewById(R.id.questions_answered_correctly);
        questions_answered_wrong = findViewById(R.id.questions_answered_wrong);
    }

    private void setQuestionAnswer(int index) {
        question_no.setText("Question No. "+(index+1));
        question.setText(questions[index]);

        option1.setText(answers[index][0]);
        option2.setText(answers[index][1]);
        option3.setText(answers[index][2]);
        option4.setText(answers[index][3]);

        total_attempted_questions.setText("Question Attempted Till Now : " + current_question_index);
        questions_answered_correctly.setText("Correct Answers : " + correct_count);
        questions_answered_wrong.setText("Wrong Answers : " + wrong_count);
    }

    private void saveCurrentQuestionAnswer() {
        save_question_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (current_question_index) {
                    case 0:
                        if(option2.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GeographyActivity.this, "Correct Answer : " + option2.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 1:
                        if(option4.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GeographyActivity.this, "Correct Answer : " + option4.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 2:
                        if(option1.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GeographyActivity.this, "Correct Answer : " + option1.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 3:
                        if(option3.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GeographyActivity.this, "Correct Answer : " + option3.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 4:
                        if(option1.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GeographyActivity.this, "Correct Answer : " + option1.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 5:
                        if(option2.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GeographyActivity.this, "Correct Answer : " + option2.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 6:
                        if(option1.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GeographyActivity.this, "Correct Answer : " + option1.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 7:
                        if(option1.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GeographyActivity.this, "Correct Answer : " + option1.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 8:
                        if(option2.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GeographyActivity.this, "Correct Answer : " + option2.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 9:
                        if(option1.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GeographyActivity.this, "Correct Answer : " + option1.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                }
            }
        });
    }

    private void showNextQuestion() {
        if(current_question_index == questions.length-1) {
            save_question_btn.setVisibility(View.INVISIBLE);
            submit_quiz_btn.setVisibility(View.VISIBLE);

            total_attempted_questions.setText("Question Attempted Till Now : " + (current_question_index+1));
            questions_answered_correctly.setText("Correct Answers : " + correct_count);
            questions_answered_wrong.setText("Wrong Answers : " + wrong_count);

            submitQuiz();
        } else {
            current_question_index = current_question_index + 1;
            setQuestionAnswer(current_question_index);
        }
    }

    private void submitQuiz() {
        submit_quiz_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
}