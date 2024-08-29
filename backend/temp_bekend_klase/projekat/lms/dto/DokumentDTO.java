package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


public class DokumentDTO extends BaseDTO implements Serializable{
	private static final long serialVersionUID = -3063725557737610339L;
	private Long id;
	
	private String naziv;
	private String opis;
	private LocalDateTime datumIzdavanja = LocalDateTime.now(); 
	
	private Set<FajlDTO> fajlovi = new HashSet<>();
	private TipDokumentaDTO tipDokumenta;

	
	public DokumentDTO() {
		super();
	}
	
	public DokumentDTO(Long id, String naziv, String opis, LocalDateTime datumIzdavanja, Set<FajlDTO> fajlovi,
			TipDokumentaDTO tipDokumenta) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.opis = opis;
		this.datumIzdavanja = datumIzdavanja;
		this.fajlovi = fajlovi;
		this.tipDokumenta = tipDokumenta;
	}

	public Set<FajlDTO> getFajlovi() {
		return fajlovi;
	}

	public void setFajlovi(Set<FajlDTO> fajlovi) {
		this.fajlovi = fajlovi;
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

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public LocalDateTime getDatumIzdavanja() {
		return datumIzdavanja;
	}

	public void setDatumIzdavanja(LocalDateTime datumIzdavanja) {
		this.datumIzdavanja = datumIzdavanja;
	}

	public TipDokumentaDTO getTipDokumenta() {
		return tipDokumenta;
	}

	public void setTipDokumenta(TipDokumentaDTO tipDokumenta) {
		this.tipDokumenta = tipDokumenta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
