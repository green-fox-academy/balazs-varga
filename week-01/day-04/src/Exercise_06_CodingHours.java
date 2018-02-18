public class Exercise_06_CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        double attendeeHours = 6.;
        double semesterPeriodWeek = 17.;
        double workHoursWeekly = 52.;

        double attendeeCodingPercentage = (int) (100 * (((attendeeHours * (semesterPeriodWeek * 5)) / (semesterPeriodWeek * workHoursWeekly))));

        System.out.println("Attendee spends " + (attendeeHours * (semesterPeriodWeek * 5)) + " hours with coding in a semester.");
        System.out.println("Attendee's percentage of coding hours is " + attendeeCodingPercentage + "%");
    }
}
