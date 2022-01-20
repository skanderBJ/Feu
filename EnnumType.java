import java.util.Scanner;
public class EnnumType {

	public static void main(String[] args) {
		
		Scanner b =new Scanner(System.in) ; 
		Feu feu = Feu.ORANGE ;
		
		System.out.println("Quelle vous faire(passer , attendre ) ");
		String fe=b.nextLine() ; 
		
		if (fe.equals("passer") ) {
			if (feu != Feu.VERT) {
				System.out.println("vous ne passer pas");}
			else {
				System.out.println("Bon route");}
		}else	if (fe.equals("attendre") ){
			if (feu == Feu.VERT) {
				System.out.println("VOUS DEVEZ PASSER ");}
			else {
			System.out.println("bonne initiativite");}
		
		}
		else {
			System.out.println("Inconnue");}
	}

}
