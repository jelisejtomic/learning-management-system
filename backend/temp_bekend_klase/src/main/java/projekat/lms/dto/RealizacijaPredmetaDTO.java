package projekat.lms.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import projekat.lms.generics.BaseDTO;


public class RealizacijaPredmetaDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 5808492620063686504L;

	private int godinaIzvodjenja;
	
	private Set<NastavnikNaRealizacijiDTO> nastavnici;
	private PredmetDTO predmet;
	private Set<TerminNastaveDTO> terminiNastave;
	private ArrayList<ObavestenjeDTO> obavestenja;
	private ArrayList<EvaluacijaZnanjaDTO> evaluacijeZnanja;
	private ArrayList<PrijavaIspitaDTO> prijaveIspita;
	
	public RealizacijaPredmetaDTO() {
		super();
	}
	
	public RealizacijaPredmetaDTO(Long id, Boolean deleted, int godinaIzvodjenja,
			Set<NastavnikNaRealizacijiDTO> nastavnici, PredmetDTO predmet, Set<TerminNastaveDTO> terminiNastave,
			ArrayList<ObavestenjeDTO> obavestenja, ArrayList<EvaluacijaZnanjaDTO> evaluacijeZnanja,
			ArrayList<PrijavaIspitaDTO> prijaveIspita) {
		super(id, deleted);
		this.godinaIzvodjenja = godinaIzvodjenja;
		this.nastavnici = nastavnici;
		this.predmet = predmet;
		this.terminiNastave = terminiNastave;
		this.obavestenja = obavestenja;
		this.evaluacijeZnanja = evaluacijeZnanja;
		this.prijaveIspita = prijaveIspita;
	}

	public ArrayList<PrijavaIspitaDTO> getPrijaveIspita() {
		return prijaveIspita;
	}

	public void setPrijaveIspita(ArrayList<PrijavaIspitaDTO> prijaveIspita) {
		this.prijaveIspita = prijaveIspita;
	}

	public PredmetDTO getPredmet() {
		return predmet;
	}

	public void setPredmet(PredmetDTO predmet) {
		this.predmet = predmet;
	}

	public Set<TerminNastaveDTO> getTerminiNastave() {
		return terminiNastave;
	}

	public void setTerminiNastave(Set<TerminNastaveDTO> terminiNastave) {
		this.terminiNastave = terminiNastave;
	}

	public ArrayList<ObavestenjeDTO> getObavestenja() {
		return obavestenja;
	}

	public void setObavestenja(ArrayList<ObavestenjeDTO> obavestenja) {
		this.obavestenja = obavestenja;
	}

	public ArrayList<EvaluacijaZnanjaDTO> getEvaluacijeZnanja() {
		return evaluacijeZnanja;
	}

	public void setEvaluacijeZnanja(ArrayList<EvaluacijaZnanjaDTO> evaluacijeZnanja) {
		this.evaluacijeZnanja = evaluacijeZnanja;
	}
	public int getGodinaIzvodjenja() {
		return godinaIzvodjenja;
	}
	public void setGodinaIzvodjenja(int godinaIzvodjenja) {
		this.godinaIzvodjenja = godinaIzvodjenja;
	}
	public Set<NastavnikNaRealizacijiDTO> getNastavnici() {
		return nastavnici;
	}
	public void setNastavnici(Set<NastavnikNaRealizacijiDTO> nastavnici) {
		this.nastavnici = nastavnici;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
