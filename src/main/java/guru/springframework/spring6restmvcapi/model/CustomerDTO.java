package guru.springframework.spring6restmvcapi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private UUID id;

    @NotBlank
    @NotNull
    @Size(max = 50)
    private String customerName;
    private Integer version;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
}
