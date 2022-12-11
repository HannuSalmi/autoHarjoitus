
public class AutoHarjoitus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto auto1 = new Auto();
		
		auto1.merkki = "volvo";
		auto1.malli = "c30";
		auto1.bensanMaara = 5;
		auto1.tankkausMaara = 3;
		
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.naytaTiedot();
		
		auto1.tankkaa();
		
	}
	
	
}
