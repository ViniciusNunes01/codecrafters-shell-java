import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("$ ");
			String command = sc.nextLine();

			if (command.equals("exit")) {
				break;
			} else if (command.startsWith("echo")) {
				System.out.println(command.substring(5));
			} else {
				System.out.print(command + ": command not found");
				System.out.println();
			}

		}
	}
}
