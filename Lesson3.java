import java.util.Scanner;
public class Lesson3 {
    public static void  main(String[] args){
        System.out.println("Урок3. Задание1");
        work1();//Задание1
        System.out.println("Урок3. Задание2");
        work2();//Задание2
        System.out.println("Урок3. Задание3");
        work3();//Задание3
        System.out.println("Урок3. Задание4");
        work4();//Задание4
        System.out.println("Урок3. Задание5");
        Intwork5();//Задание5

    }
    public static void work1(){
        int[] mass1={1,0,1,0,1,0};

        for (int i=0;mass1.length>i;++i){
            if(mass1[i]==0){
                mass1[i]=1;
            }
            else {
                mass1[i] = 0;
            }
            System.out.println("mass[" + i + "] = " +mass1[i]);
        }

    }
    public static void work2(){
        int[] mass2=new int[100];
        for(int i=0;mass2.length>i;++i){
            mass2[i]=i+1;
            System.out.println("mass[" + i + "] = " +mass2[i]);
        }


    }
    public static void work3(){
        int[] mass3={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0;mass3.length>i;i++) {
            if (mass3[i] < 6)
                mass3[i] = mass3[i] * 2;
            System.out.println("mass[" + i + "] = " +mass3[i]);
        }
    }
    public static void work4(){
        int[][] mass4=new int[10][10];
        for (int i=0;mass4.length>i;i++) {
            for (int j = 0; mass4[i].length > j; j++){
                if(i==j)
                    mass4[i][j]=1;
            }
            for (int j = 0, x = mass4[i].length - 1; j < mass4[i].length; j++, x--) {
                if (i == j || i == x) mass4[i][j] = 1;
                System.out.print(" " + mass4[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static int[] work5(int len,int initualValue){
        int[] mass5=new int[len];
        for (int i=0;mass5.length>i;++i) {
            mass5[i] = initualValue;
        }
        return mass5;

    }
    public static void Intwork5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива:");
        int len=scanner.nextInt();
        System.out.println();
        System.out.print("Введите значения для каждой ячейки массива:");
        int initualValue=scanner.nextInt();
        int[] mass5=work5(len,initualValue);
        for (int i=0;mass5.length>i;++i) {
            System.out.println("mass[" + i + "] = " +mass5[i]);

        }



    }

}
