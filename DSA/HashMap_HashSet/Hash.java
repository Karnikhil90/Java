import java.util.HashSet;

public class Hash {
    
    public static String typeOf(Object obj) {
        if (obj == null) return "null";
        return obj.getClass().getName();
    }
    static boolean twoSum(int arr[], int target) {
        // HashSet<Integer> set = new HashSet<>();
        var set = new HashSet<>();
        set.add("MUSIC");
        System.out.println(typeOf(set));
        for(var ele : arr){
            System.out.println(typeOf(ele));
            if(set.contains(target - ele)) return true;
            set.add(ele);
        }
        IO.println(set);
        return false;
    }
    
    public static void main(String[] args) {
        twoSum(new int[] {1,2,3,4,5,5,65,6,50,100,5,35,35,345,345,345,345,345,3245,23,2345,435,34,534,5234,5,34}, 50);
    }
}
