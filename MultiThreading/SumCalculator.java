

public class SumCalculator {

    public static void main(String[] args) throws InterruptedException {
        int upperLimit = 100000;
        int mid = upperLimit / 2;

        
        final SumResult result = new SumResult();
        long startTime = System.currentTimeMillis();
        
        
//        Thread thread1 = new Thread(() -> {
//            int sum1 = calculateSum(1, mid);
//            result.setSum1(sum1);
//        });
//
//        Thread thread2 = new Thread(() -> {
//            int sum2 = calculateSum(mid + 1, upperLimit);
//            result.setSum2(sum2);
//        });
//
//        
//        thread1.start();
//        thread2.start();
//
//        
//        thread1.join();
//        thread2.join();
//       
//        int totalSum = result.getSum1() + result.getSum2();
        
//        int totalSum = calculateSum(1,100000);
//        System.out.println("Total Sum: " + totalSum);
        long endTime = System.currentTimeMillis(); // Capture end time
        long elapsedTime = endTime - startTime; // Calculate elapsed time
        System.out.println("Time = " + elapsedTime);
    }

 
    private static int calculateSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

   
    private static class SumResult {
        private int sum1;
        private int sum2;

        public synchronized void setSum1(int sum1) {
            this.sum1 = sum1;
        }

        public synchronized void setSum2(int sum2) {
            this.sum2 = sum2;
        }

        public synchronized int getSum1() {
            return sum1;
        }

        public synchronized int getSum2() {
            return sum2;
        }
    }
}