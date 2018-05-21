package Business;

import UserInterface.ChallengeBoard;
import UserInterface.ChallengeBoardView;
import ch.bfh.MyUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import java.util.List;

public class ChallengeBoardPresenter implements ChallengeBoard.ChallengeBoardViewListener {

    //region Variablen

    private static ChallengeBoardPresenter instance;

    private ChallengeBoardView boardView;

    private LevelLibrary lvlLibrary;

    private Level clickedLevel = new Level("");

    //endregion

    //region Getter

    public ChallengeBoardView getBoardView() {
        return boardView;
    }

    public static ChallengeBoardPresenter getInstance() {
        if (instance == null) {
            instance = new ChallengeBoardPresenter();
        }

        return instance;
    }

    //endregion

    //region Setter
    //endregion

    //region Konstruktoren

    private ChallengeBoardPresenter() {
        boardView = new ChallengeBoardView();
        boardView.addListener(this);
        boardView.addBackButton();

        lvlLibrary = new LevelLibrary();
        for (int i = 1; i <= 5; i++) {
            lvlLibrary.createNewLevel();
        }

        lvlLibrary.getLevels().get(3).setLevelState(LevelState.closed);

        //add 6 Challanges for each Level
        for (int i = 0; i <= lvlLibrary.getLevels().size() - 1; i++) {
            for (int j = 1; j < 7; j++) {
                lvlLibrary.getLevels().get(i).createChallenge("lvl "+(i+1)+":");
                if (j % 2 == 0) {
                    lvlLibrary.getLevels().get(i).getChallenges().get(j - 1).setChallengeState(ChallengeState.open);
                }
            }
        }

        updateLevelView();
    }

    //endregion

    //region Methoden

    void addClick() {
    }

    void deleteClick(Object sender) {
    }

    void changeClick() {
    }

    // TODO: Event in Level handeln
    private Level findClickedLevel(String buttonTitle) {
        for (int i = 0; i <= lvlLibrary.getLevels().size(); i++) {
            if (lvlLibrary.getLevels().get(i).getLevelLabel().equals(buttonTitle)) {
                return lvlLibrary.getLevels().get(i);
            }
        }
        return null; //hier Exception machen falls es das LVL nicht findet
    }

    // TODO: Event in Challange handeln
    private Challenge findChallenge(String panelName){
        for (int i = 0; i < clickedLevel.getChallenges().size();i++){
            if(clickedLevel.getChallenges().get(i).getChallengeTitle().equals(panelName)){
                return clickedLevel.getChallenges().get(i);
            }
        }
        return null; //hier Exception machen falls es das challenge nicht findet
    }

    private void updateLevelView() {
        List<Level> levels = lvlLibrary.getLevels();
        for (Level level : levels) {
            boardView.addLevel(level.getLevelLabel(), level.getLevelState());
            //um das Layout anzuschauen, sollte mit button click kommen auf challange
            //if(level.getLevelState()==LevelState.open) {
            //    updateChallengeView(level);
            //}
        }
    }

    private void updateChallengeView(Level level) {
        List<Challenge> challenges = level.getChallenges();
        for (Challenge challenge : challenges) {
            boardView.addChallenge(challenge.getChallengeTitle(), challenge.getChallengeDesc(), challenge.getChallengeState(), challenge.getChallengeLevelOfAnxiety());
        }
    }

    //endregion

    //region Events

    public void buttonClick(String buttonTitle) {
        // same Button was clicked before
        if(buttonTitle.equals("Back")){
            UI.getCurrent().getNavigator().navigateTo(MyUI.STARTPAGEVIEW);
        }

        if (clickedLevel == null){
            return;
        }

        if(clickedLevel.getLevelLabel().equals(buttonTitle)){
            boardView.removeChallenges();
            clickedLevel=new Level("");
        }
        else{
            boardView.removeChallenges();
            clickedLevel = findClickedLevel(buttonTitle);

            if (clickedLevel == null){
                return;
            }

            updateChallengeView(clickedLevel);
        }
    }

    @Override
    public void buttonClick(Button openClose) {
        Challenge c = findChallenge(openClose.getParent().getParent().getCaption());

        if (c == null){
            return;
        }

        if(openClose.getCaption().equals("close")){
            c.setChallengeState(ChallengeState.closed);
        }
        else{
            c.setChallengeState(ChallengeState.open);
        }
        boardView.removeChallenges();
        updateChallengeView(clickedLevel);
    }

    //endregion

}
