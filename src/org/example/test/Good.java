package org.example.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Good")
public class Good {

    @XmlAttribute(name = "Producer", required = true)
    protected String producer;
    @XmlAttribute(name = "Model", required = true)
    protected String model;
    @XmlAttribute(name = "CreateDate", required = true)
    protected String createDate;
    @XmlAttribute(name = "Color", required = true)
    protected String color;
    @XmlAttribute(name = "Cost", required = true)
    protected String cost;
    @XmlAttribute(name = "Quantity", required = true)
    protected String quantity;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String value) {
        this.producer = value;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String value) {
        this.model = value;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String value) {
        this.createDate = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String value) {
        this.color = value;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String value) {
        this.cost = value;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String value) {
        this.quantity = value;
    }

}
