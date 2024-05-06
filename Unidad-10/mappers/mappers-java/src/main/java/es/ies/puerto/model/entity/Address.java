package es.ies.puerto.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToMany()
    @JoinColumn(name="fk_customer")
    private Customer customer;
    @Column(name="country")
    private String country;
    @Column(name="address")
    private String address;
    @Column(name="zipcode")
    private String zipCode;

    public Address() {
    }

    public Address(Long id) {
        this.id = id;
    }

    //Se pone el constructor completo dependiendo de las necesidades

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        Address address = (Address) o;
        return Objects.equals(id, address.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //No es necesario por que no va a llegar a nadie que pueda leerlo
    /**
    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", customer=" + customer +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
    **/
}
