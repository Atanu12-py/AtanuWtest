package com.example.Restaurant.Repo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateSpecialty {
    @NotNull
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getId() {
        return id;
    }

    public String getSpecialty() {
        return specialty;
    }

    @NotBlank
    private String specialty;

}
