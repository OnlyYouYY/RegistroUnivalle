package com.example.registrounivalle;

import java.io.Serializable;

public class Producto implements Serializable {

    private int codigoProducto;
    private String categoriaProducto;
    private String nombreProducto;
    private int cantidad;
    private int precio;
    private String tipodecambio;
    private String estado;

    public Producto(int codigoProducto, String categoriaProducto, String nombreProducto, int cantidad, int precio, String tipodecambio, String estado) {
        this.codigoProducto = codigoProducto;
        this.categoriaProducto = categoriaProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipodecambio = tipodecambio;
        this.estado = estado;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipodecambio() {
        return tipodecambio;
    }

    public String getEstado() {
        return estado;
    }



    @Override
    public String toString() {
        return "PRODUCTO " +
                "\nCodigo Producto: '" + codigoProducto + '\'' +
                "\nCategoria Producto: '" + categoriaProducto + '\'' +
                "\nNombre Producto: '" + nombreProducto + '\'' +
                "\nCantidad: '" + cantidad + '\'' +
                "\nPrecio: '" + precio + '\'' +
                "\nTipo de Cambio: '" + tipodecambio + '\'' +
                "\nEstado: " + estado;

    }
}