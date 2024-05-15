package com.ucompensar.tiendaonline;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ListaProductos extends AppCompatActivity {

    ListView listaProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lista_productos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Teclado Genius", 30000, R.drawable.teclado));
        productos.add(new Producto("Tarjeta Gráfica NVidia", 2500000, R.drawable.tarjetanvidia));
        productos.add(new Producto("Motherboard ASUS", 700000, R.drawable.motherboard));
        productos.add(new Producto("Audífonos Gamer", 500000, R.drawable.audifonos));
        listaProductos = findViewById(R.id.listaProductos);
        ProductoAdapter adapter = new ProductoAdapter(this, R.layout.item_producto, productos);
        listaProductos.setAdapter(adapter);
    }
}