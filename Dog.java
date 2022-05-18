/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 10: Polimorfismo
*/

public class Dog extends Animal{
	public Dog(String name, int age){
		super(name,age);
	}
	
	@Override
	public void eat(){
		System.out.println(name  + " is eating Pedigree");
	}
	
	public void bark(){
		System.out.println(name  + " is barking");
	}
}
