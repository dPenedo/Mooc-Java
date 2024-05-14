import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void startMenu() {
        System.out.println("File to read: ");
        String fileToRead = scanner.nextLine();
        System.out.println("Commands:\n" +
            "list - lists the recipes\n" +
            "stop - stops the program\n" +
            "find name - searches recipes by name\n" +
            "find cooking time - searches recipes by cooking time\n" +
            "find ingredient - searches recipes by ingredient\n");


        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("list")) {
                listRecipes(fileToRead);
            } else if (command.equals("find name")) {
                findRecipeByName(fileToRead);
            } else if (command.equals("find cooking time")) {
                findByCookingTime(fileToRead);
            } else if (command.equals(("find ingredient"))) {
                findByIngredients(fileToRead);
            } else if (command.equals("stop")) {
                break;
            }
        }
    }

    public void listRecipes(String fileToRead) {
        try (Scanner scanner1 = new Scanner(Paths.get(fileToRead))) {
            int recipeLine = 0;
            while (scanner1.hasNextLine()) {
                String row = scanner1.nextLine();
                if (row.isEmpty()) {
                    System.out.println();
                    recipeLine = 0;
                } else if (recipeLine == 0) {
                    System.out.print(row + ", cooking time: ");
                    recipeLine++;
                } else if (recipeLine == 1) {
                    System.out.print(row);
                    recipeLine++;
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void findRecipeByName(String fileToRead) {
        System.out.println("Searched word: ");
        String nameToSearch = scanner.nextLine();
        System.out.println("Recipes:");
        try (Scanner scanner1 = new Scanner(Paths.get(fileToRead))) {
            int recipeLine = 0;
            boolean containsWord = false;
            while (scanner1.hasNextLine()) {
                String row = scanner1.nextLine();
                if (row.isEmpty()) {
                    recipeLine = 0;
                    containsWord = false;
                } else if (recipeLine == 0) {
                    recipeLine++;
                    if (row.contains(nameToSearch)) {
                        System.out.print(row + ", cooking time: ");
                        containsWord = true;
                    }
                } else if (recipeLine == 1) {
                    recipeLine++;
                    if (containsWord) {
                        System.out.print(row);
                    }
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void findByCookingTime(String fileToRead) {
        System.out.println("Max cooking time:");
        int maxCookingTime = Integer.valueOf(scanner.nextLine());
        System.out.println("Recipes:");
        try (Scanner scanner1 = new Scanner(Paths.get(fileToRead))) {
            String recipeName = "";
            int recipeCookingTime = 0;
            while (scanner1.hasNextLine()) {
                String row = scanner1.nextLine();
                if (row.isEmpty()) {
                    if (recipeCookingTime <= maxCookingTime) {
                        System.out.println(recipeName + ", cooking time: " + recipeCookingTime);
                    }
                    recipeName = "";
                    recipeCookingTime = 0;
                } else if (recipeName.isEmpty()) {
                    recipeName = row;
                } else if (recipeCookingTime == 0) {
                    recipeCookingTime = Integer.parseInt(row);
                }
            }
            // Check for the last recipe after loop ends
            if (recipeCookingTime <= maxCookingTime) {
                System.out.println(recipeName + ", cooking time: " + recipeCookingTime);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void findByIngredients(String fileToRead) {
        System.out.println("Ingredient:");
        String ingredientToFind = scanner.nextLine();
        System.out.println("Recipes:");
        try (Scanner scanner1 = new Scanner(Paths.get(fileToRead))) {
            ArrayList<String> listOfIngredients = new ArrayList<>();
            String recipeName = "";
            int recipeCookingTime = 0;
            while (scanner1.hasNextLine()) {
                String row = scanner1.nextLine();
                if (row.isEmpty()) {
                    if (listOfIngredients.contains(ingredientToFind)) {
                        System.out.println(recipeName + ", cooking time: " + recipeCookingTime);
                    }
                    recipeName = "";
                    recipeCookingTime = 0;
                    listOfIngredients.clear();
                } else if (recipeName.isEmpty()) {
                    recipeName = row;
                } else if (recipeCookingTime == 0) {
                    recipeCookingTime = Integer.parseInt(row);
                } else {
                    listOfIngredients.add(row);
                }
            }
            // Check for the last recipe after loop ends
            if (listOfIngredients.contains(ingredientToFind)) {
                System.out.println(recipeName + ", cooking time: " + recipeCookingTime);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}



