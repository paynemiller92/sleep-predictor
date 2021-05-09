package model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.csv.CSVRecord;

public class Response {
  @Getter
  @Setter
  private int age;

  @Getter
  @Setter
  private int doesHouseholdContainMiddleAgedAdults;

  @Getter
  @Setter
  private int employmentStatus; // TODO: make an enum to hold this value.

  @Getter
  @Setter
  private int gender; // TODO: make an enum to hold this value.

  @Getter
  @Setter
  private String stateOfResidence;

  @Getter
  @Setter
  private int weekdayBedtime;

  @Getter
  @Setter
  private int weekdayWakeUpTime;

  @Getter
  @Setter
  private int weekendBedtime;

  @Getter
  @Setter
  private int weekendWakeUpTime;

  @Getter
  @Setter
  private int averageHoursOfSleepPerWeekday;

  @Getter
  @Setter
  private int averageHoursOfSleepPerWeekendDay;

  @Getter
  @Setter
  private int numberOfWeekdayNapsWithinPastTwoWeeks;

  @Getter
  @Setter
  private int averageWeekdayNapInMinutes;

  @Getter
  @Setter
  private int numberOfWeekendNapsWithinPastTwoWeeks;

  @Getter
  @Setter
  private int averageWeekendNapInMinutes;

  @Getter
  @Setter
  private int weekdayFrequencyOfGoodNightsSleep; // TODO: use enum

  @Getter
  @Setter
  private int weekendFrequencyOfGoodNightsSleep; // TODO: use enum

  @Getter
  @Setter
  private int chanceOfDozingWhileReading; // TODO: use enum

  @Getter
  @Setter
  private int chanceOfDozingWhileWatchingTelevision; // TODO: use enum

  @Getter
  @Setter
  private int chancesOfDozingWhileDriving; // TODO: use enum

  @Getter
  @Setter
  private int chancesOfDozingWhileRidingAsPassenger; // TODO: use num

  @Getter
  @Setter
  private int chancesOfDozingDuringConversation; // TODO: use enum

  @Getter
  @Setter
  private int chancesOfDozingAfterLunch; // TODO: use enum

  @Getter
  @Setter
  private int chancesOfDozingWhileLayingDown; // TODO: use enum

  @Getter
  @Setter
  private int optimalHoursOfSleep; // TODO: use enum

  @Getter
  @Setter
  private int q15;

  @Getter
  @Setter
  private int q16a;

  @Getter
  @Setter
  private int q16c;

  @Getter
  @Setter
  private int q16d;

  @Getter
  @Setter
  private int q16e;

  @Getter
  @Setter
  private int q16f;

  @Getter
  @Setter
  private int q17;

  @Getter
  @Setter
  private int q18;

  @Getter
  @Setter
  private int q19a;

  @Getter
  @Setter
  private int q19b;

  @Getter
  @Setter
  private int q19c;

  @Getter
  @Setter
  private int q19d;

  @Getter
  @Setter
  private int q20;

  @Getter
  @Setter
  private int q21;

  @Getter
  @Setter
  private int q22;

  @Getter
  @Setter
  private int q23;

  @Getter
  @Setter
  private int q24;

  @Getter
  @Setter
  private int q25;

  @Getter
  @Setter
  private int q26;

  @Getter
  @Setter
  private int q27;

  @Getter
  @Setter
  private int numberOfDrinksConsumed;

  @Getter
  @Setter
  private int q29a;

  @Getter
  @Setter
  private int q29b;

  @Getter
  @Setter
  private int q29c;

  @Getter
  @Setter
  private int q30;

  @Getter
  @Setter
  private int q31;

  @Getter
  @Setter
  private int q32;

  @Getter
  @Setter
  private int q33;

  @Getter
  @Setter
  private int q33a;

  @Getter
  @Setter
  private int q34;

  @Getter
  @Setter
  private int q35;

  @Getter
  @Setter
  private int q36;

  @Getter
  @Setter
  private int q3701;

  @Getter
  @Setter
  private int q3702;

  @Getter
  @Setter
  private int q3703;

  @Getter
  @Setter
  private int averageHoursOfModerateExercisePerWeekday;

