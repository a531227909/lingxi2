package com.labour.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LaborDemandUtils {

    /**
     * 获取需求编号demandId,格式yyyyMMdd+时间戳后8位
     * @param
     * @return 字符串的长度
     */
    public static String getDemandId() {
        String demandId = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String day = sdf.format(new Date());
        String time = String.valueOf(System.currentTimeMillis());
        demandId = day+time.substring(time.length()-8);
        return demandId;
    }

}
