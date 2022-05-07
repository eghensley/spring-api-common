/**
 * 
 */
package com.eghens86.common.dto;

import java.time.Instant;

import jakarta.persistence.Id;

/**
 * @author ehens86
 *
 */
public class OidAuditDto {
	@Id
	protected String oid;
	protected Instant createTs;
	protected Instant updateTs;

	public OidAuditDto() {
		
	}

	/**
	 * @return the oid
	 */
	public String getOid() {
		return oid;
	}

	/**
	 * @param oid the oid to set
	 */
	public void setOid(String oid) {
		this.oid = oid;
	}

	/**
	 * @return the createTs
	 */
	public Instant getCreateTs() {
		return createTs;
	}

	/**
	 * @param createTs the createTs to set
	 */
	public void setCreateTs(Instant createTs) {
		this.createTs = createTs;
	}

	/**
	 * @return the updateTs
	 */
	public Instant getUpdateTs() {
		return updateTs;
	}

	/**
	 * @param updateTs the updateTs to set
	 */
	public void setUpdateTs(Instant updateTs) {
		this.updateTs = updateTs;
	}
	
	
}
