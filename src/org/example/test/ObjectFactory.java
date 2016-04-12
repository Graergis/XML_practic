package org.example.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _Categories_QNAME = new QName("http://www.example.org/test/", "categories");

    public ObjectFactory() {
    }

    public Categories createCategories() {
        return new Categories();
    }

    public Category createCategory() {
        return new Category();
    }

    public SubCategory createSubCategory() {
        return new SubCategory();
    }

    public Good createGood() {
        return new Good();
    }

    @XmlElementDecl(namespace = "http://www.example.org/test/", name = "categories")
    public JAXBElement<Categories> createCategories(Categories value) {
        return new JAXBElement<Categories>(_Categories_QNAME, Categories.class, null, value);
    }

}
