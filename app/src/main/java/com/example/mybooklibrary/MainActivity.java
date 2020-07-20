package com.example.mybooklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button seeAllBooks, currentlyReadingBooks, wantsToReadBooks, alreadyReadyBooks, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        booksAchieves();

    }
    public void booksAchieves(){
        seeAllBooks = findViewById(R.id.seeAllBooks);
        currentlyReadingBooks = findViewById(R.id.cuttleyRedadingBooks);
        wantsToReadBooks = findViewById(R.id.wantsToReadBooks);
        alreadyReadyBooks = findViewById(R.id.alreadyReadingBooks);
        about = findViewById(R.id.about);

        seeAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent().setClassName(getPackageName(),"com.example.mybooklibrary.SeeAllBooksActivity");
                startActivity(intent);

            }
        });

    }
}
