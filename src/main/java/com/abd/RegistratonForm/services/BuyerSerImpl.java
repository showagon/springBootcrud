package com.abd.RegistratonForm.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abd.RegistratonForm.dao.BuyerDao;
import com.abd.RegistratonForm.model.BuyerModel;

@Service
public class BuyerSerImpl implements BuyerServices {

	
	@Autowired
	private BuyerDao buyerdao;
	
	@Override
	@Transactional
	public void SaveFormservice(BuyerModel buyer) {
		buyerdao.SaveFormDao(buyer);
		
	}

	@Override
	@Transactional
	public List<BuyerModel> getBuyerListservice() {
		
		return buyerdao.getBuyerListDao();
	}

	@Override
	@Transactional
	public BuyerModel getSingBuyerservice(int theid) {
		
		return buyerdao.getSinglebuyerDao(theid);
	}

	@Override
	@Transactional
	public void DeleteSingBuyerservice(int theid) {
		buyerdao.deleteSinglebuyerDao(theid);
		
	}

	@Override
	@Transactional
	public List<BuyerModel> SearchBuyerService(String name) {
		
		return buyerdao.SearchBuyerDao(name);
		
	}

	@Override
	@Transactional
	public int LoginProcessServices(String un, String pwd) {
		
		return buyerdao.LoginProcessDao(un,pwd);
	}

}
