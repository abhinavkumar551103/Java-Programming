class BiggestAndSmallest {

    public static void main(String[] args) {

        int[] arr = new int[] {100, 99, 88, 65, 77, 47, 22, 10, 95, 110, 150, 200, 175, 196, 128};

        int Biggest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (Biggest < arr[i])
                Biggest = arr[i];

            if (Smallest > arr[i])
                Smallest = arr[i];
        }

        System.out.println(Biggest);
        System.out.println(Smallest);
    }
}