import java.util.*;

public class AverageApp
{
	public static void main(String[] args)
	{
		AverageAppUI ui = new AverageAppUI();
		Scanner reader = new Scanner(System.in);
		System.out.println("1.Compute total average.\n2.Compute Running Average");
		int choice = reader.nextInt();
		switch(choice)
		{
		case 1: ui.totalAverageUI(); break;
		case 2: ui.runningAverageUI(); break;
		}
		reader.close();
	}
}