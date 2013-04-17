package au.com.leighton.portal.peoplefinder.model;

import java.io.Serializable;

public class WCSConnectionRow  implements Serializable{


    @SuppressWarnings("compatibility:2610916688603847517")
    private static final long serialVersionUID = 1L; 

  
  private WCSConnectionItem connectionC1;
  private WCSConnectionItem connectionC2;
  private WCSConnectionItem connectionC3;


  public void setConnectionC1(WCSConnectionItem connectionC1) {
      this.connectionC1 = connectionC1;
  }

  public WCSConnectionItem getConnectionC1() {
      return connectionC1;
  }

  public void setConnectionC2(WCSConnectionItem connectionC2) {
      this.connectionC2 = connectionC2;
  }

  public WCSConnectionItem getConnectionC2() {
      return connectionC2;
  }

  public void setConnectionC3(WCSConnectionItem connectionC3) {
      this.connectionC3 = connectionC3;
  }

  public WCSConnectionItem getConnectionC3() {
      return connectionC3;
  }
}
