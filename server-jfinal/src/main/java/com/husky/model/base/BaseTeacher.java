package com.husky.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTeacher<M extends BaseTeacher<M>> extends Model<M> implements IBean {

	public void setTId(java.lang.String tId) {
		set("t_id", tId);
	}
	
	public java.lang.String getTId() {
		return getStr("t_id");
	}
	
	public void setTName(java.lang.String tName) {
		set("t_name", tName);
	}
	
	public java.lang.String getTName() {
		return getStr("t_name");
	}
	
}
