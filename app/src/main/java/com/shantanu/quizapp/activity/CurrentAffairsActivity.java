package com.shantanu.quizapp.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import com.shantanu.quizapp.MainActivity;
import com.shantanu.quizapp.R;

public class CurrentAffairsActivity extends AppCompatActivity {

    private final String[] questions = {"What is the target for agricultural and processed food products from India for 2022-23 ?",
            "Which country commenced its annual war-game ‘Zolfaghar-1401’, in the coastal area of the Gulf of Oman ?",
            "Which country has taken over the Presidency of the Council of the European Union for the first six months of 2023 ?",
            "Where is the ‘Institute of Veterinary Biological Products (IVBP)’ located ?",
            "Which state launched ‘Didir Suraksha Kawach and Didir Doot’ programmes ?",
            "Which year has been declared as the ‘International Year of Millets (IYM)’ ?",
            "Which Union Ministry launched a five-pronged energy efficiency plan to become carbon-neutral by 2030 ?",
            "Which institution operates the ‘DRDO Industry Academia- Ramanujan Centre of Excellence’ ?",
            "Luiz Inácio Lula da Silva recently took charge as the President of which country ?",
            "Which city is the host of the ‘VIRAASAT’ festival organised by the Ministry of Textiles ?"};

    private final String[][] answers = {
            {"USD 3.56 billion", "USD 13.56 billion", "USD 23.56 billion", "USD 43.56 billion"},
            {"UAE", "Iran", "Afghanistan", "Israel"},
            {" Finland", "Sweden", "Italy", "Germany"},
            {"Pune", "Ahmedabad", "Lucknow", "Mysuru"},
            {"Bihar", "West Bengal", "Rajasthan", "Haryana"},
            {"2021", "2022", "2023", "2024"},
            {"Ministry of Coal", "Ministry of Railways", "Ministry of Steel", "Ministry of Tourism"},
            {"NIT Warangal", "IIT Madras", "IIT Bombay", "IISc Bengaluru"},
            {"Brazil", "France", "Italy", "Argentina"},
            {"Mumbai", "Tiruppur", "Ahmedabad", "New Delhi"}
    };

    private final int[] correct_answer_index = {2,1,1,0,1,2,1,1,0,3};

    private TextView question_no, question, total_attempted_questions, questions_answered_correctly, questions_answered_wrong;
    private RadioButton option1, option2, option3, option4;
    private AppCompatButton save_question_btn, submit_quiz_btn;
    private int current_question_index;
    private int correct_count, wrong_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_affairs);

        setTitle("Current Affairs Quiz");

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
                        if(option3.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(CurrentAffairsActivity.this, "Correct Answer : " + option3.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 1:
                        if(option2.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(CurrentAffairsActivity.this, "Correct Answer : " + option2.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 2:
                        if(option2.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(CurrentAffairsActivity.this, "Correct Answer : " + option2.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 3:
                        if(option1.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(CurrentAffairsActivity.this, "Correct Answer : " + option1.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 4:
                        if(option2.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(CurrentAffairsActivity.this, "Correct Answer : " + option2.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 5:
                        if(option3.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(CurrentAffairsActivity.this, "Correct Answer : " + option3.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 6:
                        if(option2.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(CurrentAffairsActivity.this, "Correct Answer : " + option2.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 7:
                        if(option2.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(CurrentAffairsActivity.this, "Correct Answer : " + option2.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 8:
                        if(option1.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(CurrentAffairsActivity.this, "Correct Answer : " + option1.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 9:
                        if(option4.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(CurrentAffairsActivity.this, "Correct Answer : " + option4.getText().toString(), Toast.LENGTH_SHORT).show();
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