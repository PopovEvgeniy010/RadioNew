package ru.notology.javaqa;

public
class Radio {
    private int currentStationNumber;
    private int currentSoundVolume;


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setToMinNumber() {
        currentStationNumber = 0;
    }

    public void setToMaxNumber() {
        currentStationNumber = 9;
    }

    public void next() {
        if (currentStationNumber != 9) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prev() {
        if (currentStationNumber != 0) {
            currentStationNumber++;
        } else {
            currentStationNumber = 9;
        }
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber > 9) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void SetMinSound() {
        currentSoundVolume = 0;
    }

    public void SetMaxSound() {
        currentSoundVolume = 10;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 10) {
            return;
        }
        this.currentSoundVolume = newCurrentSoundVolume;
    }


    public void increaseVolume() {
        if (currentSoundVolume < 10) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }

    public void increaseVolumeMax() {
        if (currentSoundVolume == 10) {
            currentSoundVolume++;
        } else {
            currentSoundVolume = 10;
        }
    }

    public void increaseVolumeMin() {
        if (currentSoundVolume == 1) {
            currentSoundVolume--;
        } else {
            currentSoundVolume = 0;
        }
    }
}










