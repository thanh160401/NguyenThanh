package com.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.laptrinhjavaweb.converter.InsertConverter;
import com.laptrinhjavaweb.dto.InsertDTO;
import com.laptrinhjavaweb.entity.InsertEntity;
import com.laptrinhjavaweb.repository.InsertRepository;
import com.laptrinhjavaweb.service.IService;
@org.springframework.stereotype.Service
public class Service implements IService {
	@Autowired
	private InsertConverter insertConverter;
	@Autowired
	private InsertRepository insertRepository;
	
	@Override
	public InsertDTO save(InsertDTO insertDTO) {
		InsertEntity instEntity = new InsertEntity();
		instEntity = insertConverter.toEntity(insertDTO);
		instEntity = insertRepository.save(instEntity);
		return insertConverter.toDTO(instEntity);
	}

}
