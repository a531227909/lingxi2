package com.labour.dao;

import com.labour.model.Dispatched;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DispatchedDao {

    List<Dispatched> selectDispatchedByFactor(@Param("workAuditStatus") String workAuditStatus, @Param("company_id") String company_id, @Param("name") String name, @Param("phoneNum") String phoneNum, @Param("province_code") String province_code,
                                              @Param("city_code") String city_code, @Param("usingCompanyId") String usingCompanyId, @Param("stationName") String stationName, @Param("workReviewTypeId") String workReviewTypeId, @Param("user_id") String user_id,
                                              @Param("star_num") int star_num, @Param("pageSize") int pageSize);

    int selectCountByFactor(@Param("workAuditStatus") String workAuditStatus, @Param("company_id") String company_id, @Param("name") String name, @Param("phoneNum") String phoneNum, @Param("province_code") String province_code,
                            @Param("city_code") String city_code, @Param("usingCompanyId") String usingCompanyId, @Param("stationName") String stationName, @Param("workReviewTypeId") String workReviewTypeId, @Param("user_id") String user_id);

    Dispatched selectOneDispatched(@Param("workAuditId") String workAuditId);

    int updateWorkAuditIdIsOk(@Param("isOk") String isOk, @Param("audit_info") String audit_info, @Param("workAuditStatus") String workAuditStatus, @Param("workAuditId") String workAuditId);
}
