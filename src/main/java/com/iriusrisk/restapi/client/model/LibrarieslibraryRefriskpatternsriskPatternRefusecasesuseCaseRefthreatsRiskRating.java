


package com.iriusrisk.restapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Risk Rating
 */
@ApiModel(description = "Risk Rating")
public class LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating {
  /**
   * Confidentiality
   */
  @JsonAdapter(ConfidentialityEnum.Adapter.class)
  public enum ConfidentialityEnum {
    NONE("none"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high"),
    
    VERY_HIGH("very-high");

    private String value;

    ConfidentialityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConfidentialityEnum fromValue(String text) {
      for (ConfidentialityEnum b : ConfidentialityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConfidentialityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfidentialityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConfidentialityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConfidentialityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("confidentiality")
  private ConfidentialityEnum confidentiality = null;

  /**
   * Integrity
   */
  @JsonAdapter(IntegrityEnum.Adapter.class)
  public enum IntegrityEnum {
    NONE("none"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high"),
    
    VERY_HIGH("very-high");

    private String value;

    IntegrityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntegrityEnum fromValue(String text) {
      for (IntegrityEnum b : IntegrityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IntegrityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntegrityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntegrityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IntegrityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("integrity")
  private IntegrityEnum integrity = null;

  /**
   * Availability
   */
  @JsonAdapter(AvailabilityEnum.Adapter.class)
  public enum AvailabilityEnum {
    NONE("none"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high"),
    
    VERY_HIGH("very-high");

    private String value;

    AvailabilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AvailabilityEnum fromValue(String text) {
      for (AvailabilityEnum b : AvailabilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AvailabilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvailabilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvailabilityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AvailabilityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("availability")
  private AvailabilityEnum availability = null;

  /**
   * Ease Of Exploitation
   */
  @JsonAdapter(EaseOfExploitationEnum.Adapter.class)
  public enum EaseOfExploitationEnum {
    NONE("none"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high"),
    
    VERY_HIGH("very-high");

    private String value;

    EaseOfExploitationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EaseOfExploitationEnum fromValue(String text) {
      for (EaseOfExploitationEnum b : EaseOfExploitationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EaseOfExploitationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EaseOfExploitationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EaseOfExploitationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EaseOfExploitationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("easeOfExploitation")
  private EaseOfExploitationEnum easeOfExploitation = null;

  public LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating confidentiality(ConfidentialityEnum confidentiality) {
    this.confidentiality = confidentiality;
    return this;
  }

   /**
   * Confidentiality
   * @return confidentiality
  **/
  @ApiModelProperty(value = "Confidentiality")
  public ConfidentialityEnum getConfidentiality() {
    return confidentiality;
  }

  public void setConfidentiality(ConfidentialityEnum confidentiality) {
    this.confidentiality = confidentiality;
  }

  public LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating integrity(IntegrityEnum integrity) {
    this.integrity = integrity;
    return this;
  }

   /**
   * Integrity
   * @return integrity
  **/
  @ApiModelProperty(value = "Integrity")
  public IntegrityEnum getIntegrity() {
    return integrity;
  }

  public void setIntegrity(IntegrityEnum integrity) {
    this.integrity = integrity;
  }

  public LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating availability(AvailabilityEnum availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Availability
   * @return availability
  **/
  @ApiModelProperty(value = "Availability")
  public AvailabilityEnum getAvailability() {
    return availability;
  }

  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
  }

  public LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating easeOfExploitation(EaseOfExploitationEnum easeOfExploitation) {
    this.easeOfExploitation = easeOfExploitation;
    return this;
  }

   /**
   * Ease Of Exploitation
   * @return easeOfExploitation
  **/
  @ApiModelProperty(value = "Ease Of Exploitation")
  public EaseOfExploitationEnum getEaseOfExploitation() {
    return easeOfExploitation;
  }

  public void setEaseOfExploitation(EaseOfExploitationEnum easeOfExploitation) {
    this.easeOfExploitation = easeOfExploitation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating librarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating = (LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating) o;
    return Objects.equals(this.confidentiality, librarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating.confidentiality) &&
        Objects.equals(this.integrity, librarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating.integrity) &&
        Objects.equals(this.availability, librarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating.availability) &&
        Objects.equals(this.easeOfExploitation, librarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating.easeOfExploitation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidentiality, integrity, availability, easeOfExploitation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating {\n");
    
    sb.append("    confidentiality: ").append(toIndentedString(confidentiality)).append("\n");
    sb.append("    integrity: ").append(toIndentedString(integrity)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    easeOfExploitation: ").append(toIndentedString(easeOfExploitation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

