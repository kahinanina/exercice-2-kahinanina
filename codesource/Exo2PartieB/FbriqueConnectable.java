package Exo2PartieB;

public class FbriqueConnectable {
	
	Class classeEffective;
	
	public Connectable creer(String nomClasse) throws InstantiationException, IllegalAccessException {
		
		Connectable c=null;
		try {
			
			 classeEffective =Class.forName("Exo2PartieB."+nomClasse);
           c=(Connectable) classeEffective.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
	}

}
