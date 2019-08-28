package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		SellerDao sellerdao = DaoFactory.CreateSellerDao();	
		
		System.out.println("======Teste n°1 FindById======");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);
		
	}

}
