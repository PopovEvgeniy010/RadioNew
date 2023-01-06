package ru.notology.javaqa;

public
class Radio {
    public int currentStationNumber;

    public int currentSoundVolume;

    public
    void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
}