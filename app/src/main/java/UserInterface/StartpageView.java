package UserInterface;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.navigator.View;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button;


import java.util.ArrayList;
import java.util.List;

/**
 * !! DO NOT EDIT THIS FILE !!
 * <p>
 * This class is generated by Vaadin Designer and will be overwritten.
 * <p>
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class StartpageView extends GridLayout implements IUI, View {


    private Button startLogoutButton = new Button("Challenges", this::buttonClick);
    private Button startJouButton = new Button("Journal", this::buttonClick);
    private Button startChallButton = new Button("Logout", this::buttonClick);
    private Label startWelcomeLabel;
    private Label startUserLabel;

    public StartpageView() {
        Design.read(this);
    }

    private List<IUIListener> listeners =
            new ArrayList<>();

    public void addListener(IUIListener listener) {
        listeners.add(listener);
    }

    public void addButtons() {
        this.addComponent(startLogoutButton);
        this.addComponent(startJouButton);
        this.addComponent(startChallButton);
    }


    /*
    public void buttonClick(Button.ClickEvent event) {
        for (IUIListener listener: listeners)
            listener.ChallengesClick();
    }
    */
    public void buttonClick(Button.ClickEvent event) {
        for (IUIListener listener: listeners)
            listener.buttonClick(event.getButton().getCaption());
    }

    //Button test = new Button ("Challenges", this::buttonClick);

    public Label getStartWelcomeLabel() {

        return startWelcomeLabel;
    }
/*
    public Button getStartChallButton() {
        return startChallButton;
    }

    public Button getStartJouButton() {
        return startJouButton;
    }

    public Button getStartLogoutButton() {
        return startLogoutButton;
    }

    public Label getStartUserLabel() {
        return startUserLabel;
    }
    */
}
