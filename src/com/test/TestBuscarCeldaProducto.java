package com.test;

import com.componentes.Celda;
import com.componentes.Producto;
import com.maquina.MaquinaDulces;

public class TestBuscarCeldaProducto {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		
		Celda celda=maquina.buscarCeldaProducto("KE34");
		System.out.println("Celda que contiene el producto:"+celda.getCodigo());
		
		
		
		
	}
}
