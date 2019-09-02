package com.gyenno.ruiyun.datamigration.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DataBase {
    String value() default "dbalone";
}
