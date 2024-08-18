package lms_app_nereg1.dto;

import java.util.ArrayList;

public class StudijskiProgramDTO{
	private Long id;
	
	private String akronim;
	private String naziv;
	private String opis;
	
	private FakultetDTO fakultet;
	
	private ArrayList<String> predmeti;
	private String rektor;
	
//	ovde bi trebalo da imamo dtoove za entitete
//	private ArrayList<String> predmeti;
//	private String rektor;
	
	public StudijskiProgramDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public FakultetDTO getFakultet() {
		return fakultet;
	}

	public void setFakultet(FakultetDTO fakultet) {
		this.fakultet = fakultet;
	}

	public ArrayList<String> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(ArrayList<String> predmeti) {
		this.predmeti = predmeti;
	}

	public String getRektor() {
		return rektor;
	}

	public void setRektor(String rektor) {
		this.rektor = rektor;
	}

	public StudijskiProgramDTO(Long id, String akronim, String naziv, String opis, FakultetDTO fakultet,
			ArrayList<String> predmeti, String rektor) {
		super();
		this.id = id;
		this.akronim = akronim;
		this.naziv = naziv;
		this.opis = opis;
		this.fakultet = fakultet;
		this.predmeti = predmeti;
		this.rektor = rektor;
	}

	public StudijskiProgramDTO(Long id, String akronim, String naziv, String opis, FakultetDTO fakultet,
			String rektor) {
		super();
		this.id = id;
		this.akronim = akronim;
		this.naziv = naziv;
		this.opis = opis;
		this.fakultet = fakultet;
		this.rektor = rektor;
	}

	public StudijskiProgramDTO(String akronim, String naziv, String opis, ArrayList<String> predmeti, String rektor) {
		super();
		this.akronim = akronim;
		this.naziv = naziv;
		this.opis = opis;
		this.predmeti = predmeti;
		this.rektor = rektor;
	}

	public StudijskiProgramDTO(String akronim, String naziv, String opis, FakultetDTO fakultet,
			ArrayList<String> predmeti, String rektor) {
		super();
		this.akronim = akronim;
		this.naziv = naziv;
		this.opis = opis;
		this.fakultet = fakultet;
		this.predmeti = predmeti;
		this.rektor = rektor;
	}
	
	
	
}
