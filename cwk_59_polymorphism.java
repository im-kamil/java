interface myCamera2 {
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

interface myWifi2 {
   String[] getNetwork();

   void connectToNetwork(String network);
}

class myCellPhone2 {
   void callNumber(int phoneNumber) {
      System.out.println("Calling number" + phoneNumber);
   }

   void pickCall() {
      System.out.println("connecting..");
   }

}

class mySmartPhone2 extends myCellPhone2 implements myCamera2, myWifi2 {
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

   public void SampleMeth() {
      System.out.println("meth");
   }
}

public class cwk_59_polymorphism {
   public static void main(String[] args) {
      myCamera2 cam1 = new mySmartPhone2(); // polymorphism split into many parts...myCamera method'''
      // cam1.getNetwork(); // not allowed as we take obj camera for smartphone so
      // camera function allowed not wifi function getNetwork is allowed
      cam1.record4kVideo(); // this is run because camera function allowed in mySmartPhone so it is
                            // polymorphism..
      // cam1.SampleMeth(); // not allowed
      mySmartPhone2 s = new mySmartPhone2(); // can all smartphone method..
      s.SampleMeth();
      s.record4kVideo();
      s.recordVideo();
      s.getNetwork();
   }
}
