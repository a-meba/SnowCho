package project.model.location;

public class locationDTO {
    private String location_id;	//PK
    private String region_name; //지역명
    private String city; 		//도시
    
 //--------------------------------------------------------------------------//
    
	public String getLocation_id() {
		return location_id;
	}
	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
//--------------------------------------------------------------------------//
    
}
