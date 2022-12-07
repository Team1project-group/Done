package com.CreditMagader.api.servicei;

import java.util.List;

import com.CreditMagader.api.model.CreditManager;

public interface CreditManagerServicei {

	public Iterable<CreditManager> getAllData();

	public CreditManager saveCreditMagager(CreditManager c);

	public void deleteCreditManager(Integer creditManagerId);


}
