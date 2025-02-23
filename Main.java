// When you are ready to have your work checked, change the value below from N to Y
// ReadyForSubmission=Y
// YOUR NAME: Tony Vera
// COLLABORATORS: N/A
// DATE:2/23/2025

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("\nMy thoughts on the article are:\n");

		//Article Questoins are executed print lines in Main and responses to questinos are invoked methods
		System.out.println("Should a self-driving car prioritize the safety of its passengers or pedestrians?");
		Main.printSafetyPriority();

		System.out.println("What factors should the car's algorithms consider when making such determinations?");
		String Answer = Main.printFactorsOfAlgorithms();
		System.out.println(Answer);

		System.out.println("Who should be deciding the algorithms for self-driving cars?");
		Main.printWhoIsResponsible();
		
	}

	// Part 1: Creating method definition returning Void Data and Non-Void Data
	public static void printWhoIsResponsible()
	{
		System.out.println("Manufacturer of the Self-Driving car and its engineers are responsible for implementing the algorithms!\n");
	}

	public static void printSafetyPriority()
	{
		System.out.println("A Car should Prioritize the safety of pedestrians as passengers have some protections inside the vehicle \n");
	}
	public static String printFactorsOfAlgorithms()
	{
		return "Maximizing perservence of life has is the most important factor while loss of property is the least important factor \n";
	}
	
}