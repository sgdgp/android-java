package com.example.sayan.sunshine;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sayan on 14-02-2016.
 */
public class ForecastAdapter extends BaseAdapter{
    private Activity activity;
    private List<String> weekForecast;

    private LayoutInflater inflater;

    public ForecastAdapter(Activity activity,List<String> weekForecast){
        this.activity = activity;
        this.weekForecast = weekForecast;
    }
    @Override
    public int getCount(){
        return weekForecast.size();
    }
    @Override
    public Object getItem(int position) {
        return weekForecast.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        if(inflater == null){
            inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }if(convertView == null){
            convertView = inflater.inflate(R.layout.list_item_forecast, null);
        }

        TextView text = (TextView)convertView.findViewById(R.id.list_item_forecast_textview);
        text.setText(weekForecast.get(position));
        return convertView;

    }
}
