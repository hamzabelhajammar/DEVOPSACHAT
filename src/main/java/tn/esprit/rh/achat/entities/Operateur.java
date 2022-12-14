package tn.esprit.rh.achat.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Operateur implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOperateur;
	private String nom;
	private String prenom;
	
	private String password;
	@OneToMany
	@JsonIgnore
	private Set<Facture> factures;
	/**
	 * @return the idOperateur
	 */
	public Long getIdOperateur() {
		return idOperateur;
	}
	/**
	 * @param idOperateur the idOperateur to set
	 */
	public void setIdOperateur(Long idOperateur) {
		this.idOperateur = idOperateur;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the factures
	 */
	public Set<Facture> getFactures() {
		return factures;
	}
	/**
	 * @param factures the factures to set
	 */
	public void setFactures(Set<Facture> factures) {
		this.factures = factures;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Operateur(Long idOperateur, String nom, String prenom, String password, Set<Facture> factures) {
		super();
		this.idOperateur = idOperateur;
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.factures = factures;
	}
	
}
