public class Question3 {
        public int minOperations(int[] nums) {
            if (nums.length == 0)
                return 0;

            int count = 0;
            while (!checkEmpty(nums)){
                count += decrementByOne (nums);
                count += divideByTwo (nums);
            }
            return count;



        }
        private static boolean checkEmpty (int [] arr){
            for (int i :arr){
                if (i !=0)
                    return false;
            }
            return true;
        }

        private static int decrementByOne (int [] arr){
            int count = 0;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] % 2 == 1){
                    arr[i] -= 1;
                    count++;
                }
            }
            return count;
        }

        private static int divideByTwo (int [] arr){
            int count = 0;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] != 0){
                    arr[i]/=2;
                    count++;

                }
            }
            if (count == 0)
                return 0;
            return 1;
        }
    }

