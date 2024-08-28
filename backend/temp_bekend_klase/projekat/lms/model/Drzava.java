package projekat.lms.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class Drzava extends BaseEntity{
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String naziv;

	@OneToMany(mappedBy = "drzava")
	private Set<Mesto> mesta;
	
	
	public Drzava(Long id, String naziv, Set<Mesto> mesta) {
		super(id);
		this.naziv = naziv;
		this.mesta = mesta;
	}

	public Drzava() {
		super();
	}
	
	public Set<Mesto> getMesta() {
		return mesta;
	}

	public void setMesta(Set<Mesto> mesta) {
		this.mesta = mesta;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	
}	
