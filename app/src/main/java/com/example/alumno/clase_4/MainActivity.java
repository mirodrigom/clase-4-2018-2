package com.example.alumno.clase_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Persona> listaPersona = new ArrayList<Persona>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Persona p1 = new Persona("Rodrigo", "Fernandez");
        Persona p2 = new Persona("Gabriel", "Perez");
        Persona p3 = new Persona("Juan", "Martinez");
        Persona p4 = new Persona("Fernando", "Reyes");
        Persona p5 = new Persona("Martin", "Gramuglia");
        Persona p6 = new Persona("Gerardo", "Zelaschi");
        Persona p7 = new Persona("Lucas", "Giofre");
        Persona p8 = new Persona("Mariano", "Volpin");
        Persona p9 = new Persona("Tara", "arat");
        Persona p10 = new Persona("alo", "ola");
        listaPersona.add(p1);
        listaPersona.add(p2);
        listaPersona.add(p3);
        listaPersona.add(p4);
        listaPersona.add(p5);
        listaPersona.add(p6);
        listaPersona.add(p7);
        listaPersona.add(p8);
        listaPersona.add(p9);
        listaPersona.add(p10);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rvPersonas);
        MyAdapter adapter = new MyAdapter(listaPersona,this);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));

    }


    public void llamar(int personasIndex)
    {
        Log.d("Llamar","Llamando a "+listaPersona.get(personasIndex).getNombre());
    }

}
