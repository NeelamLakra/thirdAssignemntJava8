package edu.knoldus;

import org.junit.Test;
import java.time.DayOfWeek;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

import static java.time.DayOfWeek.*;
import static junit.framework.TestCase.assertEquals;

public class DateApplicationTest {

    String myBirthDay = "1994-11-21";
    //String zone = "America/New_York";
    List<DayOfWeek> expectedDays = Arrays.asList(MONDAY, TUESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, FRIDAY, SATURDAY, SUNDAY, MONDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, MONDAY, TUESDAY, WEDNESDAY);
    Long expectedLife = 2471731200L;
    List<Integer> expectedList = Arrays.asList(1992, 1996, 2000, 2004, 2008, 2012, 2016);
    //ZonedDateTime expectedtime = ZonedDateTime.now(ZoneId.of("America/New_York"));

    @Test
    public final void Test() {

        List<DayOfWeek> actualDays = DateApplication.getDaysOfBirthday(myBirthDay);
        List<Integer> actualList = DateApplication.findingLeapYear();
        Long actuallife = DateApplication.mahtmaGandhiLivedInSeconds();
       // ZonedDateTime actualtime = DateApplication.getTimeZoneValue(zone);
        assertEquals("It will give the list of days", expectedDays, actualDays);
        assertEquals("It will give the List of Leapyear", expectedList, actualList);
        assertEquals("It will give the survival duration of mhatma gandhi in seconds", expectedLife, actuallife);
        //assertEquals("It should return the time", expectedtime, actualtime);
    }

}
