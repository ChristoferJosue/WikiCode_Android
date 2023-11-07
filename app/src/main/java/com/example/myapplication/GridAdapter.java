package com.example.myapplication;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
//clase adaptadora para crear el gridview
public class GridAdapter extends BaseAdapter {


    Context context;
    String[] nombreLenguaje;
    int[]lenguaje;
    LayoutInflater inflater;
    public GridAdapter(Context context,String[]nombreLenguaje, int[]lenguaje)
    {
        this.context=context;
        this.nombreLenguaje=nombreLenguaje;
        this.lenguaje=lenguaje;


    }

    @Override
    public int getCount() {
        return nombreLenguaje.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater==null)
        {
            inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);



        }
        if(convertView == null)
            convertView = inflater.inflate(R.layout.grid_item,null);

        ImageView imageView=(ImageView) convertView.findViewById(R.id.ImagenLenguaje);
        TextView textView=(TextView)    convertView.findViewById(R.id.LenguajeTexto);
        imageView.setImageResource(lenguaje[position]);
        textView.setText(nombreLenguaje[position]);

        return convertView;
    }
}
