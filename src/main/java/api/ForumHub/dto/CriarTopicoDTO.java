
package api.ForumHub.dto;


public record CriarTopicoDTO(
        String titulo,
        String mensagem,
        Long autorId
) {}
