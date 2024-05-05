package com.codecrafter.indie.theguardiangate.model.article;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Article {
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
}
