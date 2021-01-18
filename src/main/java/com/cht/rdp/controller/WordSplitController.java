package com.cht.rdp.controller;

import com.cht.rdp.bean.Body;
import com.cht.rdp.dto.ApiResponseModel;
import com.cht.rdp.services.WordSplitServiceImpl;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.ansj.domain.Result;
import org.ansj.domain.Term;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Api(value = "Word-Split API Services")
@RequestMapping("/api/word_splits")
@RestController
@Slf4j
public class WordSplitController {

    @Autowired
    WordSplitServiceImpl wordSplitService;


    // api 1.1
    @RequestMapping(value = "/parse/{method}/results", method = {RequestMethod.POST}, produces={"application/json;charset=UTF-8","application/json;charset=UTF-8"})
    @ApiOperation(value = "根據 {分詞方法} 取得分詞結果", response = Result.class)
    // 定義返回值意義
    @ApiResponses(value ={
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 204, message = "No Content"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name ="method",value = "分詞方式",dataType = "String",paramType = "path",required = true)
    })
    @PostMapping(value = "/consultants")
    public Object segApi(@PathVariable("method") String method,@RequestBody Body body) {
        String content = body.getContent();
        log.info("The query method is " + method);
        try {
            Result result;
            Term term;
            switch (method) {
                case "toAnalysis":
                    result =  wordSplitService.toAnalysis(content);
                    return ResponseEntity.status(HttpStatus.CREATED).body(result);
                case "dicAnalysis":
                    result =  wordSplitService.dicAnalysis(content);
                    return ResponseEntity.status(HttpStatus.CREATED).body(result);
                case "nlpAnalysis":
                    result =  wordSplitService.nlpAnalysis(content);
                    return ResponseEntity.status(HttpStatus.CREATED).body(result);
                case "indexAnalysis":
                    result =  wordSplitService.indexAnalysis(content);
                    return ResponseEntity.status(HttpStatus.CREATED).body(result);
                case "baseAnalysis":
                    result =  wordSplitService.baseAnalysis(content);
                    return ResponseEntity.status(HttpStatus.CREATED).body(result);
                default:
                    return ResponseEntity.status(HttpStatus.CREATED).body("{\"message\""+":\""+"輸入錯誤分詞方法，請檢查後重新輸入。"+"\"}");
            }
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity<ApiResponseModel>(new ApiResponseModel(e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }
}



