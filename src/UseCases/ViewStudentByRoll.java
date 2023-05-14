package UseCases;

import java.util.Scanner;

import service.ServiceImpl;

public class ViewStudentByRoll {
	 public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter roll number");
		int roll=sc.nextInt();
		ServiceImpl.viewStudentByRoll(roll);
	}
}
