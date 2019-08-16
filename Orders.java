
public class Orders {
	
	private long orderId;
	private Products products;
	public Orders(long orderId, Products products) {
		super();
		this.orderId = orderId;
		this.products = products;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public Products getProducts() {
		return products;
	}
	public void setProducts(Products products) {
		this.products = products;
	}
	
	
}
