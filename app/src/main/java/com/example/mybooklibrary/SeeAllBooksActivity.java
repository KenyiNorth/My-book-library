package com.example.mybooklibrary;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SeeAllBooksActivity extends AppCompatActivity {
    private static final String TAG = "SeeAllBooksActivity";
   private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_all_books);

        recyclerView = findViewById(R.id.recyclerView);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        ArrayList<Books> books = new ArrayList<>();
       books.add(new Books("Perfume Lover",
               "Robert W. Erickson, Dragan Maksimovic",
               "https://d.gr-assets.com/books/1344319175l/15793297.jpg",500,"Fundamentals of Power Electronics"));
        books.add(new Books("The Science of Getting Rich",
                "Jeylan T. Mortimer, Michael J. Shanahan",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1394237317l/8148247.jpg",500,"Fundamentals of Power Electronics"));
        books.add(new Books("The New Husband",
                "Jeylan T. Mortimer, Michael J. Shanahan",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1565012556l/45046677.jpg",500,"Fundamentals of Power Electronics"));
        books.add(new Books("Pandora's Lab",
                "Robert W. Erickson, Dragan Maksimovic",
                "https://www.sciencebrainwaves.com/wp-content/uploads/2019/01/9781426217982.jpg",500,"Fundamentals of Power Electronics"));
        books.add(new Books("Nocera",
                "Robert W. Erickson, Dragan Maksimovic",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1587051339l/53189437.jpg",500,"Fundamentals of Power Electronics"));
        books.add(new Books("Enticed by His Forgotten Lover",
                "Maya Banks",
                "https://i1.wp.com/d.gr-assets.com/books/1308589584l/11044210.jpg?ssl=1",500,"Fundamentals of Power Electronics"));

        recyclerViewAdapter.setBooks(books);




    }

}
