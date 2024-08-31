package projekat.lms.model;

import java.util.ArrayList;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class RealizacijaPredmeta extends BaseEntity{
	@Column(nullable = false, columnDefinition = "Integer")
	private Integer godinaIzvodjenja;
	
	@OneToMany
	private Set<NastavnikNaRealizaciji> nastavnici;
	
	@ManyToOne
	private Predmet predmet;

	@OneToMany(mappedBy = "realizacijaPredmeta")
	private Set<TerminNastave> terminiNastave;
	
	@OneToMany
	private ArrayList<Obavestenje> obavestenja;
	
	@OneToMany
	private ArrayList<EvaluacijaZnanja> evaluacijeZnanja;
	
	@OneToMany(mappedBy = "realizacijaPredmeta")
	private ArrayList<PrijavaIspita> prijaveIspita;
	
	public RealizacijaPredmeta() {
		super();
	}	
	
	
	public RealizacijaPredmeta(Long id, Boolean deleted, Integer godinaIzvodjenja,
			Set<NastavnikNaRealizaciji> nastavnici, Predmet predmet, Set<TerminNastave> terminiNastave,
			ArrayList<Obavestenje> obavestenja, ArrayList<EvaluacijaZnanja> evaluacijeZnanja,
			ArrayList<PrijavaIspita> prijaveIspita) {
		super(id, deleted);
		this.godinaIzvodjenja = godinaIzvodjenja;
		this.nastavnici = nastavnici;
		this.predmet = predmet;
		this.terminiNastave = terminiNastave;
		this.obavestenja = obavestenja;
		this.evaluacijeZnanja = evaluacijeZnanja;
		this.prijaveIspita = prijaveIspita;
	}


	public ArrayList<PrijavaIspita> getPrijaveIspita() {
		return prijaveIspita;
	}


	public void setPrijaveIspita(ArrayList<PrijavaIspita> prijaveIspita) {
		this.prijaveIspita = prijaveIspita;
	}


	public ArrayList<EvaluacijaZnanja> getEvaluacijeZnanja() {
		return evaluacijeZnanja;
	}

	public void setEvaluacijeZnanja(ArrayList<EvaluacijaZnanja> evaluacijeZnanja) {
		this.evaluacijeZnanja = evaluacijeZnanja;
	}

	public Set<NastavnikNaRealizaciji> getNastavnici() {
		return nastavnici;
	}

	public void setNastavnici(Set<NastavnikNaRealizaciji> nastavnici) {
		this.nastavnici = nastavnici;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public Set<TerminNastave> getTerminiNastave() {
		return terminiNastave;
	}

	public void setTerminiNastave(Set<TerminNastave> terminiNastave) {
		this.terminiNastave = terminiNastave;
	}

	public ArrayList<Obavestenje> getObavestenja() {
		return obavestenja;
	}

	public void setObavestenja(ArrayList<Obavestenje> obavestenja) {
		this.obavestenja = obavestenja;
	}

	public Integer getGodinaIzvodjenja() {
		return godinaIzvodjenja;
	}

	public void setGodinaIzvodjenja(Integer godinaIzvodjenja) {
		this.godinaIzvodjenja = godinaIzvodjenja;
	}
	
	
	
}
