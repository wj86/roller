/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  The ASF licenses this file to You
 * under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.  For additional information regarding
 * copyright in this work, please see the NOTICE file in the top level
 * directory of this distribution.
 */

package org.apache.roller.ui.core.struts2;

import java.util.Locale;
import org.apache.roller.pojos.WebsiteData;


/**
 * form bean use by CreateWeblogForm.
 */
public class CreateWeblogFormBean {
    
    private String handle;
    private String name;
    private String description;
    private String emailAddress;
    private String locale;
    private String timeZone;
    private String theme;
    
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public String getHandle() {
        return handle;
    }
    
    public void setHandle(String handle) {
        this.handle = handle;
    }
    
    public String getLocale() {
        return locale;
    }
    
    public void setLocale(String locale) {
        this.locale = locale;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTheme() {
        return theme;
    }
    
    public void setTheme(String theme) {
        this.theme = theme;
    }
    
    public String getTimeZone() {
        return timeZone;
    }
    
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
    
    
    public void copyTo(WebsiteData wd, Locale locale) {
        wd.setHandle(handle);
        wd.setName(name);
        wd.setDescription(description);
        wd.setLocale(this.locale);
        wd.setTimeZone(timeZone);
    }
    
}