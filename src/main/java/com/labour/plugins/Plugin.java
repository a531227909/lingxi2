package com.labour.plugins;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.stereotype.Component;


/**
 * @des  根据不同的彩果类型，在彩果入口，判断使用不同支付插件处理不同的彩果业务逻辑<br/>
 * @author voldemort
 * @time  2019年8月30日16:19:46
 * @version 1.0
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Plugin {

    public String lotteryType();

}
