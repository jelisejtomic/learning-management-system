package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import projekat.lms.generics.BaseDTO;


public class StudentDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 6564050817281102873L;
	private String jmbg;
	private LocalDate datumRodjenja;
	
	private AdresaDTO adresa;
	private List<StudentNaGodiniDTO> studentNaGodinama = new ArrayList<>();
	private List<PohadjanjePredmetaDTO> pohadjanjaPredmeta = new ArrayList<PohadjanjePredmetaDTO>();
	
	public StudentDTO() {
		super();
	}
	
	public StudentDTO(Long id, Boolean deleted, String jmbg, LocalDate datumRodjenja, AdresaDTO adresa,
			List<StudentNaGodiniDTO> studentNaGodinama, List<PohadjanjePredmetaDTO> pohadjanjaPredmeta) {
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

	public List<StudentNaGodiniDTO> getStudentNaGodinama() {
		return studentNaGodinama;
	}

	public void setStudentNaGodinama(List<StudentNaGodiniDTO> studentNaGodinama) {
		this.studentNaGodinama = studentNaGodinama;
	}

	public List<PohadjanjePredmetaDTO> getPohadjanjaPredmeta() {
		return pohadjanjaPredmeta;
	}

	public void setPohadjanjaPredmeta(List<PohadjanjePredmetaDTO> pohadjanjaPredmeta) {
		this.pohadjanjaPredmeta = pohadjanjaPredmeta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
