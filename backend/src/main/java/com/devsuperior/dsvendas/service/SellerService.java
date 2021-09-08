package com.devsuperior.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;

	@Autowired
	private SellerRepository sellerRepository;

	public Page<SellerDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Seller> result = repository.findAll(pageable);
		return result.map(x -> new SellerDTO(x));
	}

}
