package projekat.lms.dto;

import java.util.Set;


public class NastavnikDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 4404900526680285447L;
	private String jmbg;
	private String biografija;
	private Set<ZvanjeDTO> zvanja;

	public NastavnikDTO() {
		super();
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getBiografija() {
		return biografija;
	}

	public void setBiografija(String biografija) {
		this.biografija = biografija;
	}

	public Set<ZvanjeDTO> getZvanja() {
		return zvanja;
	}

	public void setZvanja(Set<ZvanjeDTO> zvanja) {
		this.zvanja = zvanja;
	}
}
