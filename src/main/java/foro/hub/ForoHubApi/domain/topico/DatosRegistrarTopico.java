package foro.hub.ForoHubApi.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistrarTopico(
        @NotBlank
        String idUsuario,
        @NotBlank
        String mensaje,
        @NotBlank
        String nombreCurso,
        @NotBlank
        String titulo
) {
}