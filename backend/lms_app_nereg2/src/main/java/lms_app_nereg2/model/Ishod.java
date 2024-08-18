package lms_app_nereg2.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lms_app_nereg2.generics.BaseEntity;

@Entity
public class Ishod extends BaseEntity { // Moguce ga je kreirati samo pri kreaciji predmeta.

	@Column(nullable = false, columnDefinition = "TEXT")
	private String opis;

	@ManyToOne(optional = false)
	private Predmet predmet;

	@OneToMany(mappedBy = "ishod")
	private Set<NastavniMaterijal> nastavniMaterijal = new HashSet<>();

//	@OneToOne
//	private TerminNastave termin;

	public Ishod() {
		super();
	}

	public Ishod(Long id, String opis, Predmet predmet, Set<NastavniMaterijal> nastavniMaterijal) {
		super();
		this.id = id;
		this.opis = opis;
		this.predmet = predmet;
		this.nastavniMaterijal = nastavniMaterijal;
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

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public Set<NastavniMaterijal> getNastavniMaterijal() {
		return nastavniMaterijal;
	}

	public void setNastavniMaterijal(Set<NastavniMaterijal> nastavniMaterijal) {
		this.nastavniMaterijal = nastavniMaterijal;
	}

}
