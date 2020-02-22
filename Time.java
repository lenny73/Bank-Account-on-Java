package com.Leonid;

public class Time {
    private int hour;
    private int minute;
    private double second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        }
    public int getHour() { return this.hour; }
    public int getMinute() { return this.minute; }
    public double getSecond() { return this.second; }


    public void setHour(int hour) {
        this.hour = hour+=20; }
    public void setMinute(int minute) {
        this.minute = minute; }
    public void setSecond(int second) {
        this.second = second; }
        public boolean equal(Time c){
        if(this.getHour()==c.getHour()&&this.minute==c.minute&&
                this.second==c.second)return true;
        else return false;
        }

    public String toString(){
        return ""+getHour()+""+getMinute()+""+getSecond();
    }

    public static void main(String[] args) {
        Time time = new Time(11, 59, 59.9);
        time.setHour(34);
        System.out.println();
        System.out.println(time);
    }
}
