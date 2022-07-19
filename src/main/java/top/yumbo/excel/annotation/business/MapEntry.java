package top.yumbo.excel.annotation.business;

import java.lang.annotation.*;
import java.util.function.Function;

/**
 * @author jinhua
 * @date 2021/6/8 15:27
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MapEntries.class)
public @interface MapEntry {
    /**
     * 键
     */
    String key() default "";

    /**
     * 值
     */
    String value() default "";

    Class inter() default Function.class;
}
