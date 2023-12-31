package org.narainox;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "student_address")
public class Address {
    @Id
    @GeneratedValue
            (
                strategy = GenerationType.IDENTITY
            )
    @Column(name="address_id")
    private int addressId;

    @Column(name = "Street",length=100)
    private String street;

    @Column(name = "City",length=100)
    private String city;
    @Column(name = "is_open")
    private boolean isOpen;
    @Transient
    private double x;

    @Temporal(TemporalType.DATE)
    @Column(name = "added_date")
    private Date addedDate;

    @Lob
    @Column(length = 15000)
    private byte[] image;

    public Address(int addressId, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }

    public Address() {
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
