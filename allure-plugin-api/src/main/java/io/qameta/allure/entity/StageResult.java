/*
 *  Copyright 2016-2024 Qameta Software Inc
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.qameta.allure.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author charlie (Dmitry Baev).
 */
@Data
@Accessors(chain = true)
public class StageResult implements Serializable, Summarizable {

    private static final long serialVersionUID = 1L;

    protected String name;
    protected Time time;

    protected String description;
    protected String descriptionHtml;

    protected Status status;
    protected String statusMessage;
    protected String statusTrace;

    protected List<Step> steps = new ArrayList<>();
    protected List<Attachment> attachments = new ArrayList<>();
    protected List<Parameter> parameters = new ArrayList<>();

}
