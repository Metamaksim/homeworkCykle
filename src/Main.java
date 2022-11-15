public class Main {
    public static void main(String[] args) {
        // Задание 1
        int a = 1;
        while (a <= 10) {
            System.out.print(a++ + " ");
        }
        System.out.println();
        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }

     // Задание 2
        System.out.println();
        for (int c=4;c<=31;c=c+7){
            System.out.println( "Сегодня пятница," + c + "-е число. Необходимо подготовить отчет.");
        }

        // Задание 3
        int periodFlight = 79;
        int viewUp = 100;
        int currentYear = 2021;
        int viewDown = 200;
        int periodViewUp = currentYear + viewUp;
        int periodViewDown = currentYear - viewDown;

        int startYear = 0;

        for ( ;startYear < periodViewUp; startYear += periodFlight) {

            if ( startYear < periodViewUp && startYear > periodViewDown ){

                System.out.println(startYear);
            }

        }




    }
}
