package com.ucompensar.tiendaonline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ProductoAdapter extends ArrayAdapter<Producto> {

    private Context context;
    private int resource;
    private ArrayList<Producto> productos;

    public ProductoAdapter(Context context, int resource, ArrayList<Producto> productos) {
        super(context, resource, productos);
        this.context = context;
        this.resource = resource;
        this.productos = productos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(resource, parent, false);
        }

        Producto producto = productos.get(position);

        ImageView imageViewProducto = convertView.findViewById(R.id.imageViewProducto);
        TextView textViewNombre = convertView.findViewById(R.id.textViewNombreProducto);
        TextView textViewPrecio = convertView.findViewById(R.id.textViewPrecioProducto);

        imageViewProducto.setImageResource(producto.getImagen());
        textViewNombre.setText(producto.getNombre());
        textViewPrecio.setText(String.format("Precio: $%.2f", producto.getPrecio()));

        return convertView;
    }
}