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
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Builder //aded by me
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idStock;
	private String libelleStock;
	private Integer qte;
	private Integer qteMin;
	@OneToMany(mappedBy = "stock")
	@JsonIgnore
	private Set<Produit> produits;
	public Stock(String libelleStock, Integer qte, Integer qteMin) {
		super();
		this.libelleStock = libelleStock;
		this.qte = qte;
		this.qteMin = qteMin;
	}
	/**
	 * @return the idStock
	 */
	public Long getIdStock() {
		return idStock;
	}
	/**
	 * @param idStock the idStock to set
	 */
	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}
	/**
	 * @return the libelleStock
	 */
	public String getLibelleStock() {
		return libelleStock;
	}
	/**
	 * @param libelleStock the libelleStock to set
	 */
	public void setLibelleStock(String libelleStock) {
		this.libelleStock = libelleStock;
	}
	/**
	 * @return the qte
	 */
	public Integer getQte() {
		return qte;
	}
	/**
	 * @param qte the qte to set
	 */
	public void setQte(Integer qte) {
		this.qte = qte;
	}
	/**
	 * @return the qteMin
	 */
	public Integer getQteMin() {
		return qteMin;
	}
	/**
	 * @param qteMin the qteMin to set
	 */
	public void setQteMin(Integer qteMin) {
		this.qteMin = qteMin;
	}
	/**
	 * @return the produits
	 */
	public Set<Produit> getProduits() {
		return produits;
	}
	/**
	 * @param produits the produits to set
	 */
	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Stock(Long idStock, String libelleStock, Integer qte, Integer qteMin, Set<Produit> produits) {
		super();
		this.idStock = idStock;
		this.libelleStock = libelleStock;
		this.qte = qte;
		this.qteMin = qteMin;
		this.produits = produits;
	}

}
