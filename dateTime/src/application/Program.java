package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
//		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
//		LocalDate d01 = LocalDate.now();
//		LocalDateTime d02 = LocalDateTime.now();
//		Instant d03 = Instant.now();
//		
//		LocalDate d04 = LocalDate.parse("2024-05-02");
//		LocalDateTime d05 = LocalDateTime.parse("2024-05-02T01:30:26");
//		Instant d06 = Instant.parse("2024-05-02T01:30:26Z");
//		
//		Instant d07 = Instant.parse("2024-05-02T01:30:26-03:00");
//		
//		LocalDate d08 = LocalDate.parse("02/05/2024", fmt1);
//		LocalDateTime d09 = LocalDateTime.parse("02/05/2024 01:30", fmt2);
//		
//		LocalDate d10 = LocalDate.of(2024, 05, 02);
//		LocalDateTime d11 = LocalDateTime.of(2024, 05, 02, 01, 30);
		
//		System.out.println("d01 = " + d01.toString());
//		System.out.println("d02 = " + d02.toString());
//		System.out.println("d03 = " + d03.toString());
//		
//		System.out.println("d04 = " + d04.format(fmt1));
//		System.out.println("d05 = " + fmt2.format(d05) );
//		System.out.println("d06 = " + d06.toString());
//		System.out.println("d07 = " + d07.toString());
//		
//		System.out.println("d08 = " + d08.toString());
//		System.out.println("d09 = " + d09.toString());
//		
//		System.out.println("d10 = " + d10.toString());
//		System.out.println("d11 = " + d11.toString());
		
// ----------------------------------------------------------------------------------------------
		
//		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
//		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
//		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
//		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
//
//		System.out.println("r1 = " + r1);
//		System.out.println("r2 = " + r2);
//		System.out.println("r3 = " + r3);
//		System.out.println("r4 = " + r4);
//		
//		System.out.println("d04 dia = " + d04.getDayOfMonth());
//		System.out.println("d04 mes = " + d04.getMonthValue());
//		System.out.println("d04 ano = " + d04.getYear());
//		
//		System.out.println("d05 hora = " + d05.getHour());
//		System.out.println("d05 minuto = " + d05.getMinute());
		
// ----------------------------------------------------------------------------------------------
		
//		LocalDate pastWeekLocalDate = d04.minusDays(7);
//		LocalDate nextWeekLocalDate = d04.plusDays(7);
//		
//		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
//		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
//		
//		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
//		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
//		
//		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
//		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
//		
//		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
//		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
//		
//		System.out.println("pastWeekInstant = " + pastWeekInstant);
//		System.out.println("nextWeekInstant = " + nextWeekInstant);
//		
// ----------------------------------------------------------------------------------------------		
		
//		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
//		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
//		Duration t3 = Duration.between(pastWeekInstant, d06);
//		
//		System.out.println("t1 dias = " + t1.toDays());
//		System.out.println("t1 dias = " + t1.toDays());
//		System.out.println("t3 dias = " + t3.toDays());
		
// ----------------------------------------------------------------------------------------------
//		
//		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		
//		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
//		
//		
//		Date x1 = new Date();
//		Date x2 = new Date(System.currentTimeMillis());
//		Date x3 = new Date(0L);
//		Date x4 = new Date(1000L * 60L * 60L * 5L);
//		
//		Date y1 = sdf1.parse("25/06/2018");
//		Date y2 = sdf2.parse("25/06/2018 15:42:07");
//		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
//		
//		System.out.println("x1: " + x1);
//		System.out.println("x2: " + x2);
//		System.out.println("x3: " + x3);
//		System.out.println("x4: " + x4);
//		
//		System.out.println();
//		
//		System.out.println("y1: " + y1);
//		System.out.println("y2: " + y2);
//		System.out.println("y3: " + y3);
//		
//		System.out.println("-----------------------------------");
//		
//		System.out.println("x1: " + sdf2.format(x1));
//		System.out.println("x2: " + sdf2.format(x2));
//		System.out.println("x3: " + sdf2.format(x3));
//		System.out.println("x4: " + sdf2.format(x4));
//		
//		System.out.println();
//		
//		System.out.println("y1: " + sdf2.format(y1));
//		System.out.println("y2: " + sdf2.format(y2));
//		System.out.println("y3: " + sdf2.format(y3));
//		
//		System.out.println("-----------------------------------");
//		
//		System.out.println("x1: " + sdf3.format(x1));
//		System.out.println("x2: " + sdf3.format(x2));
//		System.out.println("x3: " + sdf3.format(x3));
//		System.out.println("x4: " + sdf3.format(x4));
//		
//		System.out.println();
//		
//		System.out.println("y1: " + sdf3.format(y1));
//		System.out.println("y2: " + sdf3.format(y2));
//		System.out.println("y3: " + sdf3.format(y3));
		
	
//	-------------------------------------------------------------------
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		int minutes = cal.get(Calendar.MINUTE);
		int month =  1 + cal.get(Calendar.MONTH);
		
		
		System.out.println(sdf.format(d));
		
		
		
		
	}

}
