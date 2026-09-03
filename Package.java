import currency.*;
import distance.*;
import time.*;
import java.util.Scanner;

public class Convertor {

    public static void main(String[] args) {

        int code, currency_code, distance_code, time_code;

        Scanner sc = new Scanner(System.in);

        CurrencyConvertor cc = new CurrencyConvertor();
        DistanceConvertor dc = new DistanceConvertor();
        TimeConvertor tc = new TimeConvertor();

        System.out.println("Enter the code:");
        System.out.println("1: Currency");
        System.out.println("2: Distance");
        System.out.println("3: Time");

        code = sc.nextInt();

        if (code == 1) {

            System.out.println("Enter the currency code:");
            System.out.println("1: Euro");
            System.out.println("2: Dollar");
            System.out.println("3: Yen");

            currency_code = sc.nextInt();

            if (currency_code == 1) {
                cc.convertInrToEuro();
                cc.convertEuroToInr();
            } else if (currency_code == 2) {
                cc.convertInrToDollar();
                cc.convertDollarToInr();
            } else if (currency_code == 3) {
                cc.convertInrToYen();
                cc.convertYenToInr();
            } else {
                System.out.println("Invalid currency code.");
            }

        } else if (code == 2) {

            System.out.println("Enter the distance code:");
            System.out.println("1: Meter");
            System.out.println("2: Miles");

            distance_code = sc.nextInt();

            if (distance_code == 1) {
                dc.convertMeterToKm();
                dc.convertKmToMeter();
            } else if (distance_code == 2) {
                dc.convertMilesToKm();
                dc.convertKmToMiles();
            } else {
                System.out.println("Invalid distance code.");
            }

        } else if (code == 3) {

            System.out.println("Enter the time code:");
            System.out.println("1: Minute");
            System.out.println("2: Seconds");

            time_code = sc.nextInt();

            if (time_code == 1) {
                tc.convertHourToMinute();
                tc.convertMinuteToHour();
            } else if (time_code == 2) {
                tc.convertHourToSeconds();
                tc.convertSecondsToHour();
            } else {
                System.out.println("Invalid time code.");
            }

        } else {
            System.out.println("Invalid code.");
        }

        sc.close();
    }
}
