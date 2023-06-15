package com.error41.pratice138;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Custom extends ArrayAdapter<model> {

    private ArrayList<model> modelArrayList;
    private Context context;

    public Custom(Context context, ArrayList<model> data) {
        super(context, R.layout.item, data);
        this.modelArrayList = data;
        this.context = context;
    }

    private static class ViewHolder {
        TextView txClassmate;
        TextView txroll;
        ImageView pic_image12;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item, parent, false);

            viewHolder.txClassmate = convertView.findViewById(R.id.nametextView);
            viewHolder.txroll = convertView.findViewById(R.id.CounttextView2);
            viewHolder.pic_image12 = convertView.findViewById(R.id.imageView);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        model dataModel = getItem(position);

        if (dataModel != null) {
            viewHolder.txClassmate.setText(dataModel.getClassmate_name());
            viewHolder.txroll.setText(dataModel.getRoll());
            viewHolder.pic_image12.setImageResource(dataModel.getPic_image());
        }

        return convertView;
    }
}
