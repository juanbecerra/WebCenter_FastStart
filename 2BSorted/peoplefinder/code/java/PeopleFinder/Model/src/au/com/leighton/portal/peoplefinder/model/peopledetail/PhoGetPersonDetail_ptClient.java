package au.com.leighton.portal.peoplefinder.model.peopledetail;

import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 101221.1153.15811)

public class PhoGetPersonDetail_ptClient
{
  @WebServiceRef
  private static Phogetpersondetail_client_ep phogetpersondetail_client_ep;

  public static void main(String [] args)
  {
    phogetpersondetail_client_ep = new Phogetpersondetail_client_ep();
    PhoGetPersonDetail phoGetPersonDetail = phogetpersondetail_client_ep.getPhoGetPersonDetail_pt();
    // Add your code to call the desired methods.
  }
}
