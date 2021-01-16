package com.cht.rdp.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Body{
	
	@ApiModelProperty(value = "欲分析詞彙(ex.我是天上一片雲)",required=true)
	private String content;

	public Body() {}
	
}