package org.generation.QuickTrip.tour;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class tourService {
    public final ArrayList<tour> lista = new ArrayList<tour>();

    public tourService() {
		
        lista.add(new tour("Discover the historic center", 
		"CDMX", 
		"Culture", 
		"../assets/img/items/bellas-artes.jpg", 
		500.00, 
		"Get to know the history of many of the most famous places such as the Palacio de Bellas Artes, Zocalo, Chinatown, and the cathedral, but we will also visit less touristy spots like old colonial houses and traditional candy stores, and get to know traditions that are still alive today. Plus, a perfect snack-stop and many, many fun facts."
		));

		lista.add(new tour("Teotihuacan Ballon Ride", 
		"CDMX", 
		"Culture", 
		"https://ichef.bbci.co.uk/news/800/cpsprodpb/BEE3/production/_118676884_gettyimages-73656849.jpg.webp", 
		3000.00, 
		"This experience is your great opportunity to get to know Teotihuacan from another perspective, out of the ordinary. Fly in a balloon and let the wind take you on an unforgettable journey, witnessing the first contact between man and heaven."
		));
		
	}

    public ArrayList<tour> getTours(){
		return lista;
	}//getTours

    public tour getTour(Long tourId) {
		tour tmpTour = null;
		for (tour t : lista) {
			if(t.getId()== tourId){
				tmpTour = t;
			}//if
		}//for each
		return tmpTour;
	}//getTour

    public void deleteTour(Long tourId) {
		for (tour t : lista) {
			if(t.getId()== tourId){
				lista.remove(t);
				break;
			}//if
		}//for each
	}// deleteTour

}