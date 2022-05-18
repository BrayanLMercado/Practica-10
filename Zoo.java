/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 10: Polimorfismo
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int opc;
		ArrayList <Animal> animalArray = new ArrayList<Animal>();
		animalArray.add(new Animal("An animal",1));
		animalArray.add(new Dog("Chispita",4));
		animalArray.add(new Cat("Miu",2));
		animalArray.add(new Snake("Binah",5));
		animalArray.add(new Cougar("Matto",3));
		animalArray.add(new Snake("El Blanco",7));
		
		do{
			System.out.println("Menú");
			System.out.println("1- Mostrar Animales Existentes");
			System.out.println("2- Añadir Animales");
			System.out.println("3- Eliminar Animales");
			opc=in.nextInt();
		}while (opc<1 || opc>3);
		switch(opc){
			case 1: 
				Displayer(animalArray);
				break;
			case 2:
				adder(animalArray);
				break;
			case 3:
				eraser(animalArray);
				break;
		}
		
	}
	
	public static void Displayer(ArrayList<Animal> array){
		int b=1;
		for(Animal a : array){
			System.out.print(b + "-");
			a.eat();
			if(a instanceof Snake){
				((Snake) a).changeSkin();
				((Snake) a).dig();
			}
			else if(a instanceof Dog){
				((Dog) a).bark();
			}
			else if(a instanceof Cat){
				((Cat) a).Meow();
			}
			else if(a instanceof Cougar){
				((Cougar) a).run();
				((Cougar) a).Mission();
			}
			b+=1;
			System.out.println();
		}
	}
	
	
	public static void eraser(ArrayList<Animal> array){
		Scanner in= new Scanner(System.in);
		int op;
		Displayer(array);
		System.out.println("Qué Animal quieres Borrar? ");
		do{
			op=in.nextInt();
		}while(op<1 || op>array.size());
		array.remove(op-1);
		Displayer(array);
	}
	
	public static void adder(ArrayList<Animal> array){
		int age;
		String name;
		Scanner in= new Scanner(System.in);
		int op;
		System.out.println("Nombre del animal: ");
		name=in.nextLine();
		System.out.println("Qué Especie Es? ");
		System.out.println("1- Animal");
		System.out.println("2- Gato");
		System.out.println("3- Perro");
		System.out.println("4- Puma");
		System.out.println("5- Serpiente");
		do{
			op=in.nextInt();
		}while(op<1 || op>5);
		System.out.println("Edad Del Animal: ");
		age=in.nextInt();
		switch(op){
			case 1:
				array.add(new Animal(name,age));
				break;
			case 2:
				array.add(new Cat(name,age));
				break;
			case 3:
				array.add(new Dog(name,age));
				break;
			case 4:
				array.add(new Cougar(name,age));
				break;
			case 5:
				array.add(new Snake(name,age));
				break;
		}
		Displayer(array);
	}

}
