package java.main.smartdevice;

public interface Browser {
    void showPage(String url);
    void addNewPage(String url);
    void refreshPage();
}