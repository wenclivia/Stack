import java.util.Scanner;

public class Changetest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入转换的文字");
        int num =scanner.nextInt();
        System.out.println("请输入想要转换的进制(2/4/8/10/16) ：");
        int target=scanner.nextInt();
        System.out.println("转换结果");
        Change change = new Change(num,target);
        change.changNUm(num,target);
    }
}
