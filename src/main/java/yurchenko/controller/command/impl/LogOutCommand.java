package yurchenko.controller.command.impl;

import yurchenko.controller.command.Command;
import yurchenko.controller.command.CommandResult;
import yurchenko.controller.command.CommandResultType;
import yurchenko.controller.context.RequestContext;
import yurchenko.controller.context.RequestContextHelper;

import javax.servlet.http.HttpServletResponse;

public class LogOutCommand implements Command {
    private static final String LOGIN_PAGE = "command=logIn";
    private static final String USER = "user";
    private static final String ROLE = "role";

    @Override
    public CommandResult execute(RequestContextHelper helper, HttpServletResponse response) {
        RequestContext requestContext = helper.createContext();
        requestContext.removeSessionAttribute(USER);
        requestContext.removeSessionAttribute(ROLE);
        helper.updateRequest(requestContext);
        return new CommandResult(LOGIN_PAGE, CommandResultType.REDIRECT);
    }
}