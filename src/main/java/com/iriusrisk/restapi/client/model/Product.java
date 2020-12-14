


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
import com.iriusrisk.restapi.client.model.ArchitectureDiagram;
import com.iriusrisk.restapi.client.model.CategoryComponent;
import com.iriusrisk.restapi.client.model.Component;
import com.iriusrisk.restapi.client.model.ComponentDefinition;
import com.iriusrisk.restapi.client.model.DataFlow;
import com.iriusrisk.restapi.client.model.ProductAccessType;
import com.iriusrisk.restapi.client.model.ProductAsset;
import com.iriusrisk.restapi.client.model.ProductSetting;
import com.iriusrisk.restapi.client.model.ProductTrustZone;
import com.iriusrisk.restapi.client.model.Question;
import com.iriusrisk.restapi.client.model.SupportedStandard;
import com.iriusrisk.restapi.client.model.Udt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Product
 */
public class Product {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("revision")
  private Integer revision = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("workflowState")
  private String workflowState = null;

  @SerializedName("questions")
  private List<Question> questions = null;

  @SerializedName("diagram")
  private ArchitectureDiagram diagram = null;

  @SerializedName("assets")
  private List<ProductAsset> assets = null;

  @SerializedName("accessTypes")
  private List<ProductAccessType> accessTypes = null;

  @SerializedName("trustZones")
  private List<ProductTrustZone> trustZones = null;

  @SerializedName("settings")
  private List<ProductSetting> settings = null;

  @SerializedName("udts")
  private List<Udt> udts = null;

  @SerializedName("supportedStandards")
  private List<SupportedStandard> supportedStandards = null;

  @SerializedName("categoryComponents")
  private List<CategoryComponent> categoryComponents = null;

  @SerializedName("componentDefinitions")
  private List<ComponentDefinition> componentDefinitions = null;

  @SerializedName("components")
  private List<Component> components = null;

  @SerializedName("dataflows")
  private List<DataFlow> dataflows = null;

  @SerializedName("users")
  private List<String> users = null;

  @SerializedName("groups")
  private List<String> groups = null;

