package guru.springframework.spring6restmvcapi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BeerOrderShipmentDTO {

    private UUID id;

    private Long version;

    @NotBlank
    @Size(max = 100)
    private String trackingNumber;

    private Timestamp createdDate;
    private Timestamp lastModifiedDate;
}
