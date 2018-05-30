package UserInterface;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button;
import com.vaadin.ui.Panel;

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
public class ChallengeBoardViewPage extends HorizontalLayout {
    private VerticalLayout challBoaLevelLayout;
    private Label challBoaLevelLabel;
    private Button back;
    private Button newChall;
    private Button addLevelButton;
    private VerticalLayout challBoaChallActiveLayout;
    private Label challBoaActiveLabel;
    private VerticalLayout challBoaChallPassiveLayout;
    private Label challBoaPassivLabel;
    private VerticalLayout challBoaChallDetailLayout;
    private Label challBoaChallDetailsLabel;
    private Panel details;

    public ChallengeBoardViewPage() {
        Design.read(this);
    }

    public VerticalLayout getChallBoaLevelLayout() {
        return challBoaLevelLayout;
    }

    public Label getChallBoaLevelLabel() {
        return challBoaLevelLabel;
    }

    public Button getBack() {
        return back;
    }

    public Button getNewChall() {
        return newChall;
    }

    public Button getAddLevelButton() {
        return addLevelButton;
    }

    public VerticalLayout getChallBoaChallActiveLayout() {
        return challBoaChallActiveLayout;
    }

    public Label getChallBoaActiveLabel() {
        return challBoaActiveLabel;
    }

    public VerticalLayout getChallBoaChallPassiveLayout() {
        return challBoaChallPassiveLayout;
    }

    public Label getChallBoaPassivLabel() {
        return challBoaPassivLabel;
    }

    public VerticalLayout getChallBoaChallDetailLayout() {
        return challBoaChallDetailLayout;
    }

    public Label getChallBoaChallDetailsLabel() {
        return challBoaChallDetailsLabel;
    }

    public Panel getDetails() {
        return details;
    }

}
