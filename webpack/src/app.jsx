import React from 'react';
import ReactDOM from 'react-dom';
import ReactRouter from 'react-router';
import injectTapEventPlugin from 'react-tap-event-plugin';

// Material Ui
import AccountBox from 'material-ui/lib/svg-icons/action/account-box';
import AccountCircle from 'material-ui/lib/svg-icons/action/account-circle';
import AppBar from 'material-ui/lib/app-bar';
import AutoComplete from 'material-ui/lib/auto-complete'
import Avatar from 'material-ui/lib/avatar';
import Badge from 'material-ui/lib/badge';
import Card from 'material-ui/lib/card/card'
import CircularProgress from 'material-ui/lib/circular-progress'
import Checkbox from 'material-ui/lib/checkbox'
import Colors from 'material-ui/lib/styles/colors';
import ColorManipulator from 'material-ui/lib/utils/color-manipulator';
import DatePicker from 'material-ui/lib/date-picker/date-picker'
import Dialog from 'material-ui/lib/dialog';
import Divider from 'material-ui/lib/divider';
import DropDownMenu from 'material-ui/lib/drop-down-menu'
import FlatButton from 'material-ui/lib/flat-button';
import FloatingActionButton from 'material-ui/lib/floating-action-button'
import FontIcon from 'material-ui/lib/font-icon'
import GridList from 'material-ui/lib/grid-list/grid-list'
import IconButton from 'material-ui/lib/icon-button';
import IconMenu from 'material-ui/lib/menus/icon-menu';
import isEqual from 'lodash.isequal';
import LeftNav from 'material-ui/lib/left-nav';
import Launch from 'material-ui/lib/svg-icons/action/launch';
import LinearProgress from 'material-ui/lib/linear-progress'
import List from 'material-ui/lib/lists/list';
import ListItem from 'material-ui/lib/lists/list-item';
import Email from 'material-ui/lib/svg-icons/communication/email.js';
import MailOutline from 'material-ui/lib/svg-icons/communication/mail-outline';
import Menu from 'material-ui/lib/menu/menu';
import MenuIcon from 'material-ui/lib/svg-icons/navigation/menu';
import MenuItem from 'material-ui/lib/menu/menu-item';
import MuiTheme from 'material-ui/lib/styles/getMuiTheme';
import Notifications from 'material-ui/lib/svg-icons/social/notifications';
import Paper from 'material-ui/lib/paper';
import Popover from 'material-ui/lib/popover/popover'
import RadioButton from 'material-ui/lib/radio-button'
import RadioButtonGroup from 'material-ui/lib/radio-button-group'
import RefreshIndicator from 'material-ui/lib/refresh-indicator'
import Search from 'material-ui/lib/svg-icons/action/search';
import SelectField from 'material-ui/lib/select-field'
import Slider from 'material-ui/lib/slider'
import Snackbar from 'material-ui/lib/snackbar'
import Spacing from 'material-ui/lib/styles/spacing';
import SvgIcon from 'material-ui/lib/svg-icon';
import Tab from 'material-ui/lib/tabs/tab';
import Tabs from 'material-ui/lib/tabs/tabs';
import Table from 'material-ui/lib/table/table'
import TableRow from 'material-ui/lib/table/table-row'
import TableRowColumn from 'material-ui/lib/table/table-row-column'
import TableHeader from 'material-ui/lib/table/table-header'
import TableHeaderColumn from 'material-ui/lib/table/table-header-column'
import TableBody from 'material-ui/lib/table/table-body'
import TableFooter from 'material-ui/lib/table/table-footer'
import TextField from './overrides/material-ui/lib/TextField/TextField';
import TimePicker from 'material-ui/lib/time-picker/time-picker'
import Toolbar from 'material-ui/lib/toolbar/toolbar'
import ToolbarGroup from 'material-ui/lib/toolbar/toolbar-group'
import ToolbarSeparator from 'material-ui/lib/toolbar/toolbar-separator'
import ToolbarTitle from 'material-ui/lib/toolbar/toolbar-title'
import Toggle from 'material-ui/lib/toggle'
import Typography from 'material-ui/lib/styles/typography';
import RaisedButton from 'material-ui/lib/raised-button';
import ZIndex from 'material-ui/lib/styles/zIndex';

module.exports = {
    React: React,
    ReactDOM: ReactDOM,
    InjectTapEventPlugin: injectTapEventPlugin,
    Lodash: {
        isEqual: isEqual,
    },
    MaterialUi: {
        AppBar: AppBar,
        AutoComplete: AutoComplete,
        Avatar: Avatar,
        Badge: Badge,
        Card: Card,
        CircularProgress: CircularProgress,
        Checkbox: Checkbox,
        DatePicker: DatePicker,
        Dialog: Dialog,
        Divider: Divider,
        DropDownMenu: DropDownMenu,
        GridList: GridList,
        FlatButton: FlatButton,
        FloatingActionButton: FloatingActionButton,
        FontIcon: FontIcon,
        IconButton: IconButton,
        IconMenu: IconMenu,
        LeftNav: LeftNav,
        LinearProgress: LinearProgress,
        List: List,
        ListItem: ListItem,
        Menu: Menu,
        MenuItem: MenuItem,
        Paper: Paper,
        Popover: Popover,
        RadioButton: RadioButton,
        RadioButtonGroup: RadioButtonGroup,
        RaisedButton: RaisedButton,
        RefreshIndicator: RefreshIndicator,
        SelectField: SelectField,
        Slider: Slider,
        Snackbar: Snackbar,
        SvgIcon: SvgIcon,
        Tab: Tab,
        Tabs: Tabs,
        Table: Table,
        TableRow: TableRow,
        TableRowColumn: TableRowColumn,
        TableHeader: TableHeader,
        TableHeaderColumn: TableHeaderColumn,
        TableBody: TableBody,
        TableFooter: TableFooter,
        TextField: TextField,
        TimePicker: TimePicker,
        Toolbar: Toolbar,
        ToolbarGroup: ToolbarGroup,
        ToolbarSeparator: ToolbarSeparator,
        ToolbarTitle: ToolbarTitle,
        Toggle: Toggle,
        Icons: {
            AccountBox: AccountBox,
            AccountCircle: AccountCircle,
            Launch: Launch,
            MailOutline: MailOutline,
            Menu: MenuIcon,
            Email: Email,
            Notifications: Notifications,
            Search: Search,
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
