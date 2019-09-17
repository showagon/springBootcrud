package com.abd.RegistratonForm.services;

import java.util.List;

import com.abd.RegistratonForm.model.BuyerModel;

public interface BuyerServices {

	public void SaveFormservice(BuyerModel buyer);
	
	
	public List<BuyerModel> getBuyerListservice();


	public BuyerModel getSingBuyerservice(int theid);


	public void DeleteSingBuyerservice(int theid);


	public List<BuyerModel> SearchBuyerService(String name);


	public int LoginProcessServices(String un, String pwd);
}
