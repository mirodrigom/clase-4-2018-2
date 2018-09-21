package com.example.alumno.clase_4;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alumno on 20/09/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>
{
    List<Persona> personas;
    MainActivity act;

    //0.Le paso la lista de personas
    public MyAdapter(List<Persona> personas, MainActivity act)
    {
        this.personas = personas;
        this.act = act;
    }

    //1.Crea el elemento
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //a toda app android le tengo q decir cual es el contexto padre
        View  v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        MyViewHolder vh = new MyViewHolder(v,act);
        return vh;
    }

    //2. Y ahora bindea los datos
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Persona p = this.personas.get(position);
        holder.txtApe.setText(p.getApellido());
        holder.txtNom.setText(p.getNombre());
        holder.setPosicion(position);
    }

    //3.Cuantos Elementos creo
    @Override
    public int getItemCount() {
        return this.personas.size();
    }
}
