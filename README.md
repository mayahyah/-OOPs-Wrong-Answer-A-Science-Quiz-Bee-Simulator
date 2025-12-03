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

In GamaCharacter.java, encapsulation is applied by keeping the variables name and health private and exposing them only through public methods, which protects the internal data of the character and allows controlled access. 

    private Ability ability;
    private String description;

    private int skipUses = 2;
    private boolean extraLifeGranted = false;

    public Ability getAbility() {
        return ability;
    }

    public String getDescription() {
        return description;
    }

    public int getSkipUses() {
        return skipUses;
    }

    public boolean isExtraLifeGrantedThisLevel() {
        return extraLifeGranted;
    }

Lastly, the same can be observed from Scientists.java. It introduces private variables which can only be accessed through setter() and getter() methods shown above.

### *Inheritance*

    public class Darwin extends Scientists {
    
A class to acquire fields and methods from another class, Darwin class from Darwin.java inherits from the Scientists class (from Scientiists.java) and it gains all attributes such as name, health, ability, description, and methods like getAbility(). 

    public class Scientists extends GameCharacter implements ScientistAbility {

Scientists from Scientists.java extends GameCharacter, meaning it automatically receives all attributes and behaviors of a GameCharacter without rewriting them.

### *Abstraction*

    public interface ScientistAbility {

    // Called each question 
    default void beforeQuestion(GameCharacter scientist) {}

    // After question is answered
    default void onCorrect(GameCharacter scientist) {}

    default void onWrong(GameCharacter scientist) {}

    String getAbilityName();

The ScientistAbility interface from ScientistAbility.java declares what abilities a scientist must have but does not show how each scientist performs them. It forces all scientists (including Darwin and the regular Scientists class) to follow a common contract.

    public class Scientists extends GameCharacter implements ScientistAbility {

This is a general abstraction of a superclass "scientist" from Scientist.java. It includes essential variable details, such as name, health, ability type, and ability description. Yet, it hides unnecessary internal program details such as how skip uses are stored, how extra life flags are managed, and how hint logic is tracked.

### *Polymorphism*
    @Override
    public void beforeQuestion(GameCharacter scientist) {
        // Darwin changes ability each question
        Ability[] list = {
            Ability.HINT,
            Ability.SKIP_QUESTION,
            Ability.HEAL
        };


        Ability newA = list[random.nextInt(list.length)];
        try {
            java.lang.reflect.Field f = Scientists.class.getDeclaredField("ability");
            f.setAccessible(true);
            f.set(this, newA);
        } 
        catch (Exception e) {}


        System.out.println("(Darwin mimics: " + getAbilityName() + ")");
    }
Since Charles Darwin is a special character with an ability to copy other certain scientists' abilities, the logic of polymorphism was used to deisgn his overall kit. Every Scientist have their own beforeQuestion(), but Darwin has its own unique version to allow him to copy other scientists' abilities. Overriding those abilities allowed Darwin to perform his special ability throughout the game.

    @Override
    public String getAbilityName() {
        return "COPIED_" + super.getAbility().name();
    }
Another is that Darwin also displays what ability he copied for each questions, hence this override method shown above is necessary for better understanding of the flow of the game when using Darwin.

## ***Program Structure***

## ***How to Run the Program***
*Prerequisites*\

**1.	Before running the program, make sure the Java JDK 17 or later is installed. Open your terminal and check installation:**\
    <img width="975" height="134" alt="image" src="https://github.com/user-attachments/assets/89971ab0-a6a4-4d3d-99d1-c240f42ea31c" />\
    •	If you see an error like “java is not recognized”, Java is not installed or not added to your system’s PATH. Download the JDK to https://www.oracle.com/asean/java/technologies/downloads/#jdk25-windows\\
    
**2.	Go to the GitHub repository.**\
    
**3.	Click the green Code button and Download ZIP.**\
    
**4.	Extract the ZIP file to a folder (e.g., C:\Users\<YourName>\<ZIPfile>).**\
    
*Compile the Program*\

**5.	Open VS Code or another compiler.**\
    
**6.	Select File → Open Folder and choose the project folder.**\
    
**7.	Open Main.java and click the Run button or open a New Terminal and type java Main.java.**\

To navigate the program:\

**1.	Main Menu**\
        •	Shows unlocked levels and score.\
        •	Enter 0 to quit.\
        
**2.	Level Selection**\
        •	Enter a number (1–10).\
        •	Locked levels require clearing previous ones.\
        
**3.	Scientist Selection**\
    Choose from 6 scientists, each with unique abilities:\
        •	Galileo → Astronomy hints\
        •	Newton → Skip Physics (2 uses)\
        •	Darwin → Mimics random ability\
        •	Freud → Reduces 5 questions per level\
        •	Curie → +30 health at start\
        •	Lovelace → Heal +5 on correct answers \
        
**4.	Answering Questions**\
        •	Input a, b, c, or d.\
        •	Correct → +10 score\
        •	Wrong → -10 health\
        •	Health and score are shown after each question\
        •	Clear the level to unlock the next one\



