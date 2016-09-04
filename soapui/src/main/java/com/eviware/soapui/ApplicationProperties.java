package com.eviware.soapui;

import java.awt.*;

public enum ApplicationProperties {
    ;

    public enum ColorProperty {

        BUTTON_BACKGROUND("Button.background", Color.WHITE),
        PANEL_BACKGROUND("Panel.background", Color.WHITE),
        MENUBAR_BACKGROUND("MenuBar.background", Color.WHITE),
        COMBOBOX_BACKGROUND("ComboBox.background", Color.WHITE),
        TABLEHEADER_BACKGROUND("TableHeader.background", Color.WHITE),
        TOOLBAR_BACKGROUND("ToolBar.background", Color.WHITE),
        TABBEDPANE_BACKGROUND("TabbedPane.background", Color.LIGHT_GRAY),
        TABBEDPANE_SELECTED("TabbedPane.selected", Color.WHITE),
        LABEL_BACKGROUND("Label.background", Color.WHITE),
        CHECKBOX_BACKGROUND("CheckBox.background", Color.WHITE),
        DESKTOP_BACKGROUND("Desktop.background", Color.WHITE),
        PROGRESSBAR_BACKGROUND("ProgressBar.background", Color.WHITE),
        INTERNALFRAME_BACKGROUND("InternalFrame.background", Color.WHITE),
        SPLITPANE_BACKGROUND("SplitPane.background", Color.WHITE),
        SCROLLBAR_BACKGROUND("ScrollBar.background", Color.WHITE),
        SPINNER_BACKGROUND("Spinner.background", Color.WHITE),
        OPTIONPANE_BACKGROUND("OptionPane.background", Color.WHITE),
        TOGGLEBUTTON_BACKGROUND("ToggleButton.background", Color.WHITE),
        SLIDER_BACKGROUND("Slider.background", Color.WHITE),
        RADIOBUTTON_BACKGROUND("RadioButton.background", Color.WHITE),
        SCROLLPANE_BACKGROUND("ScrollPane.background", Color.WHITE),

        TOGGLEBUTTON_SELECT("ToggleButton.select", Color.WHITE),

        MAINTOOLBAR_SEARCHFIELD("MainToolbar.searchField", Color.LIGHT_GRAY),

        MENUBAR_COLORBEFORE("MenuBar.colorBefore", Color.WHITE),
        MENUBAR_COLORAFTER("MenuBar.colorAfter", Color.LIGHT_GRAY),

        ;

        private String name;
        private Color defaultColor;

        ColorProperty(String name, Color defaultColor) {
            this.name = name;
            this.defaultColor = defaultColor;
        }

        public String getName() {
            return name;
        }

        public Color getDefaultColor() {
            return defaultColor;
        }

        @Override
        public String toString() {
            return "ColorProperty{name='" + name + "\', defaultColor=" + defaultColor + "}";
        }
    }

}
