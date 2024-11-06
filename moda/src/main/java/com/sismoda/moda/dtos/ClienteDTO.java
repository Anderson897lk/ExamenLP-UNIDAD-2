package com.sismoda.moda.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClienteDTO {
    private Long idCliente;
    @NotNull(message = "Complete el campo")
    private String dnirucCliente;
    @NotNull(message = "Complete el campo")
    private String nombreCliente;
    @NotNull(message = "Complete el campo")
    private String apellidoCliente;
    @NotNull(message = "Complete el campo")
    private String telefonoCliente;
    @NotNull(message = "Complete el campo")
    private String correoCliente;
    @NotNull(message = "Complete el campo")
    private String direccionCliente;


}
