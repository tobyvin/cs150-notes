
// File: Hourly.java

import java.util.Objects;

public class Hourly extends Employee {
    protected double hoursPerWeek;
    protected double payPerHour;

    public Hourly() {
        this(0, "na", "Na", 0.0, 0.0);
    }// end Hourly()

    public Hourly(int sid, String first, String last, double hoursPerWeek, double payPerHour) {
        super(sid, first, last);
        setHoursPerWeek(hoursPerWeek);
        setPayPerHour(payPerHour);
    }// end Hourly()

    public final double getHoursPerWeek() {
        return hoursPerWeek;
    }// end getHoursPerWeek()

    public final double getPayPerHour() {
        return payPerHour;
    }// end getPayPerHour()

    public final void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }// end setHoursePerWeek()

    public final void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }// end setPayPerHour()

    @Override
    public double paycheck() {
        return hoursPerWeek * payPerHour;
    }// end paycheck()

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }

        Hourly that = (Hourly) o;

        return Objects.equals(this.hoursPerWeek, that.hoursPerWeek) && Objects.equals(this.payPerHour, that.payPerHour);
    }

    @Override
    public String toString() {
        String str = "";

        str += String.format("%s[%.1f, $%.2f][paycheck: $%.2f]", super.toString(), hoursPerWeek, payPerHour,
                paycheck());

        return str;
    }// end toString()

}// end Hourly
