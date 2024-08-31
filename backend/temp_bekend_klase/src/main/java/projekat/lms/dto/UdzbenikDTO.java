package projekat.lms.dto;

import java.io.Serializable;
import java.util.Set;

import projekat.lms.generics.BaseDTO;

public class UdzbenikDTO extends BaseDTO implements Serializable{
	private static final long serialVersionUID = -4488826747600137876L;
	
	private Set<String> autori;
	private Integer godinaIzdavanja; // mozda YEAR
	private String naziv;
	private String isbn;
	private Integer stanje;
	
	
	
	public UdzbenikDTO(Long id, Boolean deleted, Set<String> autori, Integer godinaIzdavanja, String naziv, String isbn,
			Integer stanje) {
		super(id, deleted);
		this.autori = autori;
		this.godinaIzdavanja = godinaIzdavanja;
		this.naziv = naziv;
		this.isbn = isbn;
		this.stanje = stanje;
	}
	public UdzbenikDTO() {
		super();
	}
	
	
	
	public Set<String> getAutori() {
		return autori;
	}
	public void setAutori(Set<String> autori) {
		this.autori = autori;
	}
	public Integer getGodinaIzdavanja() {
		return godinaIzdavanja;
	}
	public void setGodinaIzdavanja(Integer godinaIzdavanja) {
		this.godinaIzdavanja = godinaIzdavanja;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getStanje() {
		return stanje;
	}
	public void setStanje(Integer stanje) {
		this.stanje = stanje;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
