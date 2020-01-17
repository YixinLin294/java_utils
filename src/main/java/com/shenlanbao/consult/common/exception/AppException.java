package com.shenlanbao.consult.common.exception;

import com.shenlanbao.consult.common.model.ApiResult;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private ApiResult.STATE state;

    public AppException() {
        super();
    }

    public AppException(ApiResult.STATE state) {
        super(state.getMessage());
        this.setState(state);
    }

    public AppException(ApiResult.STATE state, String message) {
        state.setMessage(message);
        this.setState(state);
    }


}
