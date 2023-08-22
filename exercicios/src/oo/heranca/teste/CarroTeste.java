package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Versa;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro v1 = new Versa();
		
		v1.acelerar();
		System.out.println(v1);
		
		v1.acelerar();
		System.out.println(v1);
		
		v1.acelerar();
		System.out.println(v1);
		
		Ferrari c1 = new Ferrari(400);
		
		c1.ligarTurbo();
		c1.ligarAr();
		System.out.println(c1.nivelDoAr());
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.frear();
		System.out.println(c1);
		
	}
}
