import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlayalım.
        int number, minNum=0, maxNum =0, howMany;
        //Kullanıcıdan input alalım
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? ");
        howMany = input.nextInt();
        //Girilen her bir sayıyı bir öncekiyle karşılaştırarak en küçük ve en büyük sayıları bulalım
        for (int i=1; i<=howMany; i++) {
            System.out.print(i + ". sayıyı giriniz:" );
            number = input.nextInt();

            if (i==1){
                minNum = number;
                continue;
            }
            if (number < minNum) {
                maxNum =minNum;
                minNum = number;
            }
            if (maxNum<number || number>minNum) {
                maxNum = number;
            }
        }
        System.out.println("En küçük sayı: " + minNum);
        System.out.println("En büyük sayı: " + maxNum);
    }
}