  @Getter
  @Setter
  private int q3901;

  @Getter
  @Setter
  private int q3902;

  @Getter
  @Setter
  private int q3903;

  @Getter
  @Setter
  private int q40;

  @Getter
  @Setter
  private int q4101;

  @Getter
  @Setter
  private int q4102;

  @Getter
  @Setter
  private int q4103;

  @Getter
  @Setter
  private int q4104;

  @Getter
  @Setter
  private int q42;

  @Getter
  @Setter
  private int q43a;

  @Getter
  @Setter
  private int minutesOfComputerTime;

  @Getter
  @Setter
  private int q43c;

  @Getter
  @Setter
  private int q43d;

  @Getter
  @Setter
  private int q43e;

  @Getter
  @Setter
  private int q43f;

  @Getter
  @Setter
  private int q43g;

  @Getter
  @Setter
  private int q4401;

  @Getter
  @Setter
  private int q4402;

  @Getter
  @Setter
  private int q4403;

  @Getter
  @Setter
  private int q4404;

  @Getter
  @Setter
  private int q45;

  @Getter
  @Setter
  private int q46;

  @Getter
  @Setter
  private int q47;

  @Getter
  @Setter
  private int q48;

  @Getter
  @Setter
  private int q49;

  @Getter
  @Setter
  private int q50;

  @Getter
  @Setter
  private int q51;

  @Getter
  @Setter
  private int q52a;

  @Getter
  @Setter
  private int q53;

  @Getter
  @Setter
  private int q54;

  @Getter
  @Setter
  private int q55;

  @Getter
  @Setter
  private int q56;

  @Getter
  @Setter
  private int q5701;

  @Getter
  @Setter
  private int q5702;

  @Getter
  @Setter
  private int q5703;

  @Getter
  @Setter
  private int q5704;

  @Getter
  @Setter
  private int q5705;

  @Getter
  @Setter
  private int q5706;

  @Getter
  @Setter
  private int q5707;

  @Getter
  @Setter
  private int q5708;

  @Getter
  @Setter
  private int q5709;

  @Getter
  @Setter
  private int q58;
  

