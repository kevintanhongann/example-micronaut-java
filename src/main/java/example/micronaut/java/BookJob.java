package example.micronaut.java;

import javax.inject.Singleton;
import io.micronaut.scheduling.annotation.Scheduled;

@Singleton
public class BookJob {

    @Scheduled(fixedRate = "5m")
    public void process() {}
}