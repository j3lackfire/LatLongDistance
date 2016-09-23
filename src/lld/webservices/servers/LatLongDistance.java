package lld.webservices.servers;

import lld.common.Constants;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by chinhnk on 9/20/2016.
 */
@WebService()
public class LatLongDistance {
    @WebMethod
    public double getDistance(double latitude1,double longtitude1,double latitude2,double longtitude2) {
        // TODO
        return 0;
    }

    /**
     * main method for testing purpose
     * @param argv
     */
    public static void main(String[] argv) {
        Object implementor = new LatLongDistance();
        String address = "http://localhost:" + Constants.WS_PORT_LLP + "/" + implementor.getClass().getSimpleName();
        Endpoint.publish(address, implementor);
        System.out.println("Address: " + address);
    }
}
