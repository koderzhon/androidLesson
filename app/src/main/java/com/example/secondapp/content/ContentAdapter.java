package com.example.secondapp.content;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.secondapp.R;

import java.util.List;

public class ContentAdapter  extends RecyclerView.Adapter<ContentAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Content> contents;
    private ItemClickListener mClickListener;

    public ContentAdapter(Context context, List<Content> contents) {
        this.contents = contents;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public ContentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_content, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContentAdapter.ViewHolder holder, int position) {
        Content content = contents.get(position);
        holder.flagView.setImageResource(content.getIconResource());
        holder.nameView.setText(content.getName());
        holder.capitalView.setText(content.getDescription());
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView nameView, capitalView;
        ViewHolder(View view){
            super(view);
            flagView = (ImageView)view.findViewById(R.id.icon_content);
            nameView = (TextView) view.findViewById(R.id.name);
            capitalView = (TextView) view.findViewById(R.id.description);
        }
    }
}