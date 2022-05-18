/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 10: Polimorfismo
*/

public class Veterinarian {
	String name;
	double salary;
	
	public Veterinarian(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	
	public void vaccinate(Animal animal){
		animal.setVaccinated(true);
		System.out.println(animal.getName() + " was vaccinated");
	}
	
	public void cleanTeeth(Animal animal){
		animal.setClean(true);
		System.out.println(animal.getName() + " got his teeth cleaned");
	}
	
}
