package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

import projekat.lms.generics.BaseDTO;


public class StudentDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 6564050817281102873L;
	private String jmbg;
	private LocalDate datumRodjenja;
	
	private AdresaDTO adresa;
	private ArrayList<StudentNaGodiniDTO> studentNaGodinama = new ArrayList<>();
	private ArrayList<PohadjanjePredmetaDTO> pohadjanjaPredmeta = new ArrayList<>();
	
	public StudentDTO() {
		super();
	}
	
	public StudentDTO(Long id, Boolean deleted, String jmbg, LocalDate datumRodjenja, AdresaDTO adresa,
			ArrayList<StudentNaGodiniDTO> studentNaGodinama, ArrayList<PohadjanjePredmetaDTO> pohadjanjaPredmeta) {
		super(id, deleted);
		this.jmbg = jmbg;
		this.datumRodjenja = datumRodjenja;
		this.adresa = adresa;
		this.studentNaGodinama = studentNaGodinama;
		this.pohadjanjaPredmeta = pohadjanjaPredmeta;
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
	
	public ArrayList<StudentNaGodiniDTO> getStudentNaGodinama() {
		return studentNaGodinama;
	}

	public void setStudentNaGodinama(ArrayList<StudentNaGodiniDTO> studentNaGodinama) {
		this.studentNaGodinama = studentNaGodinama;
	}

	public ArrayList<PohadjanjePredmetaDTO> getPohadjanjaPredmeta() {
		return pohadjanjaPredmeta;
	}
	public void setPohadjanjaPredmeta(ArrayList<PohadjanjePredmetaDTO> pohadjanjaPredmeta) {
		this.pohadjanjaPredmeta = pohadjanjaPredmeta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
