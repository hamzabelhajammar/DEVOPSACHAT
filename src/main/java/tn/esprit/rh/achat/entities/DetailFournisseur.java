package tn.esprit.rh.achat.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
public class DetailFournisseur implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetailFournisseur;
	private String email;
	@Temporal(TemporalType.DATE)
	private Date dateDebutCollaboration;
	private String adresse;
	private String matricule;
	@OneToOne(mappedBy="detailFournisseur")
	@JsonIgnore
	private Fournisseur fournisseur;
	/**
	 * @return the idDetailFournisseur
	 */
	public Long getIdDetailFournisseur() {
		return idDetailFournisseur;
	}
	/**
	 * @param idDetailFournisseur the idDetailFournisseur to set
	 */
	public void setIdDetailFournisseur(Long idDetailFournisseur) {
		this.idDetailFournisseur = idDetailFournisseur;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the dateDebutCollaboration
	 */
	public Date getDateDebutCollaboration() {
		return dateDebutCollaboration;
	}
	/**
	 * @param dateDebutCollaboration the dateDebutCollaboration to set
	 */
	public void setDateDebutCollaboration(Date dateDebutCollaboration) {
		this.dateDebutCollaboration = dateDebutCollaboration;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}
	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	/**
	 * @return the fournisseur
	 */
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	/**
	 * @param fournisseur the fournisseur to set
	 */
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public DetailFournisseur() {
		super();
		this.idDetailFournisseur = idDetailFournisseur;
		this.email = email;
		this.dateDebutCollaboration = dateDebutCollaboration;
		this.adresse = adresse;
		this.matricule = matricule;
		this.fournisseur = fournisseur;
	}
	
	
	
}
