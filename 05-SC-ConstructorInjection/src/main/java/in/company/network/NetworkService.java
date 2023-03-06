package in.company.network;

import in.company.beans.NetworkAdaptor;

public class NetworkService
{
	private NetworkAdaptor networkAdaptor;
	
	
	public NetworkService(NetworkAdaptor networkAdaptor, String ipAddress) {
		super();
		this.networkAdaptor = networkAdaptor;
		this.ipAddress = ipAddress;
	}
	
	private String ipAddress;
		
	
	public void getServiceConn(String serviceName) {
		System.out.println("Hey !!!\n"+ serviceName + ""
				+ " is connected to "+networkAdaptor.getPortIp() +
				  " with ip address "+ ipAddress);
	}
	
	public void getServiceDisConn(String serviceName) {
		System.out.println("OOPS !!!\n"+ serviceName + ""
				+ " is disconnected to "+networkAdaptor.getPortIp() +
				  " with ip address "+ ipAddress);
	}
}