  public static Response fromCsvRecord(CSVRecord record) {
    Response response = new Response();
    response.setAge(readInteger(record, Field.AGE, DefaultValue.AGE));
    response.setDoesHouseholdContainMiddleAgedAdults(readInteger(record, Field.QS1, DefaultValue.QS1));
    response.setEmploymentStatus(readInteger(record, Field.WEEKDAY_AWAKE_TIME, DefaultValue.QS2));
    response.setGender(readInteger(record, Field.QS3, DefaultValue.QS3));
    response.setStateOfResidence(readString(record, Field.QS4, DefaultValue.QS4));
    response.setWeekdayBedtime(readInteger(record, Field.WEEKDAY_BEDTIME, DefaultValue.WEEKDAY_BEDTIME));
    response.setWeekdayWakeUpTime(readInteger(record, Field.Q2, DefaultValue.WEEK_DAY_AWAKE_TIME));
    response.setWeekendBedtime(readInteger(record, Field.Q3, DefaultValue.Q3));
    response.setWeekendWakeUpTime(readInteger(record, Field.Q4, DefaultValue.Q4));
    response.setAverageHoursOfSleepPerWeekday(readInteger(record, Field.Q5, DefaultValue.Q5));
    response.setAverageHoursOfSleepPerWeekendDay(readInteger(record, Field.Q6, DefaultValue.Q6));
    response.setNumberOfWeekdayNapsWithinPastTwoWeeks(readInteger(record, Field.Q7, DefaultValue.Q7));
    response.setAverageWeekdayNapInMinutes(readInteger(record, Field.Q8, DefaultValue.Q8));
    response.setNumberOfWeekendNapsWithinPastTwoWeeks(readInteger(record, Field.Q9, DefaultValue.Q9));
    response.setAverageWeekendNapInMinutes(readInteger(record, Field.Q10, DefaultValue.Q10));
    response.setWeekdayFrequencyOfGoodNightsSleep(readInteger(record, Field.Q11, DefaultValue.Q11));
    response.setWeekendFrequencyOfGoodNightsSleep(readInteger(record, Field.Q12, DefaultValue.Q12));
    response.setChanceOfDozingWhileReading(readInteger(record, Field.Q13a, DefaultValue.Q13a));
    response.setChanceOfDozingWhileWatchingTelevision(readInteger(record, Field.Q13b, DefaultValue.Q13b));
    response.setChancesOfDozingWhileDriving(readInteger(record, Field.Q13c, DefaultValue.Q13c));
    response.setChancesOfDozingWhileRidingAsPassenger(readInteger(record, Field.Q13d, DefaultValue.Q13d));
    response.setChancesOfDozingDuringConversation(readInteger(record, Field.Q13e, DefaultValue.Q13e));
    response.setChancesOfDozingAfterLunch(readInteger(record, Field.Q13f, DefaultValue.Q13f));
    response.setChancesOfDozingWhileLayingDown(readInteger(record, Field.Q13g, DefaultValue.Q13g));
    response.setOptimalHoursOfSleep(readInteger(record, Field.Q14, DefaultValue.Q14));
    response.setQ15(readInteger(record, Field.Q15, DefaultValue.Q15));
    response.setQ16a(readInteger(record, Field.Q16a, DefaultValue.Q16a));
    response.setQ16c(readInteger(record, Field.Q16c, DefaultValue.Q16c));
    response.setQ16d(readInteger(record, Field.Q16d, DefaultValue.Q16d));
    response.setQ16e(readInteger(record, Field.Q16e, DefaultValue.Q16e));
    response.setQ16f(readInteger(record, Field.Q16f, DefaultValue.Q16f));
    response.setQ17(readInteger(record, Field.Q17, DefaultValue.Q17));
    response.setQ18(readInteger(record, Field.Q18, DefaultValue.Q18));
    response.setQ19a(readInteger(record, Field.Q19a, DefaultValue.Q19a));
    response.setQ19b(readInteger(record, Field.Q19b, DefaultValue.Q19b));
    response.setQ19c(readInteger(record, Field.Q19c, DefaultValue.Q19c));
    response.setQ19d(readInteger(record, Field.Q19d, DefaultValue.Q19d));
    response.setQ20(readInteger(record, Field.Q20, DefaultValue.Q20));
    response.setQ21(readInteger(record, Field.Q21, DefaultValue.Q21));
    response.setQ22(readInteger(record, Field.Q22, DefaultValue.Q22));
    response.setQ23(readInteger(record, Field.Q23, DefaultValue.Q23));
    response.setQ24(readInteger(record, Field.Q24, DefaultValue.Q24));
    response.setQ25(readInteger(record, Field.Q25, DefaultValue.Q25));
    response.setQ26(readInteger(record, Field.Q26, DefaultValue.Q26));
    response.setQ27(readInteger(record, Field.Q27, DefaultValue.Q27));
    response.setNumberOfDrinksConsumed(readInteger(record, Field.Q28, DefaultValue.Q28));
    response.setQ29a(readInteger(record, Field.Q29a, DefaultValue.Q29a));
    response.setQ29b(readInteger(record, Field.Q29b, DefaultValue.Q29b));
    response.setQ29c(readInteger(record, Field.Q29c, DefaultValue.Q29c));
    response.setQ30(readInteger(record, Field.Q30, DefaultValue.Q30));
    response.setQ31(readInteger(record, Field.Q31, DefaultValue.Q31));
    response.setQ32(readInteger(record, Field.Q32, DefaultValue.Q32));
    response.setQ33(readInteger(record, Field.Q33, DefaultValue.Q33));
    response.setQ33a(readInteger(record, Field.Q33a, DefaultValue.Q33a));
    response.setQ34(readInteger(record, Field.Q34, DefaultValue.Q34));
    response.setQ35(readInteger(record, Field.Q35, DefaultValue.Q35));
    response.setQ36(readInteger(record, Field.Q36, DefaultValue.Q36));
    response.setQ3701(readInteger(record, Field.Q3701, DefaultValue.Q3701));
    response.setQ3702(readInteger(record, Field.Q3702, DefaultValue.Q3702));
    response.setQ3703(readInteger(record, Field.Q3703, DefaultValue.Q3703));
    response.setAverageHoursOfModerateExercisePerWeekday(readInteger(record, Field.Q38, DefaultValue.Q38));
    response.setQ3901(readInteger(record, Field.Q3901, DefaultValue.Q3901));
    response.setQ3902(readInteger(record, Field.Q3902, DefaultValue.Q3902));
    response.setQ3903(readInteger(record, Field.Q3903, DefaultValue.Q3903));
    response.setQ40(readInteger(record, Field.Q40, DefaultValue.Q40));
    response.setQ4101(readInteger(record, Field.Q4101, DefaultValue.Q4101));
    response.setQ4102(readInteger(record, Field.Q4102, DefaultValue.Q4102));
    response.setQ4103(readInteger(record, Field.Q4103, DefaultValue.Q4103));
    response.setQ4104(readInteger(record, Field.Q4104, DefaultValue.Q4104));
    response.setQ42(readInteger(record, Field.Q42, DefaultValue.Q42));
    response.setQ43a(readInteger(record, Field.Q43a, DefaultValue.Q43a));
    response.setMinutesOfComputerTime(readInteger(record, Field.Q43b, DefaultValue.Q43b));
    response.setQ43c(readInteger(record, Field.Q43c, DefaultValue.Q43c));
    response.setQ43d(readInteger(record, Field.Q43d, DefaultValue.Q43d));
    response.setQ43e(readInteger(record, Field.Q43e, DefaultValue.Q43e));
    response.setQ43f(readInteger(record, Field.Q43f, DefaultValue.Q43f));
    response.setQ43g(readInteger(record, Field.Q43g, DefaultValue.Q43g));
    response.setQ4401(readInteger(record, Field.Q4401, DefaultValue.Q4401));
    response.setQ4402(readInteger(record, Field.Q4402, DefaultValue.Q4402));
    response.setQ4403(readInteger(record, Field.Q4403, DefaultValue.Q4403));
    response.setQ4404(readInteger(record, Field.Q4404, DefaultValue.Q4404));
    response.setQ45(readInteger(record, Field.Q45, DefaultValue.Q45));
    response.setQ46(readInteger(record, Field.Q46, DefaultValue.Q46));
    response.setQ47(readInteger(record, Field.Q47, DefaultValue.Q47));
    response.setQ48(readInteger(record, Field.Q48, DefaultValue.Q48));
    response.setQ49(readInteger(record, Field.Q49, DefaultValue.Q49));
    response.setQ50(readInteger(record, Field.Q50, DefaultValue.Q50));
    response.setQ51(readInteger(record, Field.Q51, DefaultValue.Q51));
    response.setQ52a(readInteger(record, Field.Q52a, DefaultValue.Q52a));
    response.setQ53(readInteger(record, Field.Q53, DefaultValue.Q53));
    response.setQ54(readInteger(record, Field.Q54, DefaultValue.Q54));
    response.setQ55(readInteger(record, Field.Q55, DefaultValue.Q55));
    response.setQ56(readInteger(record, Field.Q56, DefaultValue.Q56));
    response.setQ5701(readInteger(record, Field.Q5701, DefaultValue.Q5701));
    response.setQ5702(readInteger(record, Field.Q5702, DefaultValue.Q5702));
    response.setQ5703(readInteger(record, Field.Q5703, DefaultValue.Q5703));
    response.setQ5704(readInteger(record, Field.Q5704, DefaultValue.Q5704));
    response.setQ5705(readInteger(record, Field.Q5705, DefaultValue.Q5705));
    response.setQ5706(readInteger(record, Field.Q5706, DefaultValue.Q5706));
    response.setQ5707(readInteger(record, Field.Q5707, DefaultValue.Q5707));
    response.setQ5708(readInteger(record, Field.Q5708, DefaultValue.Q5708));
    response.setQ5709(readInteger(record, Field.Q5709, DefaultValue.Q5709));
    response.setQ58(readInteger(record, Field.Q58, DefaultValue.Q58));

    return response;
  }

