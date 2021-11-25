package net.smart.rfid.db.entity.info_schema;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "sql_parts" database table.
 * 
 */
@Entity
@Table(name="\"sql_parts\"")
@NamedQuery(name="SqlPart.findAll", query="SELECT s FROM SqlPart s")
public class SqlPart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"comments\"")
	private Object comments;

	@Column(name="\"feature_id\"")
	private Object featureId;

	@Column(name="\"feature_name\"")
	private Object featureName;

	@Column(name="\"is_supported\"")
	private Object isSupported;

	@Column(name="\"is_verified_by\"")
	private Object isVerifiedBy;

	public SqlPart() {
	}

	public Object getComments() {
		return this.comments;
	}

	public void setComments(Object comments) {
		this.comments = comments;
	}

	public Object getFeatureId() {
		return this.featureId;
	}

	public void setFeatureId(Object featureId) {
		this.featureId = featureId;
	}

	public Object getFeatureName() {
		return this.featureName;
	}

	public void setFeatureName(Object featureName) {
		this.featureName = featureName;
	}

	public Object getIsSupported() {
		return this.isSupported;
	}

	public void setIsSupported(Object isSupported) {
		this.isSupported = isSupported;
	}

	public Object getIsVerifiedBy() {
		return this.isVerifiedBy;
	}

	public void setIsVerifiedBy(Object isVerifiedBy) {
		this.isVerifiedBy = isVerifiedBy;
	}

}