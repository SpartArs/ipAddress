package ipaddress;

public class ParseIP {
	
	public static long ipToLong(String ip) {

		String[] ipSplit = ip.split("\\.");
		return ((Long.parseLong(ipSplit[0]) << 24)) +
				((Long.parseLong(ipSplit[1]) << 16)) +
				((Long.parseLong(ipSplit[2]) << 8)) +
				(Long.parseLong(ipSplit[3]));
	}

	public static String longToIp(long longIp) {

		return ((longIp >> 24) & 0xFF) + "." + 
		((longIp >> 16) & 0xFF) + "." + 
		((longIp >> 8) & 0xFF) + "." + 
		(longIp & 0xFF);
	}
}
