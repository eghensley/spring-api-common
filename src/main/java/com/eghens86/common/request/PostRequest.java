/**
 * 
 */
package com.eghens86.common.request;

import java.util.Objects;

/**
 * @author ehens86
 *
 */
public class PostRequest {
	protected String username;
	protected Object payload;
	
	public PostRequest() {
		
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the payload
	 */
	public Object getPayload() {
		return payload;
	}

	/**
	 * @param payload the payload to set
	 */
	public void setPayload(Object payload) {
		this.payload = payload;
	}

	@Override
	public int hashCode() {
		return Objects.hash(payload, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PostRequest)) {
			return false;
		}
		PostRequest other = (PostRequest) obj;
		return Objects.equals(payload, other.payload) && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "PostRequest [username=" + username + ", payload=" + payload + "]";
	}
	
	
}
