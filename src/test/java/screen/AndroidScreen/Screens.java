package screen.AndroidScreen;


import screen.AndroidScreen.ApiDemosScreen;

public class Screens {
    public Screens() {
    }

    private ApiDemosScreen apiDemosScreen;
    private MainScreen mainScreen;
    private PreferenceScreen preferenceScreen;
    private PreferenceDependenciesScreen preferenceDependenciesScreen;
    private SwichScreen switchScreen;


//    private ViewsScreen viewsScreen;
//    private DragAndDropScreen dragAndDropScreen;
//    private DateWidgetsScreen dateWidgetsScreen;
//    private PopupMenuScreen popupMenuScreen;
//    private AlertViewScreen alertViewScreen;
//    private PickerViewScreen pickerViewScreen;
//    private SwitchesiOSScreen switchesiOSScreen;

    public SwichScreen switchScreen(){
        if (switchScreen == null){
            switchScreen = new SwichScreen();
        }
        return switchScreen;
    }

//    public SwitchesiOSScreen switchesiOSScreen() {
//        if (switchesiOSScreen == null) {
//            switchesiOSScreen = new SwitchesiOSScreen();
//        }
//        return switchesiOSScreen;
//    }
//
//    public PickerViewScreen pickerViewScreen() {
//        if (pickerViewScreen == null) {
//            pickerViewScreen = new PickerViewScreen();
//        }
//        return pickerViewScreen;


//    public AlertViewScreen alertViewScreen() {
//        if (alertViewScreen == null){
//            alertViewScreen = new AlertViewScreen();
//        }
//        return alertViewScreen;
//    }
//
//    public PopupMenuScreen popupMenuScreen() {
//        if (popupMenuScreen == null) {
//            popupMenuScreen = new PopupMenuScreen();
//        }
//        return popupMenuScreen;
//    }
//
//    public DateWidgetsScreen dateWidgetsScreen(){
//        if (dateWidgetsScreen == null){
//            dateWidgetsScreen = new DateWidgetsScreen();
//        }
//        return dateWidgetsScreen;
//    }
//
//    public DragAndDropScreen dragAndDropScreen(){
//        if (dragAndDropScreen == null){
//            dragAndDropScreen = new DragAndDropScreen();
//        }
//        return dragAndDropScreen;
//    }
//
//    public ViewsScreen viewsScreen(){
//        if (viewsScreen == null) {
//            viewsScreen = new ViewsScreen();
//        }
//        return viewsScreen;
//    }
//


    public ApiDemosScreen apiDemosScreen() {
        if (apiDemosScreen == null) {
            apiDemosScreen = new ApiDemosScreen();
        }
        return apiDemosScreen;
    }

    public MainScreen mainScreen() {
        if (mainScreen == null) {
            mainScreen = new MainScreen();
        }
        return mainScreen;
    }

    public PreferenceScreen preferenceScreen() {
        if (preferenceScreen == null) {
            preferenceScreen = new PreferenceScreen();
        }
        return preferenceScreen;
    }

    public PreferenceDependenciesScreen preferenceDependenciesScreen() {
        if (preferenceDependenciesScreen == null) {
            preferenceDependenciesScreen = new PreferenceDependenciesScreen();
        }
        return preferenceDependenciesScreen;
    }

}
