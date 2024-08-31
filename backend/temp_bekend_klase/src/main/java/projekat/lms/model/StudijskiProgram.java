package projekat.lms.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class StudijskiProgram extends BaseEntity{
	@Column(nullable = false)
	private String akronim;
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String naziv;

	@Column(nullable = false, columnDefinition = "TEXT")
	private String opis;
	
	@ManyToOne(optional = false)
	private Fakultet fakultet;
	
	@OneToMany(mappedBy = "studijskiProgram")
	private Set<GodinaStudija> godineStudija;
	
	@ManyToOne
	private Nastavnik rukovodilac;
	
	public StudijskiProgram() {
		super();
	}
	

	public StudijskiProgram(Long id, Boolean deleted, String akronim, String naziv, String opis, Fakultet fakultet,
			Set<GodinaStudija> godineStudija, Nastavnik rukovodilac) {
		super(id, deleted);
		this.akronim = akronim;
		this.naziv = naziv;
		this.opis = opis;
		this.fakultet = fakultet;
		this.godineStudija = godineStudija;
		this.rukovodilac = rukovodilac;
	}


	public Set<GodinaStudija> getGodineStudija() {
		return godineStudija;
	}

	public void setGodineStudija(Set<GodinaStudija> godineStudija) {
		this.godineStudija = godineStudija;
	}

	public Nastavnik getRukovodilac() {
		return rukovodilac;
	}

	public void setRukovodilac(Nastavnik rukovodilac) {
		this.rukovodilac = rukovodilac;
	}

	public Fakultet getFakultet() {
		return fakultet;
	}
	public void setFakultet(Fakultet fakultet) {
		this.fakultet = fakultet;
	}
	public String getAkronim() {
		return akronim;
	}
	public void setAkronim(String akronim) {
		this.akronim = akronim;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
}
