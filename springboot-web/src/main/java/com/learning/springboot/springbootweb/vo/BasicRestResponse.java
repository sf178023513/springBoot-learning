package com.learning.springboot.springbootweb.vo;

import com.learning.springboot.springbootweb.constant.ResultCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: dev_demo
 * @description:
 * @author: sunfeifei
 * @create: 2019-09-03 10:50
 **/
@Data
public class BasicRestResponse {

    @ApiModelProperty(value = "返回信息代码", required = true, example = "SUCCESS")
    private ResultCode resultCode;

    @ApiModelProperty(value = "返回信息描述")
    private String resultDesc;

    @ApiModelProperty(value = "错误代码")
    private String errorCode;


    public BasicRestResponse() {
        resultCode = ResultCode.ACCEPTED;
    }

    public BasicRestResponse(ResultCode resultCode, String errorCode, String resultDesc) {
        this.resultCode = resultCode;
        this.errorCode = errorCode;
        this.resultDesc = resultDesc;
    }
}
