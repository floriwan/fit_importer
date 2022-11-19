package org.floriwan.fit.data;

import com.garmin.fit.DateTime;
import com.garmin.fit.File;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fit_file_id")
public class FileId {
    protected FileId() {}

    public FileId(
            File type,
            Integer manufacturer,
            Integer product,
            Integer faveroProduct,
            Integer garminProduct,
            Long serialNumber,
            java.util.Date timeCreated,
            Integer number,
            String productName) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.product = product;
        this.faveroProduct = faveroProduct;
        this.garminProduct = garminProduct;
        this.serialNumber = serialNumber;
        this.timeCreated = timeCreated;
        this.number = number;
        this.productName = productName;
    }

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private File type;

    @Column
    private Integer manufacturer;

    @Column
    private Integer product;

    @Column
    private Integer faveroProduct;

    @Column
    private Integer garminProduct;

    @Column
    private Long serialNumber;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column
    private java.util.Date timeCreated;

    @Column
    private Integer number;

    @Column
    private String productName;

    public Integer getId() {
        return id;
    }

    public File getType() {
        return type;
    }

    public Integer getManufacturer() {
        return manufacturer;
    }

    public Integer getProduct() {
        return product;
    }

    public Integer getFaveroProduct() {
        return faveroProduct;
    }

    public Integer getGarminProduct() {
        return garminProduct;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public Integer getNumber() {
        return number;
    }

    public String getProductName() {
        return productName;
    }
}
