package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Alligator;
import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Snake;

public class ReptileFactory extends SpeciesFactory{
         @Override
         public Animals getAnimal(String type) {
                 if (Constants.Animals.Reptiles.Alligator.equals(type)) {
                        return new Alligator(); // leave empty constructor, for now!
                } else if (Constants.Animals.Reptiles.Snake.equals(type)) {
                     return new Snake();
                              } 
                else if (Constants.Animals.Reptiles.Crocodile.equals(type)){
                	return new Crocodile();
                	
                }
				return null;
               
               }
}
