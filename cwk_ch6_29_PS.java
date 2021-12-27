import javax.swing.SortingFocusTraversalPolicy;

public class cwk_ch6_29_PS {
 public static void main(String[] args){
    // question 1
   /* float[] marks={45.7f, 55.6f, 65.7f, 75.8f,85.9f};
    float sum=0;
    for(float element:marks){
        sum = sum+element;
        
    }
    System.out.println("The value of sum is "+ sum); */
    // QUESTION 2
    /* float[] marks={45.7f, 55.6f, 65.7f, 75.8f,85.9f};
    float num=45.8f;
    boolean isInarray = false;
    for(float element:marks){
        if(num==element){
           isInarray = true;
           break;
        }
        
    }
    if(isInarray){
        System.out.println("The value is present in the array");
    }
    else{
        System.out.println("The value is not present in the array");
    }         */
    // QUESTION 3
    /* float[] marks={45.7f, 55.6f, 65.7f, 75.8f,85.9f};
    float sum=0;
    for(float element:marks){
        sum = sum+element;
        
    }
    System.out.println("The value of average marks is  "+ sum/marks.length);  */
    // QUESTION 4
   /* int [][] mat1 = {{1, 2, 3},
                     {4, 5, 6}};
    int [][] mat2 = {{2, 7, 13},
                     {6, 8, 9}};   
   int [][] result = {{0, 0, 0},
                     {0, 0, 0}};   
 for(int i=0; i<mat1.length; i++){ // row number of times
  for(int j=0; j<mat1[i].length; j++){ // columns no of times
    System.out.print( result[i][j] + " "); 
   result [i][j] = mat1[i][j] + mat2[i][j];
  }
  System.out.println("");
 }          */
 // QUESTION 5
/* int arr[] ={1, 2, 3, 4, 5, };
 int l = arr.length;
 int n = Math.floorDiv(l,2);
 int temp;
 for(int i=0; i<n; i++){
  // swap a[i] and a[l-1-i]
  // a b temp
  // |4| |3| ||
  temp = arr[i];
  arr[i] = arr[l-1-i];
  arr[l-1-i]=temp;
 }
 for(int element : arr){
     System.out.print(element + "  ");
 }  */
 // QUESTION 6
/* int arr[] ={1, 21, 3, 2000, 5, 34, 67 };
 int max=0;
 for(int element : arr){
     if(element>max){
         max = element;
     }
     
 }
 System.out.println("The value of this maximum array is " + max); */
 // QUESTION 8
 int arr[] ={1, 2, 3, 4, 5, 34, 67 };
 boolean isSorted = true;
 for(int i=0; i<arr.length-1; i++){
     if(arr[i]>arr[i+1]){
         isSorted = false; 
         break;
     }
 }
 if(isSorted){
 System.out.println("The array is sorted : ");
 }
 else{
    System.out.println("The array is not sorted : ");
 }
 }   
}
