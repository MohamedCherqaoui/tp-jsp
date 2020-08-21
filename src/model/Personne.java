package model;


public class Personne {
	private int id ;
	private String nom;
	private String prenom;
	private int age;
	private String login;
	private String password;
	
	
	
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(int id, String nom, String prenom, int age, String login, String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.login = login;
		this.password = password;
	}
	public Personne( String nom, String prenom, int age, String login, String password) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.login = login;
		this.password = password;
	}
	public Personne(Personne p) {
		this.id =p. id;
		this.nom = p.nom;
		this.prenom = p.prenom;
		this.age = p.age;
		this.login = p.login;
		this.password =p. password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", login=" + login
				+ ", password=" + password + "]";
	}


	

	
}

