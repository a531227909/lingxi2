package com.labour.service;

import com.labour.entity.Result;

public interface ApprovalService {

    Result selectOneEntryApproval(String company_id, String user_id);

    Result selectOneRaApproval(String company_id, String user_id);

    Result selectOnePaApproval(String company_id, String user_id);

    Result selectEntryApprovals(String company_id);

    Result selectRaApprovals(String company_id);

    Result selectPaApprovals(String company_id);

    Result insertOneEnApproval(String company_id, String parentId, String user_id);

    Result insertOneRaApproval(String company_id, String parentId, String user_id);

    Result insertOnePaApproval(String company_id, String parentId, String user_id);

    Result deleteOneEnApproval(String entryApprovalId, String company_id, String parentId);

    Result deleteOneRaApproval(String resignationApprovalId, String company_id, String parentId);

    Result deleteOnePaApproval(String payAdvanceApprovalId, String company_id, String parentId);
}
