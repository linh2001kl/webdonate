package com.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.converter.FeedbackConverter;
import com.laptrinhjavaweb.dto.FeedbackDTO;
import com.laptrinhjavaweb.entity.FeedbackEntity;
import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.repository.FeedbackRepository;
import com.laptrinhjavaweb.repository.NewRepository;
import com.laptrinhjavaweb.service.IFeedbackService;

@Service
public class FeedbackService implements IFeedbackService {
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@Autowired
	private NewRepository newRepository;
	
	@Autowired
	private FeedbackConverter feedbackConverter;
	@Override
	public FeedbackDTO save(FeedbackDTO feedbackDTO) {
		NewEntity newEntity = newRepository.findOneByCode(feedbackDTO.getNewCode());
		FeedbackEntity feedbackEntity = feedbackConverter.toEntity(feedbackDTO);
		feedbackEntity.setNewss(newEntity);
		feedbackEntity = feedbackRepository.save(feedbackEntity);
		return feedbackConverter.toDTO(feedbackEntity);
	}

	

	
}
