package com.muhammadaa.sampleappwithretrofit.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.muhammadaa.sampleappwithretrofit.R;
import com.muhammadaa.sampleappwithretrofit.api.model.GitHubRepo;

import java.util.List;

/**
 * Created by muhammadaa on 14/08/17.
 */

public class GitHubRepoAdapter extends ArrayAdapter<GitHubRepo> {

    private Context context;
    private List<GitHubRepo> values;

    public GitHubRepoAdapter(Context context, List<GitHubRepo> values){
        super(context, R.layout.list_item_pagination, values);

        this.context = context;
        this.values = values;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null){
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_item_pagination, parent, false);
        }

        TextView textView = (TextView) row.findViewById(R.id.list_item_pagination_text);

        GitHubRepo item = values.get(position);
        String message = item.getName();
        textView.setText(message);

        return row;
    }
}
