### API 使用說明
* * *
#### 1.1. POST /api/word_splits/parse/{method}/results
|欄位|描述|
|:---|:---|
|Description|取得分詞結果|
|Pagination|N/A|
|Access Control|所有使用者|
|Using|N/A|

**Note**
* 簡單分詞 API
    * 啟動 rdp-word-split-service 後，開啟瀏覽器輸入以下網址
    http://localhost:8083/swagger-ui.html
    * 若上述服務無回應，請確認 aaron-eureka-server 是否正常啟動。


***
**Request Header**

|Require|Name|Data Type|Description|Example|
|:---|:---|:---|:---|:---|

***
**Request URL Parameters**

|Require|Name|Data Type|Description|Example|
|:---|:---|:---|:---|:---|
|require|method|string|分詞方法|toAnalysis<br>dicAnalysis<br>nlpAnalysis<br>indexAnalysis<br>baseAnalysis|


***
**Request Body**

```json
{
"content":"我是天上一片雲"
}
```

***
**Response Body**

*HTTP 200*
```json
{
    "terms": [
        {
            "name": "我",
            "realName": "我",
            "offe": 0,
            "newWord": false,
            "synonyms": null,
            "subTerm": null,
            "natureStr": "r",
            "realNameIfnull": "我"
        },
        {
            "name": "是",
            "realName": "是",
            "offe": 1,
            "newWord": false,
            "synonyms": null,
            "subTerm": null,
            "natureStr": "v",
            "realNameIfnull": "是"
        },
        {
            "name": "天上",
            "realName": "天上",
            "offe": 2,
            "newWord": false,
            "synonyms": null,
            "subTerm": null,
            "natureStr": "s",
            "realNameIfnull": "天上"
        },
        {
            "name": "一片",
            "realName": "一片",
            "offe": 4,
            "newWord": false,
            "synonyms": null,
            "subTerm": null,
            "natureStr": "mq",
            "realNameIfnull": "一片"
        },
        {
            "name": "雲",
            "realName": "雲",
            "offe": 6,
            "newWord": true,
            "synonyms": null,
            "subTerm": null,
            "natureStr": "null",
            "realNameIfnull": "雲"
        }
    ]
}
```

|Name|Data Type|Description|Example|
|:---|:---|:---|:---|
|name|string||
|realName|String|取得真實的詞,默認情況會取得標注化後的|
|offe|int|斷詞位置|
|newWord|boolean||
|synonyms|object|針對不同語料調用不同的分詞模型|
|subTerm|object||
|natureStr|String|詞性|
|realNameIfnull|String||


<br>
<br>
<br>
<br>