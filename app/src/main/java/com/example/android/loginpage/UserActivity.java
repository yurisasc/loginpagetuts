package com.example.android.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Bundle extras = getIntent().getExtras();
        String name = extras.getString("NAME");
        String username = extras.getString("USERNAME");
        int age = extras.getInt("AGE");

        // Capture the layout's TextView and set the string as its text
        TextView name_textView = (TextView) findViewById(R.id.name_textView);
        TextView username_textView = (TextView) findViewById(R.id.username_textView);
        TextView age_textView = (TextView) findViewById(R.id.age_textView);
        String newNameText = name_textView.getText().toString() + " " + name;
        String newUsernameText = username_textView.getText().toString() + " " + username;
        String newAgeText = age_textView.getText().toString() + " " + age;

        name_textView.setText(newNameText);
        username_textView.setText(newUsernameText);
        age_textView.setText(newAgeText);
    }
}
