# -OOPs-Wrong-Answer-A-Quiz-Bee-Game-Simulator
***Description:*** This program is a quiz bee simulator that lets users play as different scientists that are well-known in history. Each playable scientists will provide players unique abilities to help them survive questions of varying difficulties within different levels. The program's foundation will revolve around the four main OOP principles to efficiently showcase the fun in answering scientific questions, as well as help players effectively learn different science fundamentals.

## ***Object-Oriented Programming Concepts Applied***
The following are the detailed documentation of how the OOP principal were used throughout the program:
### *Encapsulation*
    private String text;
    private String[] choices;
    private char correct;
    private String category;

    public String getText() {
        return text;
    }

    public String[] getChoices() {
        return choices;
    }

    public char getCorrect() {
        return correct;
    }

    public String getCategory() {
        return category;
    }
    
The Question.java stays consistent and prevents unwanted modification, keeping data safe and controlled. 

    private int score = 0;
    private int unlockedLevels = 1;
    private Scientists scientist;

    public int getScore() { 
        return score; 
    }
    
    public void addScore(int amount) { 
        score += amount; 
    }

    public int getUnlockedLevels() { 
        return unlockedLevels; 
    }

    public void setScientist(Scientists s) {
        this.scientist = s;
    }

    public Scientists getScientist() {
        return scientist;
    }
These encapsulated player information from Player.java can only be accessed through the Getters() and Setters() functions. These are necessary information that a player can accumulate as they advance through the game.

    private Player player;
    private Scanner scanner = new Scanner(System.in);

    
Private fields from GameLevels.java are fully encapsulated, so they cannot be accessed directly outside the class and this protects them from unwanted modification. 

    private String name;
    private int health;

    public String getName() {
        return name;
    }


    public int getHealth() {
        return health;
    }


    public void modifyHealth(int amount) {
        this.health += amount;
    }

Applied by keeping the variables name and health private and exposing them only through public methods, which protects the internal data of the character and allows controlled access. 

### *Inheritance*

    public class Darwin extends Scientists {
    
A class to acquire fields and methods from another class, Darwin class from Darwin.java inherits from the Scientists class (from Scientiists.java) and it gains all attributes such as name, health, ability, description, and methods like getAbility(). 

    public class Scientists extends GameCharacter implements ScientistAbility {

Scientists from Scientists.java extends GameCharacter, meaning it automatically receives all attributes and behaviors of a GameCharacter without rewriting them.

### *Abstraction*


