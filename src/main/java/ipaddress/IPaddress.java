package ipaddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IPaddress {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the first IP: ");
		String firstIP = reader.readLine();
		long i = ipToLong(firstIP);

		System.out.println("Enter the second IP: ");
		String secondIP = reader.readLine();
		long j = ipToLong(secondIP);

	}

	public static long ipToLong(String ip) {

		String[] ipSplit = ip.split("\\.");
		return ((Long.parseLong(ipSplit[0]) << 24)) +
				((Long.parseLong(ipSplit[1]) << 16)) +
				((Long.parseLong(ipSplit[2]) << 8)) +
				(Long.parseLong(ipSplit[3]));

	}
}