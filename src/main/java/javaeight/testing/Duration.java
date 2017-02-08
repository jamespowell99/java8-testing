package javaeight.testing;

import java.util.Optional;
import java.util.Properties;

/**
 * Created by jpowel on 08/02/2017.
 */
public class Duration {
    public int readDurationOrig(Properties props, String name) {
        String value = props.getProperty(name);
        if (value != null) {
            try {
                int i = Integer.parseInt(value);
                if (i > 0) {
                    return i;
                }
            } catch (NumberFormatException e) {

            }
        }
        return 0;
    }

    public int readDuration(Properties props, String name) {
        try {
            return Optional.ofNullable(props.getProperty(name))
                    .flatMap(s -> Optional.of(Integer.parseInt(s)))
                    .filter(val -> val > 0)
                    .orElse(0);
        }catch (NumberFormatException e) {
            return 0;
        }
    }
}
