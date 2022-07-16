package tp6;

public class Sports {

	// Attributs

	private String nom;
	private Genre genre;
	private Boolean isActif;
	private String description;

	// Constructeurs
	public Sports() {
	}

	public Sports(String nom, Genre genre, Boolean isActif, String description) {
		
		this.nom = nom;
		this.genre = genre;
		this.isActif = isActif;
		this.description = description;
	}
	// Getters et setters

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Boolean getIsActif() {
		return isActif;
	}

	public void setIsActif(Boolean isActif) {
		this.isActif = isActif;
	}
	// méthodes

	public void afficher() {
		System.out.println(this.nom + " (" + this.description + ")");
	}

}
