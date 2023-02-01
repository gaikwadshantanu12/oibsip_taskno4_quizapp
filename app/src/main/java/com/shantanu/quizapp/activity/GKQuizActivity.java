package com.shantanu.quizapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.shantanu.quizapp.MainActivity;
import com.shantanu.quizapp.R;

public class GKQuizActivity extends AppCompatActivity {

    private final String[] questions = {"Who among the following is the author of ‘Indica’ ?",
                                        "Which Greek King of Bactria invaded India about 190 B.C. ?",
                                        "Who presided Fourth Buddhist Council ?",
                                        "In the Maurya empire, who was the superintendent of Ports ?",
                                        "Who among the following succeeded Samudragupta as the next ruler of Gupta Dynasty ?",
                                        "Hemis festival is dedicated to Lord Padmasambhava (Gur Rimpoche) venerated as the representative reincarnate of Buddha. In which part of India it is held every year ?",
                                        "Which of the following emerged as the chief means of livelihood of the Later Vedic people ?",
                                        "Which of the following was the largest and most powerful republican state in ancient India ?",
                                        "Which century marked the emergence of the notion of private property ?",
                                        "Which of the following was the head of the board of war elephants in Mauryan administration ?"};
    private final String[][] answers = {
            {"Ashoka","Chankya", "Megasthenes", "Seleucus"},
            {"Demetrius", "Alexander", "Seleucus Nicator", "Menander"},
            {"Mahakassapa", "Vasumitra", "Moggliputra Tissa", "Sabakami"},
            {"Pattanadhyaksha", "Manadhyaksha", "Kosadhyaksha", "Ganikadhyaksha"},
            {"Chandragupta II", "Chandragupta I", "Vishnugupta", "Mahendra"},
            {"Himachal Pradesh", "Assam", "Ladakh", "Orissa"},
            {"Fishing", "Hunting", "Agriculture", "Rearing animals"},
            {"The Mallas of Pava.", "The Lichchavis of Vaisali.", "The Sakyas of Kapilavastu.", "The Mallas of Kushinara."},
            {"7th century BCE", "6th century BCE", "8th century BCE", "1st century AD"},
            {"Hastyadhyaksha", "Asvadhyaksha", "Padadhyaksha", "Rathadhyaksha"}
                                        };

    private final int[] correct_answer_index = {2,0,1,0,0,2,2,1,1,0};

    private TextView question_no, question, total_attempted_questions, questions_answered_correctly, questions_answered_wrong;
    private RadioButton option1, option2, option3, option4;
    private AppCompatButton save_question_btn, submit_quiz_btn;
    private int current_question_index;
    private int correct_count, wrong_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gkquiz);

        setTitle("History Quiz");

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
                            Toast.makeText(GKQuizActivity.this, "Correct Answer : " + option3.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 1:
                        if(option1.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GKQuizActivity.this, "Correct Answer : " + option1.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 2:
                        if(option2.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GKQuizActivity.this, "Correct Answer : " + option2.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 3:
                        if(option1.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GKQuizActivity.this, "Correct Answer : " + option1.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 4:
                        if(option1.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GKQuizActivity.this, "Correct Answer : " + option1.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 5:
                        if(option3.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GKQuizActivity.this, "Correct Answer : " + option3.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 6:
                        if(option3.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GKQuizActivity.this, "Correct Answer : " + option3.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 7:
                        if(option2.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GKQuizActivity.this, "Correct Answer : " + option2.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 8:
                        if(option2.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GKQuizActivity.this, "Correct Answer : " + option2.getText().toString(), Toast.LENGTH_SHORT).show();
                            wrong_count += 1;
                        }
                        showNextQuestion();
                        break;
                    case 9:
                        if(option1.isChecked())
                            correct_count += 1;
                        else {
                            Toast.makeText(GKQuizActivity.this, "Correct Answer : " + option1.getText().toString(), Toast.LENGTH_SHORT).show();
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