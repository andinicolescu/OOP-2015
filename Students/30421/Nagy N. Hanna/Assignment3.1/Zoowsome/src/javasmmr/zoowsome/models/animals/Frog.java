package javasmmr.zoowsome.models.animals;

//import javasmmr.zoowsome.models.animals.Aquatic.waterType;

public class Frog extends Aquatic {

	public Frog() {
		setName("Frog");
		setNrOfLegs(4);
		avgSwimDepth = 24;
		
		//not sure on this ...
		waterType wType = waterType.FreshWater;

	}

}
