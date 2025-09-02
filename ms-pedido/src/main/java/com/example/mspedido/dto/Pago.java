//package com.example.mspedido.dto;
//
//
//import lombok.Data;
//
//@Data
//public class Pago {
//
//    private Integer id;
//    private String producto;
//    private String cantidad;
//    private String codigo;
//    private String fecha;
//}



package com.example.mspedido.dto;

import lombok.Data;

@Data
public class Pago {

    private Integer id;
    private String producto;
    private String cantidad;

    private String codigo;
    private String fecha;
    private Categoria categoria;



    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", producto='" + producto + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", codigo='" + codigo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", categoria=" + categoria +
                '}';
    }



}
