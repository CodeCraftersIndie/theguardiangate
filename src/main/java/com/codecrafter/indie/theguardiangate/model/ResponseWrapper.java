package com.codecrafter.indie.theguardiangate.model;

import com.codecrafter.indie.theguardiangate.model.article.ArticleResponse;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseWrapper {
	private ArticleResponse response;
}
