package org.acme.timer.log;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class IHEWebServiceClientTest {

    @Inject
    private IHEWebServiceClient iheClient;

    @Test
    public void smokeTest() throws Exception {
        assertNotNull(iheClient.getCamelContext());
    }

    //    @Disabled
    //    public void testIti47() throws Exception {
    //        var in = getClass().getResourceAsStream("/example-messages/PDQv3.xml");
    //        var request = IOUtils.toString(in, Charset.defaultCharset());
    //        var result = iheClient.iti47PatientDemographicsQuery(request, "localhost", 8080, "pix-xref-mgr/ws/iti47Service?secure=true", false);
    //        System.out.println(result);
    //    }

}
