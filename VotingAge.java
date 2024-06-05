package basicjava;

public class VotingAge {

	public static void main(String[] args) {
	       // Declare variables
	     int age = 25; // The person's age
	        int votingAge = 18; // The minimum age required to vote

	       
	        if (age >= votingAge) { // If the person's age is greater than or equal to the voting age
	            System.out.println("Old enough to vote!"); // Print this message
	        } else {
	            System.out.println("Not old enough to vote."); // Otherwise, print this message
	        }

	}

}
