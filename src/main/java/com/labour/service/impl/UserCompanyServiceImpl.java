package com.labour.service.impl;

import com.labour.service.UserCompanyService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;


@Service
public class UserCompanyServiceImpl extends ApplicationObjectSupport implements UserCompanyService {

    private static Logger logger = LogManager.getLogger("org.springframework");

}
