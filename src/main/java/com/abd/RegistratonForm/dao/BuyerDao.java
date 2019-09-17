package com.abd.RegistratonForm.dao;

import java.util.List;

import com.abd.RegistratonForm.model.BuyerModel;

public interface BuyerDao {

	public void SaveFormDao(BuyerModel buyer); 
	public List<BuyerModel> getBuyerListDao();
	public BuyerModel getSinglebuyerDao(int theid);
	public void deleteSinglebuyerDao(int theid);
	public List<BuyerModel> SearchBuyerDao(String name);
	public int LoginProcessDao(String un, String pwd);
}
