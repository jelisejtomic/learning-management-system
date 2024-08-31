package projekat.lms.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import projekat.lms.generics.BaseEntity;

@Entity
public class Fajl extends BaseEntity{
	@Column(nullable = false, columnDefinition = "TEXT")
	private String opis;
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String url;
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String tip;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDateTime vremeKreiranja;

	
	public Fajl() {
		super();
	}
	

	public Fajl(Long id, boolean deleted, String opis, String url, String tip, LocalDateTime vremeKreiranja) {
		super(id, deleted);
		this.opis = opis;
		this.url = url;
		this.tip = tip;
		this.vremeKreiranja = vremeKreiranja;
	}


	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public LocalDateTime getNapravljeno() {
		return vremeKreiranja;
	}

	public void setNapravljeno(LocalDateTime vremeKreiranja) {
		this.vremeKreiranja = vremeKreiranja;
	} 
	
	
}
