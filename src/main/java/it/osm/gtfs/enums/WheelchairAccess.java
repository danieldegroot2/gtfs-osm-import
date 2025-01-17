package it.osm.gtfs.enums;

public enum WheelchairAccess { //data according to the GTFS reference guide - the OSM yes value is not present in GTFS reference
    UNKNOWN(0, "unknown"),
    LIMITED(1, "limited"),
    NO(2, "no"),

    YES(-1, "yes");

    private final int gtfsValue;
    private final String osmValue;

    WheelchairAccess(int gtfsValue, String osmValue) {
        this.gtfsValue = gtfsValue;
        this.osmValue = osmValue;
    }

    public static WheelchairAccess getEnumByOsmValue(String osmValue) {
        for (WheelchairAccess e : WheelchairAccess.values()) {
            if (e.osmValue.equals(osmValue)) return e;
        }

        return null;
    }

    public static WheelchairAccess getEnumByGtfsValue(int gtfsValue) {
        for (WheelchairAccess e : WheelchairAccess.values()) {
            if (e.gtfsValue == gtfsValue) return e;
        }

        return null;
    }


    public int getGtfsValue() {
        return gtfsValue;
    }

    public String getOsmValue() {
        return osmValue;
    }
}
