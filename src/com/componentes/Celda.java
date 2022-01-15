package com.componentes;

public class Celda {
	
	private Producto producto;
	private int stock;
	private String codigo;
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Celda(int stock) {
		super();
		this.stock = stock;
	}
	
	public void ingresarProducto(Producto producto, int st){
		this.producto=producto;
		this.stock=st;
	}
	
	public Celda(String codigo) {
		super();
		this.codigo = codigo;
	}
	
	
}
