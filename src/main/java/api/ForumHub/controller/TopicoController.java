
package api.ForumHub.controller;

import api.ForumHub.dto.CriarTopicoDTO;
import api.ForumHub.dto.TopicoDTO;
import api.ForumHub.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @PostMapping
    public ResponseEntity<TopicoDTO> criar(@RequestBody CriarTopicoDTO dto) {
        return ResponseEntity.ok(topicoService.criar(dto));
    }

    @GetMapping
    public ResponseEntity<List<TopicoDTO>> listar() {
        return ResponseEntity.ok(topicoService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TopicoDTO> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(topicoService.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TopicoDTO> atualizar(@PathVariable Long id, @RequestBody CriarTopicoDTO dto) {
        return ResponseEntity.ok(topicoService.atualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        topicoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}