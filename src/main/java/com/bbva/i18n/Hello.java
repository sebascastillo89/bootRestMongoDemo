package com.bbva.i18n;

import org.springframework.data.annotation.Id;

public class Hello {

	@Id
	private String id;
	private String lang;
	private String str;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	
}
