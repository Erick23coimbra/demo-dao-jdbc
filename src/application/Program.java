package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		SellerDao sellerdao = DaoFactory.CreateSellerDao();	
		
		System.out.println("======Teste n°1:Seller FindById======");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n======Teste n°2 Seller FindByIdDeparment======");
		Department department = new Department (2,null);
		List <Seller> list = sellerdao.FindByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n======Teste n°3 Seller FindALL======");
		
		list = sellerdao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}
