package ch.bfh;

import javax.servlet.annotation.WebServlet;

import Business.ChallengeBoardPresenter;
<<<<<<< HEAD
import Business.StartpagePresenter;
<<<<<<< HEAD
=======
import Business.LoginViewPagePresenter;
>>>>>>> origin/Roland_Login
=======
import UserInterface.ChallengeBoardView;
import UserInterface.NavigatorUI;
import UserInterface.StartpageView;
>>>>>>> 12e8cf654c44cdfd9c1ebe7b8d07d667958e1926
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.Navigator.ComponentContainerViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    public Navigator navigator;

    public static final String STARTPAGEVIEW = "Start";
    public static final String CHALLENGEVIEW = "Challenge";

    @Override
    protected void init(VaadinRequest request) {

        ChallengeBoardPresenter presenter2 = ChallengeBoardPresenter.getInstance();
        StartpagePresenter presenter = StartpagePresenter.getInstance();
        setContent(presenter.getStartView());
        //ComponentContainerViewDisplay viewDisplay = new ComponentContainerViewDisplay(presenter.getStartView());
        //navigator = new Navigator(UI.getCurrent(), presenter.getStartView());
        navigator = new Navigator(this, this);
        navigator.addView(STARTPAGEVIEW, presenter.getStartView());
        navigator.addView(CHALLENGEVIEW, presenter2.getBoardView());

    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }

    /*
    @Override
    protected void init(VaadinRequest vaadinRequest) {
<<<<<<< HEAD
        StartpagePresenter presenter = StartpagePresenter.getInstance();
        setContent(presenter.getStartView());
=======
        //ChallengeBoardPresenter presenter = ChallengeBoardPresenter.getInstance();
        //setContent(presenter.getBoardView());

        LoginViewPagePresenter presenter = LoginViewPagePresenter.getInstance();
        setContent(presenter.getloginView());

>>>>>>> origin/Roland_Login
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
    */
}
