/**
 * 
 */
package com.eghens86.common.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * @author ehens86
 *
 */
@Service
public class MappingService {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	private final EntityManagerService entityManagerUtils;
	
	public MappingService(EntityManagerService entityManagerUtils) {
		this.entityManagerUtils = entityManagerUtils;
	}
	
	@SuppressWarnings("unchecked")
	public Object mapToDto(Object entity, @SuppressWarnings("rawtypes") Class dto) {
		return modelMapper.map(entity, dto);
	}
	
	@SuppressWarnings("unchecked")
	public Object mapToModel(Object dto, @SuppressWarnings("rawtypes") Class entity) {
		Object model = entityManagerUtils.fetchPersisted(dto, entity);
		modelMapper.map(dto, model);
		return modelMapper.map(model, entity);
	}
	
	public Object mapModelToModel(Object dto) {
		Object model = entityManagerUtils.fetchPersistedModel(dto, dto.getClass());
		modelMapper.map(model, dto);
		return model;
	}
}
