package com.example.Diamondapi;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	@Autowired
	private DiamondDao diamonddao;
	
	public diamondinfo getParticularRow(String bid)
	{
		return diamonddao.getOne(bid);
	}
}
