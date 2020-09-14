package com.labour.dao;

import com.labour.model.Approval;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserCompanyDao {

    List<Approval> selectEntryApproval(@Param("company_id") String company_id, @Param("star_num") int star_num, @Param("pageSize") int pageSize);

    List<Approval> selectRaApproval(@Param("company_id") String company_id, @Param("star_num") int star_num, @Param("pageSize") int pageSize);

    List<Approval> selectAdvanceApproval(@Param("company_id") String company_id, @Param("star_num") int star_num, @Param("pageSize") int pageSize);

}
