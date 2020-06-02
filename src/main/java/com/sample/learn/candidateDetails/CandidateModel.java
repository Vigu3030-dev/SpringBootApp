package com.sample.learn.candidateDetails;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class CandidateModel {

	@Id
	private ObjectId id;
	private String candidateName;
	private String candidateEmail;
	private long candidatePhone;
	private String topicSelected;
	private boolean subscribeAlert;
	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}
	/**
	 * @return the candidateName
	 */
	public String getCandidateName() {
		return candidateName;
	}
	/**
	 * @param candidateName the candidateName to set
	 */
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	/**
	 * @return the candidateEmail
	 */
	public String getCandidateEmail() {
		return candidateEmail;
	}
	/**
	 * @param candidateEmail the candidateEmail to set
	 */
	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}
	/**
	 * @return the candidatePhone
	 */
	public long getCandidatePhone() {
		return candidatePhone;
	}
	/**
	 * @param candidatePhone the candidatePhone to set
	 */
	public void setCandidatePhone(long candidatePhone) {
		this.candidatePhone = candidatePhone;
	}
	/**
	 * @return the topicSelected
	 */
	public String getTopicSelected() {
		return topicSelected;
	}
	/**
	 * @param topicSelected the topicSelected to set
	 */
	public void setTopicSelected(String topicSelected) {
		this.topicSelected = topicSelected;
	}
	/**
	 * @return the subscribeAlert
	 */
	public boolean getSubscribeAlert() {
		return subscribeAlert;
	}
	/**
	 * @param subscribeAlert the subscribeAlert to set
	 */
	public void setSubscribeAlert(boolean subscribeAlert) {
		this.subscribeAlert = subscribeAlert;
	}
	
	
}
