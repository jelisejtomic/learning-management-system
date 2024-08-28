package projekat.lms.model;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class OsobljeStudentskeSluzbe extends BaseEntity{
	@Column(nullable = false, columnDefinition = "TEXT")
	private String biografija;
	
	@OneToMany
	private Set<Inventar> inventar;
	
	private Set<Udzbenik> biblioteka;

	public OsobljeStudentskeSluzbe() {
		super();
	}

	public OsobljeStudentskeSluzbe(Long id, String biografija, Set<Inventar> inventar, Set<Udzbenik> biblioteka) {
		super(id);
		this.biografija = biografija;
		this.inventar = inventar;
		this.biblioteka = biblioteka;
	}

	public String getBiografija() {
		return biografija;
	}

	public void setBiografija(String biografija) {
		this.biografija = biografija;
	}

	public Set<Inventar> getInventar() {
		return inventar;
	}

	public void setInventar(Set<Inventar> inventar) {
		this.inventar = inventar;
	}

	public Set<Udzbenik> getBiblioteka() {
		return biblioteka;
	}

	public void setBiblioteka(Set<Udzbenik> biblioteka) {
		this.biblioteka = biblioteka;
	}
	
	
}
