package tp6;

public class main {

	public static void main(String[] args) {
		
		//les instances
		
		Sports foot=new Sports("Football",Genre.individuel,true,"bla bla bla");
		Sports handball=new Sports("handball",Genre.equipe,false,"bla bla bla");
		Sports cricket =new Sports("cricket",Genre.equipe,true,"bla bla bla");
		
		foot.afficher();
		handball.afficher();
		cricket.afficher();
		
		
	}

}
