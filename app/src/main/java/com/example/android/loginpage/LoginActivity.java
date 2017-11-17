package com.example.android.loginpage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        EditText nameEditText = (EditText) findViewById(R.id.name_editText);
        EditText usernameEditText = (EditText) findViewById(R.id.username_editText);
        EditText ageEditText = (EditText) findViewById(R.id.age_editText);
        String username_text = usernameEditText.getText().toString();
        String name_text = nameEditText.getText().toString();
        int age_text = Integer.parseInt(ageEditText.getText().toString());
        if (age_text >= 15) {
            doIntent(name_text, username_text, age_text);
        } else {
            sendToast();
        }
    }

    public void sendToast() {
        Context context = getApplicationContext();
        CharSequence text = "Your age has to be 15+";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void doIntent(String name, String username, int age) {
        Intent intent = new Intent(this, UserActivity.class);
        intent.putExtra("NAME", name);
        intent.putExtra("USERNAME", username);
        intent.putExtra("AGE", age);
        startActivity(intent);
    }
}
