package abstractClass;

public class ChildAircraft extends ParentAircraft {
	public static void main(String[] args) {
		ChildAircraft c = new ChildAircraft();
		c.Engine();
		c.SafetyGuidelines();
		c.BodyColor();
		// We cannot instantiate an Abstract class. We cannot create any object for
		// Abstract class.
	}

	@Override
	public void BodyColor() {
		System.out.println("Red Color on the Body");
	}
}
