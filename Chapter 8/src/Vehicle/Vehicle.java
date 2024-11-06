package Vehicle;

public abstract class Vehicle 
{
    double fuelEconomyCity;
    double fuelEconomyHwy;
    int seatingCapacity;
    double cargoVolume;
    boolean hasHeatedSeats;
    boolean hasChargingPorts;
    double maxSpeed;
    
    
    //Constructor
    public Vehicle(double FEC, double FEH, int SC, double CV, boolean HHS,boolean HCS, double MS)
    {
        fuelEconomyCity = FEC;
        fuelEconomyHwy = FEH;
        seatingCapacity = SC;
        cargoVolume = CV;
        hasHeatedSeats = HHS;
        hasChargingPorts = HCS;
        maxSpeed = MS;
    }
    
    
    
    //Modifier methods
    public void setFuelEconomyCity(double FEC)
    {
    	fuelEconomyCity = FEC;
    }
    public void setFuelEconomyHwy(double FEH)
    {
    	fuelEconomyHwy = FEH;
    }
    public void setSeatingCapacity(int SC)
    {
    	seatingCapacity = SC;
    }
    public void setCargoVolume(double CV)
    {
    	cargoVolume = CV;
    }
    public void setHasHeatedSeats(boolean HHS)
    {
    	hasHeatedSeats = HHS;
    }
    public void setHasChargingPorts(boolean HCS)
    {
    	hasChargingPorts = HCS;
    }
    public void setMaxSpeed(double MS)
    {
    	maxSpeed = MS;
    }
    
    
    
    //Accessor methods
    public double getFuelEconomyCity()
    {
    	return fuelEconomyCity;
    }
    public double getFuelEconomyHwy()
    {
    	return fuelEconomyHwy;
    }
    public int getSeatingCapacity()
    {
    	return seatingCapacity;
    }
    public double getCargoVolume()
    {
    	return cargoVolume;
    }
    public boolean getHasHeatedSeats()
    {
    	return hasHeatedSeats;
    }
    public boolean getHasChargingPorts()
    {
    	return hasChargingPorts;
    }
    public double getMaxSpeed()
    {
    	return maxSpeed;
    }
    
    
    
    //Return object as string
    public String toString()
    {
    	String veh = "City fuel economy: " + fuelEconomyCity
    			+ "\nHighway fuel economy: " + fuelEconomyHwy
    			+ "\nSeating capacity: " + seatingCapacity
    			+ "\nCargo volume: " + cargoVolume
    			+ "\nHas heated seats: " + hasHeatedSeats
    			+ "\nHas charging ports: " + hasChargingPorts
    			+ "\nMax speed: " + maxSpeed;

    	return veh;
    			
    }
}