package projekat.lms.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import projekat.lms.generics.BaseEntity;

@Entity
public class TipNastave extends BaseEntity{
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String naziv;
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String opis;
	
	

	public TipNastave(Long id, Boolean deleted, String naziv, String opis) {
		super(id, deleted);
		this.naziv = naziv;
		this.opis = opis;
	}


	public TipNastave() {
		super();
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
	
	
}
