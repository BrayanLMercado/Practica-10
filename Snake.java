
public class Snake extends Animal {
	public Snake(String name,int age){
		super(name,age);
	}
	
	@Override
	public void eat(){
		System.out.println(name  + " is eating a Mouse");
	}
	
	public void changeSkin(){
		System.out.println(name + " is changing skin");
	}
	
	public void dig(){
		System.out.println(name  + " is digging a tunnel");
	}
}
