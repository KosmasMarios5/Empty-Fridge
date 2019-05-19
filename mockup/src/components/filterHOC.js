import React from 'react';
import PropTypes from 'prop-types';
import classNames from 'classnames';
import {withStyles} from '@material-ui/core/styles';
import Drawer from '@material-ui/core/Drawer';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import CssBaseline from '@material-ui/core/CssBaseline';
import List from '@material-ui/core/List';
import Typography from '@material-ui/core/Typography';
import Divider from '@material-ui/core/Divider';
import IconButton from '@material-ui/core/IconButton';
import MenuIcon from '@material-ui/icons/Menu';
import ChevronLeftIcon from '@material-ui/icons/ChevronLeft';
import ChevronRightIcon from '@material-ui/icons/ChevronRight';
import ListItem from '@material-ui/core/ListItem';
import ListItemIcon from '@material-ui/core/ListItemIcon';
import ListItemText from '@material-ui/core/ListItemText';
import InboxIcon from '@material-ui/icons/MoveToInbox';
import MailIcon from '@material-ui/icons/Mail';
import Avatar from '@material-ui/core/Avatar';
import Slider from '@material-ui/lab/Slider';
import {IMAGE_INGREDIENTS_1, IMAGE_INGREDIENTS_2} from "./images";
import Collapse from "@material-ui/core/Collapse";

import ExpandLess from '@material-ui/icons/ExpandLess';
import ExpandMore from '@material-ui/icons/ExpandMore';
import Favorite from '@material-ui/icons/Favorite';
import FavoriteBorder from '@material-ui/icons/FavoriteBorder';

import Checkbox from '@material-ui/core/Checkbox';
import CheckBoxOutlineBlankIcon from '@material-ui/icons/CheckBoxOutlineBlank';
import CheckBoxIcon from '@material-ui/icons/CheckBox';
import SearchBar from "./searchHOC";

const drawerWidth = 400;

const styles = theme => ({
    root: {
        display: 'flex',
    },
    appBar: {
        transition: theme.transitions.create(['margin', 'width'], {
            easing: theme.transitions.easing.sharp,
            duration: theme.transitions.duration.leavingScreen,
        }),
    },
    appBarShift: {
        width: `calc(100% - ${drawerWidth}px)`,
        transition: theme.transitions.create(['margin', 'width'], {
            easing: theme.transitions.easing.easeOut,
            duration: theme.transitions.duration.enteringScreen,
        }),
        marginRight: drawerWidth,
    },
    menuButton: {
        marginLeft: 12,
        marginRight: 20,
    },
    hide: {
        display: 'none',
    },
    drawer: {
        width: drawerWidth,
        flexShrink: 0,
    },
    drawerPaper: {
        overflowX: 'hidden',
        width: drawerWidth,
    },
    drawerHeader: {
        display: 'flex',
        alignItems: 'center',
        padding: '0 8px',
        ...theme.mixins.toolbar,
        justifyContent: 'flex-start',
    },
    content: {
        flexGrow: 1,
        padding: theme.spacing.unit * 3,
        transition: theme.transitions.create('margin', {
            easing: theme.transitions.easing.sharp,
            duration: theme.transitions.duration.leavingScreen,
        }),
        marginRight: -drawerWidth,
    },
    contentShift: {
        transition: theme.transitions.create('margin', {
            easing: theme.transitions.easing.easeOut,
            duration: theme.transitions.duration.enteringScreen,
        }),
        marginRight: 0,
    },
    avatar: {
        margin: 10,
    },
    nested: {
    },
    checkbox:{
        padding: '0',
        paddingLeft: 16
    }
});

class FilterHOC extends React.Component {
    state = {
        openFilters: true,
        toggleIngredients: false,
        sliderValue: 3,
    };
    handleChange = (event, sliderValue) => {
        this.setState({sliderValue});
    };

    toggleIngredients = () => {
        this.setState(state => ({toggleIngredients: !state.toggleIngredients}));
    };
    openFilters = () => {
        this.setState(state => ({openFilters: !state.openFilters}));
    };

