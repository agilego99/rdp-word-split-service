package com.cht.rdp.services;

import org.ansj.domain.Result;

public interface IwordSplitService {

	public Result baseAnalysis(String str);
	public Result toAnalysis(String str);
	public Result dicAnalysis(String str);
	public Result indexAnalysis(String str);
	public Result nlpAnalysis(String str);
}
