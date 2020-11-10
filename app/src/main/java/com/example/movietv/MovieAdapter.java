package com.example.movietv;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private List<Movie> movies;
    private Context mcontext;

    MovieAdapter(Context context, List<Movie> movies) {
        this.movies = movies;
        this.mcontext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ViewHolder holder, int position) {

        Movie movie = movies.get(position);
        holder.titleTextView.setText(movie.getTitle());
        holder.ratingTextView.setText(movie.getRating());
        holder.releaseDateTextView.setText(movie.getReleaseDate());
        Glide.with(mcontext).load(movie.getPosterUrl()).into(holder.posterImageView);


    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView;
        TextView ratingTextView;
        TextView releaseDateTextView;
        ImageView posterImageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = (TextView) itemView.findViewById(R.id.title_text_view);
            ratingTextView = (TextView) itemView.findViewById(R.id.rating_text_view);
            releaseDateTextView = (TextView) itemView.findViewById(R.id.releaseDate_text_view);
            posterImageView = (ImageView) itemView.findViewById(R.id.poster_image_view);
        }
    }
}

    /*public MovieAdapter(Activity context, ArrayList<Movie> movies){
        super(context,0,movies);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Movie currMovie = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currMovie.getTitle());

        TextView ratingTextView = (TextView) listItemView.findViewById(R.id.rating_text_view);
        ratingTextView.setText(currMovie.getRating());

        TextView releaseDateTextView = (TextView) listItemView.findViewById(R.id.releaseDate_text_view);
        releaseDateTextView.setText(currMovie.getReleaseDate());

        ImageView posterImageView = (ImageView) listItemView.findViewById(R.id.poster_image_view);
        Picasso.get().load(currMovie.getPosterUrl()).into(posterImageView);

        return listItemView;

    }
}*/
