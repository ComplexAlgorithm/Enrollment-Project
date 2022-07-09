/**
 * Finally, you have to develop a new Demo class which will serve as the program that the 
computer science department can use to manage their professors. This demo should give the 
user options to add a new professor if enrollment goes up, remove the most recent professor if 
enrollment goes down, look at the most recent professor added, look at all the professors from 
newest to oldest in terms of time with the college, and finally look at all professors from oldest to 
newest in terms of time with the college. This program should continue until the user chooses 
the final option of ending the program.  
 */
import java.util.Scanner;
public class HW1Demo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		StackInterface<Faculty> professorStack = new ArrayBasedStack <Faculty>(5);
		
		int option;
		
		do {
			System.out.println("Press 1 if enrollment has gone up to add a new Professor.");
			System.out.println("Press 2 if enrollment has gone down to remove the most recent Professor ");
			System.out.println("Press 3 to look at the most recently added Professor.");
			System.out.println("Press 4 to look at all the Professors from newsest to oldest in time with the college.");
			System.out.println("Press 5 to look at all of the Professors from oldest to newest in time with the college.");
			System.out.println("Press 6 to end the program.");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if(option == 1) {
				try {
					System.out.println("What is the name of the Professor?");
					String name = keyboard.nextLine();
					
					System.out.println("What is the employee ID number for the professor?");
					int employeeId = keyboard.nextInt();
					keyboard.nextLine();
					
					System.out.println("What department does this professor teach in?");
					String department = keyboard.nextLine();
					
					Faculty currentProfessor = new Faculty();
					currentProfessor.setName(name);
					currentProfessor.setEmployeeId(employeeId);
					currentProfessor.setDepartment(department);
					
					professorStack.push(currentProfessor);
					
				}
				catch(StackFullException e) {
					System.out.println("No More Professors can be added!");
				}
			}
			else if(option == 2) {
				try {
					professorStack.pop();
				}
				catch(StackEmptyException e) {
					System.out.println("There are no professors to remove!");
				}
			}
			else if(option == 3) {
				try {
					System.out.println("Most recently added Professor: " + professorStack.peek());
				}
				catch(StackEmptyException e) {
					System.out.println("There are no Professors to look at!");
				}
			}
			else if(option == 4) {
				System.out.print("Professors From newest to oldest: ");
				System.out.println(professorStack.toString());
			}
			else if(option == 5) {
				System.out.println("Professors from oldest to newest: ");
				System.out.println(professorStack.toString2());
			}
			else if(option == 6) {
				System.out.println("Goodbye!");
			}
			else {
				System.out.println("Error!");
			}
			
		}while(option != 6);

	}

}
