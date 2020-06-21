package Enum1;

public class Enummm {
	enum Flavour {
		CHOCOLATE, VANULLAM, STRAWBERRY;
	}
	public static void main(String[] args) {
		Flavour flav = Flavour.VANULLAM;
		if(flav==flav.VANULLAM) {
			System.out.println("it's vanilla");
		}else if(flav==flav.CHOCOLATE) {
			System.out.println("it's chcolate");
		}else if(flav==flav.STRAWBERRY) {
			System.out.println("it's strawberry");
		}
	}
	

}
