/*
Nombre: Lopez Mercado Brayan
Matr�cula: 1280838
Materia: Programaci�n Orientada a Objetos 
Pr�ctica 10: Polimorfismo
*/

public class Cougar extends Animal {
	public Cougar(String name,int age){
		super(name,age);
	}
	
	@Override
	public void eat(){
		System.out.println(name  + " is eating Meat");
	}
	
	public void Mission(){
		System.out.println("THERE ARE NO COUGARS IN MISSIONS!!!");
	}
	
	public void run(){
		System.out.println(name  + " is chasing a prey");
	}
}
