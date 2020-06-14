package com.ydhsw.huihealth.entiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ：wsydh
 * @date ：Created in 2020/6/13
 * @description ：放回结果实体类
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result implements Serializable {
    /**执行结果*/
    private boolean flag;
    /**执行信息*/
    private String message;
    /**放回数据*/
    private Object data;
    public Result(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }
}
