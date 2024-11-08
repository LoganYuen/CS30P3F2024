package Vehicle;

import java.util.Scanner;

/*
Program: testVehicle.java          Date: November 5, 2024
Purpose: Create client code to test the Vehicle, Truck, Minivan, and Car classes.
Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

public class TestVehicle {

	public static void main(String[] args) 
	{
		int vehicleType;
		boolean otherVehicle = false;
		Scanner input = new Scanner(System.in);
		
	    double fuelEconomyCity, fuelEconomyHwy, cargoVolume, maxSpeed;
	    int seatingCapacity;
	    boolean hasHeatedSeats, hasChargingPorts;
		
		
		//Loop if there's a second vehicle
		do
		{
			//Menu
			System.out.println("Which Vehicle do you have?"
					+ "\n1. Car"
					+ "\n2. Truck"
					+ "\n3. Minivan");
			
			//Get vehicle type
			System.out.println("Please enter the vehicle number: ");
			vehicleType = input.nextInt();
			
			
			
			
			//Get fuelEconomyCity
			System.out.println("Please enter the vehicle's city fuel economy: ");
			fuelEconomyCity = input.nextDouble();
			
			//Get fuelEconomyHwy
			System.out.println("Please enter the vehicle's highway fuel economy: ");
			fuelEconomyHwy = input.nextDouble();
			
			//Get seatingCapacity
			System.out.println("Please enter the vehicle's seating capacity: ");
			seatingCapacity = input.nextInt();
			
			//Get cargoVolume
			System.out.println("Please enter the vehicle's cargo volume: ");
			cargoVolume = input.nextDouble();
			
			//Get hasHeatedSeats
			System.out.println("Does the vehicle have heated seats? (true or false): ");
			hasHeatedSeats = input.nextBoolean();
			
			//Get hasChargingPorts
			System.out.println("Does the vehicle have charging ports? (true or false): ");
			hasChargingPorts = input.nextBoolean();

			//Get maxSpeed
			System.out.println("Please enter the vehicle's maximum speed: ");
			maxSpeed = input.nextDouble();
			
			
			//Check for vehicle
			switch (vehicleType)
			{
			
			
			//User has a car
			case 1:
				
				//Get hasTrunkSensor
				System.out.println("Does the vehicle have an automatic trunk opening sensor? (true or false): ");
				boolean hasTrunkSensor = input.nextBoolean();
				
				//Get hasRoofRack
				System.out.println("Does the vehicle have a roof rack? (true or false): ");
				boolean hasRoofRack = input.nextBoolean();
				
				
				//Create Car object
				Car userCar;
				
				
				//Check for which way to display and store the vehicle's data
				if(otherVehicle == false)
				{
					userCar = new Car(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume, hasHeatedSeats, hasChargingPorts, maxSpeed, hasTrunkSensor, hasRoofRack);
					System.out.println("\nYour car's data:\n" + userCar);
				}
				else
				{
					//Add data to new car object
					userCar = new Car(0, 0, 0, 0, false, false, 0, false, false);
					userCar.setFuelEconomyCity(fuelEconomyCity);
					userCar.setFuelEconomyHwy(fuelEconomyHwy);
					userCar.setSeatingCapacity(seatingCapacity);
					userCar.setCargoVolume(cargoVolume);
					userCar.setHasHeatedSeats(hasHeatedSeats);
					userCar.setHasChargingPorts(hasChargingPorts);
					userCar.setMaxSpeed(maxSpeed);
					userCar.setHasTrunkSensor(hasTrunkSensor);
					userCar.setHasRoofRack(hasRoofRack);
					
					//Display data
					System.out.println("\nYour car's data:"
							+ "\nFuel Economy (City): " + userCar.getFuelEconomyCity()
							+ "\nFuel Economy (Highway): " + userCar.getFuelEconomyHwy()
							+ "\nSeating capacity: " + userCar.getSeatingCapacity()
							+ "\nCargo volume: " + userCar.getCargoVolume()
							+ "\nHas heated seats: " + userCar.getHasHeatedSeats()
							+ "\nHes charging ports: " + userCar.getHasChargingPorts()
							+ "\nMax speed: " + userCar.getMaxSpeed()
							+ "\nHas trunk sensor: " + userCar.getHasTrunkSensor()
							+ "\nHas roof rack: " + userCar.getHasRoofRack());
				}
				break;
				
				
				
				
			//User has a truck
			case 2:
				//Get bedSize
				System.out.println("Please enter the vehicles's bed size: ");
				double bedSize = input.nextDouble();
				
				//Get towingCapacity
				System.out.println("Please enter the vehicles's towing Capacity: ");
				double towingCapacity = input.nextDouble();
				
				
				//Create Truck object
				Truck userTruck;
				
				
				//Check for which way to display and store the vehicle's data
				if(otherVehicle == false)
				{
					userTruck = new Truck(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume, hasHeatedSeats, hasChargingPorts, maxSpeed, bedSize, towingCapacity);
					System.out.println("\nYour truck's data:\n" + userTruck);
				}
				else
				{
					//Add data to new truck object
					userTruck = new Truck(0, 0, 0, 0, false, false, 0, 0, 0);
					userTruck.setFuelEconomyCity(fuelEconomyCity);
					userTruck.setFuelEconomyHwy(fuelEconomyHwy);
					userTruck.setSeatingCapacity(seatingCapacity);
					userTruck.setCargoVolume(cargoVolume);
					userTruck.setHasHeatedSeats(hasHeatedSeats);
					userTruck.setHasChargingPorts(hasChargingPorts);
					userTruck.setMaxSpeed(maxSpeed);
					userTruck.setBedSize(bedSize);
					userTruck.setTowingCapacity(towingCapacity);
					
					//Display data
					System.out.println("\nYour truck's data:"
							+ "\nFuel Economy (City): " + userTruck.getFuelEconomyCity()
							+ "\nFuel Economy (Highway): " + userTruck.getFuelEconomyHwy()
							+ "\nSeating capacity: " + userTruck.getSeatingCapacity()
							+ "\nCargo volume: " + userTruck.getCargoVolume()
							+ "\nHas heated seats: " + userTruck.getHasHeatedSeats()
							+ "\nHes charging ports: " + userTruck.getHasChargingPorts()
							+ "\nMax speed: " + userTruck.getMaxSpeed()
							+ "\nBed size: " + userTruck.getBedSize()
							+ "\nTowing capacity: " + userTruck.getTowingCapacity());
				}
				break;
				
				
				
			
			//User has a minivan
			case 3:
				//Get hasSlidingDoors
				System.out.println("Does the vehicle have sliding doors? (true or false): ");
				boolean hasSlidingDoors = input.nextBoolean();
				
				//Get hasEntertainmentScreen
				System.out.println("Does the vehicle have an entertainment screen in the backseat? (true or false): ");
				boolean hasEntertainmentScreen = input.nextBoolean();
				
				
				//Create Minivan object
				Minivan userMinivan;
				
				
				//Check for which way to display and store the vehicle's data
				if(otherVehicle == false)
				{
					userMinivan = new Minivan(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume, hasHeatedSeats, hasChargingPorts, maxSpeed, hasSlidingDoors, hasEntertainmentScreen);
					System.out.println("\nYour minivan's data:\n" + userMinivan);
				}
				else
				{
					//Add data to new minivan object
					userMinivan = new Minivan(0, 0, 0, 0, false, false, 0, false, false);
					userMinivan.setFuelEconomyCity(fuelEconomyCity);
					userMinivan.setFuelEconomyHwy(fuelEconomyHwy);
					userMinivan.setSeatingCapacity(seatingCapacity);
					userMinivan.setCargoVolume(cargoVolume);
					userMinivan.setHasHeatedSeats(hasHeatedSeats);
					userMinivan.setHasChargingPorts(hasChargingPorts);
					userMinivan.setMaxSpeed(maxSpeed);
					userMinivan.setHasSlidingDoors(hasSlidingDoors);
					userMinivan.setHasEntertainmentScreen(hasEntertainmentScreen);
					
					//Display data
					System.out.println("\nYour minivan's data:"
							+ "\nFuel Economy (City): " + userMinivan.getFuelEconomyCity()
							+ "\nFuel Economy (Highway): " + userMinivan.getFuelEconomyHwy()
							+ "\nSeating capacity: " + userMinivan.getSeatingCapacity()
							+ "\nCargo volume: " + userMinivan.getCargoVolume()
							+ "\nHas heated seats: " + userMinivan.getHasHeatedSeats()
							+ "\nHes charging ports: " + userMinivan.getHasChargingPorts()
							+ "\nMax speed: " + userMinivan.getMaxSpeed()
							+ "\nHas sliding doors: " + userMinivan.getHasSlidingDoors()
							+ "\nHas entertainment screen: " + userMinivan.getHasEntertainmentScreen());
				}
				break;
			}
			
			if(otherVehicle == false)
			{
				//Ask the user if they have any other cars
				System.out.println("Is there another vehicle you would like to enter data for? (true or false): ");
				otherVehicle = input.nextBoolean();
			}
			else
			{
				otherVehicle = false;
			}
		
		} while(otherVehicle);
	}
}
/* Screen Dump
Test Case 1:
Which Vehicle do you have?
1. Car
2. Truck
3. Minivan
Please enter the vehicle number: 
1
Please enter the vehicle's city fuel economy: 
1
Please enter the vehicle's highway fuel economy: 
2
Please enter the vehicle's seating capacity: 
3
Please enter the vehicle's cargo volume: 
4
Does the vehicle have heated seats? (true or false): 
true
Does the vehicle have charging ports? (true or false): 
false
Please enter the vehicle's maximum speed: 
5
Does the vehicle have an automatic trunk opening sensor? (true or false): 
true
Does the vehicle have a roof rack? (true or false): 
false

Your car's data:
City fuel economy: 1.0
Highway fuel economy: 2.0
Seating capacity: 3
Cargo volume: 4.0
Has heated seats: true
Has charging ports: false
Max speed: 5.0
Has trunk sensor: true
Has roof rack: false
Is there another vehicle you would like to enter data for? (true or false): 
true
Which Vehicle do you have?
1. Car
2. Truck
3. Minivan
Please enter the vehicle number: 
3
Please enter the vehicle's city fuel economy: 
11
Please enter the vehicle's highway fuel economy: 
22
Please enter the vehicle's seating capacity: 
33
Please enter the vehicle's cargo volume: 
44
Does the vehicle have heated seats? (true or false): 
false
Does the vehicle have charging ports? (true or false): 
true
Please enter the vehicle's maximum speed: 
55
Does the vehicle have sliding doors? (true or false): 
false
Does the vehicle have an entertainment screen in the backseat? (true or false): 
true

Your minivan's data:
Fuel Economy (City): 11.0
Fuel Economy (Highway): 22.0
Seating capacity: 33
Cargo volume: 44.0
Has heated seats: false
Hes charging ports: true
Max speed: 55.0
Has sliding doors: false
Has entertainment screen: true







Test Case 2:
Which Vehicle do you have?
1. Car
2. Truck
3. Minivan
Please enter the vehicle number: 
2
Please enter the vehicle's city fuel economy: 
111
Please enter the vehicle's highway fuel economy: 
222
Please enter the vehicle's seating capacity: 
333
Please enter the vehicle's cargo volume: 
444
Does the vehicle have heated seats? (true or false): 
true
Does the vehicle have charging ports? (true or false): 
false
Please enter the vehicle's maximum speed: 
5555
Please enter the vehicles's bed size: 
6666
Please enter the vehicles's towing Capacity: 
7777

Your truck's data:
City fuel economy: 111.0
Highway fuel economy: 222.0
Seating capacity: 333
Cargo volume: 444.0
Has heated seats: true
Has charging ports: false
Max speed: 5555.0
Bed size: 6666.0
Towing Capacity: 7777.0
Is there another vehicle you would like to enter data for? (true or false): 
false

*/