package com.chemax.project.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "operational_section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column (name = "section_full_name")
    private String sectionFullName;

    @Column (name = "section_short_name")
    private String sectionShortName;

    @Column (name = "section_conversational_name")
    private String sectionConversationalName;

    @OneToMany(mappedBy = "section")
    private List<Area> areaEntities;

    public List<Area> getAreaEntities() {
        return areaEntities;
    }

    public void setAreaEntities(List<Area> areaEntities) {
        this.areaEntities = areaEntities;
    }

    public Section(String fullName, String shortName, String conversationalName){
    }

    public Section(String fullName) {
    }

    public Section(String fullName, String conversationalName) {
    }

    public Section() {
    }

    public String getSectionFullName() {
        return sectionFullName;
    }

    public void setSectionFullName(String sectionFullName) {
        this.sectionFullName = sectionFullName;
    }

    public String getSectionShortName() {
        return sectionShortName;
    }

    public Integer getId() {
        return id;
    }

    public void setSectionShortName(String sectionShortName) {
        this.sectionShortName = sectionShortName;
    }

    public String getSectionConversationalName() {
        return sectionConversationalName;
    }

    public void setSectionConversationalName(String sectionConversationalName) {
        this.sectionConversationalName = sectionConversationalName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

