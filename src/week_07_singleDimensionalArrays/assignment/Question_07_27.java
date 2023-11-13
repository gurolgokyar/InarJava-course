package week_07_singleDimensionalArrays.assignment;
public class Question_07_27 {
    public static void main(String[] args) {
        System.out.print("Enter list1(First input indicate number the element):");
        int[] list1 = Question_07_26.getInputs();

        System.out.print("Enter list2(First input indicate number the element):");
        int[] list2 = Question_07_26.getInputs();

        System.out.println("The two list are " + (equals(list1, list2) ? "" : "not ") + "identical");
    }

    public static boolean equals(int[] list1,int[] list2){
       if (list1.length != list2.length){
           return false;
       }
        for (int n : list1) {
            //If each element's iteration in list1 is not equals to
            // iterations in list2 return false
            int numberOfElementEqualsToList1_i = 0;
            for (int v : list1) {
                if (v == n){
                    numberOfElementEqualsToList1_i++;
                }
            }

            int numberOfElementEqualsToList2_i = 0;
            for (int v : list2) {
                if (v == n){
                    numberOfElementEqualsToList2_i++;
                }
            }
            if (numberOfElementEqualsToList1_i != numberOfElementEqualsToList2_i){
                return false;
            }
        }
        return true;
    }
}
