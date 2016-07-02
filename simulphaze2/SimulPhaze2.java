package simulphaze2;

public class SimulPhaze2 {

    public static int m1 = 5;
    public static int l1 = 7;
    public static int m2 = 3;
    public static int l2 = 2;
    public static int m3 = 1;

    public static void main(String[] args) {

        double firstArrival = 0;
        double firstDuration = 0;
        
        double secondArrival = 0;
        double secondDuration = 0;
        
        preServer1 pre1 = new preServer1();
        preServer2 pre2 = new preServer2();
        
        for (int i = 0; i < 50; i++) {

            double y = Math.log(1 - Math.random()) * (-l1);
            firstArrival = Math.floor((firstArrival + y) * 100) / 100;

            y = Math.log(1 - Math.random()) * (-m1);
            firstDuration = Math.floor(y * 100) / 100;

            job j = new job(firstArrival, firstDuration);
            pre1.addToList(j);

            y = Math.log(1 - Math.random()) * (-l2);
            secondArrival = Math.floor((secondArrival + y) * 100) / 100;

            y = Math.log(1 - Math.random()) * (-m2);
            secondDuration = Math.floor(y * 100) / 100;

            job j1 = new job(secondArrival, secondDuration);
            pre2.addToList(j1);

        }
        for (int i = 0; i < pre1.jobList.size(); i++) {
            
            System.out.println(pre1.jobList.get(i).arrivalTime + "    "  + pre1.jobList.get(i).preDurationTime);
            
            }
        
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
         for (int i = 0; i < pre2.jobList.size(); i++) {
            
            System.out.println(pre2.jobList.get(i).arrivalTime + "    "  + pre2.jobList.get(i).preDurationTime);
            
            }
    
    }
    
    

}
