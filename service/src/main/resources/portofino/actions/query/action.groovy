import com.manydesigns.portofino.*
import com.manydesigns.portofino.operations.annotations.*
import com.manydesigns.portofino.dispatcher.*
import com.manydesigns.portofino.database.model.*
import com.manydesigns.portofino.resourceactions.*
import com.manydesigns.portofino.resourceactions.custom.*
import com.manydesigns.portofino.security.*

import javax.ws.rs.*

@RequiresPermissions(level = AccessLevel.VIEW)
class Query extends CustomAction {

    @GET
    String welcomeMessage() {
        'Welcome to your new Portofino application!'
    }

}
