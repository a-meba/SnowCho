package project.model.product;

public class productDTO {
    private String product_id;		//PK
    private String product_name;	//제품이름
    private int product_price;		//제품가격

//--------------------------------------------------------------------------//
    
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

//--------------------------------------------------------------------------//
    
    
}
