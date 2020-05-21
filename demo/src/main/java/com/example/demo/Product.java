package com.example.demo;

public class Product {
	
	String nome;
	
	String marca;
	
	float prezzo;

	
	public Product(String nome, String marca, float prezzo) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Product [nome=" + nome + ", marca=" + marca + ", prezzo=" + prezzo + "]";
	}
	
	
	

}
