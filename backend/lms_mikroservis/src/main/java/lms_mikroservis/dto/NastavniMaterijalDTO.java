package lms_mikroservis.dto;

public class NastavniMaterijalDTO {
	private Long id;
	private String naziv;
	private Integer godinaIzdavanja;
	private IshodDTO ishod;
	private String autori; // private Set<String> autori;
//	private Set<File> fajlovi;

	public NastavniMaterijalDTO() {
		super();
	}

	public NastavniMaterijalDTO(Long id, String naziv, Integer godinaIzdavanja, IshodDTO ishod, String autori) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.godinaIzdavanja = godinaIzdavanja;
		this.ishod = ishod;
		this.autori = autori;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Integer getGodinaIzdavanja() {
		return godinaIzdavanja;
	}

	public void setGodinaIzdavanja(Integer godinaIzdavanja) {
		this.godinaIzdavanja = godinaIzdavanja;
	}

	public IshodDTO getIshod() {
		return ishod;
	}

	public void setIshod(IshodDTO ishod) {
		this.ishod = ishod;
	}

	public String getAutori() {
		return autori;
	}

	public void setAutori(String autori) {
		this.autori = autori;
	}

}
