/*
 * Copyright (c) 2015 Michell Bak
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tv.mizuu.app.realm;

import io.realm.RealmObject;

public class Filesource extends RealmObject {

    private String filesourceName, folderName;
    private String deviceUdn, containerId;

    public String getDeviceUdn() {
        return deviceUdn;
    }

    public void setDeviceUdn(String deviceUdn) {
        this.deviceUdn = deviceUdn;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public void setFilesourceName(String filesourceName) {
        this.filesourceName = filesourceName;
    }

    public String getFilesourceName() {
        return filesourceName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderName() {
        return folderName;
    }

}