  private static int readInteger(CSVRecord record, String fieldName, int defaultValue) {
    String recordStr = record.get(fieldName);
    recordStr = recordStr.replace(".000", "");
    int value = defaultValue;
    try {
      value = Integer.valueOf(recordStr.trim());
    } catch (NumberFormatException e) {
      // System.out.println("Invalid " + fieldName + " detected: ".concat(recordStr));
    }
    return value;
  }

  private static String readString(CSVRecord record, String fieldName, String defaultValue) {
    String recordStr = record.get(fieldName);
    return recordStr.isEmpty() ? recordStr : defaultValue;
  }

  private static class Field {
    public static final String Q58 = "q58";
    public static final String Q5709 = "q5709";
    public static final String Q5708 = "q5708";
    public static final String Q5707 = "q5707";
    public static final String Q5706 = "q5706";
    public static final String Q5705 = "q5705";
    public static final String Q5704 = "q5704";
    public static final String Q5703 = "q5703";
    public static final String Q5702 = "q5702";
    public static final String Q5701 = "q5701";
    public static final String Q56 = "q56";
    public static final String Q55 = "q55";
    public static final String Q54 = "q54";
    public static final String Q53 = "q53";
    public static final String Q52a = "q52a";
    public static final String Q51 = "q51";
    public static final String Q50 = "q50";
    public static final String Q49 = "q49";
    public static final String Q48 = "q48";
    public static final String Q47 = "q47";
    public static final String Q46 = "q46";
    public static final String Q45 = "q45";
    public static final String Q4404 = "q4404";
    public static final String Q4403 = "q4403";
    public static final String Q4402 = "q4402";
    public static final String Q4401 = "q4401";
    public static final String Q43g = "q43g";
    public static final String Q43f = "Q43F";
    public static final String Q43e = "Q43E";
    public static final String Q43d = "Q43D";
    public static final String Q43c = "Q43C";
    public static final String Q43b = "Q43B";
    public static final String Q43a = "Q43A";
    public static final String Q42 = "Q42";
    public static final String Q4104 = "q4104";
    public static final String Q4103 = "q4103";
    public static final String Q4102 = "q4102";
    public static final String Q4101 = "q4101";
    public static final String Q40 = "Q40";
    public static final String Q3903 = "q3903";
    public static final String Q3902 = "q3902";
    public static final String Q3901 = "q3901";
    public static final String Q38 = "Q38";
    public static final String Q3703 = "q3703";
    public static final String Q3702 = "q3702";
    public static final String Q3701 = "q3701";
    public static final String Q36 = "Q36";
    public static final String Q35 = "q35";
    public static final String Q34 = "q34";
    public static final String Q33a = "q33a";
    public static final String Q33 = "q33";
    public static final String Q32 = "q32";
    public static final String Q31 = "q31";
    public static final String Q30 = "q30";
    public static final String Q29c = "q29c";
    public static final String Q29b = "q29b";
    public static final String Q29a = "q29a";
    public static final String Q28 = "q28";
    public static final String Q27 = "q27";
    public static final String Q26 = "q26";
    public static final String Q25 = "q25";
    public static final String Q24 = "q24";
    public static final String Q23 = "q23";
    public static final String Q22 = "q22";
    public static final String Q21 = "q21";
    public static final String Q20 = "q20";
    public static final String Q19d = "q19d";
    public static final String Q19c = "q19c";
    public static final String Q19b = "q19b";
    public static final String Q19a = "q19a";
    public static final String Q18 = "q18";
    public static final String Q17 = "q17";
    public static final String Q16f = "q16f";
    public static final String Q16e = "q16e";
    public static final String Q16d = "q16d";
    public static final String Q16c = "q16c";
    public static final String Q16a = "q16a";
    public static final String Q15 = "q15";
    public static final String Q14 = "q14";
    public static final String Q13g = "q13g";
    public static final String Q13f = "q13f";
    public static final String Q13e = "q13e";
    public static final String Q13d = "q13d";
    public static final String Q13c = "q13c";
    public static final String Q13b = "q13b";
    public static final String Q13a = "q13a";
    public static final String Q12 = "q12";
    public static final String Q11 = "q11";
    public static final String Q10 = "q10";
    public static final String Q9 = "q9";
    public static final String Q8 = "q8";
    public static final String Q7 = "q7";
    public static final String Q6 = "Q6";
    public static final String Q5 = "Q5";
    public static final String Q4 = "q4";
    public static final String Q3 = "q3";
    public static final String Q2 = "q2";
    public static final String WEEKDAY_BEDTIME = "q1";
    public static final String QS4 = "qs4";
    public static final String QS3 = "qs3";
    public static final String WEEKDAY_AWAKE_TIME = "qs2";
    public static final String QS1 = "qs1";
    public static final String AGE = "age";
  }

