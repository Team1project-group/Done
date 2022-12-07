package com.CreditMagader.api.serviceimpl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreditMagader.api.exception.CreditMagerIdNotPresent;
import com.CreditMagader.api.model.CreditManager;
import com.CreditMagader.api.repository.CreditManagerRepository;
import com.CreditMagader.api.servicei.CreditManagerServicei;

@Service
public class CreditManagerServiceimpl implements CreditManagerServicei{
	@Autowired
	CreditManagerRepository cms;

	@Override
	public Iterable<CreditManager> getAllData() {
			
		return cms.findAll();
	}

	@Override
	public CreditManager saveCreditMagager(CreditManager c) {
		
		return cms.save(c);
	}

	@Override
	public void deleteCreditManager(Integer creditManagerId) {
	Optional<CreditManager> c=cms.findById(creditManagerId);
			
			if(c.isPresent())
			{
			cms.deleteById(creditManagerId);
			}
			else {
				throw new CreditMagerIdNotPresent("Credit manager id not present ");
			}
		
	}

	

	

}
