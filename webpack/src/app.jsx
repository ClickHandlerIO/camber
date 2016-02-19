import React from 'react';
import ReactDOM from 'react-dom';
import ReactRouter from 'react-router';
import injectTapEventPlugin from 'react-tap-event-plugin';

// Material Ui
import AppBar from 'material-ui/lib/app-bar';
import Colors from 'material-ui/lib/styles/colors';
import ColorManipulator from 'material-ui/lib/utils/color-manipulator';
import Divider from 'material-ui/lib/divider';
import FlatButton from 'material-ui/lib/flat-button';
import LeftNav from 'material-ui/lib/left-nav';
import Launch from 'material-ui/lib/svg-icons/action/launch';
import List from 'material-ui/lib/lists/list';
import ListItem from 'material-ui/lib/lists/list-item';
import MuiTheme from 'material-ui/lib/styles/getMuiTheme';
import Paper from 'material-ui/lib/paper';
import Spacing from 'material-ui/lib/styles/spacing';
import SvgIcon from 'material-ui/lib/svg-icon';
import Tab from 'material-ui/lib/tabs/tab';
import Tabs from 'material-ui/lib/tabs/tabs';
import Typography from 'material-ui/lib/styles/typography';
import RaisedButton from 'material-ui/lib/raised-button';
import ZIndex from 'material-ui/lib/styles/zIndex';



module.exports = {
  React: React,
  ReactDOM: ReactDOM,
  InjectTapEventPlugin: injectTapEventPlugin,
  MaterialUi: {
    AppBar: AppBar,
    Divider: Divider,
    FlatButton: FlatButton,
    LeftNav: LeftNav,
    List: List,
    ListItem: ListItem,
    Paper: Paper,
    RaisedButton: RaisedButton,
    SvgIcon: SvgIcon,
    Tab: Tab,
    Tabs: Tabs,
    Icons: {
      Launch: Launch,
    },
    Styles: {
      Colors: Colors,
      MuiTheme: MuiTheme,
      Spacing: Spacing,
      Typography: Typography,
      ZIndex: ZIndex,
    },
    Utils: {
      ColorManipulator: ColorManipulator,
    },
  },
};
