import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String kullaniciadi,parola;
        System.out.print("Kullanıcı Adını Griniz :");
        kullaniciadi = scan.nextLine();
        System.out.print("Parolayı Giriniz :");
        parola = scan.nextLine();
        if(kullaniciadi.equals("java") && parola.equals("123")){
            System.out.println("Başarılı Bir Şekilde Giriş Yaptınız ");
        }
        else{
            System.out.println("Kullanıcı Adınız Veya Parolanız Yanlış");
        }

    }
}