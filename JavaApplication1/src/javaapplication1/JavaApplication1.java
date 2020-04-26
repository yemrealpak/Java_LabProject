
package javaapplication1;
import java.util.Scanner;
import java.time.*;
public class JavaApplication1 {
    

    
int x = 5;  

static void YO() {
    System.out.println("Yo bitch!");
}

static void surNAme(String fname, int age) {
    System.out.println(fname + " Koc " + age);
}

static int numberExchange(int x) {
    return 5+x;
}

    public static void main(String[] args) {
        
        
        String message = "yo whatskup mofo";
        System.out.println(message);
        
        
        System.out.println("Mesajin uzunlugu: " + message.length());
        
        
        System.out.println("whatskupun nerde basladigini bul");
        System.out.println(message.indexOf("whatskup"));
        
        
        long myNum = 15000000000L;
        System.out.println(myNum);
        
        
        String firstName = "Kaan";
        String lastName = "Koc";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));
        
        
        String northSide = "We are so called \"Vikings\" from the north";
        System.out.println(northSide);
        
        
        System.out.println(Math.max(52, myNum));
        System.out.println(Math.abs(myNum));
        System.out.println(Math.sqrt(81));
        
        
        int time = 14;
        String rEsult;
        rEsult = (time<18) ? "Good afternoon" : "Good night";
        System.out.println(rEsult);
        
        
        int i=0;
        while(i<3)
        {
            System.out.println("i="+i);
            i++;
        }
        
        
        String[] cars = {"BMW" ,"Audi", "Porsche"};
                for (String s : cars)
                {
                    System.out.println(s);
                }
        int b;        
        for(b=0;b<cars.length;b++)
        {
            System.out.println(cars[b]);
        }
        
        
        int[][] myNumbers = { {1,2,3,4,5} , {11,15,18} };
        int y = myNumbers[0][3];
        System.out.println(y);
        for(int k = 0; k < myNumbers.length ;k++)
        {
            for(int l=0 ; l<myNumbers[k].length ; l++)
            {
                System.out.println(myNumbers[k][l]);
            }
        }
        
        
        YO();
        surNAme("Kaan",19);
        surNAme("Fulya",45);
        surNAme("Vedat",50);
        System.out.println(numberExchange(8));
        
        
        JavaApplication1 myObj = new JavaApplication1();
        System.out.println(myObj.x);
        
        
        Car myCar = new Car();
        myCar.fullTh();
        myCar.speed(200);
        
        
        Scanner myNaam = new Scanner(System.in);
        String isim;
        System.out.println("Isim gir: ");
        isim = myNaam.nextLine();
        
        System.out.println("Isim: " + isim);
        
        Scanner oku = new Scanner(System.in);
        System.out.println("Enter name, age and salary");
        String name = oku.nextLine();
        int age = oku.nextInt();
        double salary = oku.nextDouble();
        
        
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);
        
        
        
        
    }
    
}

