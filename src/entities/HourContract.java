package entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class HourContract {
    private LocalDate date;
    private double valuesPerHours;
    private LocalTime duration;
    public HourContract(){

    }
    public HourContract(LocalDate date, double valuesPerHours, LocalTime duration) {
        this.date = date;
        this.valuesPerHours = valuesPerHours;
        this.duration = duration;
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

    public double totalHours(){
        return 0;
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
