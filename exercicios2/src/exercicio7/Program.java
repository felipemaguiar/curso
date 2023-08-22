package exercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Criando a lista
		List<Dados> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");			
			Double salary = sc.nextDouble();
			
			Dados emp = new Dados(id, name, salary);
			
			list.add(emp);			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary =  sc.nextInt();
		
		Dados emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Dados e :  list) {
			System.out.println(e);
		}
		
		sc.close();
	}
	
	public Integer position(List<Dados> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
