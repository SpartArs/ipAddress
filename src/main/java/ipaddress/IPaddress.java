package ipaddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IPaddress {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String firstIP;
		String secondIP;
		long i = 0;
		long j = 0;

		IPValidator ipValidator = new IPValidator();

		System.out.println("Enter the first IP: ");
		while (true) {
			firstIP = reader.readLine();
			boolean firstIPvalidate = ipValidator.validate(firstIP);
			if (firstIPvalidate) {
				i = ParseIP.ipToLong(firstIP);
				break;
			} else {
				System.out.println("Invalid IP address!!!\nPlease enter the first address again: ");
			}
		}

		System.out.println("Enter the second IP: ");
		while (true) {
			secondIP = reader.readLine();
			boolean secondIPvalidate = ipValidator.validate(secondIP);
			if (secondIPvalidate) {
				j = ParseIP.ipToLong(secondIP);
				break;
			} else {
				System.out.println("Invalid IP address!!!\nPlease enter the second address again: ");
			}
		}

		System.out.println("Required IP addresses: ");
		while (i < j - 1) {
			i++;
			System.out.println(ParseIP.longToIp(i));
		}
	}
}