import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		String command = "";

		while (!"exit".equals(command)) {
			System.out.print("$ ");
			command = sc.nextLine();
			if (!"exit".equals(command)) {
				System.out.print(command + ": command not found");
				System.out.println();
			}
		}
	}
}
