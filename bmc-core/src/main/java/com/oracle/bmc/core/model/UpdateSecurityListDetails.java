/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = UpdateSecurityListDetails.Builder.class)
public class UpdateSecurityListDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("egressSecurityRules")
        private List<EgressSecurityRule> egressSecurityRules;

        @JsonProperty("ingressSecurityRules")
        private List<IngressSecurityRule> ingressSecurityRules;

        public UpdateSecurityListDetails build() {
            return new UpdateSecurityListDetails(
                    displayName, egressSecurityRules, ingressSecurityRules);
        }

        @JsonIgnore
        public Builder copy(UpdateSecurityListDetails o) {
            return displayName(o.getDisplayName())
                    .egressSecurityRules(o.getEgressSecurityRules())
                    .ingressSecurityRules(o.getIngressSecurityRules());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * Rules for allowing egress IP packets.
     **/
    @JsonProperty("egressSecurityRules")
    List<EgressSecurityRule> egressSecurityRules;

    /**
     * Rules for allowing ingress IP packets.
     **/
    @JsonProperty("ingressSecurityRules")
    List<IngressSecurityRule> ingressSecurityRules;
}
