package tn.esprit.rh.achat.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
public class Facture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFacture;
	private float montantRemise;
	private float montantFacture;
	@Temporal(TemporalType.DATE)
	private Date dateCreationFacture;
	@Temporal(TemporalType.DATE)
	private Date dateDerniereModificationFacture;
	private Boolean archivee;
	@OneToMany(mappedBy = "facture")
	private Set<DetailFacture> detailsFacture;
    @ManyToOne
    @JsonIgnore
    private Fournisseur fournisseur;
    @OneToMany(mappedBy="facture")
    @JsonIgnore
    private Set<Reglement> reglements;
	/**
	 * @return the idFacture
	 */
	public Long getIdFacture() {
		return idFacture;
	}
	/**
	 * @param idFacture the idFacture to set
	 */
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	/**
	 * @return the montantRemise
	 */
	public float getMontantRemise() {
		return montantRemise;
	}
	/**
	 * @param montantRemise the montantRemise to set
	 */
	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}
	/**
	 * @return the montantFacture
	 */
	public float getMontantFacture() {
		return montantFacture;
	}
	/**
	 * @param montantFacture the montantFacture to set
	 */
	public void setMontantFacture(float montantFacture) {
		this.montantFacture = montantFacture;
	}
	/**
	 * @return the dateCreationFacture
	 */
	public Date getDateCreationFacture() {
		return dateCreationFacture;
	}
	/**
	 * @param dateCreationFacture the dateCreationFacture to set
	 */
	public void setDateCreationFacture(Date dateCreationFacture) {
		this.dateCreationFacture = dateCreationFacture;
	}
	/**
	 * @return the dateDerniereModificationFacture
	 */
	public Date getDateDerniereModificationFacture() {
		return dateDerniereModificationFacture;
	}
	/**
	 * @param dateDerniereModificationFacture the dateDerniereModificationFacture to set
	 */
	public void setDateDerniereModificationFacture(Date dateDerniereModificationFacture) {
		this.dateDerniereModificationFacture = dateDerniereModificationFacture;
	}
	/**
	 * @return the archivee
	 */
	public Boolean getArchivee() {
		return archivee;
	}
	/**
	 * @param archivee the archivee to set
	 */
	public void setArchivee(Boolean archivee) {
		this.archivee = archivee;
	}
	/**
	 * @return the detailsFacture
	 */
	public Set<DetailFacture> getDetailsFacture() {
		return detailsFacture;
	}
	/**
	 * @param detailsFacture the detailsFacture to set
	 */
	public void setDetailsFacture(Set<DetailFacture> detailsFacture) {
		this.detailsFacture = detailsFacture;
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
	 * @return the reglements
	 */
	public Set<Reglement> getReglements() {
		return reglements;
	}
	/**
	 * @param reglements the reglements to set
	 */
	public void setReglements(Set<Reglement> reglements) {
		this.reglements = reglements;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", montantRemise=" + montantRemise + ", montantFacture="
				+ montantFacture + ", dateCreationFacture=" + dateCreationFacture + ", dateDerniereModificationFacture="
				+ dateDerniereModificationFacture + ", archivee=" + archivee + ", detailsFacture=" + detailsFacture
				+ ", fournisseur=" + fournisseur + ", reglements=" + reglements + "]";
	}
	public Facture(Long idFacture, float montantRemise, float montantFacture, Date dateCreationFacture,
			Date dateDerniereModificationFacture, Boolean archivee, Set<DetailFacture> detailsFacture,
			Fournisseur fournisseur, Set<Reglement> reglements) {
		super();
		this.idFacture = idFacture;
		this.montantRemise = montantRemise;
		this.montantFacture = montantFacture;
		this.dateCreationFacture = dateCreationFacture;
		this.dateDerniereModificationFacture = dateDerniereModificationFacture;
		this.archivee = archivee;
		this.detailsFacture = detailsFacture;
		this.fournisseur = fournisseur;
		this.reglements = reglements;
	}

	
}
