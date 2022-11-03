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
public class Produit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;
	private String codeProduit;
	private String libelleProduit;
	private float prix;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	@Temporal(TemporalType.DATE)
	private Date dateDerniereModification;
	@ManyToOne
	@JsonIgnore
	private Stock stock;
	@OneToMany(mappedBy = "produit")
	@JsonIgnore
	private Set<DetailFacture> detailFacture;
	@ManyToOne
	@JsonIgnore
	private CategorieProduit categorieProduit;
	/**
	 * @return the idProduit
	 */
	public Long getIdProduit() {
		return idProduit;
	}
	/**
	 * @param idProduit the idProduit to set
	 */
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	/**
	 * @return the codeProduit
	 */
	public String getCodeProduit() {
		return codeProduit;
	}
	/**
	 * @param codeProduit the codeProduit to set
	 */
	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}
	/**
	 * @return the libelleProduit
	 */
	public String getLibelleProduit() {
		return libelleProduit;
	}
	/**
	 * @param libelleProduit the libelleProduit to set
	 */
	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}
	/**
	 * @return the prix
	 */
	public float getPrix() {
		return prix;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}
	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}
	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	/**
	 * @return the dateDerniereModification
	 */
	public Date getDateDerniereModification() {
		return dateDerniereModification;
	}
	/**
	 * @param dateDerniereModification the dateDerniereModification to set
	 */
	public void setDateDerniereModification(Date dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}
	/**
	 * @return the stock
	 */
	public Stock getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	/**
	 * @return the detailFacture
	 */
	public Set<DetailFacture> getDetailFacture() {
		return detailFacture;
	}
	/**
	 * @param detailFacture the detailFacture to set
	 */
	public void setDetailFacture(Set<DetailFacture> detailFacture) {
		this.detailFacture = detailFacture;
	}
	/**
	 * @return the categorieProduit
	 */
	public CategorieProduit getCategorieProduit() {
		return categorieProduit;
	}
	/**
	 * @param categorieProduit the categorieProduit to set
	 */
	public void setCategorieProduit(CategorieProduit categorieProduit) {
		this.categorieProduit = categorieProduit;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Produit(Long idProduit, String codeProduit, String libelleProduit, float prix, Date dateCreation,
			Date dateDerniereModification, Stock stock, Set<DetailFacture> detailFacture,
			CategorieProduit categorieProduit) {
		super();
		this.idProduit = idProduit;
		this.codeProduit = codeProduit;
		this.libelleProduit = libelleProduit;
		this.prix = prix;
		this.dateCreation = dateCreation;
		this.dateDerniereModification = dateDerniereModification;
		this.stock = stock;
		this.detailFacture = detailFacture;
		this.categorieProduit = categorieProduit;
	}
	


	

}
