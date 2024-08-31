package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import projekat.lms.generics.BaseDTO;

public class FajlDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 2196452011931993494L;

	private String opis;
	private String url;
	private String tip;
	private LocalDateTime createdAt;
	public FajlDTO() {
		super();
	}
	
	public FajlDTO(Long id, Boolean deleted, String opis, String url, String tip, LocalDateTime createdAt) {
		super(id, deleted);
		this.opis = opis;
		this.url = url;
		this.tip = tip;
		this.createdAt = createdAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	
}
