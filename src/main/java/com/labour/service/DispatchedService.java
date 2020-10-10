package com.labour.service;

import com.labour.entity.Result;
import com.labour.model.PagesResult;
import org.apache.ibatis.annotations.Param;

public interface DispatchedService {

    PagesResult selectDispatchedByFactor(String workAuditStatus, String company_id, String name, String phoneNum, String province_code, String city_code,
                                                String usingCompanyId, String stationName, String workReviewTypeId, String user_id, String page);

    Result selectOneDispatched(String workAuditId);

    Result updateWorkAuditIdIsOk(String isOk, String audit_info, String workAuditStatus, String workAuditId);

}
