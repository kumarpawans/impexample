import com.twitter.finagle.Http;
import com.twitter.finagle.Service;
import com.twitter.finagle.http.Method;
import com.twitter.finagle.http.Request;
import com.twitter.finagle.http.Response;
import com.twitter.util.Await;

public class FinagleClientExample {
  public static void main(String[] args) throws Exception {
    Service<Request, Response> client = Http.client().newService("localhost:8080");

    Request request = Request.apply(Method.GET, "/endpoint");
    request.headerMap().add("Content-Type", "application/json");

    Response response = Await.result(client.apply(request));
    System.out.println("Response status: " + response.status());
    System.out.println("Response body: " + response.getContentString());
  }
}
