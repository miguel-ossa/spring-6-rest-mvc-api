package guru.springframework.spring6restmvcapi.events;

import guru.springframework.spring6restmvcapi.model.BeerOrderDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlacedEvent {
    // This event is triggered when a beer order is placed
    private BeerOrderDTO beerOrderDTO;
}
