package projekat.lms.model;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class InstrumentEvaluacije extends BaseEntity{
	@OneToMany
	private Set<Fajl> fajlovi;
	
	public InstrumentEvaluacije() {
		super();
	}

	

	public InstrumentEvaluacije(Long id, Boolean deleted, Set<Fajl> fajlovi) {
		super(id, deleted);
		this.fajlovi = fajlovi;
	}



	public Set<Fajl> getFajlovi() {
		return fajlovi;
	}

	public void setFajlovi(Set<Fajl> fajlovi) {
		this.fajlovi = fajlovi;
	}
	
}
