package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Pigeon;
import javasmmr.zoowsome.models.animals.Stork;


public class BirdFactory extends SpeciesFactory{
	
	 public Animals getAnimal(String type) {
         if (Constants.Animals.Birds.Stork.equals(type)) {
                return new Stork(); // leave empty constructor, for now!
        } else if (Constants.Animals.Birds.Eagle.equals(type)) {
             return new Eagle();
                      } 
        else if (Constants.Animals.Birds.Pigeon.equals(type)){
        	return new Pigeon();
        	
        }
		return null;
       
       }

}
