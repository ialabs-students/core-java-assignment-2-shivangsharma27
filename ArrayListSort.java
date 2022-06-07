import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

    //function to sort the content of arraylist into descending order
    public static ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> arrayList){

        //calling inbuilt sort method of collection interface for sorting
        Collections.sort(arrayList, Collections.reverseOrder());

        return arrayList;
    }

    public static void main(String[] args) {

        ArrayList<BigInteger> arrayList = new ArrayList<>();
        
        //adding elements into arraylist of type BigInteger
        arrayList.add(BigInteger.valueOf(24));
        arrayList.add(BigInteger.valueOf(543534));
        arrayList.add(BigInteger.valueOf(545));
        arrayList.add(BigInteger.valueOf(2342));
        arrayList.add(BigInteger.valueOf(9));

        System.out.println("ArrayList before Sorting : " + arrayList);

        System.out.println("ArrayList after Sorting in descending order : " + arrayListSortDesc(arrayList));
    }
}
