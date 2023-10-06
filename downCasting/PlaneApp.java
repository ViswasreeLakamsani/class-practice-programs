package downCasting;

public class PlaneApp {

	public static void main(String[] args) {
		Plane ref;
		ref=new FighterPalne("Brahoms...");
		ref.takeOff();
		ref.fly();
		((FighterPalne) (ref)).carryArms();

	}

}
