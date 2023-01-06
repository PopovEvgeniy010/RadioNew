package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.notology.javaqa.Radio;

public
class RadioTest {
    @Test
    public
    void shouleSetStation() {
        Radio cond = new Radio();
        cond.currentStationNumber = 1;
        int expected = 1;
        int actual = cond.currentStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public
    void shouleSetSound() {
        Radio cond = new Radio();
        cond.currentSoundVolume = 2;
        int expected = 2;
        int actual = cond.currentSoundVolume;
        Assertions.assertEquals(expected, actual);
}
@Test
    public void shouleSetSound2(){
        Radio cond = new Radio();
        cond.increaseVolume();
        int expected = 2;
        int actual =cond.currentVolume;
                Assertions.assertEquals(expected, actual);
}
}
