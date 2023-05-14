package UseCases;

import java.util.Scanner;

import service.ServiceImpl;

public class ViewAllStudents {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("If you want to view all student then enter yes");
		String res=sc.next();
		if(res.equalsIgnoreCase("yes")) {
			ServiceImpl ser= new ServiceImpl();
			ser.viewAllStudents();
		}
	}
}
