package org.generation.QuickTrip.tour;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tourService {
	private final tourRepository tourRep;
	
	@Autowired
	public tourService(tourRepository tourRep) {
		super();
		this.tourRep = tourRep;
	}//constructor
	
	public List<tour> getTours(){
		return tourRep.findAll();
	}//get tours

	
	public tour getTour(Long tourId) {
		return tourRep.findById(tourId).orElseThrow(() -> new IllegalStateException("El tour con el id "+ tourId +" no existe."));

	}//get tour

	public void deleteTour(Long tourId) {
		if (tourRep.existsById(tourId)) {
			tourRep.deleteById(tourId);
		}//
		
	}// delete tour
	
	public void addTour(tour tou) {
		Optional<tour> userByName = tourRep.findByName(tou.getName());
		if(userByName.isPresent()) {
			throw new IllegalStateException("El Usuario con el nombre [ "+tou.getName()+" ] ya existe.");
		}else {
			tourRep.save(tou);
		}
		
	}//adduser
	
	
	public void updateTour(Long tourId, String name, String location, String category, String image, Long price, String about, String city, double rating, int reviews_num) {
		if (tourRep.existsById(tourId)) { 
			tour t = tourRep.getById(tourId);
			if (name != null) t.setName(name); 
			if (location != null) t.setLocation(location);
			if (category != null) t.setCategory(category);
			if (image != null) t.setImage(image);
			if (price != 0) t.setPrice(price);
			if (about != null) t.setAbout(about);
			if (city != null) t.setCity(city);
			if (rating != 0) t.setRating(rating);
			if (reviews_num != 0) t.setReviews_num(reviews_num);
			tourRep.save(t);
		}else {
			System.out.println("No existe el id "+tourId);
			System.err.println("*No existe el id "+tourId);
		}// if 		
		
	} // update tour

	
}
