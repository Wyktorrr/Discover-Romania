package org.discover.romania;

import org.discover.romania.domain.Destination;
import org.discover.romania.domain.Neighbourhood;
import org.discover.romania.domain.Region;

import java.util.List;

import static java.util.Arrays.asList;
import static org.discover.romania.domain.City.BRASOV;
import static org.discover.romania.domain.Neighbourhood.BRASOV_HISTORICAL_CENTER;
import static org.discover.romania.domain.Region.TRANSILVANIA;

public class DestinationRepository {
    public static List<Destination> availableDestination = asList(Destination.builder().region(TRANSILVANIA).city(BRASOV).neighbourhood(BRASOV_HISTORICAL_CENTER).build(),
            Destination.builder().city(BRASOV).region(Region.DOBROGEA) //currently working like this bcs no validations are added
            .neighbourhood(Neighbourhood.BRASOV_HISTORICAL_CENTER).build());
    public List<Destination> listAvailableDestinations() {
        return availableDestination;
    }
}
