package projekat.lms.dto;



public class NaucnaOblastDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 4490604472890814876L;
	private String naziv;

	public NaucnaOblastDTO() {
		super();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
}
