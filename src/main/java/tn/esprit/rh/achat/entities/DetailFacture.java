package tn.esprit.rh.achat.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
public class DetailFacture implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetailFacture;
	private Integer qteCommandee;
	private float prixTotalDetail;
	private Integer pourcentageRemise;
	private float montantRemise;
	@ManyToOne
	private Produit produit;
	@ManyToOne
	@JsonIgnore
	Facture facture;
	/**
	 * @return the idDetailFacture
	 */
	public Long getIdDetailFacture() {
		return idDetailFacture;
	}
	/**
	 * @param idDetailFacture the idDetailFacture to set
	 */
	public void setIdDetailFacture(Long idDetailFacture) {
		this.idDetailFacture = idDetailFacture;
	}
	/**
	 * @return the qteCommandee
	 */
	public Integer getQteCommandee() {
		return qteCommandee;
	}
	/**
	 * @param qteCommandee the qteCommandee to set
	 */
	public void setQteCommandee(Integer qteCommandee) {
		this.qteCommandee = qteCommandee;
	}
	/**
	 * @return the prixTotalDetail
	 */
	public float getPrixTotalDetail() {
		return prixTotalDetail;
	}
	/**
	 * @param prixTotalDetail the prixTotalDetail to set
	 */
	public void setPrixTotalDetail(float prixTotalDetail) {
		this.prixTotalDetail = prixTotalDetail;
	}
	/**
	 * @return the pourcentageRemise
	 */
	public Integer getPourcentageRemise() {
		return pourcentageRemise;
	}
	/**
	 * @param pourcentageRemise the pourcentageRemise to set
	 */
	public void setPourcentageRemise(Integer pourcentageRemise) {
		this.pourcentageRemise = pourcentageRemise;
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
	 * @return the produit
	 */
	public Produit getProduit() {
		return produit;
	}
	/**
	 * @param produit the produit to set
	 */
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	/**
	 * @return the facture
	 */
	public Facture getFacture() {
		return facture;
	}
	/**
	 * @param facture the facture to set
	 */
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
