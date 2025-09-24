package org.example.Comparable;

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized int compareTo(Beach other) {
        int one = 0;
        int two = 0;
        float res = this.distance - other.distance;
        if(res > 0){
            two++;
        }
        else if(res < 0){
            one++;
        }
        int res2 = this.quality - other.quality;
        if(res2 > 0){
            one++;
        }
        else if(res2 < 0){
            two++;
        }
        return one - two;

    }



    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }
}

