package project.model.order;

import java.sql.Date;

public class orderDTO {
    private int order_id;			//PK
    private String member_id;		//FK
    private Date order_date;		//주문일자
    private double total_amount;	//주문총액
    
 //--------------------------------------------------------------------------//
    
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

//--------------------------------------------------------------------------//
    
}
