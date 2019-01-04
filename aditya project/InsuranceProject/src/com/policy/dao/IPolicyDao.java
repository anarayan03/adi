package com.policy.dao;

import java.sql.SQLException;

import com.policy.bean.PolicyBean;

public interface IPolicyDao {
	public PolicyBean ViewPolicy() throws SQLException;
}
