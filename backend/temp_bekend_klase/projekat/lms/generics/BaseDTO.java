package lms_app_nereg2.generics;

public abstract class BaseDTO<Long> {
	protected Long id;
    protected boolean deleted = false;

	public BaseDTO() {
	}

	public BaseDTO(Long id, boolean deleted) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public boolean getDeleted(){
        return this.deleted;
    }

    public void setDeleted(boolean deleted){
        this.deleted = deleted;
    }
}
