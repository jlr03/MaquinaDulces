package com.test;

import com.componentes.Celda;
import com.componentes.Producto;

public class TestContenidoCelda {

	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		Producto producto=new Producto("Papitas","KE34",0.85);
		celda.ingresarProducto(producto, 5);
		
		System.out.println("CELDA:"+celda.getCodigo());
		System.out.println("*************************************");
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("Código Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
	}

}
