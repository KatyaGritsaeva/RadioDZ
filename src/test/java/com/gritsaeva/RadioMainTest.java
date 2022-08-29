package com.gritsaeva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioMainTest {


    @Test
    public void testConstructorSize() {
        RadioMain radio = new RadioMain(10);
        Assertions.assertEquals(9, radio.getMaxStation());
        //Assertions.assertEquals(99, radio.getMaxVolume());
    }

    @Test
    public void testConstructorNoParam() {
        RadioMain radio = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(10, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
    }


    @Test
    public void RadioMainNextStationBoundaryMaxTest() {
        RadioMain station = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        station.setCurrentstation(9);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void RadioMainPrewStationBoundaryMinTest() {
        RadioMain station = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        station.setCurrentstation(0);

        station.prewStation();

        int expected = 9;
        int actual = station.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioMainPrewStationBoundaryMaxTest() {
        RadioMain station = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        station.setCurrentstation(10);

        station.prewStation();

        int expected = 9;
        int actual = station.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioMainPrewStationBoundaryMin0Test() {
        RadioMain station = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        station.setCurrentstation(-2);

        station.nextStation();

        int expected = 1;
        int actual = station.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioMainPrewStationBoundaryTest() {
        RadioMain station = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        station.setCurrentstation(5);

        station.prewStation();

        int expected = 4;
        int actual = station.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioMainPrewStationMinTest() {
        RadioMain station = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        station.setCurrentstation(0);

        station.prewStation();

        int expected = 9;
        int actual = station.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioMainNextStationBoundaryMinTest() {
        RadioMain station = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        station.setCurrentstation(0);

        station.nextStation();

        int expected = 1;
        int actual = station.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioMainNextStationTest() {
        RadioMain station = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        station.setCurrentstation(4);

        station.nextStation();

        int expected = 5;
        int actual = station.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioMainIncreaseVolumeTest() {
        RadioMain volume = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        volume.setCurrentVolume(5);

        volume.increaseVolume();

        int expected = 6;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioMainIncreaseBoundaryMaxVolumeTest() {
        RadioMain volume = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        volume.setCurrentVolume(10);

        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioMainIncreaseBoundaryMinVolumeTest() {
        RadioMain volume = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        volume.setCurrentVolume(0);

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioMainlessMinBoundaryMinVolumeTest() {
        RadioMain volume = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        volume.setCurrentVolume(0);

        volume.lessMinVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioMainlessMinVolumeTest() {
        RadioMain volume = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        volume.setCurrentVolume(-10);

        volume.lessMinVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioMainMoreThenMinVolumeTest() {
        RadioMain volume = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        volume.setCurrentVolume(11);

        volume.lessMinVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioMainlessMinBoundaryMaxVolumeTest() {
        RadioMain volume = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        volume.setCurrentVolume(10);

        volume.lessMinVolume();

        int expected = 9;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioMainlessMinMiddleVolumeTest() {
        RadioMain volume = new RadioMain(); //(maxStation, minStation, maxVolume, minVolume);
        volume.setCurrentVolume(-6);

        volume.lessMinVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

}
