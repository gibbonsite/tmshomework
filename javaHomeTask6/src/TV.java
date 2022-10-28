public class TV {
    private int currentChannel;
    private int maxChannel;
    private int currentVolume;
    private int maxVolume;

    public TV(int maxChannel, int maxVolume) {
        this.maxChannel = maxChannel;
        this.maxVolume = maxVolume;
        this.currentVolume = 10;
        this.currentChannel = 1;
    }

    public void changeVolume(boolean increaseByOne) {
        System.out.println("Current volume is " + currentVolume);
        updateVolume(increaseByOne);
    }

    public void changeChannel(int newChannel) {
        System.out.println("Current channel is " + currentChannel);
        updateChannel(newChannel);
    }

    private void updateVolume(boolean increaseByOne) {
        currentVolume += increaseByOne ? 1 : -1;
        System.out.println("New volume is " + currentVolume);
    }

    private void updateChannel(int newChannel) {
        currentChannel = newChannel;
        System.out.println("New channel is " + currentChannel);
    }
}
