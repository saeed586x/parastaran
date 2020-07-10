package ir.parastaran.network.entity;

import java.util.Date;
import java.util.List;

import ir.parastaran.network.constant.Degree;

public class ServiceProvider extends ServicePeople {
	
	private Education education;
	private Degree degree;
	private WorkExperiance workExperiance;
	private ServiceReceiver serviceReceivers;
	private List<Service> service;
	private List<BankAccount> bankAccount;
}
