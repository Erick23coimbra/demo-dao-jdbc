package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
			
		DepartmentDao deparmentdao = DaoFactory.CreateDepartmentDao();
		
		System.out.println("======Teste n°1:Seller FindById======");
		Department department = deparmentdao.findById(3);
		System.out.println(department);
		
		
		System.out.println("\n======Teste n°2 Seller FindALL======");
			List<Department> list = deparmentdao.findAll();
			for (Department d : list) {
				System.out.println(d);
			}
		
			
		
		
		System.out.println("\n======Teste n°3 insert======");
		Department newdepartment = new Department(null,"greg");
		deparmentdao.insert(newdepartment);
		System.out.println("Inserted! new Id = " + newdepartment.getId());
		
		System.out.println("\n======Teste n°5 Update======");
		
		department = deparmentdao.findById(1);
		department.setNome("Eat");
		deparmentdao.update(department);
		System.out.println("Update Complatede");
		
		System.out.println("\n======Teste n°6 insert======");
		System.out.println("Digite o cod para deletar");
		int id = sc.nextInt();
		deparmentdao.deleteById(id);
		System.out.println("Delete complited");
		
		
		sc.close();
	}

}
