package core;
import javax.xml.parsers.*;
import org.w3c.dom.*;
public class DOM {







	public static void main(String[] args) throws Throwable, Exception,
			ParserConfigurationException {

		String url = "http://alex.academy/ebay.xml";

		String node = "kadu-response";

		String element_01 = "orig-kw";
		String element_02 = "engine";
		String element_03 = "kadu-version";
		String element_04 = "response-time";
		String element_05 = "deals";
		String attribute_01 = "count";
		String element_06="kadu-branch";
		String element_07="description";
		String element_08="price";
		String element_09="stock-description";
		String element_10="impact-score";
        String element_11="merchants";
        String attribute_02="count";
        
		
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();

		DocumentBuilder b = f.newDocumentBuilder();

		Document doc = b.parse(url);




		System.out.println("Key Word: \t " + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_01).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println("Engine: \t\t " + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_02).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println("Version: \t " + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_03).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println("Response time: \t " + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_04).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println("Name:\t\t" +  ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_06).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println("Description:\t"+((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_07).item(0).getChildNodes().item(0).getNodeValue());	
	
		System.out.println("Number of deals: " + ((Element) doc.getElementsByTagName(element_05).item(0)).getAttribute(attribute_01).trim());
	    System.out.println("Marchant  #" +((Element)doc.getElementsByTagName(element_11).item(0)).getAttribute(attribute_02).trim());
	    System.out.println("phone-adon:\t"+((Element)doc.getElementsByTagName(node).item(0)).getElementsByTagName("phone-addon").item(0).getChildNodes().item(0).getNodeName());
	    System.out.println("Description:\t"+((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_07).item(0).getChildNodes().item(0).getNodeValue());	
	
	}
}