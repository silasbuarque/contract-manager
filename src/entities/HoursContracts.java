package entities;

import java.util.Date;

public class HoursContracts {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HoursContracts(){
    }

    public HoursContracts(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public Date setDate() {
        this.date = date;
        return date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }

}
