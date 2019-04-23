package com.example.servicedemo.config;

import java.lang.reflect.AnnotatedElement;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @ClassName ApiReturnHandler
 * @Author mawenjie
 * @Date 2019-04-18 17:32
 **/
//@ControllerAdvice(annotations = RestController.class)
public class ApiReturnHandler implements ResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        AnnotatedElement element = methodParameter.getAnnotatedElement();
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType,
        Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        return null;
    }
}
