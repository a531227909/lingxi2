package com.labour.dao;

import com.labour.model.Approval;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprovalDao {

    Approval selectOneEntryApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id,
                                    @Param("user_type_id") String user_type_id, @Param("type") String type);

    Approval selectOneRaApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id,
                                 @Param("user_type_id") String user_type_id, @Param("type") String type);

    Approval selectOnePaApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id,
                                 @Param("user_type_id") String user_type_id, @Param("type") String type);

    int insertOneEnApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id, @Param("user_type_id") String user_type_id, @Param("type") String type);

    int insertOneRaApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id, @Param("user_type_id") String user_type_id, @Param("type") String type);

    int insertOnePaApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id, @Param("user_type_id") String user_type_id, @Param("type") String type);

    int updateOneEnApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id, @Param("user_type_id") String user_type_id, @Param("type") String type, @Param("entryApprovalId") String entryApprovalId);

    int updateOneRaApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id, @Param("user_type_id") String user_type_id, @Param("type") String type, @Param("resignationApprovalId") String resignationApprovalId);

    int updateOnePaApproval(@Param("company_id") String company_id, @Param("parentId") String parentId, @Param("user_id") String user_id, @Param("user_type_id") String user_type_id, @Param("type") String type, @Param("payAdvanceApprovalId") String payAdvanceApprovalId);

    int deleteOneEnApproval(@Param("entryApprovalId") String entryApprovalId);

    int deleteOneRaApproval(@Param("resignationApprovalId") String resignationApprovalId);

    int deleteOnePaApproval(@Param("payAdvanceApprovalId") String payAdvanceApprovalId);
}
