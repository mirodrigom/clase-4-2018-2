package com.example.alumno.clase_4;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 20/09/2018.
 */

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView txtNom;
    TextView txtApe;
    MainActivity act;
    int posicion;

    public MyViewHolder(View itemView,MainActivity act) {
        super(itemView);
        txtNom = (TextView) itemView.findViewById(R.id.nom);
        txtApe = (TextView) itemView.findViewById(R.id.ape);
        this.act = act;
        itemView.setOnClickListener(this);
    }

    public void setPosicion(int pos)
    {
        this.posicion = pos;
    }

    @Override
    public void onClick(View v) {
        //Cualquiercosa que apretes va a llamarse este metodo.

        act.llamar(this.posicion);
    }
}
