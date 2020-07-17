package ir.parastaran.network.entity;

import java.util.List;

import javax.persistence.Entity;

import ir.parastaran.network.constant.Degree;
@Entity
public class ServiceProvider extends ServiceMan {
	
	private Education education;
	private Degree degree;
	private WorkExperiance workExperiance;
	private ServiceReceiver serviceReceivers;
	private List<Service> service;
	private List<BankAccount> bankAccount;
	
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	public Degree getDegree() {
		return degree;
	}
	public void setDegree(Degree degree) {
		this.degree = degree;
	}
	public WorkExperiance getWorkExperiance() {
		return workExperiance;
	}
	public void setWorkExperiance(WorkExperiance workExperiance) {
		this.workExperiance = workExperiance;
	}
	public ServiceReceiver getServiceReceivers() {
		return serviceReceivers;
	}
	public void setServiceReceivers(ServiceReceiver serviceReceivers) {
		this.serviceReceivers = serviceReceivers;
	}
	public List<Service> getService() {
		return service;
	}
	public void setService(List<Service> service) {
		this.service = service;
	}
	public List<BankAccount> getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(List<BankAccount> bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	
}
