package projekat.lms.dto;

public class TipKontaktaDTO {
	private Long id;
	private String naziv;
	
	
	
	public TipKontaktaDTO(Long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}
	public TipKontaktaDTO() {
		super();
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
	
	
}
