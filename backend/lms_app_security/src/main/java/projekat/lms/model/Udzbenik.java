package projekat.lms.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import projekat.lms.generics.BaseEntity;

@Entity
public class Udzbenik extends BaseEntity {
	@Column(nullable = true, columnDefinition = "VARCHAR(256)")
	private String autori;

	@Column(nullable = false)
	private Integer godinaIzdavanja;

	@Column(nullable = false, columnDefinition = "TEXT")
	private String naziv;

	@Column(nullable = false, columnDefinition = "VARCHAR(13)")
	private String isbn;

	@Column(columnDefinition = "int default 0")
	private Integer stanje;

	public Udzbenik(Long id, Boolean deleted, String autori, Integer godinaIzdavanja, String naziv, String isbn,
			Integer stanje) {
		super(id, deleted);
		this.autori = autori;
		this.godinaIzdavanja = godinaIzdavanja;
		this.naziv = naziv;
		this.isbn = isbn;
		this.stanje = stanje;
	}

	public Udzbenik() {
		super();
	}

	public Set<String> getAutori() {
		if (this.autori == null || this.autori.isEmpty()) {
			return new HashSet<>();
		}
		return new HashSet<>(Arrays.asList(this.autori.split(",")));
	}

	public void setAutori(Set<String> autori) {
		if (autori == null || autori.isEmpty()) {
			this.autori = null;
		} else {
			this.autori = String.join(",", autori);
		}
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

}
