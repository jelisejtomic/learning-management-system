package projekat.lms.model;


import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class Nastavnik extends BaseEntity{
	@Column(columnDefinition = "VARCHAR(13)")
	private String jmbg;
	
	@Column(columnDefinition = "TEXT")
	private String biografija;
	
	@OneToMany
	private Set<Zvanje> zvanja;

	public Nastavnik() {
		super();
	}

	public Nastavnik(Long id, String jmbg, String biografija, Set<Zvanje> zvanja) {
		super(id);
		this.jmbg = jmbg;
		this.biografija = biografija;
		this.zvanja = zvanja;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getBiografija() {
		return biografija;
	}

	public void setBiografija(String biografija) {
		this.biografija = biografija;
	}

	public Set<Zvanje> getZvanja() {
		return zvanja;
	}

	public void setZvanja(Set<Zvanje> zvanja) {
		this.zvanja = zvanja;
	}
	
	

}
