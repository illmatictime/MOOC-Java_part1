
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        ArrayList<Match> matches = readMatchesFromFile(file);
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int count = 0;
        
        for(Match team: matches){
            if(team.toString().contains(teamName)){
                count = count + 1;
            }  
        }
        System.out.println("Games: " + count);
        
    }
    
    public static ArrayList<Match> readMatchesFromFile(String file){
        ArrayList<Match> match = new ArrayList<>();
        
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                
                String[] parts = line.split(",");
                String firstTeam = parts[0];
                String secondTeam = parts[1];
                int firstTeamScore = Integer.valueOf(parts[2]);
                int secondTeamScore = Integer.valueOf(parts[3]);
                
                match.add(new Match(firstTeam, secondTeam, firstTeamScore, secondTeamScore));
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return match;
    }
    
}
