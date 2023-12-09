package project.model.store;

public class storeDTO {
    private String store_id;		//매장PK
    private String store_name;
    private Long location_id;		//FK
    private String phone_number;	//매장번호

 //--------------------------------------------------------------------------//
    
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public Long getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Long location_id) {
		this.location_id = location_id;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

//--------------------------------------------------------------------------//
    
    
}
