package org.example.microservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "CustomerDetails",
        description = "Schema to hold Customer, Account, Cards and Loans  information"
)
public class CustomerDetailsDto {
    @Schema(
            description = "Name of the customer",
            example = "John Doe"
    )
    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min = 5, max=30 , message="The lenght of the customer name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email address of the customer",
            example = "jhon@doe.com"
    )
    @NotEmpty(message = "Email address can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(
            description = "Mobile number of the customer",
            example = "1234567890"
    )
    @Pattern(regexp = "(^\\d{10}$)" ,message="MobileNumber should be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details  of the customer"
    )
    private AccountsDto accountsDto;

    @Schema(
            description = "Cards details  of the customer"
    )
    private CardsDto cardsDto;

    @Schema(
            description = "Loans details  of the customer"
    )
    private LoansDto loansDto;
}
