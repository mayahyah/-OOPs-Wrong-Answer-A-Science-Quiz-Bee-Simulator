public interface ScientistAbility {
    // Called each question — allows polymorphic behavior
    default void beforeQuestion(GameCharacter scientist) {}

    // Called after question is answered
    default void onCorrect(GameCharacter scientist) {}

    default void onWrong(GameCharacter scientist) {}

    // Allows polymorphic description
    String getAbilityName();
}
