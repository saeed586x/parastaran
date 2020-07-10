package ir.parastaran.entity;

import java.util.Date;
import java.util.List;

import ir.parastaran.constant.Degree;

public class ServiceProvider extends ServicePeople {
	
	private Education education;
	private Degree degree;
	private WorkExperiance workExperiance;
	private ServiceReceiver serviceReceivers;
	private List<Service> service;
	private List<BankAccount> bankAccount;
}
