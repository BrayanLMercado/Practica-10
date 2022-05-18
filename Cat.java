/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 10: Polimorfismo
*/

public class Cat extends Animal{
	public Cat(String name,int age){
		super(name,age);
	}
	
	@Override
	public void eat(){
		System.out.println(name  + " is eating Whiskas");
	}
	
	public void Meow(){
		System.out.println("Meow* Meow*");
	}
}