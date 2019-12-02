package com.example.attlistviewfrutas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Adapter extends ArrayAdapter<Fruta> {

    Context mContext;
    int mResource;
    Fruta[] frutas;

    public Adapter (Context context, int resource, Fruta[] objects) {

        super(context, resource, objects);
        mContext = context;
        mResource = resource;
        frutas = objects;

    }

    public View getView (int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent,false);

        //Associando objetos da interface a indentificadores locais

        TextView tvCodigo = convertView.findViewById(R.id.tvCodigo);
        TextView tcPreco = convertView.findViewById(R.id.tvPreco);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        //Recuperando um objeto do data set, na posição position
        Fruta f = getItem(position);
        DecimalFormat df = new DecimalFormat("#,###.00");

        //populando as views do layout inflado
        tvCodigo.setText(Integer.toString(f.getCodigo()));


        imageView.setImageResource(f.getImagem());

        return convertView;
    }
}