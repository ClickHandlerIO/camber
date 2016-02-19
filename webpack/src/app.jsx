import React from 'react';
import ReactDOM from 'react-dom';
import ReactRouter from 'react-router';
import injectTapEventPlugin from 'react-tap-event-plugin';

// Material Ui
import AppBar from 'material-ui/lib/app-bar';
import Divider from 'material-ui/lib/divider';
import FlatButton from 'material-ui/lib/flat-button';
import LeftNav from 'material-ui/lib/left-nav';
import List from 'material-ui/lib/lists/list';
import ListItem from 'material-ui/lib/lists/list-item';
import Paper from 'material-ui/lib/paper';
import Tab from 'material-ui/lib/tabs/tab';
import Tabs from 'material-ui/lib/tabs/tabs';
import RaisedButton from 'material-ui/lib/raised-button';

import Colors from 'material-ui/lib/styles/colors';
import MuiTheme from 'material-ui/lib/styles/getMuiTheme';
import Spacing from 'material-ui/lib/styles/spacing';
import Typography from 'material-ui/lib/styles/typography';
import ZIndex from 'material-ui/lib/styles/zIndex';

import ColorManipulator from 'material-ui/lib/utils/color-manipulator';

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
    Tab: Tab,
    Tabs: Tabs,
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
