import java.util.Scanner;

public class TowerBreaker {

    public static int towerBreaker(int m, int n){
//            base case
        if(m == 1){ // if height of tower is 1
            return 2;  // return 2 because player 2 always win because player 1 can not make move
        }
        if(n % 2 == 0){  // if we have even numbers of tower. player2 can always mirror player 1's move
            return 2;
        }
        return 1; // otherwise, Player 1 can force to win
    }
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of tower : ");
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(towerBreaker(m, n));
        }
    }


}
