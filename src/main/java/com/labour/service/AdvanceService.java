package com.labour.service;

import com.labour.entity.Result;
import com.labour.model.PagesResult;
import org.apache.ibatis.annotations.Param;

public interface AdvanceService {

    PagesResult selectAdvanceByFactor( String name, String gender, String phoneNum, String province_code,
                                      String city_code, String company_id, String usingCompanyId, String stationName, String page);

    Result selectOneAdvance(String advanceId);

    Result updateAdvanceStatus(String status, String advanceId);

}
