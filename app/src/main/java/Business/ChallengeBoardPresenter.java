package Business;


import UserInterface.ChallengeBoard;
import UserInterface.ChallengeBoardView;
import com.vaadin.ui.Button;

import java.util.List;

// implemented as singleton
public class ChallengeBoardPresenter implements ChallengeBoard.ChallengeBoardViewListener {

    public void buttonClick(String buttonTitle) {
        // same Button was clicked before
        if(clickedLevel.getLevelLabel().equals(buttonTitle)){
            boardView.removeChallanges();
            clickedLevel=new Level("");
        }
        else{
            boardView.removeChallanges();
            clickedLevel = findClickedLevel(buttonTitle);
            updateChallengeView(clickedLevel);
        }
    }

    private Level findClickedLevel(String buttonTitle) {
        for (int i = 0; i <= lvlLibrary.getLevels().size() - 1; i++) {
            if (lvlLibrary.getLevels().get(i).getLevelLabel().equals(buttonTitle)) {
                return lvlLibrary.getLevels().get(i);
            }
        }
        return null; //hier Exception machen falls es das LVL nicht findet
    }


    private static ChallengeBoardPresenter instance;

    private ChallengeBoardView boardView;

    private LevelLibrary lvlLibrary;

    private Level clickedLevel = new Level("");

    //<editor-fold desc="getter">

    public ChallengeBoardView getBoardView() {
        return boardView;
    }

    public static ChallengeBoardPresenter getInstance() {
        if (instance == null) {
            instance = new ChallengeBoardPresenter();
        }

        return instance;
    }

    //</editor-fold>

    //<editor-fold desc="constructors">

    private ChallengeBoardPresenter() {
        boardView = new ChallengeBoardView();
        boardView.addListener(this);
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

    //</editor-fold>

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
            boardView.addChallenge(challenge.getTitle(), challenge.getDesc(), challenge.getChallengeState(), challenge.getLevelOfAnxiety());
        }
    }


    void addClick() {
    }

    void deleteClick(Object sender) {
    }

    void changeClick() {
    }


}
