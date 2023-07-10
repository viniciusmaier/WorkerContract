package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class HourContract {
    private Date date;
    private double valuesPerHours;
    private int duration;
    public HourContract(){

    }
    public HourContract(Date date, double valuesPerHours, int duration) {
        this.date = date;
        this.valuesPerHours = valuesPerHours;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuesPerHours() {
        return valuesPerHours;
    }

    public void setValuesPerHours(double valuesPerHours) {
        this.valuesPerHours = valuesPerHours;
    }

    public double totalHours(){
        return getValuesPerHours() * getDuration();
    }

    @Override
    public String toString() {
        return "HourContract{" +
                "date=" + date +
                ", valuesPerHours=" + valuesPerHours +
                ", duration=" + duration +
                '}';
    }
}
