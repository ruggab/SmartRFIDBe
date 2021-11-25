package net.smart.rfid.db.entity.info_schema;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "sql_features" database table.
 * 
 */
@Entity
@Table(name="\"sql_features\"")
@NamedQuery(name="SqlFeature.findAll", query="SELECT s FROM SqlFeature s")
public class SqlFeature implements Serializable {
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

	@Column(name="\"sub_feature_id\"")
	private Object subFeatureId;

	@Column(name="\"sub_feature_name\"")
	private Object subFeatureName;

	public SqlFeature() {
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

	public Object getSubFeatureId() {
		return this.subFeatureId;
	}

	public void setSubFeatureId(Object subFeatureId) {
		this.subFeatureId = subFeatureId;
	}

	public Object getSubFeatureName() {
		return this.subFeatureName;
	}

	public void setSubFeatureName(Object subFeatureName) {
		this.subFeatureName = subFeatureName;
	}

}