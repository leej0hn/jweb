package com.redscraf.jweb.common.validator;

import com.redscraf.jweb.common.exception.JwebException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new JwebException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new JwebException(message);
        }
    }
}
