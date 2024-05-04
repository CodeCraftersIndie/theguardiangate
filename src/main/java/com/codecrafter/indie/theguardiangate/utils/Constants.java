package com.codecrafter.indie.theguardiangate.utils;

public class Constants
{
	private Constants() {
		throw new IllegalStateException("Constants class");
	}
	
	
	
	// Response status values
	public static final String OK = "OK";
	public static final String KO = "KO";
	public static final String BAD_REQUEST_VALUES = "400";
	
	

	
	// Error descriptions (common)
	public static final String INTERNAL_SERVER_ERROR = "Internal Server Error";
	public static final String INTERNAL_SERVER_ERROR_CODE = "500";
	public static final String BAD_REQUEST = "Bad Request";
	
	
	
	//DATE
	public static final String FORMAT_YYYYMMDDHHMMSSSSSSSSSSSS = "yyyyMMddHHmmssSSSSSSSSSS";
	public static final String FORMAT_YYYYMMDDHHMMSS_SSS = "yyyyMMddHHmmssSSS";
	public static final String FORMAT_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
	public static final String FORMAT_YYYYMMDD = "yyyyMMdd";
	public static final String FORMAT_YYYYMM = "yyyyMM";

	
	public static final String FORMAT_YYYY_MM_DD_HH_MM_SS_SSS = "yyyy-MM-dd- HH:mm:ss.SSS";
	public static final String FORMAT_YYYYSLMMSLDD_HH_MM_SS_SSS = "yyyy/MM/dd- HH:mm:ss.SSS";
	public static final String FORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	public static final String FORMAT_YYYY_MM_DD_HH_MM_SS_S = "yyyy-MM-dd HH:mm:ss.s";
	public static final String FORMAT_YYYYSLMMSLDD_HH_MM_SS = "yyyy/MM/dd HH:mm:ss";
	public static final String FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
	public static final String FORMAT_YYYYSLMMSLDD = "yyyy/MM/dd";

	
	public static final String FORMAT_DD_MM_YYYY = "dd-MM-yyyy";
	public static final String FORMAT_DDSLMMSLYYYY = "dd/MM/yyyy";
	public static final String FORMAT_DDMMYYYY = "ddMMyyyy";

	public static final String FORMAT_MMSLYYYY = "MM/yyyy";
	public static final String FORMAT_MMYYYY = "MMyyyy";

	
	//JWT
	
	public static final String UNAUTHORIZED_ERROR = "401";
	public static final String UNAUTHORIZED_DESCRIPTION = "Unauthorized Error";
	
	

	public static final String FALSE = "false";
	public static final String TRUE = "true";
	public static final String BAD_REQUEST_CODE = "400";

	
	public static final String FORMAT_YYYY_MM_DDT_HH_MM_SSZ = "yyyy-MM-dd'T'HH:mm:ss'Z'";


}
