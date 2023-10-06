package downCasting;

public class FighterPalne extends Plane {
	public FighterPalne(String name) {
		this.name=name;
	}
	
	public void fly() {
		System.out.println(name+" plane is flying very fast");
		
	}
	public void carryArms() {
		System.out.println(name+" carrying arms and weapons");
	}

}
