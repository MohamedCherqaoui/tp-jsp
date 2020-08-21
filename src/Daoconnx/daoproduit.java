package Daoconnx;


	import java.sql.SQLException;
	import java.util.ArrayList;

	import com.mysql.jdbc.ResultSet;

	import Model.Categorie;
	import Model.Produit;

	public class daoproduit {
	       Connexion c=new Connexion();
		public ArrayList<Produit> ListProduit(String login) throws ClassNotFoundException, SQLException {
			Produit p=null;
			ArrayList<Produit> Produit=new ArrayList<Produit>();
			c.connect();
			
			ResultSet res =(ResultSet) c.select("select p.id,p.nom,prix,c.nom from produit p,Categorie c where p.idCategorie=c.id");
			
		while(res.next()) {
			p=new Produit(res.getInt(1),res.getString(2),res.getFloat(3),new Categorie(res.getString(4)));
			Produit.add(p);
		}
		c.Disconnect();
		return Produit;
		}
	}