  private static class DefaultValue {
    public static final int Q58 = 0;
    public static final int Q5709 = 0;
    public static final int Q5708 = 0;
    public static final int Q5707 = 0;
    public static final int Q5706 = 0;
    public static final int Q5705 = 0;
    public static final int Q5704 = 0;
    public static final int Q5703 = 0;
    public static final int Q5702 = 0;
    public static int Q5701;
    public static final int Q56 = 0;
    public static final int Q55 = 0;
    public static final int Q54 = 0;
    public static final int Q53 = 0;
    public static final int Q52a = 0;
    public static final int Q51 = 0;
    public static final int Q50 = 0;
    public static final int Q49 = 0;
    public static final int Q48 = 0;
    public static final int Q47 = 0;
    public static final int Q46 = 0;
    public static final int Q45 = 0;
    public static final int Q4404 = 0;
    public static final int Q4403 = 0;
    public static final int Q4402 = 0;
    public static final int Q4401 = 0;
    public static final int Q43g = 0;
    public static final int Q43f = 0;
    public static final int Q43e = 0;
    public static final int Q43d = 0;
    public static final int Q43c = 0;
    public static final int Q43b = 0;
    public static final int Q43a = 0;
    public static final int Q42 = 0;
    public static final int Q4104 = 0;
    public static final int Q4103 = 0;
    public static final int Q4102 = 0;
    public static final int Q4101 = 0;
    public static final int Q40 = 0;
    public static final int Q3903 = 0;
    public static final int Q3902 = 0;
    public static final int Q3901 = 0;
    public static final int Q38 = 0;
    public static final int Q3703 = 0;
    public static final int Q3702 = 0;
    public static final int Q3701 = 0;
    public static final int Q36 = 0;
    public static final int Q35 = 0;
    public static final int Q34 = 0;
    public static final int Q33a = 0;
    public static final int Q33 = 0;
    public static final int Q32 = 0;
    public static final int Q31 = 0;
    public static final int Q30 = 0;
    public static final int Q29c = 0;
    public static final int Q29b = 0;
    public static final int Q29a = 0;
    public static final int Q28 = 0;
    public static final int Q27 = 0;
    public static final int Q26 = 0;
    public static final int Q25 = 0;
    public static final int Q24 = 0;
    public static final int Q23 = 0;
    public static final int Q22 = 0;
    public static final int Q21 = 0;
    public static final int Q20 = 0;
    public static final int Q19d = 0;
    public static final int Q19c = 0;
    public static final int Q19b = 0;
    public static final int Q19a = 0;
    public static final int Q18 = 0;
    public static final int Q17 = 0;
    public static final int Q16f = 0;
    public static final int Q16e = 0;
    public static final int Q16d = 0;
    public static final int Q16c = 0;
    public static final int Q16a = 0;
    public static final int Q15 = 0;
    public static final int Q14 = 0;
    public static final int Q13g = 0;
    public static final int Q13f = 0;
    public static final int Q13e = 0;
    public static final int Q13d = 0;
    public static final int Q13c = 0;
    public static final int Q13b = 0;
    public static final int Q13a = 0;
    public static final int Q12 = 0;
    public static final int Q11 = 0;
    public static final int Q10 = 0;
    public static final int Q9 = 0;
    public static final int Q8 = 0;
    public static final int Q7 = 0;
    public static final int Q6 = 0;
    public static final int Q5 = 0;
    public static final int Q4 = 0;
    public static final int Q3 = 0;
    public static final int WEEK_DAY_AWAKE_TIME = 0;
    public static final int WEEKDAY_BEDTIME = 0;
    public static final String QS4 = "";
    public static final int QS3 = 0;
    public static final int QS2 = 0;
    public static final int QS1 = 0;
    public static final int AGE = 0;
  }
}
