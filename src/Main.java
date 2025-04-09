import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import ru.academy.zoo.exceptions.AgeException;
import ru.academy.zoo.objects.Lion;

public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Configurator.setRootLevel(Level.ERROR);

        try {
            Lion lion = new Lion("Лёва", -10);
        } catch (AgeException e) {

            log.error("Ошибка", e);
        }
    }
}