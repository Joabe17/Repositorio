package Vetores;
import java.util.ArrayList;
public class Exemplo2 {

	public static void main(String[] args) {
		
		String [] names = new String [3] ;
		names [0] = "Lisa";
		names [1] = "Kevin";
		names [2] = "Roger";
		
		for (String name : names) {
			System.out.println(name + ", ");
		}
	}

}
