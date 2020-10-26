package com.example.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * @author: 晓白
 * @time: 2020/10/16 17:37
 * @description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface  Mapper{}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Select{
    String value();
}

@Mapper
public class annotationTest {

}
