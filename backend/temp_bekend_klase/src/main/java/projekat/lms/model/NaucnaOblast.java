package projekat.lms.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import projekat.lms.generics.BaseEntity;

@Entity
public class NaucnaOblast extends BaseEntity{
	@Column(nullable = false, columnDefinition = "TEXT")
	private String naziv;

	public NaucnaOblast() {
		super();
	}

	

	public NaucnaOblast(Long id, Boolean deleted, String naziv) {
		super(id, deleted);
		this.naziv = naziv;
	}



	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	
}
