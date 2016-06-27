package com.epicodus.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mMadLibsButton;
    private EditText mNounText;
    private EditText mNameText;
    private EditText mAdjectiveText;
    private EditText mVerbText;
    private EditText mAnimalText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNounText = (EditText) findViewById(R.id.nounText);
        mNameText = (EditText) findViewById(R.id.nameText);
        mAdjectiveText = (EditText) findViewById(R.id.adjectiveText);
        mVerbText = (EditText) findViewById(R.id.verbText);
        mAnimalText = (EditText) findViewById(R.id.animalText);

        mMadLibsButton = (Button) findViewById(R.id.madLibsButton);
        mMadLibsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noun = mNounText.getText().toString();
                String name = mNameText.getText().toString();
                String adjective = mAdjectiveText.getText().toString();
                String verb = mVerbText.getText().toString();
                String animal = mAnimalText.getText().toString();
                Log.d(TAG, noun + name + adjective + verb + animal);
                Intent intent = new Intent(MainActivity.this, MadLibsActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("noun", noun);
                intent.putExtra("adjective", adjective);
                intent.putExtra("verb", verb);
                intent.putExtra("animal", animal);
                startActivity(intent);
            }
        });
    }
}
