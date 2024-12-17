public class SumOfSquares {
    public long calculationSumOfSquares(int n) {
        if(n <0 ){
            return -1;
        }
        // 1 to n => n*n
        long sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.println(sum);
            sum += i*i;
        }
        return sum;
    }
}
