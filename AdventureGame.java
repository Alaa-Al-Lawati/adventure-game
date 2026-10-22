import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Lost in the Library at the End of Time!");

        System.out.println("You wake up between two endless bookshelves.");
        System.out.println("A glowing book lies on the floor, and a tiny robot librarian rolls toward you.");
        System.out.println();
        System.out.println("Select one: [a] Pick up the glowing book  or  [b] Follow the robot");
        System.out.print(">> ");

        String choice1 = scanner.nextLine();

        choice1 = choice1.toLowerCase();

        if (choice1.equals("a")){
            System.out.println("The book opens by itself and shows a map with two glowing paths.");
            // choice 2 resulting from choice 1 - a: 
            System.out.println("Select one: [a] Silver Stairs  or  [b] Whispering Doors");
            System.out.print(">> ");
            String choice2 = scanner.nextLine().toLowerCase();

            if (choice2.equals("a")) {
                System.out.println("The stairs spiral up into the clouds. At the top is a locked door and a riddle: 'I have keys but no locks. I have space but no room. You can enter, but you can't go outside. What am I?'");
                String answer1 = scanner.nextLine().toLowerCase();
                if (answer1.equals("keyboard")) {
                    System.out.println("You push through the door and sunlight pours over you. You're standing outside the library at 9 a.m. with a coffee in your hand. Was it all a dream? You check your pocket... and there's a glowing library card. You escaped! Press [y] to play again.");
                } else {
                    System.out.println("Something went wrong. The shelves close in, the lights dim, and a book opens itself in your hands. You start reading... and you can't stop. Somewhere, a tiny robot sighs and stamps your card: \"Overdue.\" You are now part of the library. Press [y] to play again.");
                }

            } else if (choice2.equals("b")) {
                // Whispering Doors scene goes here
                System.out.println("Three doors: red, blue, green. A voice says 'Only one leads out'. Type red, blue or green");
                System.out.print(">> ");
                String answer2 = scanner.nextLine().toLowerCase();
                if (answer2.equals("green")) {
                    System.out.println("You push through the door and sunlight pours over you. You're standing outside the library at 9 a.m. with a coffee in your hand. Was it all a dream? You check your pocket... and there's a glowing library card. You escaped! Press [y] to play again.");
                }
                else if (answer2.equals("red")) { 
                    System.out.println("The red door swings open on a dragon's reading room. The dragon looks up from his book...");
                    System.out.println("The dragon smiles (can dragons smile?) and offers you a seat. It turns out he's been lonely for 400 years and just wants someone to read fantasy novels with. You now live in the library, and honestly, it's not so bad. You became the dragon's reading buddy. Press [y] to play again.");
                } else { 
                    System.out.println("Something went wrong. The shelves close in, the lights dim, and a book opens itself in your hands. You start reading... and you can't stop. Somewhere, a tiny robot sighs and stamps your card: \"Overdue.\" You are now part of the library. Press [y] to play again.");
                }

            } else {
                System.out.println("That's not an option!");
            }
        } else if (choice1.equals("b")) {
            System.out.println("The robot (named BIND-3R) leads you to a vending machine that sells a)'Snacks' and b)'Mystery Keys', Which one are you picking up: ");
            System.out.print(">> ");
            String choice3 = scanner.nextLine().toLowerCase();
            if (choice3.equals("a")){
                System.out.println("The robot is so delighted it gives you a free library card that opens any door");
                System.out.println("You push through the door and sunlight pours over you. You're standing outside the library at 9 a.m. with a coffee in your hand. Was it all a dream? You check your pocket... and there's a glowing library card. You escaped! Press [y] to play again.");
            }else if (choice3.equals("b")){
                System.out.println("The key unlocks a door to a dragon's reading room. You have two choices a) Say hello, or b) to Run");
                String answer3 = scanner.nextLine().toLowerCase();
                if (answer3.equals("a")){
                    System.out.println("The dragon smiles (can dragons smile?) and offers you a seat. It turns out he's been lonely for 400 years and just wants someone to read fantasy novels with. You now live in the library, and honestly, it's not so bad. You became the dragon's reading buddy. Press [y] to play again.");
                }else if (answer3.equals("b")){
                    System.out.println("Something went wrong. The shelves close in, the lights dim, and a book opens itself in your hands. You start reading... and you can't stop. Somewhere, a tiny robot sighs and stamps your card: \"Overdue.\" You are now part of the library. Press [y] to play again.");
                }else {
                    System.out.println("That's not an option");
                }

            } else { 
                System.out.println("That's not an option");
            }

        } else { 
            System.out.println("That's not an option!");
        }
        scanner.close();  
    }


}