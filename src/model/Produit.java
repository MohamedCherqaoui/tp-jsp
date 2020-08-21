package model;


public class Produit {
    private int id ;
    private String nom ;
    private float prix;
    private Categorie cat;
    
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(int id, String nom, float prix, Categorie cat) {
		
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.cat = cat;
	}
	public Produit( String nom, float prix, Categorie cat) {
		
		this.nom = nom;
		this.prix = prix;
		this.cat = cat;
	}
public Produit(Produit p) {
		
		this.nom = p.nom;
		this.prix = p.prix;
		this.cat = p.cat;
	}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}
public Categorie getCat() {
	return cat;
}
public void setCat(Categorie cat) {
	this.cat = cat;
}
public int getId() {
	return id;
}
	
    
    
    
    
    
    
}

