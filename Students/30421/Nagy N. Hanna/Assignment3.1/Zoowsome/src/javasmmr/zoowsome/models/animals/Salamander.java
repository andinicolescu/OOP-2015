package javasmmr.zoowsome.models.animals;

//import javasmmr.zoowsome.models.animals.Aquatic.waterType;

public class Salamander extends Aquatic {

	public Salamander() {
		setName("Salamander");
		setNrOfLegs(4);
		avgSwimDepth = 20;
		
		//not sure on this ...
		waterType wType = waterType.SaltWater;

	}

}
