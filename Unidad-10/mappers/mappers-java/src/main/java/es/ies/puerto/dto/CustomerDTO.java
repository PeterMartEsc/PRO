package es.ies.puerto.dto;

import java.io.Serializable;
import java.util.Objects;

public class CustomerDTO implements Serializable {

    private Long id;
    private String FullName;
    private String country;
    private String Address;
    private String zipCode;

    public CustomerDTO() {
    }

    public CustomerDTO(Long id) {
        this.id = id;
    }

    public CustomerDTO(Long id, String fullName, String country, String address, String zipCode) {
        this.id = id;
        this.FullName = fullName;
        this.country = country;
        this.Address = address;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        this.FullName = fullName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDTO that = (CustomerDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id + '\'' +
                ", FullName='" + FullName + '\'' +
                ", country='" + country + '\'' +
                ", Address='" + Address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
