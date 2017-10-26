package core;

import java.io.*;
import java.net.URL;
import javax.xml.stream.*;

public class STAX{
	public static void main(String[] args) throws XMLStreamException, IOException {

		URL url = new URL("http://alex.academy/ebay.xml");

		final String element_01 = "orig-kw";
		final String element_02 = "engine";
		final String element_03 = "kadu-version";
		final String element_04 = "response-time";
		final String element_05 = "deals";
		final String element_06 = "country_id";
		final String element_07="kadu-branch";
		final String element_08="kadu-version";
		final String element_09="kadu-index-info";
		final String element_10="categories";//attribute_02
		final String element_11="category";//attribute_03
		final String element_12="products";//attribut_04
		final String element_13="products";
		final String element_14="id";
		final String element_15="name";
		final String element_16="description";
		final String element_17="impact-score";
		final String element_18="impact-raw-score";
		final String element_19="price";
		final String element_20="static-score";
		final String element_21="orig-price";
		final String element_22="on-sale";
		final String element_23="on-sale-percent-off";
		final String element_24="tax";
		final String element_25="shipping-cost";
		final String element_26="free-shipping";
		final String element_27="merchant-ref";
		final String element_28="category-ref";
		final String element_29="bid";
		final String element_30="bid-level";
		final String element_31="raw-bid";
		final String element_32="addon";//attribute_05
		final String element_33="crawler-id";
		final String element_34="url";
		
		InputStream in = url.openStream();

		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader reader = factory.createXMLStreamReader(in);
		int eventType = reader.getEventType();

		while (reader.hasNext()) {

		eventType = reader.next();

			if (eventType == XMLStreamReader.START_ELEMENT) {
			if (reader.getLocalName() == element_01) {System.out.println("Key Word: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_02) {System.out.println("Engine: \t\t " + reader.getElementText());}
			if (reader.getLocalName() == element_03) {System.out.println("Version: \t " + reader.getElementText());}
			//if (reader.getLocalName() == element_04) {System.out.println("Response time: \t " + reader.getElementText());}
			//if (reader.getLocalName() == element_05) {System.out.println("Number of deals: " + reader.getAttributeValue(0));}
			if (reader.getLocalName() == element_06) {System.out.println("database: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_07) {System.out.println("lang_id: \t " + reader.getElementText());}
			//if (reader.getLocalName() == element_08) {System.out.println("country_id: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_09) {System.out.println("kadu-branch: \t " + reader.getElementText());}
			//if (reader.getLocalName() == element_10) {System.out.println("kadu-version: \t " + reader.getAttributeValue(0));}
			//if (reader.getLocalName() == element_11) {System.out.println("kadu-index-info: \t " + reader.getAttributeValue(0));}
			//if (reader.getLocalName() == element_12) {System.out.println("categories: \t " + reader.getAttributeValue(0));}
			if (reader.getLocalName() == element_13) {System.out.println("category: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_14) {System.out.println("id: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_15) {System.out.println("name: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_16) {System.out.println("impact-score: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_17) {System.out.println("impact-raw-score: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_18) {System.out.println("price: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_19) {System.out.println("static-score: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_20) {System.out.println("orig-price: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_21) {System.out.println("on-sale: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_22) {System.out.println("on-sale-percent-off: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_23) {System.out.println("tax: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_24) {System.out.println("shipping-cost: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_25) {System.out.println("free-shipping: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_26) {System.out.println("merchant-ref: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_27) {System.out.println("category-ref: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_28) {System.out.println("bid: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_29) {System.out.println("bid-level: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_30) {System.out.println("raw-bid: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_31) {System.out.println("addon: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_32) {System.out.println("crawler-id: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_33) {System.out.println("url \t " + reader.getElementText());}
				if (reader.getLocalName() == element_04) {System.out.println("Response time: \t " + reader.getElementText());}
		}}
	}
}