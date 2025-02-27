package solid.humank.port.adapter;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import solid.humank.domain.model.OrderTicket;

public class ProxyResponseWrapper {
    public static APIGatewayProxyResponseEvent wrap(OrderTicket orderTicket) {

        APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
        responseEvent.setBody("{\"orderString\":" + "\"" + orderTicket.value() + "\"}");
        responseEvent.setStatusCode(200);

        return responseEvent;
    }
}
