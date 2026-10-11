package bots;
import com.gatdsen.manager.Controller;
import com.gatdsen.manager.StaticGameState;
import com.gatdsen.manager.player.Bot;
import com.gatdsen.simulation.PathTile;
import com.gatdsen.simulation.Tower;
import com.gatdsen.simulation.Tower.TowerType;

public class MyBot extends Bot {


    private int x_0 = 4;
    private int y_0 = 9;

    private int x_1 = 8;
    private int y_1 = 3;

    private int x_2 = 9;
    private int y_2 = 3;

    private int x_3 = 6;
    private int y_3 = 12;

    private int x_4 = 2;
    private int y_4 = 11;

    private int x_5 = 0;
    private int y_5 = 0;

    private int x_6 = 0;
    private int y_6 = 0;

    private int x_7 = 2;
    private int y_7 = 2;

    private int x_8 = 1;
    private int y_8 = 7;

    private int x_9 = 0;
    private int y_9 = 11;

    private int x_10 = 0;
    private int y_10 = 5;

    private int flag_0 = 0;
    private int flag_1 = 0;
    private int flag_2 = 0;
    private int flag_3 = 0;
    private int flag_4 = 0;
    private int flag_5 = 0;

    private TowerType bestCatToChoose;
    private boolean isMap3 = false;

    private int x_0_3 = 3;
    private int y_0_3 = 10;

    private int x_1_3 = 10;
    private int y_1_3 = 9;

    private int x_2_3 = 3;
    private int y_2_3 = 3;

    private int x_3_3 = 4;
    private int y_3_3 = 0;

    private int x_4_3 = 1;
    private int y_4_3 = 8;

    private int x_5_3 = 1;
    private int y_5_3 = 12;

    private int x_6_3 = 1;
    private int y_6_3 = 5;


    @Override
    public String getStudentName() {
        return "Aziz Zarrouki";
    }
    @Override
    public int getMatrikel() {
        return 246556;
    }

    @Override
    public String getName() {
        return "best";
    }


    @Override
    public void init(StaticGameState state) {
        PathTile startTile = state.getMyPlayerState().getCheeseTile();
        while (startTile.getPrev() != null) {
            startTile = startTile.getPrev();
        }
        isMap3 = !state.getMyPlayerState().getBoard()[10][12].isBuildable() && !state.getMyPlayerState().getBoard()[9][12].isBuildable() &&
                !state.getMyPlayerState().getBoard()[8][12].isBuildable() && state.getMyPlayerState().getBoard()[7][12].isBuildable() &&
                !state.getMyPlayerState().getBoard()[9][9].isBuildable();
    }

    private void chooseBestCat(int number, int flag){
        if (flag % number == 0) {
            bestCatToChoose = TowerType.values()[2];
        } else {
            bestCatToChoose = TowerType.values()[0];
        }
    }

    @Override
    public void executeTurn(StaticGameState state, Controller controller) {
        if (!isMap3) {
            if (x_0 <= 8) {
                chooseBestCat(4, flag_0);
                flag_0++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_0, y_0, bestCatToChoose);
                    x_0++;
                }

            } else if (x_1 >= 0) {
                chooseBestCat(3, flag_1);
                flag_1++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_1, y_1, bestCatToChoose);
                    x_1--;
                }
            } else if (y_2 <= 9) {
                chooseBestCat(2, flag_2);
                flag_2++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_2, y_2, bestCatToChoose);
                    y_2++;
                }
            } else if (y_3 >= 10) {
                chooseBestCat(2, flag_3);
                flag_3++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_3, y_3, bestCatToChoose);
                    y_3--;
                }
            } else if (y_4 >= 6) {
                chooseBestCat(4, flag_4);
                flag_4++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_4, y_4, bestCatToChoose);
                    y_4--;
                }
            } else if (y_5 <= 6) {
                chooseBestCat(2, flag_5);
                flag_5++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_5, y_5, bestCatToChoose);
                    y_5++;
                }
            } else if (x_6 <= 6) {
                chooseBestCat(2, flag_5);
                flag_5++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_6, y_6, bestCatToChoose);
                    x_6++;
                }
            } else if (x_7 <= 6) {
                chooseBestCat(2, flag_5);
                flag_5++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_7, y_7, bestCatToChoose);
                    x_7++;
                }
            } else if (x_8 <= 10) {
                chooseBestCat(2, flag_5);
                flag_5++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_8, y_8, bestCatToChoose);
                    x_8++;
                }
            } else if (x_9 <= 10) {
                chooseBestCat(2, flag_5);
                flag_5++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_9, y_9, bestCatToChoose);
                    x_9++;
                }
            } else if (x_10 <= 10) {
                chooseBestCat(2, flag_5);
                flag_5++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_10, y_10, bestCatToChoose);
                    x_10++;
                }
            }
        } else {
            if (x_0_3 <= 8) {
                chooseBestCat(4, flag_0);
                flag_0++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_0_3, y_0_3, bestCatToChoose);
                    x_0_3++;
                }
            } else if (y_1_3 >= 5) {
                chooseBestCat(2, flag_1);
                flag_1++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_1_3, y_1_3, bestCatToChoose);
                    y_1_3--;
                }
            } else if (x_2_3 <= 7) {
                chooseBestCat(2, flag_2);
                flag_2++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_2_3, y_2_3, bestCatToChoose);
                    x_2_3++;
                }
            } else if (y_3_3 <= 3) {
                chooseBestCat(2, flag_2);
                flag_2++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_3_3, y_3_3, bestCatToChoose);
                    y_3_3++;
                }
            } else if (x_4_3 <= 8) {
                chooseBestCat(2, flag_2);
                flag_2++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_4_3, y_4_3, bestCatToChoose);
                    x_4_3++;
                }
            } else if (x_5_3 <= 5) {
                chooseBestCat(2, flag_2);
                flag_2++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_5_3, y_5_3, bestCatToChoose);
                    x_5_3++;
                }
            } else if (x_6_3 <= 9) {
                chooseBestCat(2, flag_2);
                flag_2++;
                if (state.getMyPlayerState().getMoney() >= Tower.getTowerPrice(bestCatToChoose)) {
                    controller.placeTower(x_6_3, y_6_3, bestCatToChoose);
                    x_6_3++;
                }
            }
        }
    }
}