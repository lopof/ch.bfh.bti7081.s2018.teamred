package UserInterface;

import Business.Challenge;
import Business.LevelState;
import Business.ChallengeState;
import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.server.Sizeable;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.*;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button;
import javassist.runtime.Desc;

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
public class ChallengeBoardView extends HorizontalLayout implements ChallengeBoard, View {
    private VerticalLayout challBoaLevelLayout;
    private Label challBoaLevelLabel;
    private Button addLevelButton;
    private VerticalLayout challBoaChallActiveLayout;
    private Label challBoaActiveLabel;
    private VerticalLayout challBoaChallPassiveLayout;
    private Label challBoaPassivLabel;
    private VerticalLayout challBoaChallDetailLayout;
    private Label challBoaChallDetailsLabel;

    Panel details = new Panel("Details");
    Button back = new Button("Back", this::buttonClick);
    Button newChall = new Button("Make new challenge", this::buttonClick);

    private List<ChallengeBoardViewListener> listeners = new ArrayList<>();

    public void addListener(ChallengeBoardViewListener listener) {
        listeners.add(listener);
    }

    public void buttonClick(Button.ClickEvent event) {
        for (ChallengeBoardViewListener listener: listeners)
            listener.buttonClick(event.getButton());
    }

    public ChallengeBoardView() {
        Design.read(this);

        this.addLevelButton.addClickListener(this::buttonClick);
        this.addLevelButton.setId("AddLevelButton");
    }

    public void clearLevels(){
        for (int i = challBoaLevelLayout.getComponentCount() - 1; i >= 0; i--){
            Component comp = challBoaLevelLayout.getComponent(i);
            if (comp.getId().equals("level")) {
                challBoaLevelLayout.removeComponent(comp);
            }
        }
    }

    public void setLevelInfoLabel(int closedCount, int neededToBeClosed, int allCount){
        Label newLabel = null;
        for (int i = this.challBoaLevelLayout.getComponentCount() - 1; i >= 0; i--) {
            Component comp = this.challBoaLevelLayout.getComponent(i);
            if (comp.getId().equals("lvlInfoLbl")){
                newLabel = (Label) comp;
            }
        }

        String labelText = closedCount + " von " + neededToBeClosed + ", Gesammt: " + allCount;

        if (newLabel == null){
            newLabel = new Label("");
            newLabel.setId("lvlInfoLbl");
        }

        newLabel.setValue(labelText);
        this.challBoaLevelLayout.addComponent(newLabel, 1);
    }

    public void addBackButton(){
        back.setId("back");
        back.setWidth("100%");
        challBoaLevelLayout.addComponent(back);

    }

    public void addChallengeButton() {
        newChall.setWidth("100%");
        newChall.setId("newChall");
        challBoaLevelLayout.addComponent(newChall);
    }

    public void addLevel(String levelLabel, LevelState state) {
        Button level = new Button(levelLabel, this::buttonClick);
        level.setId("level");
        level.setWidth("100%");

        if (state == LevelState.closed) {
            level.setIcon(VaadinIcons.LOCK);
            level.setEnabled(false);
        }
        else{
            level.setIcon(VaadinIcons.UNLOCK);
        }

        // Getting index for new element
        int compCount = this.challBoaLevelLayout.getComponentCount() - 1;
        this.challBoaLevelLayout.addComponent(level, compCount);
    }

    public void addChallenge(String title, String desc, ChallengeState challengeState, int levelOfAnxiety) {
        Panel challenge = new Panel(title);
        final VerticalLayout contentLayout = new VerticalLayout();
        contentLayout.addComponent(new Label(desc));
        challenge.setContent(contentLayout);
        challenge.setHeight("100%");
        challenge.setWidth("100%");


        if (challengeState == challengeState.closed){
            this.challBoaChallPassiveLayout.addComponent(challenge);
            challenge.setEnabled(true);
            challenge.addStyleName("captionPassive");
            Button reOpen = new Button("reopen",this::buttonClick);
            reOpen.setId("reOpen");
            contentLayout.addComponent(reOpen);
            Button details = new Button("Details",this::buttonClick);
            details.setId("details");
            contentLayout.addComponent(details);

        }

        if (challengeState == challengeState.open){
            this.challBoaChallActiveLayout.addComponent(challenge);
            challenge.setEnabled(true);
            challenge.addStyleName("captionActive");
            Button close = new Button("close",this::buttonClick);
            close.setId("close");
            contentLayout.addComponent(close);
            Button details = new Button("Details",this::buttonClick);
            details.setId("details");
            contentLayout.addComponent(details);

        }
    }

    public void addChallengeDetails(Challenge challenge) {
        details.setWidth("100%");
        final VerticalLayout content = new VerticalLayout();
        content.setWidth("100%");
        details.setContent(content);
        challBoaChallDetailLayout.addComponent(details);
        content.addComponent(new Label(challenge.getTitle().toUpperCase()));
        //content.addComponent(new Label(challenge.getDesc(), ContentMode.TEXT));
        content.addComponent(new Label(challenge.getChallengeState().toString()));
        String levelAnx = Integer.toString(challenge.getLevelOfAnxiety());
        content.addComponent(new Label("Level of Anxiety: "+levelAnx));
        Label Description = new Label(challenge.getDesc());
        Description.setWidth("100%");
        //Description.setHeight("100%");
        content.addComponent(Description);
        //content.setExpandRatio(Description,2);
        details.setDescription("Challenge Details");

    }

    public void removeChallengeDetails(){
        challBoaChallDetailLayout.removeComponent(details);
    }

    public void removeChallenges(){
        this.challBoaChallActiveLayout.removeAllComponents();
        this.challBoaChallActiveLayout.addComponent(challBoaActiveLabel);
        this.challBoaChallActiveLayout.setComponentAlignment(challBoaActiveLabel,Alignment.TOP_CENTER);
        this.challBoaChallPassiveLayout.removeAllComponents();
        this.challBoaChallPassiveLayout.addComponent(challBoaPassivLabel);
        this.challBoaChallPassiveLayout.setComponentAlignment(challBoaPassivLabel,Alignment.TOP_CENTER);
    }

    public VerticalLayout getChallBoaLevelLayout() {
        return challBoaLevelLayout;
    }

    public Label getChallBoaLevelLabel() {
        return challBoaLevelLabel;
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

}
