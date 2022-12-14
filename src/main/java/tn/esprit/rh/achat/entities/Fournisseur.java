package tn.esprit.rh.achat.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
public class Fournisseur implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFournisseur;
	private String code;
	private String libelle;
	@Enumerated(EnumType.STRING)
	private CategorieFournisseur  categorieFournisseur;
	@OneToMany(mappedBy="fournisseur")
	@JsonIgnore
	private Set<Facture> factures;
    @ManyToMany
    @JsonIgnore
    private Set<SecteurActivite> secteurActivites;
    @OneToOne(cascade= CascadeType.ALL,fetch=FetchType.EAGER)
    private DetailFournisseur detailFournisseur;
	/**
	 * @return the idFournisseur
	 */
	public Long getIdFournisseur() {
		return idFournisseur;
	}
	/**
	 * @param idFournisseur the idFournisseur to set
	 */
	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @return the categorieFournisseur
	 */
	public CategorieFournisseur getCategorieFournisseur() {
		return categorieFournisseur;
	}
	/**
	 * @param categorieFournisseur the categorieFournisseur to set
	 */
	public void setCategorieFournisseur(CategorieFournisseur categorieFournisseur) {
		this.categorieFournisseur = categorieFournisseur;
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
	 * @return the secteurActivites
	 */
	public Set<SecteurActivite> getSecteurActivites() {
		return secteurActivites;
	}
	/**
	 * @param secteurActivites the secteurActivites to set
	 */
	public void setSecteurActivites(Set<SecteurActivite> secteurActivites) {
		this.secteurActivites = secteurActivites;
	}
	/**
	 * @return the detailFournisseur
	 */
	public DetailFournisseur getDetailFournisseur() {
		return detailFournisseur;
	}
	/**
	 * @param detailFournisseur the detailFournisseur to set
	 */
	public void setDetailFournisseur(DetailFournisseur detailFournisseur) {
		this.detailFournisseur = detailFournisseur;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Fournisseur(Long idFournisseur, String code, String libelle, CategorieFournisseur categorieFournisseur,
			Set<Facture> factures, Set<SecteurActivite> secteurActivites, DetailFournisseur detailFournisseur) {
		super();
		this.idFournisseur = idFournisseur;
		this.code = code;
		this.libelle = libelle;
		this.categorieFournisseur = categorieFournisseur;
		this.factures = factures;
		this.secteurActivites = secteurActivites;
		this.detailFournisseur = detailFournisseur;
	}
    

	
}
