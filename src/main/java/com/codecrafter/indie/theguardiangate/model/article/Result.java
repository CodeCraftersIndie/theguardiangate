package com.codecrafter.indie.theguardiangate.model.article;

public class Result {
	
	private String id;
    private String type;
    private String sectionId;
    private String sectionName;
    private String webPublicationDate;
    private String webTitle;
    private String webUrl;
    private String apiUrl;
    private Fields fields;
    private boolean isHosted;
    private String pillarId;
    private String pillarName;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSectionId() {
		return sectionId;
	}
	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public String getWebPublicationDate() {
		return webPublicationDate;
	}
	public void setWebPublicationDate(String webPublicationDate) {
		this.webPublicationDate = webPublicationDate;
	}
	public String getWebTitle() {
		return webTitle;
	}
	public void setWebTitle(String webTitle) {
		this.webTitle = webTitle;
	}
	public String getWebUrl() {
		return webUrl;
	}
	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}
	public String getApiUrl() {
		return apiUrl;
	}
	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}
	public Fields getFields() {
		return fields;
	}
	public void setFields(Fields fields) {
		this.fields = fields;
	}
	public boolean isHosted() {
		return isHosted;
	}
	public void setHosted(boolean isHosted) {
		this.isHosted = isHosted;
	}
	public String getPillarId() {
		return pillarId;
	}
	public void setPillarId(String pillarId) {
		this.pillarId = pillarId;
	}
	public String getPillarName() {
		return pillarName;
	}
	public void setPillarName(String pillarName) {
		this.pillarName = pillarName;
	}

}
