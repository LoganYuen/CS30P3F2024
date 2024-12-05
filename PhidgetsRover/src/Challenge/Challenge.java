package Challenge;

import com.phidget22.*;

public class Challenge 
{
    public static void main(String[] args) throws Exception 
    {

        //Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        DistanceSensor sonar = new DistanceSensor();

        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);
        sonar.open(5000);
        

        for (int i = 0; i < 4; i++)
        {
        	if (sonar.getDistance() < 400)
        	{
                //Turn 180
                leftMotors.setTargetVelocity(1);
                rightMotors.setTargetVelocity(-1);
                Thread.sleep(800);
                
    	        //Move
    	        leftMotors.setTargetVelocity(-1);
    	        rightMotors.setTargetVelocity(-1);
    	        Thread.sleep(1000);
    	        
    	        //Stop
    	        leftMotors.setTargetVelocity(0);
    	        rightMotors.setTargetVelocity(0);
    	        Thread.sleep(1000);
    	        break;
        	}
            		
    	    //Move
    	    leftMotors.setTargetVelocity(-1);
    	    rightMotors.setTargetVelocity(-1);
    	    Thread.sleep(1520);
    	    //Stop
    	    leftMotors.setTargetVelocity(0);
    	    rightMotors.setTargetVelocity(0);
    	    Thread.sleep(2000);
    	    //Turn
    	    leftMotors.setTargetVelocity(1);
    	    rightMotors.setTargetVelocity(-1);
    	    Thread.sleep(575);
    	    //Stop
    	    leftMotors.setTargetVelocity(0);
    	    rightMotors.setTargetVelocity(0);
    	    Thread.sleep(2000);
            }     
    }
}
