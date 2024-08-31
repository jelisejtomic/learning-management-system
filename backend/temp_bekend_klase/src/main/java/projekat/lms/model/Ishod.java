package projekat.lms.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class Ishod extends BaseEntity { // Moguce ga je kreirati samo pri kreaciji predmeta.
	@Column(nullable = false, columnDefinition = "TEXT")
	private String opis;
	
	@OneToMany(cascade = CascadeType.REMOVE)
	private Set<ObrazovniCilj> obrazovniCiljevi;
	
	@OneToMany
	private Set<NastavniMaterijal> nastavniMaterijali;
	
	public Ishod(Long id, Boolean deleted, String opis, Set<ObrazovniCilj> obrazovniCiljevi,
			Set<NastavniMaterijal> nastavniMaterijali) {
		super(id, deleted);
		this.opis = opis;
		this.obrazovniCiljevi = obrazovniCiljevi;
		this.nastavniMaterijali = nastavniMaterijali;
	}

	public Ishod() {
		super();
	}
	
	public Set<NastavniMaterijal> getNastavniMaterijali() {
		return nastavniMaterijali;
	}

	public void setNastavniMaterijali(Set<NastavniMaterijal> nastavniMaterijali) {
		this.nastavniMaterijali = nastavniMaterijali;
	}

	public Set<ObrazovniCilj> getObrazovniCiljevi() {
		return obrazovniCiljevi;
	}

	public void setObrazovniCiljevi(Set<ObrazovniCilj> obrazovniCiljevi) {
		this.obrazovniCiljevi = obrazovniCiljevi;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}
}
