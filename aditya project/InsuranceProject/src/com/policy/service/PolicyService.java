package com.policy.service;

import java.sql.SQLException;

import com.policy.bean.PolicyBean;

public interface PolicyService
{
	public PolicyBean ViewPolicy() throws SQLException;
}
