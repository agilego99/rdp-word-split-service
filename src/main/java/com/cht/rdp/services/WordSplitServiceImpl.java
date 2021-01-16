package com.cht.rdp.services;

import org.ansj.domain.Result;
import org.ansj.splitWord.analysis.*;
import org.springframework.stereotype.Component;

@Component("wordSplitService")
public class WordSplitServiceImpl implements IwordSplitService{


	@Override
	public Result baseAnalysis(String str) {
		return BaseAnalysis.parse(str);
	}

	@Override
	public Result toAnalysis(String str) {
		return ToAnalysis.parse(str);
	}

	@Override
	public Result dicAnalysis(String str) {
		return DicAnalysis.parse(str);
	}

	@Override
	public Result indexAnalysis(String str) {
		return IndexAnalysis.parse(str);
	}

	@Override
	public Result nlpAnalysis(String str) {
		return NlpAnalysis.parse(str);
	}
}
