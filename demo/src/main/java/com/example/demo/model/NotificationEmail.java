package com.example.demo.model;

import javax.mail.internet.InternetAddress;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationEmail {
    private String subject;
    private String recipient;
    private String body;
	public InternetAddress getRecipient() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getSubject() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getBody() {
		// TODO Auto-generated method stub
		return null;
	}
}
