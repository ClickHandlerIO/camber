import React from 'react';
import ReactDOM from 'react-dom';
import ReactRouter from 'react-router';
import injectTapEventPlugin from 'react-tap-event-plugin';

// Material Ui
import AppBar from 'material-ui/lib/app-bar';
import Divider from 'material-ui/lib/divider';
import LeftNav from 'material-ui/lib/left-nav';
import List from 'material-ui/lib/lists/list';
import ListItem from 'material-ui/lib/lists/list-item';
import RaisedButton from 'material-ui/lib/raised-button';

import Colors from 'material-ui/lib/styles/colors';
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
    LeftNav: LeftNav,
    List: List,
    ListItem: ListItem,
    RaisedButton: RaisedButton,
    Styles: {
      Colors: Colors,
      Spacing: Spacing,
      Typography: Typography,
      ZIndex: ZIndex,
    },
    Utils: {
      ColorManipulator: ColorManipulator,
    },
  },
};
