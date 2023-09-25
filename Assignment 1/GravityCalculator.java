class GravityCalculator  {
    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
        finalPosition = initialPosition + (initialVelocity*fallingTime) + (0.5*gravity*fallingTime*fallingTime);
 		System.out.println("The object's position after " + fallingTime  + " seconds is " + finalPosition + " m.");
    }
}
// PART ONE
// Output before adding formula
// The object's position after 10.0 seconds is 0.0 m.

// PART TWO
// Output after adding formula
// The object's position after 10.0 seconds is -490.50000000000006 m.