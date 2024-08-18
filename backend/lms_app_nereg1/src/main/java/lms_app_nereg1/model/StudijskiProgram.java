package lms_app_nereg1.model;
import java.util.ArrayList;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity
public class StudijskiProgram{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String akronim;
	private String naziv;
	
	@Lob
	private String opis;
	
	@ManyToOne(optional = false)
	private Fakultet fakultet;
	
	private ArrayList<String> predmeti;
	private String rektor;
	
//	private ArrayList<GodinaStudija> godineStudija;
//	private NastavnikMock rektor;
	
	public StudijskiProgram() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudijskiProgram(Long id, String akronim, String naziv, String opis, Fakultet fakultet,
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

	public Fakultet getFakultet() {
		return fakultet;
	}

	public void setFakultet(Fakultet fakultet) {
		this.fakultet = fakultet;
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
	
	
	
	
	
	
}
