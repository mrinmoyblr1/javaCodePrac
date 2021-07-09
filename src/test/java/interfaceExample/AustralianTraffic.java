package interfaceExample;
public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {
	public static void main(String[] args) {
		CentralTraffic ob1 = new AustralianTraffic();
		ob1.greenGo();
		ob1.redStop();
		ob1.flashingYellow();
		System.out.println(CentralTraffic.a);
		AustralianTraffic ob2 = new AustralianTraffic();
		ob2.WalkOnSignal();
		ContinentalTraffic ct = new AustralianTraffic();
		ct.TrainSymbol();
	}
	
	public void greenGo() {
		System.out.println("Green Go Implementation");
	}
	public void redStop() {
		System.out.println("Red Stop Implementation");
	}
	public void flashingYellow() {
		System.out.println("Flash Yellow Implementation");
	}
	public void WalkOnSignal() {
		System.out.println("Walk On Signal Method");
	}
	public void TrainSymbol() {
		System.out.println("Train Symbol Method");
	}
}
