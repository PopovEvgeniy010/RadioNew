package ru.notology.javaqa;

public
class Radio {
    private int currentStationNumber;
    private int maxCurrentStationNumber;
    private int currentSoundVolume;
    private int minCurrentSoundVolume = 0;
    private int maxCurrentSoundVolume = 100;

    public Radio(){
        maxCurrentStationNumber = 10;
    }
    public Radio (int countStationNumber){
        maxCurrentStationNumber = countStationNumber -1;

    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setToMinNumber() {
        currentStationNumber = 0;
    }

    public void setToMaxNumber() {
        currentStationNumber = maxCurrentStationNumber;
    }

    public void next() {
        if (currentStationNumber != maxCurrentStationNumber) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prev() {
        if (currentStationNumber != 0) {
            currentStationNumber++;
        } else {
            currentStationNumber = maxCurrentStationNumber;
        }
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber > maxCurrentStationNumber) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void SetMinSound() {
        currentSoundVolume = minCurrentSoundVolume;
    }

    public void SetMaxSound() {
        currentSoundVolume = maxCurrentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < minCurrentSoundVolume) {
            return;
        }
        if (newCurrentSoundVolume > maxCurrentSoundVolume) {
            return;
        }
        this.currentSoundVolume = newCurrentSoundVolume;
    }


    public void increaseVolume() {
        if (currentSoundVolume < maxCurrentSoundVolume) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume > minCurrentSoundVolume) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }

    public void increaseVolumeMax() {
        if (currentSoundVolume == maxCurrentSoundVolume) {
            currentSoundVolume++;
        } else {
            currentSoundVolume = maxCurrentSoundVolume;
        }
    }

    public void increaseVolumeMin() {
        if (currentSoundVolume == 1) {
            currentSoundVolume--;
        } else {
            currentSoundVolume = minCurrentSoundVolume;
        }
    }
}










