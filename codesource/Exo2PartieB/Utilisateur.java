package Exo2PartieB;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Utilisateur {
	
	 static ArrayList<Connectable> addConnect =new ArrayList<Connectable>();
	
	public static void main(String []args)  {

	String classe="exit";
	
	while(classe!=null) {
		
		System.out.println("saisie le nom de la classe ");
		Scanner sc = new Scanner(System.in);
		classe = sc.nextLine();
	FbriqueConnectable con=new FbriqueConnectable();
	Connectable connect;
	try {
	
		connect = con.creer(classe);
		
		
		addConnect.add(connect);
	} catch (InstantiationException | IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
		
	}
	for(int i=0;i<addConnect.size();i++) {
		System.out.println(addConnect.get(i).getClass().getName());
	}
	}

}
