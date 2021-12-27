interface myCamera {
    void takeSnap();

    void recordVideo();
    // private void greet(){ // private is used if default is more
    // System.out.println("kamil good morning..");
    // }

    default void record4kVideo() { // another method can be applied by default
        // greet();
        System.out.println("video is recording in 4k..");
    }
}

interface myWifi {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class myCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling number" + phoneNumber);
    }

    void pickCall() {
        System.out.println("connecting..");
    }

}

class mySmartPhone extends myCellPhone implements myCamera, myWifi {
    public void takeSnap() {
        System.out.println("taking a snap..");
    }

    public void recordVideo() {
        System.out.println("video is recording..");
    }
    // public void record4kVideo() { // but this is run
    // System.out.println("video is recording in 4k..");
    // }

    public String[] getNetwork() {
        System.out.println("Getting list of network");
        String[] networkList = { "kamil", "irfan", "pasha" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("connecting to.." + network);
    }
}

public class cwk_57_default {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        ms.record4kVideo();
        String[] arr = ms.getNetwork();
        for (String item : arr) {
            System.out.println(item);
        }
    }
}
