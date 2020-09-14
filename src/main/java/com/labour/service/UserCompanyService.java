package com.labour.service;

import com.labour.entity.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserCompanyService {

    Result selectEntryApproval(String company_id, String page);

    Result selectRaApproval(String company_id, String page);

    Result selectAdvanceApproval(String company_id, String page);

}
