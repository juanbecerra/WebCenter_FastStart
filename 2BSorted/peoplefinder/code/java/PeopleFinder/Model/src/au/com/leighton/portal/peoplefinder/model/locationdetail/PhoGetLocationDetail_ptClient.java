package au.com.leighton.portal.peoplefinder.model.locationdetail;

import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 101221.1153.15811)

public class PhoGetLocationDetail_ptClient
{
  @WebServiceRef
  private static Phogetlocationdetail_client_ep phogetlocationdetail_client_ep;

  public static void main(String [] args)
  {
    phogetlocationdetail_client_ep = new Phogetlocationdetail_client_ep();
    PhoGetLocationDetail phoGetLocationDetail = phogetlocationdetail_client_ep.getPhoGetLocationDetail_pt();
    // Add your code to call the desired methods.
  }
}
