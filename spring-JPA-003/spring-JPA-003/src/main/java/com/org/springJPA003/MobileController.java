package com.org.springJPA003;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.org.springJPA003.repo.MobileRepo;
import com.org.springJPA003.repo.SimRepo;

public class MobileController {
	@Autowired
	MobileRepo mobileRepo;
	
	@Autowired
	SimRepo simRepo;
	
	@PostMapping("/mobile")
	public String saveMobileAndSim(@RequestBody Mobile m) {
		mobileRepo.save(m.getSims());
		simRepo.save(s);
		return "sccucess";
	}
}
