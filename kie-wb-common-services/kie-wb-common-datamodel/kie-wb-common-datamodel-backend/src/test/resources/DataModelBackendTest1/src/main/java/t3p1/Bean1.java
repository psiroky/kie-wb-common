/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package t3p1;

import org.kie.api.definition.type.Role;

@Role(Role.Type.EVENT)
public class Bean1 {

    private String field1;
    private int field2;

    public String getField1() {
        return field1;
    }

    public void setField1( String field1 ) {
        this.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2( int field2 ) {
        this.field2 = field2;
    }
}
