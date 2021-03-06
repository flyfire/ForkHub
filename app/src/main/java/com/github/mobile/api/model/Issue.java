/*
 * Copyright 2016 Jon Ander Peñalba
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.mobile.api.model;

import java.util.Date;
import java.util.List;

public class Issue {
    public long id;

    public String url;

    public String html_url;

    public int number;

    public String state;

    public String title;

    public String body;

    public User user;

    public List<Label> labels;

    public User assignee;

    public Milestone milestone;

    public boolean locked;

    public int comments;

    public PullRequest pull_request;

    public Date created_at;

    public Date closed_at;

    public Date updated_at;

    public User closed_by;

    public ReactionSummary reactions;
}
