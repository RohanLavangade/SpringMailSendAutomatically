package com.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.email.model.FormData;
import com.email.service.EmailService;

@RestController
public class EmailController {
    
	@Autowired
	private EmailService emailservice;
	 
	@PostMapping("/submit")
    public String handleFormSubmission(@RequestBody FormData formData) {
        // Process form data (e.g., save to database)
        System.out.println("Form submitted: " + formData.getFullName() + " (" + formData.getEmail() + ")");

        // Send Thank You email
        String subject = "Thank you for your submission";
        String body = "Dear " + formData.getFullName() + ",\n\n" +
                      "Thank you for submitting the form.\n\n" +
                      "Best regards,\nYour Company";
        emailservice.sendThankYouEmail(formData.getEmail(), subject, body);

        return "Form submitted successfully, and a thank-you email has been sent.";
    }
}
