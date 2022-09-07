package com.miquis.test_lambda.demo1.testSDK;

public class Request {

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getHttp_methodo() {
        return http_methodo;
    }

    public void setHttp_methodo(String http_methodo) {
        this.http_methodo = http_methodo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    private int producto_id;
    private String http_methodo;
    private Producto producto;
}
