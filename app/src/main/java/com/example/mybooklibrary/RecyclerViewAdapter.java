package com.example.mybooklibrary;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHoldel> {
    private static final String TAG = "RecyclerViewAdapter";
    ArrayList<Books>books = new ArrayList<>();
    Context context;

    public RecyclerViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHoldel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerlayout, parent,false);
        ViewHoldel viewHoldel = new ViewHoldel(view);
        return viewHoldel;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHoldel holder, final int position) {
        Log.d(TAG, "onBindViewHolder: ");
     holder.bookName.setText(books.get(position).getName());
        Glide.with(context)
                .asBitmap().
                load(books.get(position)
                        .getImageURL()).into(holder.bookImage);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,books.get(position).getName()+" Selected ",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class ViewHoldel extends RecyclerView.ViewHolder {
     ImageView bookImage;
     TextView bookName;
     CardView cardView;
        public ViewHoldel(@NonNull View itemView) {
            super(itemView);
             bookImage = itemView.findViewById(R.id.bookImage);
            bookName = itemView.findViewById(R.id.bookName);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }

    public void setBooks(ArrayList<Books> books) {
        this.books = books;
        notifyDataSetChanged();
    }
}
