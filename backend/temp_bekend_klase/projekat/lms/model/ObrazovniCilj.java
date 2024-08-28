package projekat.lms.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import projekat.lms.generics.BaseEntity;

@Entity
public class ObrazovniCilj extends BaseEntity{
	@Column(nullable = false, columnDefinition = "TEXT")
	private String opis;
	
	public ObrazovniCilj(Long id, String opis) {
		super(id);
		this.opis = opis;
	}

	public ObrazovniCilj() {
		super();
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}
}
