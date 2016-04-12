package org.example.test;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubCategory", propOrder = {
        "good"
})
public class SubCategory {

    @XmlElement(required = true)
    protected List<Good> good;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    public List<Good> getGood() {
        if (good == null) {
            good = new ArrayList<Good>();
        }
        return this.good;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
