package com.policy.ui;

import java.util.Scanner;

import com.policy.bean.PolicyBean;
import com.policy.service.PolicyService;
import com.policy.service.PolicyServiceImpl;

public class PolicyClient
{
	static Scanner scanner = new Scanner(System.in);
	static PolicyService policyService = null;
	static PolicyServiceImpl policyServiceImpl = null;
	
	public static void main(String[] args)
	{
		PolicyBean policyBean = null;
		long policy_number = 0;
		
		System.out.println("Enter the Policy No. :");
		policy_number = scanner.nextInt();
		
		try
		{
			policyBean = new PolicyBean();
			policyService = new PolicyServiceImpl();
			policyServiceImpl = new PolicyServiceImpl();
			
			if(!(policyBean.getPolicy_premium()==0))
			{
			
				System.out.println(policyBean);
			}
			else
				
				System.out.println("Sorry no policy found!! ");
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
