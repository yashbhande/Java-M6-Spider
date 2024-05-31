//Example of Interface 

// Class representing a basic phone with call and SMS functionality
class Phone {
    void call() {
        System.out.println("Calling Supported.");
    }

    void sms() {
        System.out.println("SMS Supported.");
    }
}

// Interface for camera functionality
interface Camera {
    void click();
    void record();
}

// Interface for music player functionality
interface MusicPlayer {
    void play();
    void stop();
    void pause();
}

// SmartPhone class extends Phone and implements Camera and MusicPlayer interfaces
public class SmartPhone extends Phone implements Camera, MusicPlayer {

    // Implementing Camera interface methods
    @Override
    public void click() {
        System.out.println("Click Supported.");
    }

    @Override
    public void record() {
        System.out.println("Record Supported.");
    }

    // Implementing MusicPlayer interface methods
    @Override
    public void play() {
        System.out.println("Playback Supported.");
    }

    @Override
    public void stop() {
        System.out.println("Stop Supported.");
    }

    @Override
    public void pause() {
        System.out.println("Pause Supported.");
    }

    public static void main(String[] args) {
        // Creating an instance of SmartPhone
        SmartPhone smartPhone = new SmartPhone();

        // Using SmartPhone specific methods
        smartPhone.call();
        smartPhone.sms();
        smartPhone.click();
        smartPhone.record();
        smartPhone.play();
        smartPhone.stop();
        smartPhone.pause();

        // Demonstrating polymorphism with Phone reference
        Phone phone = smartPhone;
        phone.call();
        phone.sms();

        // Demonstrating polymorphism with Camera reference
        Camera camera = smartPhone;
        camera.click();
        camera.record();

        // Demonstrating polymorphism with MusicPlayer reference
        MusicPlayer musicPlayer = smartPhone;
        musicPlayer.play();
        musicPlayer.stop();
        musicPlayer.pause();
    }
}
