
import injectTapEventPlugin from 'react-tap-event-plugin';

// Material Ui


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
import LeftNav from 'material-ui/lib/left-nav';
import LinearProgress from 'material-ui/lib/linear-progress'
import List from 'material-ui/lib/lists/list';
import ListItem from 'material-ui/lib/lists/list-item';
import LodashAssign from 'lodash.assign';
import LodashIsEqual from 'lodash.isequal';
import Menu from 'material-ui/lib/menus/menu';
import MenuItem from 'material-ui/lib/menus/menu-item';
import MuiTheme from 'material-ui/lib/styles/getMuiTheme';
import Paper from 'material-ui/lib/paper';
import Popover from 'material-ui/lib/popover/popover'
import RadioButton from 'material-ui/lib/radio-button'
import RadioButtonGroup from 'material-ui/lib/radio-button-group'
import React from 'react';
import ReactDOM from 'react-dom';
import ReactTransitionGroup from 'react-addons-transition-group'
import ReactCssTransitionGroup from 'react-addons-css-transition-group'
import ReactSelect from 'react-select'
import RefreshIndicator from 'material-ui/lib/refresh-indicator'
import SelectField from 'material-ui/lib/select-field'
import Slider from 'material-ui/lib/slider'
import Snackbar from 'material-ui/lib/snackbar'
import Spacing from 'material-ui/lib/styles/spacing';
import SvgIcon from 'material-ui/lib/svg-icon';
import SvgIconAccountBox from 'material-ui/lib/svg-icons/action/account-box';
import SvgIconAccountCircle from 'material-ui/lib/svg-icons/action/account-circle';
import SvgIconAdd from 'material-ui/lib/svg-icons/content/add';
import SvgIconAddBox from 'material-ui/lib/svg-icons/content/add-box';
import SvgIconAddCircle from 'material-ui/lib/svg-icons/content/add-circle';
import SvgIconAddCircleOutline from 'material-ui/lib/svg-icons/content/add-circle-outline';
import SvgIconAddShoppingCart from 'material-ui/lib/svg-icons/action/add-shopping-cart';
import SvgIconArchive from 'material-ui/lib/svg-icons/content/archive';
import SvgIconArrowDropDown from 'material-ui/lib/svg-icons/navigation/arrow-drop-down';
import SvgIconArrowDropUp from 'material-ui/lib/svg-icons/navigation/arrow-drop-up';
import SvgIconAttachFile from 'material-ui/lib/svg-icons/editor/attach-file';
import SvgIconChevronLeft from 'material-ui/lib/svg-icons/navigation/chevron-left';
import SvgIconChevronRight from 'material-ui/lib/svg-icons/navigation/chevron-right';
import SvgIconClose from 'material-ui/lib/svg-icons/navigation/close';
import SvgIconCloudDownload from 'material-ui/lib/svg-icons/file/cloud-download';
import SvgIconCloudUpload from 'material-ui/lib/svg-icons/file/cloud-upload';
import SvgIconDelete from 'material-ui/lib/svg-icons/action/delete';
import SvgIconDragHandle from 'material-ui/lib/svg-icons/editor/drag-handle';
import SvgIconEmail from 'material-ui/lib/svg-icons/communication/email';
import SvgIconFileDownload from 'material-ui/lib/svg-icons/file/file-download';
import SvgIconFileUpload from 'material-ui/lib/svg-icons/file/file-upload';
import SvgIconFilterList from 'material-ui/lib/svg-icons/content/filter-list';
import SvgIconGpsFixed from 'material-ui/lib/svg-icons/device/gps-fixed';
import SvgIconInsertDriveFile from 'material-ui/lib/svg-icons/editor/insert-drive-file';
import SvgIconLaunch from 'material-ui/lib/svg-icons/action/launch';
import SvgIconMailOutline from 'material-ui/lib/svg-icons/communication/mail-outline';
import SvgIconMenu from 'material-ui/lib/svg-icons/navigation/menu';
import SvgIconNotifications from 'material-ui/lib/svg-icons/social/notifications';
import SvgIconPersonAdd from 'material-ui/lib/svg-icons/social/person-add';
import SvgIconPowerSettingsNew from 'material-ui/lib/svg-icons/action/power-settings-new';
import SvgIconPrint from 'material-ui/lib/svg-icons/action/print';
import SvgIconReply from 'material-ui/lib/svg-icons/content/reply';
import SvgIconSearch from 'material-ui/lib/svg-icons/action/search';
import SvgIconSend from 'material-ui/lib/svg-icons/content/send';
import SvgIconStorage from 'material-ui/lib/svg-icons/device/storage';
import SvgIconUnarchive from 'material-ui/lib/svg-icons/content/unarchive';
import Tab from 'material-ui/lib/tabs/tab';
import Tabs from 'material-ui/lib/tabs/tabs';
import Table from 'material-ui/lib/table/table'
import TableRow from './overrides/material-ui/src/table/table-row'
import TableRowColumn from 'material-ui/lib/table/table-row-column'
import TableHeader from 'material-ui/lib/table/table-header'
import TableHeaderColumn from 'material-ui/lib/table/table-header-column'
import TableBody from './overrides/material-ui/src/table/table-body'
import TableFooter from 'material-ui/lib/table/table-footer'
import TextField from 'material-ui/lib/TextField/TextField';
import TextareaAutosize from 'react-textarea-autosize/lib/TextareaAutosize';
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
    ReactAddons: {
        ReactTransitionGroup: ReactTransitionGroup,
        ReactCssTransitionGroup: ReactCssTransitionGroup,
    },
    InjectTapEventPlugin: injectTapEventPlugin,
    Lodash: {
        assign: LodashAssign,
        isEqual: LodashIsEqual,
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
            AccountBox: SvgIconAccountBox,
            AccountCircle: SvgIconAccountCircle,
            Add: SvgIconAdd,
            AddBox: SvgIconAddBox,
            AddCircle: SvgIconAddCircle,
            AddCircleOutline: SvgIconAddCircleOutline,
            AddShoppingCart: SvgIconAddShoppingCart,
            Archive: SvgIconArchive,
            ArrowDropUp: SvgIconArrowDropUp,
            ArrowDropDown: SvgIconArrowDropDown,
            AttachFile: SvgIconAttachFile,
            ChevronLeft: SvgIconChevronLeft,
            ChevronRight: SvgIconChevronRight,
            CloudDownload: SvgIconCloudDownload,
            CloudUpload: SvgIconCloudUpload,
            Close: SvgIconClose,
            Delete: SvgIconDelete,
            DragHandle: SvgIconDragHandle,
            Email: SvgIconEmail,
            FileDownload: SvgIconFileDownload,
            FileUpload: SvgIconFileUpload,
            FilterList: SvgIconFilterList,
            GpsFixed: SvgIconGpsFixed,
            InsertDriveFile: SvgIconInsertDriveFile,
            Launch: SvgIconLaunch,
            MailOutline: SvgIconMailOutline,
            Menu: SvgIconMenu,
            Notifications: SvgIconNotifications,
            PersonAdd: SvgIconPersonAdd,
            PowerSettingsNew: SvgIconPowerSettingsNew,
            Print: SvgIconPrint,
            Reply: SvgIconReply,
            Search: SvgIconSearch,
            Send: SvgIconSend,
            Storage: SvgIconStorage,
            Unarchive: SvgIconUnarchive,
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
    ReactSelect: ReactSelect,
    TextareaAutosize: TextareaAutosize,
};
