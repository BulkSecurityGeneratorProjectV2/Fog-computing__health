package org.ibase4j.core.support;

import org.ibase4j.core.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式化扩展
 *
 * @author ShenHuaJie
 * @since 2017年6月30日 下午7:40:00
 */
@SuppressWarnings("serial")
public class DateFormat extends SimpleDateFormat {

    public Date parse(String source) {
        return DateUtil.stringToDate (source);
    }
}
