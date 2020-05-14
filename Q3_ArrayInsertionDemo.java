public class Q3_ArrayInsertionDemo {

  public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
    // Your code here
    int l = beforeArray.length;
    int[] newArray = new int[l+1];
    
    for(int i = 0; i < indexToInsert; i++) {
      newArray[i] = beforeArray[i];
    }
    
    newArray[indexToInsert] = valueToInsert;
    
    for(int i = (indexToInsert + 1); i < l + 1; i++) {
      newArray[i] = beforeArray[i-1];
    }
    
    return newArray;
  }

  public static void main(String[] args){
    // Your code here
    int[] array1 = new int[] {1,5,4,7,9,6};
    int l = array1.length;
    int indexToInsert = 3;
    int valueToInsert = 15;
    
    System.out.println("Array before insertion:");
    
    for(int i = 0; i < l; i++) {
      System.out.println(array1[i]);
    }
    
    int[] array2 = insertIntoArray(array1, indexToInsert, valueToInsert);
    
    System.out.println("Array after insertion of " + valueToInsert + " at position " + indexToInsert + " :");
    
    for(int i = 0; i < l+1; i++) {
      System.out.println(array2[i]);
    }
  }
}
