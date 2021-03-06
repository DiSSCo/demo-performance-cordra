package eu.dissco.demoapicollector.properties;

import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@ConfigurationProperties(prefix = "naturalis")
public class NaturalisProperties {

  @NotBlank
  private String field;
  @NotBlank
  private String operator;
  @NotBlank
  private String value;
}
