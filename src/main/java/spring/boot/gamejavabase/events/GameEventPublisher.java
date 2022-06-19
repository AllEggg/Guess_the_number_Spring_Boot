package spring.boot.gamejavabase.events;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Locale;
@Component
public class GameEventPublisher implements ApplicationContextAware {

    private ApplicationContext context;

    public void publishEvent(int guess, Locale locale) {
        context.publishEvent(new GameEvent(guess, locale));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}