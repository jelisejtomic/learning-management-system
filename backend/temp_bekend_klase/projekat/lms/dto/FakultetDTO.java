package projekat.lms.dto;


import java.io.Serializable;
import java.util.Set;


public class FakultetDTO implements Serializable{
	private static final long serialVersionUID = -1480662552111659681L;
	private Long id;
	
	private String naziv;

	private NastavnikDTO dekan;
	private AdresaDTO adresa;
	private Set<KontaktDTO> kontakti;
	private Set<StudijskiProgramDTO> studijskiProgrami;
	private UniverzitetDTO univerzitet;
	
	public FakultetDTO() {
		super();
	}
	
	public FakultetDTO(Long id, String naziv, Set<StudijskiProgramDTO> studijskiProgrami, NastavnikDTO dekan,
			AdresaDTO adresa, Set<KontaktDTO> kontakti, UniverzitetDTO univerzitet) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.studijskiProgrami = studijskiProgrami;
		this.dekan = dekan;
		this.adresa = adresa;
		this.kontakti = kontakti;
		this.univerzitet = univerzitet;
	}

	public NastavnikDTO getDekan() {
		return dekan;
	}

	public void setDekan(NastavnikDTO dekan) {
		this.dekan = dekan;
	}

	public AdresaDTO getAdresa() {
		return adresa;
	}

	public void setAdresa(AdresaDTO adresa) {
		this.adresa = adresa;
	}

	public Set<KontaktDTO> getKontakti() {
		return kontakti;
	}

	public void setKontakti(Set<KontaktDTO> kontakti) {
		this.kontakti = kontakti;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public UniverzitetDTO getUniverzitet() {
		return univerzitet;
	}

	public void setUniverzitet(UniverzitetDTO univerzitet) {
		this.univerzitet = univerzitet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<StudijskiProgramDTO> getStudijskiProgrami() {
		return studijskiProgrami;
	}

	public void setStudijskiProgrami(Set<StudijskiProgramDTO> studijskiProgrami) {
		this.studijskiProgrami = studijskiProgrami;
	}
	
	
}
