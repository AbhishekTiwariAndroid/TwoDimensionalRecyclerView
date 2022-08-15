package dev.abhishektiwari.twodimensionalrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoriesRVAdapter extends RecyclerView.Adapter<CategoriesRVAdapter.ViewHolder> {

    // variables for array list and context.
    private ArrayList<CategoriesModal> categoriesModalArrayList;
    private Context context;

    // creating a constructor
    public CategoriesRVAdapter(ArrayList<CategoriesModal> categoriesModalArrayList, Context context) {
        this.categoriesModalArrayList = categoriesModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoriesRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // passing our layout file for displaying our card item
        return new CategoriesRVAdapter.ViewHolder(LayoutInflater.from(context).inflate(R.layout.news_categories_rv_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesRVAdapter.ViewHolder holder, int position) {
        // setting data to our views on below line.
        CategoriesModal modal = categoriesModalArrayList.get(position);
        holder.categoryTV.setText(modal.getNewsCategory());
        NewsRVAdapter adapter = new NewsRVAdapter(modal.getNewsModalArrayList(), context);
        // below line is for setting a layout manager for our recycler view.
        // here we are creating horizontal list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        holder.newsRV.setLayoutManager(linearLayoutManager);
        holder.newsRV.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        // returning the size of array list on below line.
        return categoriesModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // creating new variables for our views.
        private RecyclerView newsRV;
        private TextView categoryTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our views.
            categoryTV = itemView.findViewById(R.id.idTVCategory);
            newsRV = itemView.findViewById(R.id.idRVNews);
        }
    }
}