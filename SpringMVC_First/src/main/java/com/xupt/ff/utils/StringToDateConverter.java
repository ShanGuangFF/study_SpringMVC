package com.xupt.ff.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cc_ff
 * @create 2019-11-26 下午4:06
 * @action 自定义类型转换器:把字符串转为日期类型
 */
public class StringToDateConverter implements Converter<String,Date> {
    @Override
    public Date convert(String source) {
        if (source == null){
            throw new RuntimeException("参数不能为空");
        }

        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date date = df.parse(source);
            return date;
        } catch (ParseException e) {
            throw new RuntimeException("类型转换出错");
        }
    }
}
