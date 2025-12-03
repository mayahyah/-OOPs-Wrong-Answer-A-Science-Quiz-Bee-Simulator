# -OOPs-Wrong-Answer-A-Quiz-Bee-Game-Simulator
***Description:*** This program is a quiz bee simulator that lets users play as different scientists that are well-known in history. Each playable scientists will provide players unique abilities to help them survive questions of varying difficulties within different levels. The program's foundation will revolve around the four main OOP principles to efficiently showcase the fun in answering scientific questions, as well as help players effectively learn different science fundamentals.

## ***Object-Oriented Programming Concepts Applied***
The following are the detailed documentation of how the OOP principal were used throughout the program:
### *Encapsulation*
    private String text;
    private String[] choices;
    private char correct;
    private String category;
The Question.java stays consistent and prevents unwanted modification, keeping data safe and controlled. 

    private int score = 0;
    private int unlockedLevels = 1;
    private Scientists scientist;

These encapsulated player information from Player.java can only be accessed through the Getters() and Setters() functions. These are necessary information that a player can accumulate as they advance through the game.

<img width="450" height="64" alt="image" src="https://github.com/user-attachments/assets/f5a9c24a-a940-4879-a9ae-8d5e53860a00" /> \
Private fields from GameLevels.java are fully encapsulated, so they cannot be accessed directly outside the class and this protects them from unwanted modification. 

<img width="504" height="167" alt="image" src="https://github.com/user-attachments/assets/9ea546fc-bbb3-4915-b7a8-400fef132156" /> \

