public class Main {
    public static void main(String []args) {
        int balanceRUR = 500;
        int putRUR = 3000;
        int bonusRUR;
        int totalRUR;
        if (putRUR > 1000) {
            bonusRUR = putRUR / 100;
        }
        else{
            bonusRUR = 0;
        }
        totalRUR = balanceRUR + putRUR + bonusRUR;
        System.out.println(bonusRUR);
        System.out.println(totalRUR);
    }
}