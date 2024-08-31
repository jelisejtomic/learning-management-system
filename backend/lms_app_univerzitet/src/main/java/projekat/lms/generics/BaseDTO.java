package projekat.lms.generics;

public abstract class BaseDTO {
	protected Long id;
    protected Boolean deleted = false;

	public BaseDTO() {
	}

	public BaseDTO(Long id, Boolean deleted) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public Boolean getDeleted(){
        return this.deleted;
    }

    public void setDeleted(Boolean deleted){
        this.deleted = deleted;
    }
}
