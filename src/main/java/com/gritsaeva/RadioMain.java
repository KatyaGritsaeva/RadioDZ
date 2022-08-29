package com.gritsaeva;

public class RadioMain {

    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;

    private int currentVolume = minVolume;
    private int currentStation = minStation;

    public RadioMain() {

    }

//    public RadioMain(int maxStation, int minStation, int maxVolume, int minVolume) {
//        this.maxStation = maxStation;
//        this.minStation = minStation;
//        this.maxVolume = maxVolume;
//        this.minVolume = minVolume;
//        this.currentVolume = minVolume;
//        this.currentStation = minStation;
//    }

    public RadioMain(int sizeStation) {
        //maxVolume = minVolume + sizeVolume - 1;
        maxStation = minStation + sizeStation - 1;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void lessMinVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }


    public void prewStation() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentstation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentstation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

}

