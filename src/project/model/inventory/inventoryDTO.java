package project.model.inventory;

import java.sql.Date;

public class inventoryDTO {
	private String product_id;		//FK
    private int stock_quantity;		//재고수량
    private Date arrival_date;	//입고일자
    private Date departure_date;	//출고일자
    
//--------------------------------------------------------------------------//
    
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public int getStock_quantity() {
		return stock_quantity;
	}
	public void setStock_quantity(int stock_quantity) {
		this.stock_quantity = stock_quantity;
	}
	public Date getArrival_date() {
		return arrival_date;
	}
	public void setArrival_date(Date arrival_date) {
		this.arrival_date = arrival_date;
	}
	public Date getDeparture_date() {
		return departure_date;
	}
	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}

//--------------------------------------------------------------------------//
    
    
}
