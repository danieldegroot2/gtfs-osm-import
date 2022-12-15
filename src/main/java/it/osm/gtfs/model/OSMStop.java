package it.osm.gtfs.model;

import it.osm.gtfs.enums.WheelchairAccess;
import org.w3c.dom.Node;

public class OSMStop extends Stop {
    public Node originalXMLNode;


    public OSMStop(String gtfsId, String code, Double lat, Double lon, String name, String operator, WheelchairAccess wheelchairAccessibility) {
        super(gtfsId, code, lat, lon, name, operator, wheelchairAccessibility);
    }

    public String getOSMId(){
        return (originalXMLNode == null) ? null : originalXMLNode.getAttributes().getNamedItem("id").getNodeValue();
    }


    @Override
    public String toString() {
        return "Stop [gtfsId=" + getGtfsId() + ", code=" + getCode() + ", lat=" + getLat()
                + ", lon=" + getLon() + ", name=" + getName() + ", accessibility=" + getWheelchairAccessibility() +
                ((originalXMLNode != null) ? ", osmid=" + getOSMId() : "" )
                + "]";
    }
}
