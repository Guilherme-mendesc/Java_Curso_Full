package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.ExercicioOrderStatus;
import entities.enums.OrderStatus;

public class ExercicioOrder {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momment;
	private ExercicioOrderStatus status;
	
	private ExercicioClient client;
	private List<ExercicioOrderItem> items = new ArrayList<>();
	

	public ExercicioOrder(Date momment, ExercicioOrderStatus status, ExercicioClient client) {
		this.momment = momment;
		this.status = status;
		this.client = client;
	}

	public Date getMomment() {
		return momment;
	}

	public void setMomment(Date momment) {
		this.momment = momment;
	}

	public ExercicioOrderStatus getStatus() {
		return status;
	}

	public void setStatus(ExercicioOrderStatus status) {
		this.status = status;
	}

	public ExercicioClient getClient() {
		return client;
	}

	public void setClient(ExercicioClient client) {
		this.client = client;
	}
	
	public List<ExercicioOrderItem> getItems(){
		return items;
	}
	
	public void addItem(ExercicioOrderItem item) {
		items.add(item);
	}
	
	public void removeItem(ExercicioOrderItem item) {
		items.remove(item);
	}
	public double total() {
		double sum = 0.0;
		for(ExercicioOrderItem item: items) {
			sum += item.subTotal();
		}
		return sum;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(momment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (ExercicioOrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
	

}
