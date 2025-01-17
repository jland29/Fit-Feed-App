package com.example.fitfeed.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.fitfeed.R;
import com.example.fitfeed.models.Workout;

import java.util.List;

public class WorkoutsSpinnerArrayAdapter extends ArrayAdapter<Workout> {

    public WorkoutsSpinnerArrayAdapter(Context context, List<Workout> workouts) {
        super(context, 0, workouts);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable
    View convertView, @NonNull ViewGroup parent)
    {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable
    View convertView, @NonNull ViewGroup parent)
    {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView,
                          ViewGroup parent)
    {
        // It is used to set our custom view.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.workouts_spinner, parent, false);
        }

        TextView textViewName = convertView.findViewById(R.id.workoutsSpinnerTextView);
        Workout currentItem = getItem(position);

        // It is used the name to the TextView when the
        // current item is not null.
        if (currentItem != null) {
            textViewName.setText(currentItem.getWorkoutName());
        }
        return convertView;
    }
}
