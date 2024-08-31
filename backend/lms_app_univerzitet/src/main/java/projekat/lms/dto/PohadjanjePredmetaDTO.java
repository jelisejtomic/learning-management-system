package projekat.lms.dto;

import java.io.Serializable;

import projekat.lms.generics.BaseDTO;

public class PohadjanjePredmetaDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 5155900689286442503L;
	
	private int konacnaOcena;
	private int bodovi;
	private int bonusBodovi;
	private StudentDTO student;
	private RealizacijaPredmetaDTO realizacijaPredmeta;
	
	public PohadjanjePredmetaDTO() {
		super();
	}
	

	public PohadjanjePredmetaDTO(Long id, Boolean deleted, int konacnaOcena, int bodovi, int bonusBodovi,
			StudentDTO student, RealizacijaPredmetaDTO realizacijaPredmeta) {
		super(id, deleted);
		this.konacnaOcena = konacnaOcena;
		this.bodovi = bodovi;
		this.bonusBodovi = bonusBodovi;
		this.student = student;
		this.realizacijaPredmeta = realizacijaPredmeta;
	}


	public StudentDTO getStudent() {
		return student;
	}

	public void setStudent(StudentDTO student) {
		this.student = student;
	}

	public RealizacijaPredmetaDTO getRealizacijaPredmeta() {
		return realizacijaPredmeta;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public void setRealizacijaPredmeta(RealizacijaPredmetaDTO realizacijaPredmeta) {
		this.realizacijaPredmeta = realizacijaPredmeta;
	}

	public int getKonacnaOcena() {
		return konacnaOcena;
	}
	public void setKonacnaOcena(int konacnaOcena) {
		this.konacnaOcena = konacnaOcena;
	}
	public int getBodovi() {
		return bodovi;
	}
	public void setBodovi(int bodovi) {
		this.bodovi = bodovi;
	}
	public int getBonusBodovi() {
		return bonusBodovi;
	}
	public void setBonusBodovi(int bonusBodovi) {
		this.bonusBodovi = bonusBodovi;
	}
}
