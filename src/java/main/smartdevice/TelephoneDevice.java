package java.main.smartdevice;

public interface TelephoneDevice {
    void call(String number);
    void answer(String number);
    void startMessageVoice(String message,  String target);
}