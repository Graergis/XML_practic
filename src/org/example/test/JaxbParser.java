package org.example.test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;
import java.io.FileNotFoundException;

public class JaxbParser {

    public JaxbParser(String numder) throws XMLStreamException, JAXBException, FileNotFoundException {
        XMLInputFactory xif = XMLInputFactory.newFactory();
        StreamSource xml = new StreamSource("test.xml");
        XMLStreamReader xsr = xif.createXMLStreamReader(xml);

        JAXBContext jc = JAXBContext.newInstance(Categories.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        JAXBElement<Categories> jb = unmarshaller.unmarshal(xsr, Categories.class);
        xsr.close();
        Categories categories = jb.getValue();
        if (numder.equals("2")) {
            Converter converter = new Converter(jb.getValue());
        }
        if (numder.equals("1")) {
            for (Category category : categories.getCategory()) {
                System.out.println(category.getName());
                for (SubCategory subCategory : category.getSubCategory()) {
                    System.out.println(subCategory.getName());
                    for (Good good : subCategory.getGood()) {
                        System.out.print("Модель - " + good.getModel() + "; Изготовитель - " + good.getProducer() + "; Цена - " + good.getCost() + "; Цвет - " + good.getColor() + "; Дата изготовления - " + good.getCreateDate() + "; Наличие - " + good.getQuantity());
                        System.out.println();
                    }
                }
            }
        }
    }

}