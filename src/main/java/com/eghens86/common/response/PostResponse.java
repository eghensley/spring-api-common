/**
 * 
 */
package com.eghens86.common.response;

import java.util.Date;
import java.util.Objects;

import org.springframework.http.HttpStatus;

/**
 * @author ehens86
 *
 */
public class PostResponse extends GeneralApiResponse {
	private Object request;
	private Integer itemsRequested;
	private Integer itemsCompleted;
	private Object payload;

	public PostResponse() {
		this.timestamp = new Date();
	}

	public PostResponse(Object request) {
		this.timestamp = new Date();
		this.request = request;
		this.itemsRequested = 0;
		this.itemsCompleted = 0;
	}
	
	public PostResponse(Object request, Integer itemsRequested) {
		this.timestamp = new Date();
		this.request = request;
		this.itemsRequested = itemsRequested;
		this.itemsCompleted = 0;
	}

	public PostResponse(Object request, Integer itemsRequested, Integer itemsCompleted, HttpStatus status,
			String errorMsg) {
		this.request = request;
		this.itemsRequested = itemsRequested;
		this.itemsCompleted = itemsCompleted;
		this.status = status;
		this.timestamp = new Date();
		this.errorMsg = errorMsg;
	}

	public void addResponseMsg(HttpStatus status, String errorMsg) {
		this.status = status;
		this.errorMsg = errorMsg;
		this.timestamp = new Date();
	}

	/**
	 * @return the request
	 */
	public Object getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(Object request) {
		this.request = request;
	}



	/**
	 * @return the itemsRequested
	 */
	public Integer getItemsRequested() {
		return itemsRequested;
	}

	/**
	 * @param itemsRequested the itemsRequested to set
	 */
	public void setItemsRequested(Integer itemsRequested) {
		this.itemsRequested = itemsRequested;
	}

	/**
	 * @return the itemsCompleted
	 */
	public Integer getItemsCompleted() {
		return itemsCompleted;
	}

	/**
	 * @param itemsCompleted the itemsCompleted to set
	 */
	public void setItemsCompleted(Integer itemsCompleted) {
		this.itemsCompleted = itemsCompleted;
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
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(itemsCompleted, itemsRequested, payload, request);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof PostResponse)) {
			return false;
		}
		PostResponse other = (PostResponse) obj;
		return Objects.equals(itemsCompleted, other.itemsCompleted) && Objects.equals(itemsRequested, other.itemsRequested)
				&& Objects.equals(payload, other.payload) && Objects.equals(request, other.request);
	}

	@Override
	public String toString() {
		return "ParseResponse [request=" + request + ", itemsRequested=" + itemsRequested + ", itemsCompleted=" + itemsCompleted
				+ ", payload=" + payload + "]";
	}

}