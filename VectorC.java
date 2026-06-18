import java.util.*;
public class VectorC {
    public static void main(String[]args){
      List<Integer> nums =new Vector<Integer>();
      nums.add(30);
      nums.add(31);
      nums.add(32);
      nums.add(33);
      nums.add(34);
      nums.add(35);
      nums.add(36);
      nums.add(37);
      nums.add(38);
      nums.add(39);
      nums.add(40);
      nums.add(41);
        System.out.println(nums);
        System.out.println(nums.get(5));
        nums.add(0,45);
        System.out.println(nums);
        nums.set(0,99);
        System.out.println(nums);

        List<Integer>nums1=new Vector<>();
        nums1.addAll(nums);
        System.out.println(nums1);
       System.out.println(nums1.containsAll(nums));
       nums1.remove(0);
        System.out.println(nums1);
        System.out.println(nums1.contains(31));
        nums1.clear();
        System.out.println(nums1);
        for (Integer i:nums){
            System.out.print(i+" ");
        }
        Vector<Integer> nums2=new Vector<>();
        nums2.add(20);
        nums2.add(30);
        nums2.add(50);
        int sum=0;
        for(int j=0;j<nums2.size();j++){
            sum+=nums2.get(j);
        }
        System.out.println("sum of vector"+sum);

    }
}
