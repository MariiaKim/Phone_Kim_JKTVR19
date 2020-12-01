/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author pupil
 */
@Entity
public class Phone implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String marka;   
    private Integer publishedYear;

    public Phone() {
    }

    public Phone(String title, String marka,Integer price, Integer publishedYear) {
        this.title = title;
        this.marka = marka;
        this.publishedYear = publishedYear;
    }
    public Phone(String title, String marka, String publishedYear) {
        this.title = title;
        this.marka = marka;
        setPublishedYear(publishedYear);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Integer publishedYear) {
        this.publishedYear = publishedYear;
    }
    public void setPublishedYear(String publishedYear) {
        try {
            int publishedYearInt = Integer.parseInt(publishedYear);
            this.publishedYear = publishedYearInt;
            System.out.println("Строка "+publishedYear+" успешно преобразована в число.");
        } catch (Exception e) {
            System.out.println("Введены не цифры. Поле не изменено");
        }
        
    }

    @Override
    public String toString() {
        return "Phone{" 
                + "title=" + title 
                + ", marka=" + marka 
                + ", publishedYear=" + publishedYear 
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.title);
        hash = 97 * hash + Objects.hashCode(this.marka);
        hash = 97 * hash + Objects.hashCode(this.publishedYear);
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
        final Phone other = (Phone) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.marka, other.marka)) {
            return false;
        }
        if (!Objects.equals(this.publishedYear, other.publishedYear)) {
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

