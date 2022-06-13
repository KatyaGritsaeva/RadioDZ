package com.gritsaeva;

public class RadioMain {
// currentVolume;
    public void increaseVolume() {
        int currentVolume = 0;
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        else currentVolume = currentVolume;
    }

    public void RadioStationNumber() {
        int currentstation = 0;
        if (currentstation < 9) {
            currentstation = currentstation + 1;
        }
        else currentstation = currentstation;
    }
}
