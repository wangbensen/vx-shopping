package com.it.vx.common.advice;

import com.it.vx.common.exception.VXException;
import com.it.vx.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author wangbs
 * @version 1.0
 * @date 2019/8/3 23:13
 */
@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(VXException.class)
    public ResponseEntity<ExceptionResult> handleException(VXException e) {
        return ResponseEntity.status(e.getExceptionEnum().value())
                .body(new ExceptionResult(e.getExceptionEnum()));
    }

}
