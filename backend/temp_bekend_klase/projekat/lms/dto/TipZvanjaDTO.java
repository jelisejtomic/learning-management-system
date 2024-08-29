package projekat.lms.dto;



public class TipZvanjaDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 8750628979351199203L;
	private String naziv;

	public TipZvanjaDTO() {
		super();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
}
