package org.example.microservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
@Schema(
    name = "Accounts",
    description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            description = "Account Number of account",
            example = "3453667890"
    )
    @NotEmpty(message = "AccountNumber can not be a null or empty")
    @Pattern(regexp = "(^\\d{10}$)" ,message="AccountNumber should be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of account",
            example = "Savings"
    )
    @NotEmpty(message = "AccountType can not be a null or empty" )
    private String accountType;

    @Schema(
            description = "Branch address",
            example = "123 New York Street"
    )
    @NotEmpty(message = "BranchAddress can not be a null or empty" )
    private String branchAddress;
}
