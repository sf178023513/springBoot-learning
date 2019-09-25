package com.learning.springboot.springbootweb.constant;

public enum ResultCode {
    /*
     *  请求已经被接收，但仍在处理
     */
    ACCEPTED,

    /*
     *  成功
     */
    SUCCESS,

    /*
     *  失败
     */
    FAILED,

    /*
     *  拒绝接收请求
     */
    REJECTED,
}
