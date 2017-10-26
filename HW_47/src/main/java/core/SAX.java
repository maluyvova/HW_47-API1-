


package core;

import java.io.IOException;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public class SAX extends DefaultHandler {

	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
		
		String url = "http://alex.academy/ebay.xml";

		final String element_01 = "orig-kw";
		final String element_02 = "normalized-kw";
		final String element_03 = "engine";
		final String element_04 = "database";
		final String element_05 = "lang_id";
		final String element_06 = "country_id";
		final String element_07="kadu-branch";
		final String element_08="kadu-version";
		final String element_09="kadu-index-info";
		final String element_10="categories";//attribute_02
		final String element_11="category";//attribute_03
		final String element_12="products";//attribut_04
		final String element_13="products";//attribut_04
		final String element_14="id";//attribut_04
		final String element_15="name";//attribut_04
		final String element_16="description";//attribut_04
		final String element_17="impact-score";//attribut_04
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
		
		
		final String attribute_01 = "count";
		final String attribute_02="count";
		final String attribute_03="xref";
		final String attribute_04="count";
		final String attribute_05="type";
		SAXParserFactory f = SAXParserFactory.newInstance();

		SAXParser p = f.newSAXParser();

		DefaultHandler h = new DefaultHandler() {

			boolean handler_01 = false;
			boolean handler_02 = false;
			boolean handler_03 = false;
			boolean handler_04 = false;
			boolean handler_05 = false;
			boolean handler_06=false;
			boolean handler_07=false;
			boolean handler_08=false;
			boolean handler_09=false;
			boolean handler_10=false;
			boolean handler_11=false;
			boolean handler_12=false;
			boolean handler_13=false;
			boolean handler_14=false;
			boolean handler_15=false;
			boolean handler_16=false;
			boolean handler_17=false;
			boolean handler_18=false;
			boolean handler_19=false;
			boolean handler_20=false;
			boolean handler_21=false;
			boolean handler_22=false;
			boolean handler_23=false;
			boolean handler_24=false;
			boolean handler_25=false;
			boolean handler_26=false;
			boolean handler_27=false;
			boolean handler_28=false;
			boolean handler_29=false;
			boolean handler_30=false;
			boolean handler_31=false;
			boolean handler_32=false;
			boolean handler_33=false;
			
			
			
			String attribute_count = null;

			public void startElement(String a, String b, String c, Attributes d) throws SAXException {

				if (c.equalsIgnoreCase(element_01)) {handler_01 = true;}
				if (c.equalsIgnoreCase(element_02)) {handler_02 = true;}
				if (c.equalsIgnoreCase(element_03)) {handler_03 = true;}
				if (c.equalsIgnoreCase(element_04)) {handler_04 = true;}
				if (c.equalsIgnoreCase(element_05)) {handler_05 = true; attribute_count = d.getValue(attribute_01);}
				//if (c.equalsIgnoreCase(element_04)) {handler_05 = true;}
				if (c.equalsIgnoreCase(element_06)) {handler_06 = true;}
				if (c.equalsIgnoreCase(element_07)) {handler_07 = true;}
				if (c.equalsIgnoreCase(element_08)) {handler_08 = true;}
				if (c.equalsIgnoreCase(element_09)) {handler_09 = true;}
				if (c.equalsIgnoreCase(element_10)) {handler_10 = true;attribute_count = d.getValue(attribute_02);}
				if (c.equalsIgnoreCase(element_11)) {handler_11 = true;attribute_count = d.getValue(attribute_03);}
				if (c.equalsIgnoreCase(element_12)) {handler_12= true;attribute_count = d.getValue(attribute_04);}
				if (c.equalsIgnoreCase(element_13)) {handler_13= true;}
				if (c.equalsIgnoreCase(element_14)) {handler_14= true;}
				if (c.equalsIgnoreCase(element_15)) {handler_15= true;}
				if (c.equalsIgnoreCase(element_16)) {handler_16= true;}
				if (c.equalsIgnoreCase(element_17)) {handler_17= true;}
				if (c.equalsIgnoreCase(element_18)) {handler_18= true;}
				if (c.equalsIgnoreCase(element_19)) {handler_19= true;}
				if (c.equalsIgnoreCase(element_20)) {handler_20= true;}
				if (c.equalsIgnoreCase(element_21)) {handler_21= true;}
				if (c.equalsIgnoreCase(element_22)) {handler_22= true;}
				if (c.equalsIgnoreCase(element_23)) {handler_23= true;}
				if (c.equalsIgnoreCase(element_24)) {handler_24= true;}
				if (c.equalsIgnoreCase(element_25)) {handler_25= true;}
				if (c.equalsIgnoreCase(element_26)) {handler_26= true;}
				if (c.equalsIgnoreCase(element_27)) {handler_27= true;}
				if (c.equalsIgnoreCase(element_28)) {handler_28= true;}
				if (c.equalsIgnoreCase(element_29)) {handler_29= true;}
				if (c.equalsIgnoreCase(element_30)) {handler_30= true;}
				if (c.equalsIgnoreCase(element_31)) {handler_31= true;}
				if (c.equalsIgnoreCase(element_32)) {handler_32= true;attribute_count = d.getValue(attribute_05);}
				if (c.equalsIgnoreCase(element_33)) {handler_33= true;}

				
			}

			//public void endElement(String a, String b, String c) throws SAXException {}

			public void characters(char ch[], int start, int length) throws SAXException {
				if (handler_01) {System.out.println("Key Word: \t " + new String(ch, start, length)); handler_01 = false;}
				if (handler_02) {System.out.println("Engine: \t\t " + new String(ch, start, length)); handler_02 = false;}
				if (handler_03) {System.out.println("Version: \t " + new String(ch, start, length)); handler_03 = false;}
				if (handler_04) {System.out.println("database\t " + new String(ch, start, length)); handler_04 = false;}
				if (handler_05) {System.out.println("lang_id \t " + new String(ch, start, length)); handler_05 = false;}
				if (handler_06) {System.out.println("country_id : \t " + new String(ch, start, length)); handler_06 = false;}
				if (handler_07) {System.out.println("kadu-branch: \t " + new String(ch, start, length)); handler_07 = false;}
				if (handler_08) {System.out.println("kadu-version \t " + new String(ch, start, length)); handler_08 = false;}
				if (handler_09) {System.out.println("kadu-index-info: \t " + new String(ch, start, length)); handler_09 = false;}
				if (handler_10) {System.out.println("categories: \t " + new String(ch, start, length)); handler_10 = false;}
				if (handler_11) {System.out.println("category: \t " + new String(ch, start, length)); handler_11 = false;}
				if (handler_12) {System.out.println("products: \t " + new String(ch, start, length)); handler_12 = false;}
				if (handler_13) {System.out.println("products: \t " + new String(ch, start, length)); handler_13 = false;}
				if (handler_14) {System.out.println("id: \t " + new String(ch, start, length)); handler_14 = false;}
				if (handler_15) {System.out.println("name: \t " + new String(ch, start, length)); handler_15 = false;}
				if (handler_16) {System.out.println("description: \t " + new String(ch, start, length)); handler_16 = false;}
				if (handler_17) {System.out.println("impact-score: \t " + new String(ch, start, length)); handler_17 = false;}
				if (handler_18) {System.out.println("impact-raw-score: \t " + new String(ch, start, length)); handler_18 = false;}
				if (handler_19) {System.out.println("price: \t " + new String(ch, start, length)); handler_19 = false;}
				if (handler_20) {System.out.println("static-score: \t " + new String(ch, start, length)); handler_20 = false;}
				if (handler_21) {System.out.println("orig-price: \t " + new String(ch, start, length)); handler_21 = false;}
				if (handler_22) {System.out.println("on-sale: \t " + new String(ch, start, length)); handler_22 = false;}
				if (handler_23) {System.out.println("on-sale-percent-off: \t " + new String(ch, start, length)); handler_23 = false;}
				if (handler_24) {System.out.println("tax: \t " + new String(ch, start, length)); handler_24 = false;}
				if (handler_25) {System.out.println("shipping-cost: \t " + new String(ch, start, length)); handler_25 = false;}
				if (handler_26) {System.out.println("free-shipping: \t " + new String(ch, start, length)); handler_26 = false;}
				if (handler_27) {System.out.println("merchant-ref: \t " + new String(ch, start, length)); handler_27 = false;}
				if (handler_28) {System.out.println("category-ref: \t " + new String(ch, start, length)); handler_28 = false;}
				if (handler_29) {System.out.println("bid: \t " + new String(ch, start, length)); handler_29 = false;}
				if (handler_30) {System.out.println("bid-level: \t " + new String(ch, start, length)); handler_30 = false;}
				if (handler_31) {System.out.println("raw-bid: \t " + new String(ch, start, length)); handler_31 = false;}
				if (handler_32) {System.out.println("addon: \t " + new String(ch, start, length)); handler_32 = false;}
				if (handler_33) {System.out.println("crawler-id: \t " + new String(ch, start, length)); handler_33 = false;}
			
		
			}
		};
		p.parse(url, h);
	}
}