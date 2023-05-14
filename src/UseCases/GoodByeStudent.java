package UseCases;

import java.util.Scanner;

import service.ServiceImpl;

public class GoodByeStudent {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter roll");
		int roll=sc.nextInt();
		ServiceImpl ser=new ServiceImpl();
		String message=ser.deleteStudent(roll);
		System.out.println(message);
	}
}
