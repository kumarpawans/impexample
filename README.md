# imp Notes
Finagle example
<dependency>
  <groupId>com.twitter</groupId>
  <artifactId>finagle-http</artifactId>
  <version>6.47.0</version>
</dependency>

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

Online UML tools - 

  https://online.visual-paradigm.com/app/diagrams/#diagram:type=PackageDiagram&gallery=/repository/88031adf-45b4-4587-baf8-0a4b2af2f702.xml&name=General%20Business%20System
