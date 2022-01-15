package com.maquina;

import com.componentes.Celda;
import com.componentes.Producto;

public class MaquinaDulces {
	
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public Celda getCelda1() {
		return celda1;
	}
	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}
	public Celda getCelda2() {
		return celda2;
	}
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}
	public Celda getCelda3() {
		return celda3;
	}
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}
	public Celda getCelda4() {
		return celda4;
	}
	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void configurarMaquina(String c1,String c2,String c3,String c4){
		celda1=new Celda(c1);
		celda2=new Celda(c2);
		celda3=new Celda(c3);
		celda4=new Celda(c4);
		
	}
	
	public void mostrarConfiguracion(){
		System.out.println("Codigo celda1: "+celda1.getCodigo());
		System.out.println("Codigo celda2: "+celda2.getCodigo());
		System.out.println("Codigo celda3: "+celda3.getCodigo());
		System.out.println("Codigo celda4: "+celda4.getCodigo());
		System.out.println("Saldo: "+saldo);
	}
	
	public Celda buscarCelda(String c){
		
		if(c.equals(celda1.getCodigo())){
			return celda1;
		}
		else if(c.equals(celda2.getCodigo())){
			return celda2;
		}
		else if(c.equals(celda3.getCodigo())){
			return celda3;
		}
		else if(c.equals(celda4.getCodigo())){
			return celda4;
		}
		else
		{
			return null;
		}
	}
	
	public void cargarProducto(Producto pd, String cd, int st){
	  
		Celda celdaRecuperada=buscarCelda(cd);
		
		if(celdaRecuperada==null){
			
			System.out.println("La celda no existe");
		}
		
		celdaRecuperada.ingresarProducto(pd, st);
		
	}
	
	public void mostrarProductos(){
		System.out.println("Celda1**********");
		System.out.println("Codigo: "+celda1.getCodigo());
		System.out.println("Stock: "+celda1.getStock());
		
		if(celda1.getProducto()!=null){
			System.out.println("Nombre: "+celda1.getProducto().getNombre());
			System.out.println("Precio: "+celda1.getProducto().getPrecio());
		}
		else{
			System.out.println("La celda no tiene producto");
		}
		
		System.out.println("Celda2**********");
		System.out.println("Codigo: "+celda2.getCodigo());
		System.out.println("Stock: "+celda2.getStock());
		if(celda2.getProducto()!=null){
			System.out.println("Nombre: "+celda2.getProducto().getNombre());
			System.out.println("Precio: "+celda2.getProducto().getPrecio());
		}
		else{
			System.out.println("La celda no tiene producto");
		}
		
		System.out.println("Celda3**********");
		System.out.println("Codigo: "+celda3.getCodigo());
		System.out.println("Stock: "+celda3.getStock());
		if(celda3.getProducto()!=null){
			
			System.out.println("Nombre: "+celda3.getProducto().getNombre());
			 System.out.println("Codigo: "+celda3.getProducto().getCodigo());
			System.out.println("Precio: "+celda3.getProducto().getPrecio());
			
			
		}
		else{
			System.out.println("La celda no tiene producto");
		}
		
			
			//System.out.println("La celda no tiene producto");
		System.out.println("Celda4**********");
		System.out.println("Codigo: "+celda4.getCodigo());
		System.out.println("Stock: "+celda4.getStock());
		if(celda4.getProducto()!=null){
			System.out.println("Nombre: "+celda4.getProducto().getNombre());
			System.out.println("Precio: "+celda4.getProducto().getPrecio());
		}
		else{
			System.out.println("La celda no tiene producto");
		}
	}
	
	public Producto buscarProductoEnCelda(String c){
		
		if(c.equals(celda1.getCodigo())){
			return celda1.getProducto();
		}
		else if(c.equals(celda2.getCodigo())){
			return celda2.getProducto();
		}
		else if(c.equals(celda3.getCodigo())){
			return celda3.getProducto();
		}
		else if(c.equals(celda4.getCodigo())){
			return celda4.getProducto();
		}
		else
		{
			return null;
		}
		
	}
	
	public double consultarPrecio(String c){
		
		if(c.equals(celda1.getCodigo())){
			return celda1.getProducto().getPrecio();
		}
		else if(c.equals(celda2.getCodigo())){
			return celda2.getProducto().getPrecio();
		}
		else if(c.equals(celda3.getCodigo())){
			return celda3.getProducto().getPrecio();
		}
		else if(c.equals(celda4.getCodigo())){
			return celda4.getProducto().getPrecio();
		}
		else
		{
			return 0.0;
		}
	}
	
	public Celda buscarCeldaProducto(String pd){
		
		if(celda1.getProducto()!=null && pd.equals(celda1.getProducto().getCodigo())){
			return celda1;
		}
		else if(celda2.getProducto()!=null && pd.equals(celda2.getProducto().getCodigo())){
			return celda2;
		}
		else if(celda3.getProducto()!=null && pd.equals(celda3.getProducto().getCodigo())){
			return celda3;
		}
		else if(celda4.getProducto()!=null && pd.equals(celda4.getProducto().getCodigo())){
			return celda4;
		}
		else
		{
			return null;
		}
		
	}
	
	public void incrementarProductos(String cd, int it){
		
		Celda celdaEncontrada=buscarCeldaProducto(cd);
		
		celdaEncontrada.setStock(celdaEncontrada.getStock()+it);
		
	}
	
	public void vender(String cd){
		
		Celda celdar=buscarCelda(cd);
		celdar.setStock(celdar.getStock()-1);
		
		saldo=saldo+celdar.getProducto().getPrecio();
		mostrarConfiguracion();
	}
	
	public double venderConCambio(String cd, double precio){
		
		Celda cl=buscarCelda(cd);
		cl.setStock(cl.getStock()-1);
		saldo=saldo-precio;
		
		return saldo;
		
	}
}
