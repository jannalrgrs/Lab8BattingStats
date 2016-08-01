import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab8BattingStats {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		// System.out.println("Enter the number of batters: ");
		// int batters = scan1.nextInt();
		// for (int j = 0; j < batters; j++){
		// double [][] calculateBatters = new double[batters][input];
		// System.out.println(batters);

		System.out.println("Welcome to the Batting Average Calculator!!!");
		System.out.println("Enter the number of times at bat:");

		double totalBases = 0;
		double bases = 0;
		int input = scan1.nextInt();

		double[] atBatInput = new double[(int) input];
		String choice = "y";
		int result = 0;

		while (choice.equalsIgnoreCase("y")) {

			System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");

			{

				for (int a = 0; a < input; a++) { // user inputs number of at
													// bats // bats

					result = a + 1;
					System.out.println("Result for at-bat " + (result) + ":");

					atBatInput[a] = scan1.nextInt();
					if (atBatInput[a] > 0) { // user inputs their base hits
						bases += 1;
					}

					for (double i : atBatInput) {
						totalBases += i;
					}
					while (atBatInput[a] < 0 || atBatInput[a] > 4) {
						System.out.println("You must enter a number between 0 and 4;" + "\nEnter Result for at-bat "
								+ result + ": ");
						atBatInput[a] = scan1.nextInt();
					}

				}

			}
			double battingAverage = bases / result; // bases earned/ total # of
													// at bats
			System.out.println("Batting Average: " + battingAverage);
			DecimalFormat df = new DecimalFormat();
			df.setMinimumFractionDigits(3); // set the minimum number of decimal
											// places

			System.out.print("Slugging Average: ");
			System.out.println(df.format(totalBases / result));

			System.out.println("Would you like to enter another batter? (y/n): ");
			choice = scan1.nextLine();
			scan1.nextLine();

		}
	}
}
