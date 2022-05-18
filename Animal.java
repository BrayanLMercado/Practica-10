/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 10: Polimorfismo
*/

public class Animal {
	String name;
	int age;
	boolean vaccinated ;
	boolean cleanTeeth;
	
	public Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public void eat(){
		System.out.println(name + " is eating");
	}
	
	public void sleep(){
		System.out.println(name + "is spleeping");
	}
	
	public void setVaccinated(boolean vaccinated){
		this.vaccinated=vaccinated;
	}

	public String getName() {
		return name;
	}
	
	public void setClean(boolean cleanTeeth) {
		this.cleanTeeth=cleanTeeth;
	}

}
