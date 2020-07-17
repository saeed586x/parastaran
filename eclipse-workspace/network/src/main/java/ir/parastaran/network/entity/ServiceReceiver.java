	package ir.parastaran.network.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class ServiceReceiver extends ServiceMan {
	
	//private ServiceType serviceType;
	private List<ServiceProvider> serviceProviders;

}
