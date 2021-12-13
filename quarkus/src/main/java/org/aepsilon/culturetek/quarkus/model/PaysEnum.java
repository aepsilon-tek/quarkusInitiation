package org.aepsilon.culturetek.quarkus.model;

public enum PaysEnum {

    FRANCE("FR"), BELGIQUE("BL"),CANADA("CA"),ECOSSE("EC");
    private String abreviation ;  
      
     private PaysEnum(String abreviation) {  
         this.abreviation = abreviation ;  
    }  
      
     public String getAbreviation() {  
         return  this.abreviation ;  
    }  

        /**
     * @return the Enum representation for the given string.
     * @throws IllegalArgumentException if unknown string.
     */
    public static PaysEnum valueOfByAbreviation(String s) throws IllegalArgumentException {
        for (PaysEnum value : values()) {
            if (value.abreviation.equalsIgnoreCase(s)) {
                 return value;
            }
       }
       throw new IllegalArgumentException("unknown value: " + s);
    }
}
