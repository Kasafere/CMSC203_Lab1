import java.util.Scanner;
public class movieDriver 
{
private int number;
private String name;
private String rating;

driver movie = new driver (name,rating,number);
public static void main(String[] args)
{
Scanner scanner = new Scanner (System.in);
char answer;
do {
	Movie movie = new Movie();
	
System.out.println("Please enter the name of a movie");
String name = scanner.next();
movie.setTitle(name);
scanner.nextLine();

System.out.println("enter therating");
String rating = scanner.next();
movie.setRating(rating);

System.out.println(" enter the number of tickets sold for this movie");
int number = scanner.nextInt();
movie.setSoldTickets(number);

System.out.println("" + name + "(" +rating +"): Tickets Sold: " + number + "\n");

System.out.println("Do you want to enter morer? (y/n)?");
scanner.nextLine();

answer = scanner.next().toLowerCase().charAt(0);
scanner.nextLine();
} while (answer != 'n');
System.out.println("Goodbye");

scanner.close();
}
}

