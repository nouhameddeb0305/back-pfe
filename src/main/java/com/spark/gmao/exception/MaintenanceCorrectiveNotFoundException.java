package com.spark.gmao.exception;

public class MaintenanceCorrectiveNotFoundException extends DataNotFoundException{
	
private static final long serialVersionUID = -585393677381609541L;
	
	/**
	 * Exception code
	 */
	private static final String code = "ERROR_NF_001";
	
	/**
	 * Exception message
	 */
	private static final String message = "Maintenance Préventive not found";
	
	/**
	 * 
	 * @param code
	 * @param message
	 */
	public MaintenanceCorrectiveNotFoundException() {
		// TODO Auto-generated constructor stub
		super(code, message);
	}
	

}
