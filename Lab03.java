public class Lab03 {
    public static void main(String args[]){

        int seconds = 10000;
        int minutes = 3600;
        int second2 = 2800;
        int n60 = 60;
        int n1 = 10000123;
        int n2 = 3600000;
        int n3 = 215000;
        int n4 = 1000;
        int n5 = 245000;
        int n6 = 81010;
        int hours = 10000123/3600000;
        int mins = 10000123/215000;
        int secs= 10000123/245000;
        int millisecs = 10000123/81010;

        System.out.println();
        System.out.println("Lab03 80 Point Version");
        System.out.println();
        System.out.println("starting seconds:  "+seconds);
        System.out.print("hours: ");
        System.out.println(seconds/minutes);
        System.out.print("minutes: ");
        System.out.println(second2/n60);
        System.out.print("seconds: ");
        System.out.println(second2%n60);
        System.out.println();
        System.out.println();

        System.out.println("100 Point Version");
        System.out.println();
        System.out.println("Starting Milliseconds:  "+ n1);
        System.out.println("Hours:                  "+ hours);
        System.out.println("Minutes:                "+ mins);
        System.out.println("Seconds:                "+ secs);
        System.out.println("Milliseconds:           "+ millisecs);



    }

}
