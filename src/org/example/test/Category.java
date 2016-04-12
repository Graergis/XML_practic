package org.example.test;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", propOrder = {
        "subCategory"
})
public class Category {

    @XmlElement(required = true)
    protected List<SubCategory> subCategory;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    public List<SubCategory> getSubCategory() {
        if (subCategory == null) {
            subCategory = new ArrayList<SubCategory>();
        }
        return this.subCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
