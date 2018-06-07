package test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class UnixTimeStampConverter {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee,d MMM yyyy h:mm:ss a zzzz");
		long unixTime = System.currentTimeMillis()/1000;
		String formattedDtm = Instant.ofEpochSecond(unixTime).atZone(ZoneId.of("GMT-4")).format(formatter);
		System.out.println(formattedDtm);
	}
}