  public Product ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @ApiModelProperty(value = "")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product revision(Integer revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * @return revision
  **/
  @ApiModelProperty(value = "")
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  public Product type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Product status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Product priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Product tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public Product desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @ApiModelProperty(value = "")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Product workflowState(String workflowState) {
    this.workflowState = workflowState;
    return this;
  }

   /**
   * Get workflowState
   * @return workflowState
  **/
  @ApiModelProperty(value = "")
  public String getWorkflowState() {
    return workflowState;
  }

  public void setWorkflowState(String workflowState) {
    this.workflowState = workflowState;
  }

  public Product questions(List<Question> questions) {
    this.questions = questions;
    return this;
  }

  public Product addQuestionsItem(Question questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<Question>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  @ApiModelProperty(value = "")
  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }

  public Product diagram(ArchitectureDiagram diagram) {
    this.diagram = diagram;
    return this;
  }

   /**
   * Get diagram
   * @return diagram
  **/
  @ApiModelProperty(value = "")
  public ArchitectureDiagram getDiagram() {
    return diagram;
  }

  public void setDiagram(ArchitectureDiagram diagram) {
    this.diagram = diagram;
  }

  public Product assets(List<ProductAsset> assets) {
    this.assets = assets;
    return this;
  }

  public Product addAssetsItem(ProductAsset assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<ProductAsset>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @ApiModelProperty(value = "")
  public List<ProductAsset> getAssets() {
    return assets;
  }

  public void setAssets(List<ProductAsset> assets) {
    this.assets = assets;
  }

  public Product accessTypes(List<ProductAccessType> accessTypes) {
    this.accessTypes = accessTypes;
    return this;
  }

  public Product addAccessTypesItem(ProductAccessType accessTypesItem) {
    if (this.accessTypes == null) {
      this.accessTypes = new ArrayList<ProductAccessType>();
    }
    this.accessTypes.add(accessTypesItem);
    return this;
  }

   /**
   * Get accessTypes
   * @return accessTypes
  **/
  @ApiModelProperty(value = "")
  public List<ProductAccessType> getAccessTypes() {
    return accessTypes;
  }

  public void setAccessTypes(List<ProductAccessType> accessTypes) {
    this.accessTypes = accessTypes;
  }

  public Product trustZones(List<ProductTrustZone> trustZones) {
    this.trustZones = trustZones;
    return this;
  }

  public Product addTrustZonesItem(ProductTrustZone trustZonesItem) {
    if (this.trustZones == null) {
      this.trustZones = new ArrayList<ProductTrustZone>();
    }
    this.trustZones.add(trustZonesItem);
    return this;
  }

   /**
   * Get trustZones
   * @return trustZones
  **/
  @ApiModelProperty(value = "")
  public List<ProductTrustZone> getTrustZones() {
    return trustZones;
  }

  public void setTrustZones(List<ProductTrustZone> trustZones) {
    this.trustZones = trustZones;
  }

  public Product settings(List<ProductSetting> settings) {
    this.settings = settings;
    return this;
  }

  public Product addSettingsItem(ProductSetting settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<ProductSetting>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  public List<ProductSetting> getSettings() {
    return settings;
  }

  public void setSettings(List<ProductSetting> settings) {
    this.settings = settings;
  }

  public Product udts(List<Udt> udts) {
    this.udts = udts;
    return this;
  }

  public Product addUdtsItem(Udt udtsItem) {
    if (this.udts == null) {
      this.udts = new ArrayList<Udt>();
    }
    this.udts.add(udtsItem);
    return this;
  }

   /**
   * Get udts
   * @return udts
  **/
  @ApiModelProperty(value = "")
  public List<Udt> getUdts() {
    return udts;
  }

  public void setUdts(List<Udt> udts) {
    this.udts = udts;
  }

  public Product supportedStandards(List<SupportedStandard> supportedStandards) {
    this.supportedStandards = supportedStandards;
    return this;
  }

  public Product addSupportedStandardsItem(SupportedStandard supportedStandardsItem) {
    if (this.supportedStandards == null) {
      this.supportedStandards = new ArrayList<SupportedStandard>();
    }
    this.supportedStandards.add(supportedStandardsItem);
    return this;
  }

   /**
   * Get supportedStandards
   * @return supportedStandards
  **/
  @ApiModelProperty(value = "")
  public List<SupportedStandard> getSupportedStandards() {
    return supportedStandards;
  }

  public void setSupportedStandards(List<SupportedStandard> supportedStandards) {
    this.supportedStandards = supportedStandards;
  }

  public Product categoryComponents(List<CategoryComponent> categoryComponents) {
    this.categoryComponents = categoryComponents;
    return this;
  }

  public Product addCategoryComponentsItem(CategoryComponent categoryComponentsItem) {
    if (this.categoryComponents == null) {
      this.categoryComponents = new ArrayList<CategoryComponent>();
    }
    this.categoryComponents.add(categoryComponentsItem);
    return this;
  }

   /**
   * Get categoryComponents
   * @return categoryComponents
  **/
  @ApiModelProperty(value = "")
  public List<CategoryComponent> getCategoryComponents() {
    return categoryComponents;
  }

  public void setCategoryComponents(List<CategoryComponent> categoryComponents) {
    this.categoryComponents = categoryComponents;
  }

  public Product componentDefinitions(List<ComponentDefinition> componentDefinitions) {
    this.componentDefinitions = componentDefinitions;
    return this;
  }

  public Product addComponentDefinitionsItem(ComponentDefinition componentDefinitionsItem) {
    if (this.componentDefinitions == null) {
      this.componentDefinitions = new ArrayList<ComponentDefinition>();
    }
    this.componentDefinitions.add(componentDefinitionsItem);
    return this;
  }

   /**
   * Get componentDefinitions
   * @return componentDefinitions
  **/
  @ApiModelProperty(value = "")
  public List<ComponentDefinition> getComponentDefinitions() {
    return componentDefinitions;
  }

  public void setComponentDefinitions(List<ComponentDefinition> componentDefinitions) {
    this.componentDefinitions = componentDefinitions;
  }

  public Product components(List<Component> components) {
    this.components = components;
    return this;
  }

  public Product addComponentsItem(Component componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<Component>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Get components
   * @return components
  **/
  @ApiModelProperty(value = "")
  public List<Component> getComponents() {
    return components;
  }

  public void setComponents(List<Component> components) {
    this.components = components;
  }

  public Product dataflows(List<DataFlow> dataflows) {
    this.dataflows = dataflows;
    return this;
  }

  public Product addDataflowsItem(DataFlow dataflowsItem) {
    if (this.dataflows == null) {
      this.dataflows = new ArrayList<DataFlow>();
    }
    this.dataflows.add(dataflowsItem);
    return this;
  }

   /**
   * Get dataflows
   * @return dataflows
  **/
  @ApiModelProperty(value = "")
  public List<DataFlow> getDataflows() {
    return dataflows;
  }

  public void setDataflows(List<DataFlow> dataflows) {
    this.dataflows = dataflows;
  }

  public Product users(List<String> users) {
    this.users = users;
    return this;
  }

  public Product addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<String>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }

  public Product groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public Product addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.ref, product.ref) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.revision, product.revision) &&
        Objects.equals(this.type, product.type) &&
        Objects.equals(this.status, product.status) &&
        Objects.equals(this.priority, product.priority) &&
        Objects.equals(this.tags, product.tags) &&
        Objects.equals(this.desc, product.desc) &&
        Objects.equals(this.workflowState, product.workflowState) &&
        Objects.equals(this.questions, product.questions) &&
        Objects.equals(this.diagram, product.diagram) &&
        Objects.equals(this.assets, product.assets) &&
        Objects.equals(this.accessTypes, product.accessTypes) &&
        Objects.equals(this.trustZones, product.trustZones) &&
        Objects.equals(this.settings, product.settings) &&
        Objects.equals(this.udts, product.udts) &&
        Objects.equals(this.supportedStandards, product.supportedStandards) &&
        Objects.equals(this.categoryComponents, product.categoryComponents) &&
        Objects.equals(this.componentDefinitions, product.componentDefinitions) &&
        Objects.equals(this.components, product.components) &&
        Objects.equals(this.dataflows, product.dataflows) &&
        Objects.equals(this.users, product.users) &&
        Objects.equals(this.groups, product.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, revision, type, status, priority, tags, desc, workflowState, questions, diagram, assets, accessTypes, trustZones, settings, udts, supportedStandards, categoryComponents, componentDefinitions, components, dataflows, users, groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    diagram: ").append(toIndentedString(diagram)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    accessTypes: ").append(toIndentedString(accessTypes)).append("\n");
    sb.append("    trustZones: ").append(toIndentedString(trustZones)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    udts: ").append(toIndentedString(udts)).append("\n");
    sb.append("    supportedStandards: ").append(toIndentedString(supportedStandards)).append("\n");
    sb.append("    categoryComponents: ").append(toIndentedString(categoryComponents)).append("\n");
    sb.append("    componentDefinitions: ").append(toIndentedString(componentDefinitions)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    dataflows: ").append(toIndentedString(dataflows)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

