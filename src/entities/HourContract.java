package entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class HourContract {
    private LocalDate date;
    private double valuesPerHours;
    private LocalTime hours;
    private LocalTime duration;
    public HourContract(){

    }
    public HourContract(LocalDate date, double valuesPerHours, LocalTime hours) {
        this.date = date;
        this.valuesPerHours = valuesPerHours;
        this.hours = hours;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValuesPerHours() {
        return valuesPerHours;
    }

    public void setValuesPerHours(double valuesPerHours) {
        this.valuesPerHours = valuesPerHours;
    }

    public LocalTime getHours() {
        return hours;
    }

    public void setHours(LocalTime hours) {
        this.hours = hours;
    }
    public double totalHours(){
        return 0;
    }

    @Override
    public String toString() {
        return "HourContract{" +
                "date=" + date +
                ", valuesPerHours=" + valuesPerHours +
                ", hours=" + hours +
                ", duration=" + duration +
                '}';
    }
}
