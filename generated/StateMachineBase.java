/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        UIBuilder.registerCustomComponent("SpanLabel", com.codename1.components.SpanLabel.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        UIBuilder.registerCustomComponent("SpanLabel", com.codename1.components.SpanLabel.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Button findBtn6(Component root) {
        return (com.codename1.ui.Button)findByName("btn_6", root);
    }

    public com.codename1.ui.Button findBtn6() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtn5(Component root) {
        return (com.codename1.ui.Button)findByName("btn_5", root);
    }

    public com.codename1.ui.Button findBtn5() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnGameComputer(Component root) {
        return (com.codename1.ui.Button)findByName("btnGameComputer", root);
    }

    public com.codename1.ui.Button findBtnGameComputer() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnGameComputer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnGameComputer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtn4(Component root) {
        return (com.codename1.ui.Button)findByName("btn_4", root);
    }

    public com.codename1.ui.Button findBtn4() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtn3(Component root) {
        return (com.codename1.ui.Button)findByName("btn_3", root);
    }

    public com.codename1.ui.Button findBtn3() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer11(Component root) {
        return (com.codename1.ui.Container)findByName("Container_11", root);
    }

    public com.codename1.ui.Container findContainer11() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container_11", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container_11", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer12(Component root) {
        return (com.codename1.ui.Container)findByName("Container_12", root);
    }

    public com.codename1.ui.Container findContainer12() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container_12", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container_12", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtn9(Component root) {
        return (com.codename1.ui.Button)findByName("btn_9", root);
    }

    public com.codename1.ui.Button findBtn9() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_9", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_9", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtn8(Component root) {
        return (com.codename1.ui.Button)findByName("btn_8", root);
    }

    public com.codename1.ui.Button findBtn8() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_8", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_8", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtn7(Component root) {
        return (com.codename1.ui.Button)findByName("btn_7", root);
    }

    public com.codename1.ui.Button findBtn7() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_7", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_7", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtPlayer1(Component root) {
        return (com.codename1.ui.TextField)findByName("txtPlayer1", root);
    }

    public com.codename1.ui.TextField findTxtPlayer1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtPlayer1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtPlayer1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtPlayer2(Component root) {
        return (com.codename1.ui.TextField)findByName("txtPlayer2", root);
    }

    public com.codename1.ui.TextField findTxtPlayer2() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtPlayer2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtPlayer2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerGame(Component root) {
        return (com.codename1.ui.Container)findByName("Container_game", root);
    }

    public com.codename1.ui.Container findContainerGame() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container_game", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container_game", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtn2(Component root) {
        return (com.codename1.ui.Button)findByName("btn_2", root);
    }

    public com.codename1.ui.Button findBtn2() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtn1(Component root) {
        return (com.codename1.ui.Button)findByName("btn_1", root);
    }

    public com.codename1.ui.Button findBtn1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnReset(Component root) {
        return (com.codename1.ui.Button)findByName("btn_reset", root);
    }

    public com.codename1.ui.Button findBtnReset() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_reset", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_reset", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnDelete(Component root) {
        return (com.codename1.ui.Button)findByName("btn_delete", root);
    }

    public com.codename1.ui.Button findBtnDelete() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_delete", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_delete", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container_1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container_1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container_1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.list.MultiList findMltRank(Component root) {
        return (com.codename1.ui.list.MultiList)findByName("mltRank", root);
    }

    public com.codename1.ui.list.MultiList findMltRank() {
        com.codename1.ui.list.MultiList cmp = (com.codename1.ui.list.MultiList)findByName("mltRank", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.list.MultiList)findByName("mltRank", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnEasy(Component root) {
        return (com.codename1.ui.Button)findByName("btn_easy", root);
    }

    public com.codename1.ui.Button findBtnEasy() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_easy", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_easy", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnRank(Component root) {
        return (com.codename1.ui.Button)findByName("btnRank", root);
    }

    public com.codename1.ui.Button findBtnRank() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnRank", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnRank", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnSave(Component root) {
        return (com.codename1.ui.Button)findByName("btn_save", root);
    }

    public com.codename1.ui.Button findBtnSave() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_save", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_save", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblName(Component root) {
        return (com.codename1.ui.Label)findByName("lbl_name", root);
    }

    public com.codename1.ui.Label findLblName() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lbl_name", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lbl_name", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findMainContainer(Component root) {
        return (com.codename1.ui.Container)findByName("MainContainer", root);
    }

    public com.codename1.ui.Container findMainContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("MainContainer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("MainContainer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer15(Component root) {
        return (com.codename1.ui.Container)findByName("Container_15", root);
    }

    public com.codename1.ui.Container findContainer15() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container_15", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container_15", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer16(Component root) {
        return (com.codename1.ui.Container)findByName("Container_16", root);
    }

    public com.codename1.ui.Container findContainer16() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container_16", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container_16", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnOfflineGame(Component root) {
        return (com.codename1.ui.Button)findByName("btnOfflineGame", root);
    }

    public com.codename1.ui.Button findBtnOfflineGame() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnOfflineGame", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnOfflineGame", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSlbText(Component root) {
        return (com.codename1.components.SpanLabel)findByName("slbText", root);
    }

    public com.codename1.components.SpanLabel findSlbText() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("slbText", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("slbText", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer13(Component root) {
        return (com.codename1.ui.Container)findByName("Container_13", root);
    }

    public com.codename1.ui.Container findContainer13() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container_13", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container_13", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblPlayer2(Component root) {
        return (com.codename1.ui.Label)findByName("lbl_player2", root);
    }

    public com.codename1.ui.Label findLblPlayer2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lbl_player2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lbl_player2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer14(Component root) {
        return (com.codename1.ui.Container)findByName("Container_14", root);
    }

    public com.codename1.ui.Container findContainer14() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container_14", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container_14", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnGameFriend(Component root) {
        return (com.codename1.ui.Button)findByName("btnGameFriend", root);
    }

    public com.codename1.ui.Button findBtnGameFriend() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnGameFriend", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnGameFriend", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer17(Component root) {
        return (com.codename1.ui.Container)findByName("Container_17", root);
    }

    public com.codename1.ui.Container findContainer17() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container_17", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container_17", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer18(Component root) {
        return (com.codename1.ui.Container)findByName("Container_18", root);
    }

    public com.codename1.ui.Container findContainer18() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container_18", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container_18", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblTitle(Component root) {
        return (com.codename1.ui.Label)findByName("lblTitle", root);
    }

    public com.codename1.ui.Label findLblTitle() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblTitle", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblTitle", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnResult(Component root) {
        return (com.codename1.ui.Button)findByName("btn_result", root);
    }

    public com.codename1.ui.Button findBtnResult() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_result", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_result", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected void exitForm(Form f) {
        if("Computer".equals(f.getName())) {
            exitComputer(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(f.getName())) {
            exitLogin(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Detail".equals(f.getName())) {
            exitDetail(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("TicTacToeOffline".equals(f.getName())) {
            exitTicTacToeOffline(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Table".equals(f.getName())) {
            exitTable(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("GameAgainstFriend".equals(f.getName())) {
            exitGameAgainstFriend(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitComputer(Form f) {
    }


    protected void exitLogin(Form f) {
    }


    protected void exitDetail(Form f) {
    }


    protected void exitTicTacToeOffline(Form f) {
    }


    protected void exitTable(Form f) {
    }


    protected void exitGameAgainstFriend(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Computer".equals(f.getName())) {
            beforeComputer(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(f.getName())) {
            beforeLogin(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Detail".equals(f.getName())) {
            beforeDetail(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("TicTacToeOffline".equals(f.getName())) {
            beforeTicTacToeOffline(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Table".equals(f.getName())) {
            beforeTable(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("GameAgainstFriend".equals(f.getName())) {
            beforeGameAgainstFriend(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeComputer(Form f) {
    }


    protected void beforeLogin(Form f) {
    }


    protected void beforeDetail(Form f) {
    }


    protected void beforeTicTacToeOffline(Form f) {
    }


    protected void beforeTable(Form f) {
    }


    protected void beforeGameAgainstFriend(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Computer".equals(c.getName())) {
            beforeContainerComputer(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(c.getName())) {
            beforeContainerLogin(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Detail".equals(c.getName())) {
            beforeContainerDetail(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("TicTacToeOffline".equals(c.getName())) {
            beforeContainerTicTacToeOffline(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Table".equals(c.getName())) {
            beforeContainerTable(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("GameAgainstFriend".equals(c.getName())) {
            beforeContainerGameAgainstFriend(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerComputer(Container c) {
    }


    protected void beforeContainerLogin(Container c) {
    }


    protected void beforeContainerDetail(Container c) {
    }


    protected void beforeContainerTicTacToeOffline(Container c) {
    }


    protected void beforeContainerTable(Container c) {
    }


    protected void beforeContainerGameAgainstFriend(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("Computer".equals(f.getName())) {
            postComputer(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(f.getName())) {
            postLogin(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Detail".equals(f.getName())) {
            postDetail(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("TicTacToeOffline".equals(f.getName())) {
            postTicTacToeOffline(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Table".equals(f.getName())) {
            postTable(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("GameAgainstFriend".equals(f.getName())) {
            postGameAgainstFriend(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postComputer(Form f) {
    }


    protected void postLogin(Form f) {
    }


    protected void postDetail(Form f) {
    }


    protected void postTicTacToeOffline(Form f) {
    }


    protected void postTable(Form f) {
    }


    protected void postGameAgainstFriend(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Computer".equals(c.getName())) {
            postContainerComputer(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(c.getName())) {
            postContainerLogin(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Detail".equals(c.getName())) {
            postContainerDetail(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("TicTacToeOffline".equals(c.getName())) {
            postContainerTicTacToeOffline(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Table".equals(c.getName())) {
            postContainerTable(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("GameAgainstFriend".equals(c.getName())) {
            postContainerGameAgainstFriend(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerComputer(Container c) {
    }


    protected void postContainerLogin(Container c) {
    }


    protected void postContainerDetail(Container c) {
    }


    protected void postContainerTicTacToeOffline(Container c) {
    }


    protected void postContainerTable(Container c) {
    }


    protected void postContainerGameAgainstFriend(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Computer".equals(rootName)) {
            onCreateComputer();
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(rootName)) {
            onCreateLogin();
            aboutToShowThisContainer = null;
            return;
        }

        if("Detail".equals(rootName)) {
            onCreateDetail();
            aboutToShowThisContainer = null;
            return;
        }

        if("TicTacToeOffline".equals(rootName)) {
            onCreateTicTacToeOffline();
            aboutToShowThisContainer = null;
            return;
        }

        if("Table".equals(rootName)) {
            onCreateTable();
            aboutToShowThisContainer = null;
            return;
        }

        if("GameAgainstFriend".equals(rootName)) {
            onCreateGameAgainstFriend();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateComputer() {
    }


    protected void onCreateLogin() {
    }


    protected void onCreateDetail() {
    }


    protected void onCreateTicTacToeOffline() {
    }


    protected void onCreateTable() {
    }


    protected void onCreateGameAgainstFriend() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Computer".equals(f.getName())) {
            getStateComputer(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Login".equals(f.getName())) {
            getStateLogin(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Detail".equals(f.getName())) {
            getStateDetail(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("TicTacToeOffline".equals(f.getName())) {
            getStateTicTacToeOffline(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Table".equals(f.getName())) {
            getStateTable(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("GameAgainstFriend".equals(f.getName())) {
            getStateGameAgainstFriend(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateComputer(Form f, Hashtable h) {
    }


    protected void getStateLogin(Form f, Hashtable h) {
    }


    protected void getStateDetail(Form f, Hashtable h) {
    }


    protected void getStateTicTacToeOffline(Form f, Hashtable h) {
    }


    protected void getStateTable(Form f, Hashtable h) {
    }


    protected void getStateGameAgainstFriend(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Computer".equals(f.getName())) {
            setStateComputer(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(f.getName())) {
            setStateLogin(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Detail".equals(f.getName())) {
            setStateDetail(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("TicTacToeOffline".equals(f.getName())) {
            setStateTicTacToeOffline(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Table".equals(f.getName())) {
            setStateTable(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("GameAgainstFriend".equals(f.getName())) {
            setStateGameAgainstFriend(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateComputer(Form f, Hashtable state) {
    }


    protected void setStateLogin(Form f, Hashtable state) {
    }


    protected void setStateDetail(Form f, Hashtable state) {
    }


    protected void setStateTicTacToeOffline(Form f, Hashtable state) {
    }


    protected void setStateTable(Form f, Hashtable state) {
    }


    protected void setStateGameAgainstFriend(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("mltRank".equals(listName)) {
            return initListModelMltRank(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelMltRank(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Computer")) {
            if("btn_easy".equals(c.getName())) {
                onComputer_BtnEasyAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Login")) {
            if("btn_save".equals(c.getName())) {
                onLogin_BtnSaveAction(c, event);
                return;
            }
            if("txtPlayer1".equals(c.getName())) {
                onLogin_TxtPlayer1Action(c, event);
                return;
            }
            if("txtPlayer2".equals(c.getName())) {
                onLogin_TxtPlayer2Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Detail")) {
            if("btn_delete".equals(c.getName())) {
                onDetail_BtnDeleteAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("TicTacToeOffline")) {
            if("btn_1".equals(c.getName())) {
                onTicTacToeOffline_Btn1Action(c, event);
                return;
            }
            if("btn_2".equals(c.getName())) {
                onTicTacToeOffline_Btn2Action(c, event);
                return;
            }
            if("btn_3".equals(c.getName())) {
                onTicTacToeOffline_Btn3Action(c, event);
                return;
            }
            if("btn_4".equals(c.getName())) {
                onTicTacToeOffline_Btn4Action(c, event);
                return;
            }
            if("btn_5".equals(c.getName())) {
                onTicTacToeOffline_Btn5Action(c, event);
                return;
            }
            if("btn_6".equals(c.getName())) {
                onTicTacToeOffline_Btn6Action(c, event);
                return;
            }
            if("btn_7".equals(c.getName())) {
                onTicTacToeOffline_Btn7Action(c, event);
                return;
            }
            if("btn_8".equals(c.getName())) {
                onTicTacToeOffline_Btn8Action(c, event);
                return;
            }
            if("btn_9".equals(c.getName())) {
                onTicTacToeOffline_Btn9Action(c, event);
                return;
            }
            if("btn_reset".equals(c.getName())) {
                onTicTacToeOffline_BtnResetAction(c, event);
                return;
            }
            if("btn_result".equals(c.getName())) {
                onTicTacToeOffline_BtnResultAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Table")) {
            if("mltRank".equals(c.getName())) {
                onTable_MltRankAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("GameAgainstFriend")) {
            if("btnOfflineGame".equals(c.getName())) {
                onGameAgainstFriend_BtnOfflineGameAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("btnRank".equals(c.getName())) {
                onMain_BtnRankAction(c, event);
                return;
            }
            if("btnGameFriend".equals(c.getName())) {
                onMain_BtnGameFriendAction(c, event);
                return;
            }
            if("btnGameComputer".equals(c.getName())) {
                onMain_BtnGameComputerAction(c, event);
                return;
            }
        }
    }

      protected void onComputer_BtnEasyAction(Component c, ActionEvent event) {
      }

      protected void onLogin_BtnSaveAction(Component c, ActionEvent event) {
      }

      protected void onLogin_TxtPlayer1Action(Component c, ActionEvent event) {
      }

      protected void onLogin_TxtPlayer2Action(Component c, ActionEvent event) {
      }

      protected void onDetail_BtnDeleteAction(Component c, ActionEvent event) {
      }

      protected void onTicTacToeOffline_Btn1Action(Component c, ActionEvent event) {
      }

      protected void onTicTacToeOffline_Btn2Action(Component c, ActionEvent event) {
      }

      protected void onTicTacToeOffline_Btn3Action(Component c, ActionEvent event) {
      }

      protected void onTicTacToeOffline_Btn4Action(Component c, ActionEvent event) {
      }

      protected void onTicTacToeOffline_Btn5Action(Component c, ActionEvent event) {
      }

      protected void onTicTacToeOffline_Btn6Action(Component c, ActionEvent event) {
      }

      protected void onTicTacToeOffline_Btn7Action(Component c, ActionEvent event) {
      }

      protected void onTicTacToeOffline_Btn8Action(Component c, ActionEvent event) {
      }

      protected void onTicTacToeOffline_Btn9Action(Component c, ActionEvent event) {
      }

      protected void onTicTacToeOffline_BtnResetAction(Component c, ActionEvent event) {
      }

      protected void onTicTacToeOffline_BtnResultAction(Component c, ActionEvent event) {
      }

      protected void onTable_MltRankAction(Component c, ActionEvent event) {
      }

      protected void onGameAgainstFriend_BtnOfflineGameAction(Component c, ActionEvent event) {
      }

      protected void onMain_BtnRankAction(Component c, ActionEvent event) {
      }

      protected void onMain_BtnGameFriendAction(Component c, ActionEvent event) {
      }

      protected void onMain_BtnGameComputerAction(Component c, ActionEvent event) {
      }

}
