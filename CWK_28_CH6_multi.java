public class CWK_28_CH6_multi {
  public static void main(String[] args) {
    int marks[]; // 1-dimensional array
    int[][] flats; // a 2-D array
    flats = new int[2][3];
    // for ground floor
    flats[0][0] = 100;
    flats[0][1] = 101;
    flats[0][2] = 102;
    // for first floor
    flats[1][0] = 201;
    flats[1][1] = 202;
    flats[1][2] = 203;
    System.out.println("printing 2-D array using for loop");
    for (int i = 0; i < flats.length; i++) {
      for (int j = 0; j < flats[i].length; j++) {
        System.out.print(flats[i][j]);
        System.out.print(" ");
      }
      System.out.println("\n");
    }
  }
}
