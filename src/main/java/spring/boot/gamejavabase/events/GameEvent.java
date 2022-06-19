package spring.boot.gamejavabase.events;

import org.springframework.context.ApplicationEvent;

import java.util.Locale;

public class GameEvent extends ApplicationEvent {

    private final int guess;
    private final Locale locale;


    public GameEvent(int guess, Locale locale) {
        super(guess);

        this.guess = guess;
        this.locale = locale;
    }

    public int getGuess() {
        return guess;
    }

    public Locale getLocale() {
        return locale;
    }


}