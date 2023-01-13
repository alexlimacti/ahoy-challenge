package com.alexsandro.ahoytest.resource;

import com.alexsandro.ahoytest.dto.RegiaoGetDTO;
import com.alexsandro.ahoytest.dto.ResponseMessageDTO;
import com.alexsandro.ahoytest.service.AgenteService;
import com.alexsandro.ahoytest.service.RegiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin("*")
@RestController
public class UploadController {

    @Autowired
    private AgenteService agenteService;

    @Autowired
    private RegiaoService regiaoService;

    @PostMapping("/upload")
    public ResponseEntity<ResponseMessageDTO> uploadFile(@RequestParam("file") MultipartFile file) {
        String message = "";
        try {
            agenteService.saveAgente(file);
            message = "Upload realizado com sucesso: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessageDTO(message));
        } catch (Exception e) {
            message = "Houve falha no upload do arquivo: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessageDTO(message));
        }
    }

    @GetMapping(value = "/regioes/{sigla}", produces="application/json")
    public ResponseEntity<List<RegiaoGetDTO>> getListFiles(@PathVariable String sigla) {
        return ResponseEntity.status(HttpStatus.OK).body(regiaoService.findBySigla(sigla));
    }
}
