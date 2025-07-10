class TotalAndAverage {
    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = {10, 20, 30, 40, 50};

        int total = 0;

        // Calculate total
        for (int num : numbers) {
            total += num;
        }

        // Calculate average
        double average = (double) total / numbers.length;

        // Print results
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}
