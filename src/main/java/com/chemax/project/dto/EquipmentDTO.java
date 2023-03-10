package com.chemax.project.dto;

import com.chemax.project.entity.Document;
import lombok.Data;

import java.util.List;

@Data
public class EquipmentDTO {
    private Integer id;
    private String machineModel;
    private String manufacturerCountry;
    private String manufacturer;
    private String manufacturingYear;
    private String machineNumber;
    private String details;
    private Integer machineTypeId;
    private Integer areaId;
    private List<Document> files;
}
