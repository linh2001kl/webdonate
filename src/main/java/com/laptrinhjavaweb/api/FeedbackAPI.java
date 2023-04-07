//package com.laptrinhjavaweb.api;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.laptrinhjavaweb.dto.FeedbackDTO;
//import com.laptrinhjavaweb.service.IFeedbackService;
//
//
//@CrossOrigin
//@RestController
//public class FeedbackAPI {
//	
//	@Autowired
//	private IFeedbackService feedbackService;
//	
//	@PostMapping(value = "/feedback")
//	public FeedbackDTO createFeedback(@RequestBody FeedbackDTO model) {
//		return feedbackService.save(model);
//	}
//
//	@PutMapping(value = "/feedback")
//	public FeedbackDTO updateFeedback(@RequestBody FeedbackDTO model) {
//		return model;
//	}
//
//	@DeleteMapping(value = "/feedback")
//	public void deleteFeedback(@RequestBody long[] ids) {
//
//	}
//}
//
