package com.example.Restaurant.Entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRestaurant {
    @NotNull
    private Integer restId;

    @NotBlank
    private String restName;

    @NotBlank
    private String restAddress;

    @Size(min = 10,max = 10)
    @Pattern(regexp = "^[0-9]+$", message = "contacts should be just numbers!!")
    private String restContactNo;

    @NotBlank
    private String specialty;

    public void setRestId(Integer restId) {
        this.restId = restId;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public void setRestAddress(String restAddress) {
        this.restAddress = restAddress;
    }

    public void setRestContactNo(String restContactNo) {
        this.restContactNo = restContactNo;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getRestId() {
        return restId;
    }

    public String getRestName() {
        return restName;
    }

    public String getRestAddress() {
        return restAddress;
    }

    public String getRestContactNo() {
        return restContactNo;
    }

    public String getSpecialty() {
        return specialty;
    }

    public Integer getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(Integer totalStaff) {
        this.totalStaff = totalStaff;
    }

    @Min(1)
    private Integer totalStaff;
}
