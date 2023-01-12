package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.notology.javaqa.Radio;

public class RadioTest {
    @Test
    public void shouledSetToMinNumber() {
        Radio cond = new Radio();
        cond.setToMinNumber();
        int expected = 0;
        int actual = cond.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouledSetToMaxNumber() {
        Radio cond = new Radio();
        cond.setToMaxNumber();
        int expected = 9;
        int actual = cond.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouledNextSetStation1() {
        Radio cond = new Radio();
        cond.next();
        int expected = 1;
        int actual = cond.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouledNextSetStation2() {
        Radio cond = new Radio();
        cond.setCurrentStationNumber(9);
        cond.next();
        int expected = 0;
        int actual = cond.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouledPrevSetStation1() {
        Radio cond = new Radio();
        cond.prev();
        int expected = 9;
        int actual = cond.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouledPrevSetStation2() {
        Radio cond = new Radio();
        cond.setCurrentStationNumber(1);
        cond.prev();
        int expected = 2;
        int actual = cond.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouledSetStation1() {
        Radio cond = new Radio();
        cond.setCurrentStationNumber(10);
        int expected = 0;
        int actual = cond.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetStation2() {
        Radio cond = new Radio();
        cond.setCurrentStationNumber(-1);
        int expected = 0;
        int actual = cond.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouledSetMinSound() {
        Radio cond = new Radio();
        cond.SetMinSound();
        int expected = 0;
        int actual = cond.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouledSetMaxSound() {
        Radio cond = new Radio();
        cond.SetMaxSound();
        int expected = 10;
        int actual = cond.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouledSetStation15() {
        Radio cond = new Radio();
        cond.setCurrentSoundVolume(-1);
        int expected = 0;
        int actual = cond.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouledSetStation2() {
        Radio cond = new Radio();
        cond.setCurrentSoundVolume(11);
        int expected = 0;
        int actual = cond.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseSound1() {
        Radio cond = new Radio();
        cond.increaseVolume();
        int expected = 1;
        int actual = cond.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseSound2() {
        Radio cond = new Radio();
        cond.setCurrentSoundVolume(10);
        cond.increaseVolume();
        int expected = 10;
        int actual = cond.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSound1() {
        Radio cond = new Radio();
        cond.decreaseVolume();
        int expected = 0;
        int actual = cond.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSound2() {
        Radio cond = new Radio();
        cond.setCurrentSoundVolume(1);
        cond.decreaseVolume();
        int expected = 0;
        int actual = cond.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundMax1() {
        Radio cond = new Radio();
        cond.increaseVolumeMax();
        int expected = 10;
        int actual = cond.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundMax2() {
        Radio cond = new Radio();
        cond.setCurrentSoundVolume(10);
        cond.increaseVolumeMax();
        int expected = 11;
        int actual = cond.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundMin1() {
        Radio cond = new Radio();
        cond.increaseVolumeMin();
        int expected = 0;
        int actual = cond.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundMin2() {
        Radio cond = new Radio();
        cond.setCurrentSoundVolume(1);
        cond.increaseVolumeMin();
        int expected = 0;
        int actual = cond.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}
