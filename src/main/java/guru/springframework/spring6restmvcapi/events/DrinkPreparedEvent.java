package guru.springframework.spring6restmvcapi.events;

import guru.springframework.spring6restmvcapi.model.BeerOrderLineDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrinkPreparedEvent {
    // This event is triggered when a drink is prepared for an order line.
    private BeerOrderLineDTO beerOrderLine;
}
