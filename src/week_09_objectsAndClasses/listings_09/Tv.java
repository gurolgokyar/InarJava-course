package week_09_objectsAndClasses.listings_09;

class Tv {
    int channel;
    int volumeLevel;
    boolean on;

    Tv() {
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }

    void setChannel(int newChannel) {
        if (newChannel >= 1 && newChannel <= 120 && on) {
            channel = newChannel;
        }
    }

    void setVolume(int newVolume) {
        if (newVolume >= 1 && newVolume <= 7 && on) {
            volumeLevel = newVolume;
        }
    }

    void channelUp() {
        if (channel < 120 && on) {
            channel++;
        }
    }

    void channelDown() {
        if (channel > 1) {
            channel--;
        }
    }

    void volumeUp() {
        if (volumeLevel < 7 && on) {
            volumeLevel++;
        }
    }

    void volumeDown() {
        if (volumeLevel > 1) {
            volumeLevel--;
        }
    }
}
