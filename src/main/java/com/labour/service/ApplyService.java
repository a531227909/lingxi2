package com.labour.service;

import com.labour.entity.Result;

public interface ApplyService {

    Result insertOneEntryApply(String user_id, String laborDemandId, String workReviewTypeId, String workReviewType, String reviewReason);

    Result insertOneRaApply(String user_id, String company_id, String workReviewTypeId, String workReviewType, String reviewReason);
}
