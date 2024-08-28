package projekat.lms.dto;

import java.time.LocalDateTime;

public class UlogaDTO{
	private String naziv;
	private LocalDateTime datumDodeljivanja;
	
	public UlogaDTO() {
		super();
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public LocalDateTime getDatumDodeljivanja() {
		return datumDodeljivanja;
	}
	public void setDatumDodeljivanja(LocalDateTime datumDodeljivanja) {
		this.datumDodeljivanja = datumDodeljivanja;
	}
	
}
