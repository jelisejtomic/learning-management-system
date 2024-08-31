package projekat.lms.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

	public Ishod() {
		super();
	}

	public Ishod(Long id, Boolean deleted, String opis, Set<ObrazovniCilj> obrazovniCiljevi,
			Set<NastavniMaterijal> nastavniMaterijali) {
		super(id, deleted);
		this.opis = opis;
		this.obrazovniCiljevi = obrazovniCiljevi;
		this.nastavniMaterijali = nastavniMaterijali;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Set<ObrazovniCilj> getObrazovniCiljevi() {
		return obrazovniCiljevi;
	}

	public void setObrazovniCiljevi(Set<ObrazovniCilj> obrazovniCiljevi) {
		this.obrazovniCiljevi = obrazovniCiljevi;
	}

	public Set<NastavniMaterijal> getNastavniMaterijal() {
		return nastavniMaterijali;
	}

	public void setNastavniMaterijal(Set<NastavniMaterijal> nastavniMaterijali) {
		this.nastavniMaterijali = nastavniMaterijali;
	}

}
