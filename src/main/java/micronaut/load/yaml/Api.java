package micronaut.load.yaml;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Set;

@Controller
public class Api {

  private final Set<String> mimeTypes;

  public Api(@Value("${mime.types}") Set<String> mimeTypes) {
    this.mimeTypes = mimeTypes;
  }

  @Get
  public HttpResponse mimeTypes() {
    return HttpResponse.ok(mimeTypes);
  }
}
