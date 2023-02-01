package com.shantanu.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.shantanu.quizapp.activity.CurrentAffairsActivity;
import com.shantanu.quizapp.activity.GKQuizActivity;
import com.shantanu.quizapp.activity.GeographyActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private final String[] domain_names = {"History", "Current Affairs", "Geography"};
    private final int[] domain_logo = {R.drawable.logo_history, R.drawable.logo_current_affairs, R.drawable.logo_geography};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        ListViewAdapter adapter = new ListViewAdapter(domain_names, domain_logo, getApplicationContext());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(getApplicationContext(), GKQuizActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), CurrentAffairsActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(), GeographyActivity.class));
                        break;
                }
            }
        });
    }
}