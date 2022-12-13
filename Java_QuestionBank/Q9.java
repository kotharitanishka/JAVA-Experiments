package Java_QuestionBank;
import Java_QuestionBank.lcalcmc.lmc;

public class Q9 {
    
    public static void main(String[] args) {
        lmc r = new lmc();
        float ans1, ans2, ans3, ans4 , x = 10, y = 20 ;
        ans1 = r.add(x , y);
        ans2 = r.sub(x , y);
        ans3 = r.mul(x , y);
        ans4 = r.div(x , y);
        System.out.println("add is : " + ans1 + " sub is : " + ans2 + " mul is : " + ans3 + " div is : " + ans4);
    }
}
