/*******************************************************************************
 * Copyright 2016 Jalian Systems Pvt. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package net.sourceforge.marathon.recorder;

import net.sourceforge.marathon.runtime.api.ComponentId;
import net.sourceforge.marathon.runtime.api.IScriptElement;
import net.sourceforge.marathon.runtime.api.Indent;
import net.sourceforge.marathon.runtime.api.ScriptModel;
import net.sourceforge.marathon.runtime.api.WindowId;

public class InsertChecklistElement implements IScriptElement {
    private static final long serialVersionUID = 1L;
    private String fileName;
    private final WindowId windowId;

    public InsertChecklistElement(WindowId windowId, String fileName) {
        this.windowId = windowId;
        this.fileName = fileName;
    }

    public String toScriptCode() {
        return Indent.getIndent() + ScriptModel.getModel().getScriptCodeForInsertChecklist(fileName);
    }

    public ComponentId getComponentId() {
        return null;
    }

    public WindowId getWindowId() {
        return windowId;
    }

    public boolean isUndo() {
        return false;
    }

    public IScriptElement getUndoElement() {
        return null;
    }
}