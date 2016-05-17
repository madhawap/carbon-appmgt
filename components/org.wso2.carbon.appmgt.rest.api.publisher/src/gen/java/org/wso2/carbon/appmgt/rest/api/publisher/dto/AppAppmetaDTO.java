/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * you may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.appmgt.rest.api.publisher.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@ApiModel(description = "")
public class AppAppmetaDTO  {
  
  
  
  private String weburl = null;
  
  
  private String _package = null;
  
  
  private String path = null;
  
  
  private String version = null;

  
  /**
   * Web application urk
   **/
  @ApiModelProperty(value = "Web application urk")
  @JsonProperty("weburl")
  public String getWeburl() {
    return weburl;
  }
  public void setWeburl(String weburl) {
    this.weburl = weburl;
  }

  
  /**
   * The package name of the application binary
   **/
  @ApiModelProperty(value = "The package name of the application binary")
  @JsonProperty("_package")
  public String getPackage() {
    return _package;
  }
  public void setPackage(String _package) {
    this._package = _package;
  }

  
  /**
   * Application binary file API
   **/
  @ApiModelProperty(value = "Application binary file API")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  
  /**
   * The version of the application binary
   **/
  @ApiModelProperty(value = "The version of the application binary")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppAppmetaDTO {\n");
    
    sb.append("  weburl: ").append(weburl).append("\n");
    sb.append("  _package: ").append(_package).append("\n");
    sb.append("  path: ").append(path).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
