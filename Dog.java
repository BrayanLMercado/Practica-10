/*
Nombre: Lopez Mercado Brayan
Matr�cula: 1280838
Materia: Programaci�n Orientada a Objetos 
Pr�ctica 10: Polimorfismo
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
