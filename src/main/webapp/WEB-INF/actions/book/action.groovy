import javax.servlet.*

import com.manydesigns.elements.messages.*
import com.manydesigns.elements.reflection.*
import com.manydesigns.portofino.*
import com.manydesigns.portofino.operations.*
import com.manydesigns.portofino.operations.annotations.*
import com.manydesigns.portofino.dispatcher.*
import com.manydesigns.portofino.model.database.*
import com.manydesigns.portofino.resourceactions.*
import com.manydesigns.portofino.security.*
import com.manydesigns.portofino.shiro.*

import org.apache.commons.lang.StringUtils
import org.apache.shiro.*
import org.hibernate.*
import org.hibernate.criterion.*

import com.manydesigns.portofino.resourceactions.crud.*

@SupportsPermissions([ CrudAction.PERMISSION_CREATE, CrudAction.PERMISSION_EDIT, CrudAction.PERMISSION_DELETE ])
@RequiresPermissions(level = AccessLevel.VIEW)
class CrudAction_8mva3zgpb9j5m4tmd4obrnj4t extends CrudAction {

    String linkToParentProperty = "";
    String parentName = "";

    //**************************************************************************
    // Extension hooks
    //**************************************************************************

    public boolean isCreateEnabled() {
        super.isCreateEnabled()
    }
    
    protected void createSetup(Object object) {
        if(!StringUtils.isEmpty(parentName)) {
            object[linkToParentProperty] = ognlContext[parentName].nothing
        }
    }

    protected boolean createValidate(Object object) {
        true
    }

    protected void createPostProcess(Object object) {}


    public boolean isEditEnabled() {
        super.isEditEnabled()
    }

    protected void editSetup(Object object) {}

    protected boolean editValidate(Object object) {
        true
    }

    protected void editPostProcess(Object object) {}


    public boolean isDeleteEnabled() {
        super.isDeleteEnabled()
    }

    protected boolean deleteValidate(Object object) {
        true
    }

    protected void deletePostProcess(Object object) {}

}
