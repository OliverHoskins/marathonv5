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
package net.sourceforge.marathon.runtime.api;

public class TestRootElement extends CompositeScriptElement {
    private static final long serialVersionUID = 1L;
    private String story;

    public TestRootElement(String story) {
        this.story = story;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof TestRootElement))
            return false;
        return super.equals(obj) && ObjectComparator.compare(story, ((TestRootElement) obj).story) == 0;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public WindowId getWindowId() {
        return null;
    }

    public boolean owns(CompositeScriptElement child) {
        return true;
    }

    public boolean isUndo() {
        return false;
    }

    public IScriptElement getUndoElement() {
        return null;
    }
}