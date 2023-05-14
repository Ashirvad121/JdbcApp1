package UseCases;

import java.util.Scanner;

import service.ServiceImpl;

public class RegisterStudent {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your roll number");
		int roll =sc.nextInt();
		System.out.println("Enter you name");
		String name=sc.next();
		System.out.println("Enter yor marks");
		int marks=sc.nextInt();
		ServiceImpl ser=new ServiceImpl();
		String message=ser.registerStudent(roll, name, marks);
		System.out.println(message);
	}

}
