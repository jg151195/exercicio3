package exercicio3;
import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE");
		if (student.Media()<60.0) {
			
			System.out.printf("FAILED%nMISSING %.2f POINTS",student.MissingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		
		sc.close();

	}

}
