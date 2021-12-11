package yurchenko.controller.command.impl.transition;

import yurchenko.controller.command.Command;
import yurchenko.controller.command.CommandResult;
import yurchenko.controller.command.CommandResultType;
import yurchenko.controller.context.RequestContext;
import yurchenko.controller.context.RequestContextHelper;

import javax.servlet.http.HttpServletResponse;

public class GoToContactsCommand implements Command {
    private static final String PAGE = "WEB-INF/view/contacts.jsp";


    @Override
    public CommandResult execute(RequestContextHelper helper, HttpServletResponse response) {
        RequestContext requestContext = helper.createContext();


        helper.updateRequest(requestContext);
        return new CommandResult(PAGE, CommandResultType.FORWARD);
    }
}