package Exerciece2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Utilisateur {
	
	 static ArrayList<Connectable> addConnect =new ArrayList<Connectable>();
	
	public static void main(String []args) {

	int number=7;
	
	while(number!=0) {
		
		System.out.println("saisie un numero ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
	
		if(number==2) {
			Connectable cafetiere=new Cafetiere();
			addConnect.add(cafetiere);
			System.out.println("vous avez creer cafetiere");
			 
		}else if(number==1) {
			Connectable radio=new Radio();
			addConnect.add(radio);
			System.out.println("vous avez creer une radio");
		}
		
		
		
		
		
	}
	for(int i=0;i<addConnect.size();i++) {
		System.out.println(addConnect.get(i).getClass().getName());
	}
	}

}
