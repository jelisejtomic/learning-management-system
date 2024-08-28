package projekat.lms.dto;

import java.io.Serializable;
import java.util.Set;

public class StudijskiProgramDTO implements Serializable{
	private static final long serialVersionUID = -8750628979351199203L;
	private Long id;
	
	private String akronim;
	private String naziv;
	private String opis;
	
	private FakultetDTO fakultet;
	private Set<GodinaStudijaDTO> godineStudija;
	private NastavnikDTO rukovodilac;
	
	public StudijskiProgramDTO() {
		super();
	}
	

	public StudijskiProgramDTO(Long id, String akronim, String naziv, String opis, FakultetDTO fakultet,
			Set<GodinaStudijaDTO> godineStudija, NastavnikDTO rukovodilac) {
		super();
		this.id = id;
		this.akronim = akronim;
		this.naziv = naziv;
		this.opis = opis;
		this.fakultet = fakultet;
		this.godineStudija = godineStudija;
		this.rukovodilac = rukovodilac;
	}


	public Set<GodinaStudijaDTO> getGodineStudija() {
		return godineStudija;
	}

	public void setGodineStudija(Set<GodinaStudijaDTO> godineStudija) {
		this.godineStudija = godineStudija;
	}

	public NastavnikDTO getRukovodilac() {
		return rukovodilac;
	}

	public void setRukovodilac(NastavnikDTO rukovodilac) {
		this.rukovodilac = rukovodilac;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
}
