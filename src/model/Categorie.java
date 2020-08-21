package model;


public class Categorie {
         private int id;
         private String nom;
		public Categorie() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Categorie(int id, String nom) {
		
			this.id = id;
			this.nom = nom;
		}
		public Categorie( String nom) {
			
			this.nom = nom;
		}
		public Categorie(Categorie cat) {
			super();
			this.id = cat.id;
			this.nom =cat. nom;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getId() {
			return id;
		}
		
         
         
}

