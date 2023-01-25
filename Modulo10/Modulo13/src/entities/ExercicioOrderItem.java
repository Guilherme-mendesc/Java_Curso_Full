package entities;

public class ExercicioOrderItem {

	private Integer quantity;
	private Double price;
	
	private ExercicioProduct product;

	public ExercicioOrderItem(Integer quantity, Double price, ExercicioProduct product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ExercicioProduct getProduct() {
		return product;
	}

	public void setProduct(ExercicioProduct product) {
		this.product = product;
	}
	
	public double subTotal() {
		return price*quantity;
	}

	@Override
	public String toString() {
		return product.getName()
				+", $"
				+String.format("%.2f", price)
				+", Quantity: "
				+quantity
				+", Subtotal: $"
				+String.format("%.2f", subTotal());
	}
	
}
