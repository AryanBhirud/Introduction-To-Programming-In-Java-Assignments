class Marathon {
    static int fastestRunner(int[] times){
        int lowest = 0;
        int n = times.length;
        for(int i = 1; i < n; i++){
            if(times[i] < times[lowest]){
                lowest = i;
            }
        }
        return lowest;
    }
    public static void main(String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        System.out.println("Name Times(Minutes)");
        System.out.println("--------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
        System.out.println(fastestRunner(times));
        System.out.println("\n\nThe fastest runner is " + names[fastestRunner(times)] + ", with a time of " + times[fastestRunner(times)] + " minutes.");
    }
}