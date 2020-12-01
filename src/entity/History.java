/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author pupil
 */
@Entity
public class History implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Phone phone;
    @OneToOne
    private Customer customer;
    @Temporal(TemporalType.TIMESTAMP)
    private Date takeOnDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date returnDate;

    public History() {
    }

    public History(Phone phone, Customer customer, Date takeOnDate, Date returnDate) {
        this.phone = phone;
        this.customer = customer;
        this.takeOnDate = takeOnDate;
        this.returnDate = returnDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setBook(Phone book) {
        this.phone = phone;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getTakeOnDate() {
        return takeOnDate;
    }

    public void setTakeOnDate(Date takeOnDate) {
        this.takeOnDate = takeOnDate;
    }

    @Override
    public String toString() {
        return "History{" 
                + "phone=" + phone.getTitle()
                + ", customer=" + customer.getFirstname()+" "+customer.getLastname()
                + ", takeOnDate=" + takeOnDate 
                + ", returnDate=" + returnDate 
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.phone);
        hash = 37 * hash + Objects.hashCode(this.customer);
        hash = 37 * hash + Objects.hashCode(this.takeOnDate);
        hash = 37 * hash + Objects.hashCode(this.returnDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final History other = (History) obj;
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.customer, other.customer)) {
            return false;
        }
        if (!Objects.equals(this.takeOnDate, other.takeOnDate)) {
            return false;
        }
        if (!Objects.equals(this.returnDate, other.returnDate)) {
            return false;
        }
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}

