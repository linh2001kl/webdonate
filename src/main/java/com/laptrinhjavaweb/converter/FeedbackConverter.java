//package com.laptrinhjavaweb.converter;
//
//import org.springframework.stereotype.Component;
//
//import com.laptrinhjavaweb.dto.FeedbackDTO;
//import com.laptrinhjavaweb.entity.FeedbackEntity;
//
//@Component
//public class FeedbackConverter {
//
//	public FeedbackEntity toEntity(FeedbackDTO dto) {
//		FeedbackEntity entity = new FeedbackEntity();
//		entity.setComment(dto.getComment());
//		entity.setUserName(dto.getUserName());
//		return entity;
//	}
//	
//	public FeedbackDTO toDTO(FeedbackEntity entity) {
//		FeedbackDTO dto = new FeedbackDTO();
//		dto.setComment(entity.getComment());
//		dto.setUserName(entity.getUserName());
//		return dto;
//	}
//}
