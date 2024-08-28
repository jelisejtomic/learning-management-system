package projekat.lms.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import projekat.lms.generics.BaseEntity;

@Entity
public class TipEvaluacije extends BaseEntity{
	@Column(nullable = false, columnDefinition = "TEXT")
	private String naziv;

	public TipEvaluacije(Long id, String naziv) {
		super(id);
		this.naziv = naziv;
	}

	public TipEvaluacije() {
		super();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
}
