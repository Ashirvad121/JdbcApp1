package UseCases;

import java.util.Scanner;

import service.ServiceImpl;

public class IncreaseMarks {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter roll of student whose marks you want update");
		int roll=sc.nextInt();
		System.out.println("Enter new marks");
		int marks=sc.nextInt();
		ServiceImpl ser=new ServiceImpl();
		String message= ser.updateMarks(roll, marks);
		System.out.println(message);
	}
}
