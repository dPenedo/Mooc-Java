
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int gamesCount = 0;
        int winsCount = 0;
        int losesCount = 0;

        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                String[] splittedPart = line.split(",");
                String homeTeam = splittedPart[0];
                String visitingTeam = splittedPart[1];
                int homeTeamPoints = Integer.valueOf(splittedPart[2]);
                int visitingTeamPoints = Integer.valueOf(splittedPart[3]);
                if (homeTeam.equals(team)) {
                    gamesCount++;
                    if (homeTeamPoints>visitingTeamPoints) {
                        winsCount++;
                    }else{
                        losesCount++;
                    }
                } else if(visitingTeam.equals(team)){
                    gamesCount++;
                    if (visitingTeamPoints>homeTeamPoints) {
                        winsCount++;
                    }else{
                        losesCount++;
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + gamesCount);
        System.out.println("Wins: "+ winsCount);
        System.out.println("Losses: " + losesCount);

    }

}
