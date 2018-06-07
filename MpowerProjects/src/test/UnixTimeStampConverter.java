package test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class UnixTimeStampConverter {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee,d MMM yyyy H:mm:ss zzzz");
		long unixTime = 1528373083;
		String formattedDtm = Instant.ofEpochSecond(unixTime).atZone(ZoneId.of("GMT+5")).format(formatter);
		System.out.println(formattedDtm);
	}
}
