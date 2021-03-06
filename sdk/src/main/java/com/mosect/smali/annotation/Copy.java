package com.mosect.smali.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 复制方法
 * 此注解将会在生成dex时移除
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Copy {
    /**
     * 目标方法名，即复制后的方法名
     *
     * @return 方法名
     */
    String value();
}
