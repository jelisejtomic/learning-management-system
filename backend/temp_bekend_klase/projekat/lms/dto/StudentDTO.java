package projekat.lms.dto;

import java.time.LocalDate;
import java.util.ArrayList;


public class StudentDTO{
	private String jmbg;
	private LocalDate datumRodjenja;
	private AdresaDTO adresa;
	private ArrayList<StudentNaGodiniDTO> studentiNaGodini = new ArrayList<>();
	private ArrayList<PohadjanjePredmetaDTO> pohadjanjaPredmeta = new ArrayList<>();
	
	public StudentDTO() {
		super();
	}
	
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public LocalDate getDatumRodjenja() {
		return datumRodjenja;
	}
	public void setDatumRodjenja(LocalDate datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	public AdresaDTO getAdresa() {
		return adresa;
	}
	public void setAdresa(AdresaDTO adresa) {
		this.adresa = adresa;
	}
	public ArrayList<StudentNaGodiniDTO> getStudentiNaGodini() {
		return studentiNaGodini;
	}
	public void setStudentiNaGodini(ArrayList<StudentNaGodiniDTO> studentiNaGodini) {
		this.studentiNaGodini = studentiNaGodini;
	}
	public ArrayList<PohadjanjePredmetaDTO> getPohadjanjaPredmeta() {
		return pohadjanjaPredmeta;
	}
	public void setPohadjanjaPredmeta(ArrayList<PohadjanjePredmetaDTO> pohadjanjaPredmeta) {
		this.pohadjanjaPredmeta = pohadjanjaPredmeta;
	}
	
}
