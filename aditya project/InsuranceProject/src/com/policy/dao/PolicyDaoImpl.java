package com.policy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.policy.bean.PolicyBean;
import com.policy.util.DbConnection;

public class PolicyDaoImpl implements IPolicyDao
{

	int policy_number = 0;
	@Override
	public PolicyBean ViewPolicy() throws SQLException
	{
		Connection connection = DbConnection.getConnection();
		PolicyBean policyBean = new PolicyBean();
		
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		preparedStatement = connection.prepareStatement(QueryMapper.EXECUTE_QUERY);
		preparedStatement.setLong(1, policy_number);
		resultSet = preparedStatement.executeQuery();
		
		try
		{
			while(resultSet.next())
			{
				
			}
		}catch (Exception e)
		{
			// TODO: handle exception
		}
		
		return policyBean;
	}

}
