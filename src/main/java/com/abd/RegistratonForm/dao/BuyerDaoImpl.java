package com.abd.RegistratonForm.dao;

import java.util.List;

import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abd.RegistratonForm.model.BuyerModel;


@Repository
public class BuyerDaoImpl implements BuyerDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void SaveFormDao(BuyerModel buyer) {
		
     Session session = entityManager.unwrap(Session.class);
     session.saveOrUpdate(buyer);    
	}

	@Override
	public List<BuyerModel> getBuyerListDao() {
		
		Session session = entityManager.unwrap(Session.class);
		
		List<BuyerModel> buyer = session.createNativeQuery("SELECT * FROM buyer",BuyerModel.class).list();
	               
		//Query<BuyerModel> buyer = session.createQuery("from BuyerModel", BuyerModel.class);
		
		//List<BuyerModel> buyerlist = buyer;
		
		return buyer;
	}

	@Override
	public BuyerModel getSinglebuyerDao(int theid) {
		Session session = entityManager.unwrap(Session.class);
		
		BuyerModel thesinglebuyer = session.get(BuyerModel.class, theid);
		
		return thesinglebuyer;
	}

	@Override
	public void deleteSinglebuyerDao(int theid) {

		Session session = entityManager.unwrap(Session.class);
		
		Query<?> buyer = session.createQuery("delete from BuyerModel where id=:id");
		buyer.setParameter("id", theid);
		buyer.executeUpdate();
	}

	@Override
	public List<BuyerModel> SearchBuyerDao(String name) {

		Session session = entityManager.unwrap(Session.class);
		
		List<BuyerModel> buyer = session.createNativeQuery("SELECT * FROM buyer where name LIKE '"+name+"%'",BuyerModel.class).list();
		
		System.out.println(buyer.size());
		return buyer;
	}

	@Override
	public int LoginProcessDao(String un, String pwd) {
		
		Session session = entityManager.unwrap(Session.class);
		Query query =	 session.createNativeQuery("SELECT count(*) FROM login where uname = '"+un+"'  and pwd ='"+pwd+"'");
		int count  = query.getSingleResult().hashCode();
		System.out.println(query.getSingleResult());
		return count;
			
	}

}
