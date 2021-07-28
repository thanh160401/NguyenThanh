package com.laptrinhjavaweb.converter;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.InsertDTO;
import com.laptrinhjavaweb.entity.InsertEntity;

@Component
public class InsertConverter {
	
	public InsertDTO toDTO(InsertEntity entity) {
		InsertDTO dto = new InsertDTO();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}
	public InsertEntity toEntity(InsertDTO dto) {
		InsertEntity entity = new InsertEntity();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}
}
