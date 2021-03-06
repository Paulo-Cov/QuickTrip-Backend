package org.generation.QuickTrip.reservations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
    private Long id;
    private Integer num_reservations;
    private String date;
    private Double total_price;
    private String user_id;
    private String tour_id;
    
    public reservation(Long id, Integer num_reservations, String date, Double total_price, String user_id,
			String tour_id) {
		super();
		this.id = id;
		this.num_reservations = num_reservations;
		this.date = date;
		this.total_price = total_price;
		this.user_id = user_id;
		this.tour_id = tour_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getTour_id() {
		return tour_id;
	}

	public void setTour_id(String tour_id) {
		this.tour_id = tour_id;
	}

	public reservation() {
    	
    }//constructor vacio
    
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNum_reservations() {
		return num_reservations;
	}

	public void setNum_reservations(Integer num_reservations) {
		this.num_reservations = num_reservations;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(Double total_price) {
		this.total_price = total_price;
	}
    
    
    

}