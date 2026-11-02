package ifElseStatements;

public class ifelse {
    public static void main(String[] args) {
        int minVotingAge = 21;
        String player1 = "Simon";
        int player1Age = 18;
        String player2 = "Daniel";
        int player2Age = 20;
        boolean playerVotingAge = true;
        boolean playerVoting = false;
        boolean findingAge = player1Age>=minVotingAge && player2Age>=minVotingAge;
        if (player1Age >= minVotingAge && player2Age >= minVotingAge) {
            System.out.println("Eligible for voting" + player1 + player2 + minVotingAge);
        } else {
            System.out.println("Not eligible for voting" + player1 + player2 + minVotingAge);
        }
        if (minVotingAge == 21) {
            System.out.println("Eligible to vote " + minVotingAge);
        } else {
            System.out.println("Not eligible to vote " + minVotingAge);
        }
        if (playerVotingAge != findingAge) {
            System.out.println("Critiere is not met " + playerVotingAge);
        } else {
            System.out.println("Criteria met " + playerVotingAge);
        }
    }
}