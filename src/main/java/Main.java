import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("$ ");
			String command = sc.nextLine();

			if (command.startsWith("type")) {
				if (command.substring(5).startsWith("echo")) {
					System.out.println("echo is a shell builtin");
				} else if (command.substring(5).startsWith("exit")) {
					System.out.println("exit is a shell builtin");
				} else if (command.substring(5).startsWith("type")) {
					System.out.println("type is a shell builtin");
				} else {
					System.out.println(command.substring(5) + ": not found");
				}
			} else if (command.equals("exit")) {
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
