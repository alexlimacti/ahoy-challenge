package com.alexsandro.ahoytest.service;

import com.alexsandro.ahoytest.dto.AgentesDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class UploadXMLService {

    public AgentesDTO readXMLFile(MultipartFile file) {

        try {
            XmlMapper xmlMapper = new XmlMapper();
            ObjectMapper jsonMapper = new ObjectMapper();
            JsonNode node = xmlMapper.readTree(file.getInputStream());
            String json = jsonMapper.writeValueAsString(node);
            jsonMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
            jsonMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return jsonMapper.readValue(json, AgentesDTO.class);
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
