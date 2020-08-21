package Daoconnx;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Personne;


public class daopersonne {
	Connexion c=new Connexion();
	public int supprimerPersonne(int id) throws SQLException, ClassNotFoundException{
		c.connect();
		int res=c.Maj("delete * from persson where id="+id);
		c.Disconnect();
		return res;
	}
	public   int ajouterPersonne(Personne p) throws SQLException, ClassNotFoundException {
		c.connect();
		int res=c.Maj("insert into Persson(nom,prenom,login,password) values('"+p.getNom()+"','"+p.getPrenom()+"','"+p.getAge()+"','"+p.getLogin()+"','"+p.getPassword()+"')");
		c.Disconnect();
		return res;
	}
	public int ModiferPersonne(Personne p) throws SQLException, ClassNotFoundException {
		c.connect();
		int res =c.Maj("Update Persson set nom='"+p.getNom()+"',prenom='"+p.getPrenom()+"',age='"+p.getAge()+"',login='"+p.getLogin()+"',password'"+p.getPassword()+"' where id='"+p.getId()+"'");
		c.Disconnect();
		return res;
	}
	public ArrayList<Personne> listPersonne() throws ClassNotFoundException, SQLException{
		Personne P=null;
		ArrayList<Personne> Personne=new ArrayList<Personne>();
		c.connect();
		ResultSet res=c.select("select * from persson");
		while(res.next()) {
			P=new Personne(res.getInt(1),res.getString(2),res.getString(3),res.getInt(4),res.getString(5),res.getString(6));
			Personne.add(P);
		}
		c.Disconnect();
		return Personne;
	}
	
}

