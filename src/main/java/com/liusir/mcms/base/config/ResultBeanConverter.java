package com.liusir.mcms.base.config;

import com.liusir.mcms.base.bean.ResultBean;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author
 * 自定义消息转换器;
 */
public class ResultBeanConverter extends AbstractHttpMessageConverter<ResultBean> {

    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private static final String DEFAULT_SUBTYPE = "json";

    public ResultBeanConverter(){

        super(new MediaType("application", DEFAULT_SUBTYPE, DEFAULT_CHARSET));
    }

    @Override
    protected boolean supports(Class<?> aClass) {
        return ResultBean.class.isAssignableFrom(aClass);
    }

    @Override
    protected ResultBean readInternal(Class<? extends ResultBean> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return new ResultBean();
    }

    @Override
    protected void writeInternal(ResultBean resultBean, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {

        StreamUtils.copy(resultBean.toString(), DEFAULT_CHARSET, httpOutputMessage.getBody());
    }
}