    render() {
        const {classes, theme, open} = this.props;
        return (
            <Drawer
                className={classes.drawer}
                variant="persistent"
                anchor="left"
                open={open}
                classes={{
                    paper: classes.drawerPaper,
                }}
            >
                <SearchBar
                    style={{width: '100%'}}
                    placeholder="Ψάξε υλικό ή κατηγορία"
                />
                <List>
                    <ListItem button onClick={this.openFilters}>
                        <ListItemIcon>
                            <Avatar src={IMAGE_INGREDIENTS_2} className={classes.avatar}/>
                        </ListItemIcon>
                        <ListItemText inset primary="Κουζίνα"/>

                        {this.state.openFilters ? <ExpandLess /> : <ExpandMore />}
                    </ListItem>
                    <Collapse in={this.state.openFilters} timeout="auto" unmountOnExit>
                        <List component="div" disablePadding>
                            <ListItem className={classes.nested}>
                                <Checkbox
                                    className={classes.checkbox}
                                    value="checkedA"
                                />
                                <ListItemText inset primary="Ελληνική"/>
                            </ListItem>
                            <ListItem className={classes.nested}>
                                <Checkbox
                                    className={classes.checkbox}
                                    value="checkedA"
                                />
                                <ListItemText inset primary="Ιταλική"/>
                            </ListItem>
                            <ListItem className={classes.nested}>
                                <Checkbox
                                    className={classes.checkbox}
                                    value="checkedA"
                                /><ListItemText inset primary="Κινέζικη"/>
                            </ListItem>
                            <ListItem className={classes.nested}>
                                <Checkbox
                                    className={classes.checkbox}
                                    value="checkedA"
                                /><ListItemText inset primary="Ινδική"/>
                            </ListItem>
                        </List>
                    </Collapse>
                    <ListItem button onClick={this.toggleIngredients}>
                        <ListItemIcon>
                            <Avatar src={IMAGE_INGREDIENTS_1} className={classes.avatar}/>
                        </ListItemIcon>
                        <ListItemText inset primary="Υλικά"/>

                        {this.state.toggleIngredients ? <ExpandLess /> : <ExpandMore />}
                    </ListItem>
                    <Collapse in={this.state.toggleIngredients} timeout="auto" unmountOnExit>
                        <List component="div" disablePadding>
                            <ListItem  className={classes.nested}>
                                    <Checkbox
                                        className={classes.checkbox}
                                        value="checkedA"
                                    />
                                <ListItemText inset primary="Μανιτάρια"/>
                            </ListItem>
                            <ListItem className={classes.nested}>
                                <Checkbox
                                    className={classes.checkbox}
                                    value="checkedA"
                                /><ListItemText inset primary="Ντομάτα"/>
                            </ListItem>
                            <ListItem className={classes.nested}>
                                <Checkbox
                                    className={classes.checkbox}
                                    value="checkedA"
                                /><ListItemText inset primary="Φρούτα"/>
                            </ListItem>
                            <ListItem className={classes.nested}>
                                <Checkbox
                                    className={classes.checkbox}
                                    value="checkedA"
                                />
                                <ListItemText inset primary="Λαχανικά"/>
                            </ListItem>
                        </List>
                    </Collapse>
                    <Divider/>
                    {/*<Checkbox icon={<FavoriteBorder />} checkedIcon={<Favorite />} value="checkedH" />*/}
                    <ListItem>
                        <ListItemText
                            primary="Βαθμός Δυσκολίας"
                            secondary={
                                <div style={{
                                    height: '4rem',
                                    width: '100%',
                                    paddingTop: '2rem'
                                }}
                                >
                                    <Slider
                                        value={this.state.sliderValue}
                                        min={0}
                                        max={5}
                                        step={1}
                                        onChange={this.handleChange}
                                        // onChange={this.handleChange}
                                    />
                                </div>
                            }
                        />
                    </ListItem>


                    {/*</ListItem>*/}
                </List>
            </Drawer>
        )
    }

}

export default withStyles(styles, {withTheme: true})(FilterHOC);