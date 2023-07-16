package gim.boss.finchirp.scheduled;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class TestScheduler {

    @Scheduled(cron = "*/5 * * * * *")
    public void logger() {
        log.info("Application running.");
    }
}
