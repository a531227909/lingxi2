package com.labour.dao;

import com.labour.entity.User;
import com.labour.model.LaborDemand;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaborDemandDao {

    int insertLaborDemand(LaborDemand laborDemand);

    int insertWelfareMember(@Param("welfareMemberId") String welfareMemberId, @Param("company_id") String company_id, @Param("company_full_name") String company_full_name, @Param("welfareId") String welfareId,
                            @Param("welfareName") String welfareName, @Param("welfare") String welfare);

    int updateLaborDemand(LaborDemand laborDemand);

    int updateBusinessPrice(LaborDemand laborDemand);

    int deleteWmByWmId(@Param("welfareMemberId") String welfareMemberId);

    LaborDemand selectOneLaborDemand(@Param("laborDemandId") String laborDemandId);

    List<User> selectResident(@Param("company_id") String company_id, @Param("user_type_id") String user_type_id);

    int deleteLaborDemand(@Param("laborDemandId") String laborDemandId);

    List<LaborDemand> selectLDByFactor(@Param("company_id") String company_id, @Param("usingCompanyId") String usingCompanyId, @Param("salaryTypeId") String salaryTypeId,@Param("status") String status,
                                       @Param("star_num") int star_num, @Param("pageSize") int pageSize);

    int selectCountByFactor(@Param("company_id") String company_id, @Param("usingCompanyId") String usingCompanyId, @Param("salaryTypeId") String salaryTypeId,@Param("status") String status);

    int updateStatus(@Param("status") String status, @Param("laborDemandId") String laborDemandId);

}
