package com.it.vx.common.exception;

import com.it.vx.common.enums.ExceptionEnum;
import lombok.Getter;

/**
 * @author bystander
 * @date 2018/9/15
 *
 * 自定义异常类
 */
@Getter
public class VXException extends RuntimeException {

    private ExceptionEnum exceptionEnum;

    public VXException(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }


}
