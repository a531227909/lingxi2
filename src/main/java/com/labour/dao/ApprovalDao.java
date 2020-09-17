package com.labour.dao;

import com.labour.model.Approval;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprovalDao {

    Approval selectOneEntryApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id);

    Approval selectOneRaApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id);

    Approval selectOnePaApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id);

    int insertOneEnApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id);

    int insertOneRaApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id);

    int insertOnePaApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id);

    int updateOneEnApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id, @Param("entryApprovalId") String entryApprovalId);

    int updateOneRaApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id, @Param("resignationApprovalId") String resignationApprovalId);

    int updateOnePaApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id, @Param("payAdvanceApprovalId") String payAdvanceApprovalId);

    int deleteOneEnApproval(@Param("entryApprovalId") String entryApprovalId);

    int deleteOneRaApproval(@Param("resignationApprovalId") String resignationApprovalId);

    int deleteOnePaApproval(@Param("payAdvanceApprovalId") String payAdvanceApprovalId);
}
