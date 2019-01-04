package com.policy.service;

import java.sql.SQLException;

import com.policy.bean.PolicyBean;
import com.policy.dao.IPolicyDao;
import com.policy.dao.PolicyDaoImpl;

public class PolicyServiceImpl implements PolicyService
{

	IPolicyDao ipolicyDao = new PolicyDaoImpl();
	
	@Override
	public PolicyBean ViewPolicy() throws SQLException 
	{
		
		PolicyBean policyBean = ipolicyDao.ViewPolicy();
		return policyBean;
	}

}
