package org.example.microservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(name = "Cards",
        description = "Schema to hold Card information"
)
@Data
public class CardsDto {
    @NotEmpty(message = "Mobile number can not be a null or empty")
    @Pattern(regexp = "^$|[0-9]{10}",message="Mobile number must be 10 digits")
    @Schema(
            description = "Mobile Number of Customer", example = "4354437687"
    )
    private String mobileNUmber;

    @NotEmpty(message = "Card number can not be a null or empty")
    @Pattern(regexp = "^$|[0-9]{12}",message = "Card number must be 12 digits")
    @Schema(
            description = "Card Number of the customer", example = "100646930341"
    )
    private String cardNumber;

    @NotEmpty(message = "Card type can not be a null or empty")
    @Schema(
        description = "Type of the card", example = "Credit"
    )
    private String cardType;

    @Positive(message = "Total card limit should be greater than zero")
    @Schema(
            description = "Total limit of the card", example = "10000"
    )
    private int totalLimit;

    @PositiveOrZero(message = "Amount used should be greater than or equal to zero")
    @Schema(
            description = "Amount used by the customer", example = "5000"
    )
    private int amountUsed;

    @PositiveOrZero(message = "Available amount should be greater than or equal to zero")
    @Schema(
            description = "Available amount on the card", example = "500000"
    )
    private int availableAmount;
}
