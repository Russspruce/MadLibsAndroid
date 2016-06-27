package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibsActivity extends AppCompatActivity {
    private TextView mMadLibsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs);
        mMadLibsTextView = (TextView) findViewById(R.id.madLibsTextView);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String noun = intent.getStringExtra("noun");
        String adjective = intent.getStringExtra("adjective");
        String verb = intent.getStringExtra("verb");
        String animal = intent.getStringExtra("animal");
        mMadLibsTextView.setText("This is a story about "+name+", who would love to eat "+noun+".  Every day and night, "+name+" would just keep eating "+noun+", until one day when they decided to "+adjective+" instead of eat it.  For some reason that can not be explained, all of the "+animal+"s did not like this change in behavior, and decided to "+verb+".  And from that point on, nothing really made sense.");
    }
}
