package com.gritsaeva;

public class RadioMain {
    public int currentVolume;
    public int currentstation;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void lessMinVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentstation < 9) {
            currentstation++;
        } else {
            currentstation = 0;
        }
    }


    public void prewStation() {
        if (currentstation > 0) {
            currentstation--;
        } else {
            currentstation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentstation() {
        return currentstation;
    }

    public void setCurrentstation(int currentstation) {
        if (currentstation < 0) {
            return;
        }
        if (currentstation > 9) {
            return;
        }
        this.currentstation = currentstation;
    }

}

