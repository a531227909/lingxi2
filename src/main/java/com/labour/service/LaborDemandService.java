package com.labour.service;

import com.labour.entity.Result;
import com.labour.model.LaborDemand;
import com.labour.model.PagesResult;

public interface LaborDemandService {

    Result insertLaborDemand(LaborDemand laborDemand);

    Result updateLaborDemand(LaborDemand laborDemand);

    Result updateBusinessPrice(LaborDemand laborDemand);

    Result selectOneLaborDemand(String laborDemandId);

    Result selectResident(String company_id, String user_type_id);

    Result selectThirdParty(String company_type_id, String parentId);

    Result deleteLaborDemand(String laborDemandId);

    PagesResult selectLDByFactor(String company_id, String usingCompanyId, String salaryTypeId, String status, String page);

    Result updateStatus(String status, String laborDemandId);

}
