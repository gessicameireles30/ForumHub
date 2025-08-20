package api.ForumHub.service;

import api.ForumHub.dto.CriarTopicoDTO;
import api.ForumHub.dto.TopicoDTO;
import api.ForumHub.model.Topico;
import api.ForumHub.model.Usuario;
import api.ForumHub.repository.TopicoRepository;
import api.ForumHub.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Criar
    public TopicoDTO criar(CriarTopicoDTO dto) {
        Usuario autor = usuarioRepository.findById(dto.autorId())
                .orElseThrow(() -> new RuntimeException("Autor não encontrado"));

        Topico topico = new Topico(dto.titulo(), dto.mensagem(), autor);
        topicoRepository.save(topico);

        return new TopicoDTO(topico.getId(), topico.getTitulo(), topico.getMensagem(), autor.getNome());
    }

    // Listar todos
    public List<TopicoDTO> listar() {
        return topicoRepository.findAll()
                .stream()
                .map(t -> new TopicoDTO(t.getId(), t.getTitulo(), t.getMensagem(), t.getAutor().getNome()))
                .toList();
    }

    // Buscar por ID
    public TopicoDTO buscarPorId(Long id) {
        Topico topico = topicoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tópico não encontrado"));

        return new TopicoDTO(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getAutor().getNome());
    }

    // Atualizar
    public TopicoDTO atualizar(Long id, CriarTopicoDTO dto) {
        Topico topico = topicoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tópico não encontrado"));

        Usuario autor = usuarioRepository.findById(dto.autorId())
                .orElseThrow(() -> new RuntimeException("Autor não encontrado"));

        topico.setTitulo(dto.titulo());
        topico.setMensagem(dto.mensagem());
        topico.setAutor(autor);

        topicoRepository.save(topico);

        return new TopicoDTO(topico.getId(), topico.getTitulo(), topico.getMensagem(), autor.getNome());
    }

    // Deletar
    public void deletar(Long id) {
        if (!topicoRepository.existsById(id)) {
            throw new RuntimeException("Tópico não encontrado");
        }
        topicoRepository.deleteById(id);
    }
}