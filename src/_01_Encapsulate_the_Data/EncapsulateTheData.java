package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

    /*
     * itemsReceived cannot be negative. All negative parameters should set
     * itemsReceived to 0.
     */

    protected int itemsReceived;
    public void setItemsReceived(int num) {
    	itemsReceived = num;
    }
    public int getItemsReceived() {
    	if (itemsReceived>0) {
        	return itemsReceived;

		}
    	return 0;
    }
    /*
     * degreesTurned must be locked between 0.0 and 360.0 inclusive. All
     * parameters outside this range should set degreesTurned to the nearest
     * bound.
     */

    protected double degreesTurned;
    public void setDegreesTurned(Double num) {
    	degreesTurned = num;
    }
    public Double getDegreesTurned() {
    	if (degreesTurned > 360) {
			degreesTurned = 360;
		} else if (degreesTurned<0) {
			degreesTurned = 0;
		}
    	return degreesTurned;
    }
    /*
     * nomenclature must not contain an empty String. An empty String parameter
     * should set nomenclature to a String with a single space.
     */

    protected String nomenclature;
    public void setNomenclature(String rand) {
    	nomenclature = rand;
    }
    public String getNomenclature() {
    	if (nomenclature.equals("")) {
			nomenclature = " ";
		}
    	return nomenclature;
    }
    /*
     * memberObj must not be a String. A String parameter should set memberObj
     * to a new Object(); Hint: Use the instanceof operator.
     */

    protected Object memberObj;
    public void setMemberObj(Object object) {
    	memberObj = object;
    }
    public Object getMemberObj() {
    	if (memberObj instanceof String) {
			memberObj = new Object();
		}
    	return memberObj;
    }
}
