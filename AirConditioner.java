import java.util.*;

	public class AirConditioner {
	private boolean isOn;
	private String productName;
	private int temperature;
     
		public AirConditioner(boolean isOn, String productName, int temperature) {           
		this.isOn = isOn;
		this.productName = productName;
		this.temperature = temperature;
		}
		
		public void setOn (boolean on){
		    if (isOn == false){
		    on = true;
		    isOn = on;
		    }
		    else {
		    isOn = false;
	            }
		}
		
		public boolean getIsOn() {
		return isOn;
		}
	
		public void setProductName(String productName) {
		this.productName = productName; 
		}
	
		public String getProductName() {
		return productName; 
		}
	
		public void increaseTemperature() {
			if (temperature >= 0){
			temperature++;
			}
			else {
			this.temperature = temperature;
			}
		}
	
		public void decreaseTemperature() {
			if (temperature > 0) {
			temperature--;
			}
			else {
			this.temperature = temperature;
			}
		}
		
		public void setTemperature (int temperature ) {
		this.temperature = temperature;
		}
        
		public int getTemperature() {
       		return temperature;
        	}    
} 
 // Qus. to ask teacher what the difference b/w a nested class & a inner class?
    // Qus. is static an access modifier or a return type? 
    // tro more light on static variables & static block?
    // integer litral 0b(BINARY)or 0B, 0(OCTAL) 0X(HEXADECIMAL),
