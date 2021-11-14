import java.util.Scanner;

public class SallySpeakMain {
	public static void main(String[] args) {
		String goodString = "earperk bark whimper earperk bark whimper earperk tailwag tailwag bark growl earperk";
		//System.out.println(goodString);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string for Sally: ");
		String userResponse = scan.nextLine();
		SallySpeak ss = new SallySpeak(userResponse);
	}
}
