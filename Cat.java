/*
Nombre: Lopez Mercado Brayan
Matr�cula: 1280838
Materia: Programaci�n Orientada a Objetos 
Pr�ctica 10: Polimorfismo
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