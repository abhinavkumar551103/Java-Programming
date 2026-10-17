class calculator{
    public int SquareRoot(int n){
        int num = n*n;
        return num;
    }
    public int CubeRoot(int n){
        int num = n*n*n;
        return num;
    }
    public int Add(int... number){
        int sum = 0;
        for(int num: number){
            sum += num;
        }
        return sum;
    }
    public int Subtract(int first ,int... num){
        int result = first;
        for(int n: num){
            result -= n;
        }
        return result;
    }
    public int Multiplication(int... nums){
        int result = 1;
        for(int n:nums){
            result *= n;
        }
        return result;
    }
}