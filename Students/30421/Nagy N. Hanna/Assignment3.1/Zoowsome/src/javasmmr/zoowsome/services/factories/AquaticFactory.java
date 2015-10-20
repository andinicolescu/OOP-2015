package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Frog;
import javasmmr.zoowsome.models.animals.Newt;
import javasmmr.zoowsome.models.animals.Salamander;

public class AquaticFactory extends SpeciesFactory{

	
	 public Animals getAnimal(String type) {
         if (Constants.Animals.Aquatics.Frog.equals(type)) {
                return new Frog(); // leave empty constructor, for now!
        } else if (Constants.Animals.Aquatics.Newt.equals(type)) {
             return new Newt();
                      } 
        else if (Constants.Animals.Aquatics.Salamander.equals(type)){
        	return new Salamander();
        	
        }
		return null;
       
       }
}
