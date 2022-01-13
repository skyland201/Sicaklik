import java.util.Scanner;

public class Sıcaklık {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sıcaklık giriniz: ");
        double sıcaklık=input.nextDouble();
        if(sıcaklık<5)
            System.out.println("Kayak yapabilirsin");
        if(sıcaklık>=5&&sıcaklık<=15)
            System.out.println("Sinemaya gidebilirsin.");
        if(sıcaklık>15&&sıcaklık<=25)
            System.out.println("Pikniğe gidebilirsin.");
        if (sıcaklık>25)
            System.out.println("Yüzmeye gidebilirsin.");
    }
}
