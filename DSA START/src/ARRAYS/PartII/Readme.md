# TrappingWater Problem Solve using different Apporches 

1. Broute Froce
we are using two loop to check all the possible of max area / check every element possiblity
# code 
1.    public static int CalculateMaxArea (int [] arr){
      int max = 0;
      for (int i  = 0; i < arr.length; i++) {
      for (int j = i +1; j < arr.length; j++){
      int width = Math.abs(j - i);
      int minHeight = Math.min(arr[i], arr[j]);
      int area = width * minHeight;
      max = Math.max(area, max);
      }
      }
      return  max;
      }
2. using two pointer
