package com.labour.dao;

import com.labour.model.Advance;
import com.labour.model.Dispatched;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvanceDao {

    List<Advance> selectAdvanceByFactor(@Param("name") String name, @Param("gender") String gender, @Param("phoneNum") String phoneNum, @Param("province_code") String province_code,
                                           @Param("city_code") String city_code, @Param("company_id") String company_id, @Param("usingCompanyId") String usingCompanyId, @Param("stationName") String stationName,
                                           @Param("star_num") int star_num, @Param("pageSize") int pageSize);

    int selectCountByFactor(@Param("name") String name, @Param("gender") String gender, @Param("phoneNum") String phoneNum, @Param("province_code") String province_code,
                            @Param("city_code") String city_code, @Param("company_id") String company_id, @Param("usingCompanyId") String usingCompanyId, @Param("stationName") String stationName);

    Advance selectOneAdvance(@Param("advanceId") String advanceId);

    int updateAdvanceStatus(@Param("status") String status, @Param("advanceId") String advanceId);
}
