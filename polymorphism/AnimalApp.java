package polymorphism;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jungle j=new Jungle();
		j.acceptAnimals(new Tiger());
		j.acceptAnimals(new Deer());
		j.acceptAnimals(new Monkey());
		
		
		

	}

}
